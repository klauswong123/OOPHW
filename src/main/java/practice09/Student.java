package practice09;

public class Student extends Person{
    private final Klass klass;
    public Student(Integer id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return this.klass;
    }

    public String introduce() {
        if (this.klass.getLeader()==null){
            return String.format("%s I am a Student. I am at Class %d.",super.introduce() ,this.klass.getNumber());
        }
        return this.klass.getLeader().getID()==super.getID()?String.format("%s I am a Student. I am Leader of Class %d.",super.introduce() ,this.klass.getNumber()):
                String.format("%s I am a Student. I am at Class %d.",super.introduce() ,this.klass.getNumber());
    }
}
