package at.htlwienwest;

public class Person
{
    private String vorname;
    private String nachname;
    private int age;
    private boolean sex;

    public Person(String vorname, String nachname, int age, boolean sex)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.age = age;
        this.sex = sex;
    }

    public String getVorname() { return vorname; }
    public String getNachname() { return nachname; }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public boolean isSex()
    {
        return sex;
    }

    public void setSex(boolean sex)
    {
        this.sex = sex;
    }

    public void setVorname(String vorname) { this.vorname = vorname; }
    public void setNachname(String nachname) { this.nachname = nachname; }

    @Override
    public String toString() { return "Vorname: " +vorname+ ", Nachname: " +nachname; }
}
