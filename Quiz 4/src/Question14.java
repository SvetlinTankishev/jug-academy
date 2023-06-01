/** Write java class User with fields name (String), age (int) and details (Object)
 * that is both serializable and cloneable. The details field is not serializable and if it is not cloneable than
 * java.lang.CloneNotSupportedException exception must be thrown.
 * */

public class Question14 {
    public class User implements java.io.Serializable, Cloneable {
        private String name;
        private int age;
        private transient Object details;

        public User(String name, int age, Object details) {
            this.name = name;
            this.age = age;
            this.details = details;
        }

        public User() {
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public Object getDetails() {
            return details;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setDetails(Object details) {
            this.details = details;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            User clonedUser = (User) super.clone();

            if (!(clonedUser.details instanceof Cloneable)) {
                throw new CloneNotSupportedException("Details object is not cloneable");
            }

            try {
                Class<?> detailsClass = clonedUser.details.getClass();
                clonedUser.details = detailsClass.getMethod("clone").invoke(clonedUser.details);
            } catch (Exception e) {
                throw new CloneNotSupportedException("Details object clone failed");
            }

            return clonedUser;
        }
    }

}
