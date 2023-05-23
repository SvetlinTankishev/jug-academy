import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        //"On 2020-01-01 my Pixel drained 55%. That's OK!"
        Pattern pattern = Pattern.compile(".*(\\d{4}-\\d{2}-\\d{2}).+my (\\w+).+ (\\d+)%.*");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Matcher matcher = pattern.matcher(line);
            if (matcher.matches()) {
                System.out.println("Match!");
            } else {
                System.out.println("Bad input!");
            }
        }
    }
}