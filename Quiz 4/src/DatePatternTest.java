import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DatePatternTest {
    public static void main(String[] args) {
        String date = "2023.05.28";

        // Option a
        Pattern patternA = Pattern.compile("^[0-9]{4}\\.[0-9]{2}\\.[0-9]{2}");
        Matcher matcherA = patternA.matcher(date);
        System.out.println("Option a:");
        System.out.println("Date: " + date);
        System.out.println("Matched? " + matcherA.matches());
        System.out.println();

        // Option b
        Pattern patternB = Pattern.compile("^[0-9]{4}.[0-9]{2}.[0-9]{2}");
        Matcher matcherB = patternB.matcher(date);
        System.out.println("Option b:");
        System.out.println("Date: " + date);
        System.out.println("Matched? " + matcherB.matches());
        System.out.println();

        // Option c
        Pattern patternC = Pattern.compile(":^[0-9]{4}.[0-9]{2}.[0-9]{2}.*");
        Matcher matcherC = patternC.matcher(date);
        System.out.println("Option c:");
        System.out.println("Date: " + date);
        System.out.println("Matched? " + matcherC.matches());
        System.out.println();

        // Option d
        Pattern patternD = Pattern.compile("^[0-9]{4}\\.[0-9]{2}\\.[0-9]{2}.*");
        Matcher matcherD = patternD.matcher(date);
        System.out.println("Option d:");
        System.out.println("Date: " + date);
        System.out.println("Matched? " + matcherD.matches());
        System.out.println();
    }
}
