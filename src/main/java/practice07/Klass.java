package practice07;

public class Klass {
    private final Integer klass;
    private Student leader;
    public Klass(Integer klass)  {
        this.klass = klass;
    }

    public void assignLeader(Student leader){
        this.leader=leader;
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
}
