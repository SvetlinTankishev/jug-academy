public class InstanceFields {
    public static int numberOfInstanceFields(Object object){

        if (object.getClass().getSuperclass() == null) {
            return (int) java.util.Arrays.stream(object.getClass().getDeclaredFields()).filter(s -> !java.lang.reflect.Modifier.isStatic(s.getModifiers()))
                    .count();
        } else {
            return (int) java.util.Arrays.stream(object.getClass().getSuperclass().getDeclaredFields()).
                    filter(s -> java.lang.reflect.Modifier.isPublic(s.getModifiers()) || java.lang.reflect.Modifier.isProtected(s.getModifiers()))
                    .filter(f -> !java.lang.reflect.Modifier.isStatic(f.getModifiers())).count()
                    +
                    (int) java.util.Arrays.stream(object.getClass().getDeclaredFields()).filter(s -> !java.lang.reflect.Modifier.isStatic(s.getModifiers())).count();
        }

    }

}
