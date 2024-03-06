/**
 * Namn: Marielle Jonasdotter
 * Kurs: Java I
 * Programnamn: Media.java
 * Datum: 21/2-24
 * Beskrivning:
 */

public class Media { //superklass, ska innehålla gemensamma instansvariabler och metoder för alla media typer
    protected String title;
    protected int length;
    protected Publisher publisher;

    //media objekt med length < 0 ska inte gå att skapa
    //length < 0 ska sättas till = 0

    public Media (){}

    public Media (String title, int length, Publisher publisher) {
        //sätter värden på klassens alla instansvariabler
        this.publisher = publisher;
        this.title = title;
        this.length = length;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLength(int length) {
        //kontrollera att length > 0
        if (length < 0)
        {
            length = 0;
        }

        this.length = length;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setPublisher(String name, String phone){}

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void print(){
        System.out.println("Publisher: " + publisher.getname() + '\n' + "Title: " + title);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
