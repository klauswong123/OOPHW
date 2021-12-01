package practice09;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Teacher extends Person{
    private LinkedList<Klass> klass = new LinkedList<>();
    @SafeVarargs
    public Teacher(Integer id, String name, int age, LinkedList<Klass>... klass) {
        super(id,name, age);
        if (klass.length==1){
            this.klass = (LinkedList<Klass>)klass[0];
        }
    }

    public List<Klass> getKlass() {
        return klass;
    }

    public String introduce() {
        if (this.klass==null){
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", super.getName(), super.getAge());
        }
        List<Integer> teachClass = new ArrayList<>();
        for (Klass singleKlass : this.klass){
            teachClass.add(singleKlass.getNumber());
        }
        System.out.println(teachClass);
        return teachClass.size()>0?String.format("My name is %s. I am %d years old. I am a Teacher. I teach Class %s.", super.getName()
                , super.getAge(), teachClass.stream().map(teachc->teachc.toString()).collect(Collectors.joining(", "))):
                String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", super.getName(), super.getAge());
    }

    public String introduceWith(Student student){
        if (this.klass==null){
            return String.format("My name is %s. I am %d years old. I am a Teacher. I teach No Class.", super.getName(), super.getAge());
        }
        List<Integer> teachClass = new ArrayList<>();
        for (Klass singleKlass : this.klass){
            teachClass.add(singleKlass.getNumber());
        }
        return teachClass.contains(student.getKlass().getNumber())?String.format("My name is %s. I am %d years old. I am a Teacher. I teach %s.", super.getName(), super.getAge(), student.getName()):
                String.format("My name is %s. I am %d years old. I am a Teacher. I don't teach %s.", super.getName(), super.getAge(), student.getName());
    }

    public LinkedList<Klass> getClasses() {
        return this.klass;
    }

    public boolean isTeaching(Student jerry) {
        if (this.klass==null) return false;
        for (Klass singleKlass : this.klass){
            if (jerry.getKlass().equals(singleKlass)){
                return true;
            }
        }
        return false;
    }
}
