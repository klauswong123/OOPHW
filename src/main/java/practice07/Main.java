package practice07;

public class Main {
    public static void main(String[] args) {
        Klass klass = new Klass(2);
        Student tom = new Student(1, "Tom", 21, klass);
        System.out.println(tom.introduce());
    }
}
