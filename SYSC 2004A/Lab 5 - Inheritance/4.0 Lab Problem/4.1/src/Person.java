//Ngo Huu Gia Bao 101163137

public class Person {
    private String name;
    private int age;

    /**
     * Constructor for Person
     */
    public Person() {
        this("", 0);
    }

    /**
     * Constructor for Person
     * @param name, String, name of a person
     * @param age, Integer, age of a person
     */
    public Person (String name, int age) {
        this.name = name;
        this.age = age;
    }
    /**
     * accessor method for name
     * @return name of a person
     */
    public String getName() {
        return name;
    }

    /**
     * accessor method for age
     * @return age of a person
     */
    public Integer getAge() {
        return age;
    }

    /**
     * setter method for age
     * @param age of a person
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * setter method for name
     * @param name of a person
     */
    public void setName(String name) {
        this.name = name;
    }
}
