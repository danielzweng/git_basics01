package at.htlwienwest;

public class Pet
{
    private String name;
    private int age;
    private boolean isCarnivore;

    public Pet(String name, int age, boolean isCarnivore)
    {
        this.name = name;
        this.age = age;
        this.isCarnivore = isCarnivore;
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
