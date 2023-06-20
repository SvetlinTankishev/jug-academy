/** Given the following class that checks if a number is present in a list of numbers:

 class CollectionUtils {

 public static boolean search(java.util.List<Integer> numbers, Integer number) {

 ...
 }
 }
 Write a class CollectionUtilsTest with the following unit tests:

 - checks that given a list of numbers and a number not present it in it the method returns false;
 - checks that given a list of numbers and a number present it in it the method returns true;
 - checks that given a list of numbers that is null a RuntimeException is thrown;
 - checks that given a number that is null a RuntimeException is thrown.

 Note: for the annotations and assertions use fully qualified class names i.e.:
 @org.junit.jupiter.api.Test
 org.junit.jupiter.api.Assertions

 */
package bg.jug;

import java.util.Arrays;
import java.util.List;

class CollectionUtils {

    public static boolean search(List<Integer> numbers, Integer number) {
        if (numbers == null || number == null) {
            throw new RuntimeException("Input list or number is null.");
        }
        return numbers.contains(number);
    }

}
