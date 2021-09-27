package test;

public class Students {
    static class Student{
        private int age = 10;
        private String name = "origin";

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {
        Student stu = new Student();
        int i = 20;
        func(i, stu);
        System.out.println(stu.toString());
        System.out.println(i);
    }

    private static void func(int i, Student stu) {
        i = 5;
        stu.setAge(i);
        stu.setName("update");
    }
}
