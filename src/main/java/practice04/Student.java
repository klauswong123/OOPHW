package practice04;

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
        return String.format("%s I am a Student. I am at Class %d.",super.introduce() ,this.klass);
    }
}
