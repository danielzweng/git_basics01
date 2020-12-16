package at.htlwienwest;

public class Person
{
    private String vorname;
    private String nachname;
    private int alter;

    public Person(String vorname, String nachname, int alter)
    {
        this.vorname= vorname;
        this.nachname= nachname;
        this.alter= alter;
    }

    public String getVorname() { return vorname; }
    public String getNachname() { return nachname; }

    public void setVorname(String vorname) { this.vorname= vorname; }
    public void setNachname(String nachname) { this.nachname= nachname; }

    @Override
    public String toString() { return " Vorname: " +vorname+ ", Nachname: " +nachname+ "\n"; }
}
