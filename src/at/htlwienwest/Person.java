package at.htlwienwest;

public class Person
{
    private String vorname;
    private String nachname;
    private int age;

    public Person(String vorname, String nachname, int age)
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.age = age;
    }

    public String getVorname() { return vorname; }
    public String getNachname() { return nachname; }

    public void setVorname(String vorname) { this.vorname = vorname; }
    public void setNachname(String nachname) { this.nachname = nachname; }

    @Override
    public String toString() { return "Vorname: " +vorname+ ", Nachname: " +nachname + "\n"; }
}
