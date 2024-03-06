/**
 * Namn: Marielle Jonasdotter
 * Kurs: Java I
 * Programnamn: CD.java
 * Datum: 21/2-24
 * Beskrivning: Klass för att skapa objekt av typen Pubblisher.
 */

public class Publisher
{
    private String name;
    private String phone;
    private static int nrOfPublishers;

    public Publisher()
    {
        nrOfPublishers++;
    }

    public Publisher(String name, String phone)
    {
        this.name = name;
        this.phone = phone;
        nrOfPublishers++;
    }

    public String getname()
    {
        return name;
    }

    public void setname(String name)
    {
        this.name = name;
    }

    public String getphone()
    {
        return phone;
    }

    public void setphone(String phone)
    {
        this.phone = phone;
    }

    public static int getnrOfPublishers()
    {
        return nrOfPublishers;
    }

    @Override
    public String toString()
    {
        return "-- Publisher information for " + name + " --" + '\n'
                + "Publisher name: " + name + '\n'
                + "Publisher phonenumber: " + phone + '\n';
    }

    public void print()
    {
        System.out.println(this.toString());
    }
}