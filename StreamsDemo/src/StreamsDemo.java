import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
    record BatteryDay(LocalDate date, String deviceModel, double percentDrained) {
        BatteryDay(String[] fields) {
            this(LocalDate.parse(fields[0]), fields[1], Double.parseDouble(fields[2]));
        }
        BatteryDay(String line) {
            this(line.split(", "));
        }
    }

    public static void main(String[] args) {
        try (Stream<String> lines = new BufferedReader(
                new InputStreamReader(
                        Objects.requireNonNull(StreamsDemo.class.getResourceAsStream("battery.csv")))).lines()) {

            var result =
                    lines
                    .map(BatteryDay::new)
                    .filter(batteryDay -> batteryDay.date().isBefore(LocalDate.now()))
                    .collect(Collectors.groupingBy(
                            BatteryDay::deviceModel,
                            Collectors.averagingDouble(BatteryDay::percentDrained)));
            System.out.println("result: " + result);
        }
    }
}