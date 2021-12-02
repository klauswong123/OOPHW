package practice05;

public class Teacher extends Person{
    private Integer klass=null;
    public Teacher(String name, int age, Object... klass) {
        super(name, age);
        if (klass.length==1){
            this.klass = (Integer)klass[0];
        }
    }

    public Integer getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        return klass == null?String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", super.getName(), super.getAge()):
                String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %d.", super.getName(), super.getAge(), this.klass);
    }
}
