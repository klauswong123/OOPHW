package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final Integer klass;
    private Student leader;
    private String teacher;
    private final List<Student> members= new ArrayList<>();
    public Klass(Integer klass)  {
        this.klass = klass;
    }

    public void assignLeader(Student leader){
        if (members.contains(leader)){
            this.leader=leader;
            System.out.printf("I am %s. I know %s become Leader of Class %d.\n",this.teacher, leader.getName(), this.klass);
        } else{
            System.out.print("It is not one of us.\n");
        }

    }

    public void setTeacher(String teacherName){
        this.teacher=teacherName;
    }

    public Student getLeader(){
        return this.leader;
    }

    public Integer getNumber() {
        return this.klass;
    }

    public String  getDisplayName() {
        return String.format("Class %d",this.klass);
    }

    public void appendMember(Student jerry) {
        members.add(jerry);
        System.out.printf("I am %s. I know %s has joined Class %d.\n",this.teacher, jerry.getName(), this.klass);
    }
}
