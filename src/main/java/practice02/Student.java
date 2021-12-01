package practice02;

public class Student extends Person{
    private final int klass;
    public Student(String name, int age, int classNumber) {
        super(name, age);
        this.klass = classNumber;
    }

    public Integer getKlass() {
        return this.klass;
    }

    public String introduce() {
        return String.format("I am a Student. I am at Class %d.",this.klass);
    }
}
