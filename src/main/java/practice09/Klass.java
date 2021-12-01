package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private final Integer klass;
    private Student leader;
    private final List<Student> members= new ArrayList<>();
    public Klass(Integer klass)  {
        this.klass = klass;
    }

    public void assignLeader(Student leader){
        if (members.contains(leader)){
            this.leader=leader;
        } else{
            System.out.printf("It is not one of us.\n");
        }

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
    }
}
