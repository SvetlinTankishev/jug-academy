/** Implement the public void invokeDefault(Object object, String method) method
 * that given an object and a method invokes the if present.
 * If the supplied method is missing the provided class is checked for a defaultMethod() method
 * and if present it is called otherwise ignore the execution.
 * Assume the class does not have overloaded methods with the given name and the method does not have parameters. */

public class Question18 {
    public static void main(String[] args) {
        // Create an instance of the class where the invokeDefault method is defined
        Question18 testObj = new Question18();

        // Create an object with the desired method(s)
        Object test = new Object() {
            void x() {
                System.out.println("x");
            }
        };

        // Call the invokeDefault method
        testObj.invokeDefault(test, "x");
    }

    public void invokeDefault(Object object, String method) {
        Class<?> classy = object.getClass();

        try {
            java.lang.reflect.Method targetMethod = classy.getDeclaredMethod(method);
            targetMethod.setAccessible(true); // Allow invoking package-private methods
            targetMethod.invoke(object);
        } catch (NoSuchMethodException e) {
            try {
                java.lang.reflect.Method defaultMethod = classy.getDeclaredMethod("defaultMethod");
                defaultMethod.setAccessible(true); // Allow invoking package-private methods
                defaultMethod.invoke(object);
            } catch (NoSuchMethodException | IllegalAccessException | java.lang.reflect.InvocationTargetException ex) {
                // Ignore the execution if neither the target nor the default method is found
            }
        } catch (IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
