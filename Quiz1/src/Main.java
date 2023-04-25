/**
 * Quiz 1
 */

public class Main {
    public static void main(String[] args) {
        isEven(4);
        isPower(8);
        isPalindrome("aba");
        isAnagram("abcd", "bacd");
        binary(4);
    }

    public static void isEven(int number) {
        if (number % 2 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void isPower(int number) {
        if (number < 1) {
            System.out.println("false");
            return;
        }
        while (number > 1) {
            if (number % 2  != 0) {
                System.out.println("false");
                return;
            }
            number /= 2;
        }
        System.out.println("true");
    }

    public static void isPalindrome(String test) {
        String str = test.replaceAll("\\s+", "");
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        if (str.equalsIgnoreCase(sb.toString())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void isAnagram(String first, String second) {
        if (first.length() != second.length()) {
            System.out.println("false");
            return;
        }
        for (int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            int index = second.indexOf(c);
            if (index == -1) {
                System.out.println("false");
                return;
            }
            second = second.substring(0, index) + second.substring(index + 1);
        }
        System.out.println("true");
    }

    public static void binary(int n) {
        String binaryString = Integer.toBinaryString(n);
        int firstOneIndex = binaryString.indexOf('1');
        System.out.println(binaryString.substring(firstOneIndex));
    }


}