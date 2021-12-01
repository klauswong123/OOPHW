package practice06;

public class Klass {
    private final Integer klass;
    public Klass(Integer klass)  {
        this.klass = klass;
    }

    public Integer getNumber() {
        return this.klass;
    }

    public String  getDisplayName() {
        return String.format("Class %d",this.klass);
    }
}
