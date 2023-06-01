/** Write a method public static java.util.stream.IntStream numbers(java.util.List<String> items)
 * that given a list of strings returns an integer stream of only those items that represent valid integers
*/


 public class Question11 {
 public static java.util.stream.IntStream numbers(java.util.List<String> items) {
  return items.stream()
          .filter(__tester__::isValidInteger)
          .mapToInt(Integer::parseInt);
 }
 public static boolean isValidInteger(String str) {
  try {
   Integer.parseInt(str);
   return true;
  } catch (NumberFormatException e) {
   return false;
  }
 }

}
