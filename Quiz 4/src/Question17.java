/** Write a method public static int numberOfInstanceFields(Object object)
 * which returns the number of all not-static fields (including the inherited ones) contained in the given object. */

public class Question17 {
    public static int numberOfInstanceFields(Object object) {
        int count = 0;
        Class<?> thingy = object.getClass();

        while (thingy != null) {
            java.lang.reflect.Field[] fields = thingy.getDeclaredFields();
            for (java.lang.reflect.Field field : fields) {
                if (!java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                    count++;
                }
            }
            thingy = thingy.getSuperclass();
        }
        return count;
    }
}
