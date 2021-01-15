package at.htlwienwest;

public class Pet
{
    private String name;
    private int age;
    private int legs;

    public Pet(String name, int age, int legs)
    {
        this.name = name;
        this.age = age;
        this.legs = legs;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }

    @Override
    public String toString()
    {
        return "name: " +name+ ", age: " +age+ "\n";
    }
}
