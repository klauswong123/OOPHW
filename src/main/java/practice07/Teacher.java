package practice07;

public class Teacher extends Person{
    private Klass klass;
    public Teacher(Integer id, String name, int age, Object... klass) {
        super(id,name, age);
        if (klass.length==1){
            this.klass = (Klass)klass[0];
        }
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return klass == null?String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", super.getName(), super.getAge()):
                String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.", super.getName(), super.getAge(), this.klass.getNumber());
    }

    public String introduceWith(Student student){
        return student.getKlass().getNumber().equals(this.klass.getNumber())?String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s.", super.getName(), super.getAge(), student.getName()):
                String.format("My name is %s. I am %d years old. I am a Teacher. I don't teach %s.", super.getName(), super.getAge(), student.getName());
    }
}
