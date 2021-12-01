package practice10;

public class Person {
    private final String name;
    private final Integer age;
    private final Integer id;
    public Person(Integer id, String name, Integer age) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getID() {
        return this.id;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.",this.name,this.age);
    }
}
