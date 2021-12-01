package practice04;

public class Student extends Person{
    private final int classNumber;
    public Student(String name, int age, int classNumber) {
        super(name, age);
        this.classNumber = classNumber;
    }

    public Integer getKlass() {
        return this.classNumber;
    }

    public String introduce() {
        return String.format("%s I am a Student. I am at Class %d.",super.introduce() ,this.classNumber);
    }
}
