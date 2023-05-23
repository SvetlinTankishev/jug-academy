import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionDemo {

    private void fun() {}

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Field[] fields = String.class.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        String hello = "Hello!";
        Field valueField = String.class.getDeclaredField("value");
        valueField.setAccessible(true); //used practice for libraries

        byte[] value = (byte[]) valueField.get(hello);
        System.out.println(Arrays.toString(value));

        //valueField.set(hello, "bye!".getBytes());
        //System.out.println("Hello= " + hello);

        //2.-
        /*Method[] methods = ReflectionDemo.class.getMethods();
        Method[] methods = ReflectionDemo.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }*/
        //1.-
        //System.out.println(ReflectionDemo.class);
        //System.out.println(args.getClass());
    }
}
