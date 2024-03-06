/**
 * Namn: Marielle Jonasdotter
 * Kurs: Java I
 * Programnamn: CD.java
 * Datum: 21/2-24
 * Beskrivning: Klass för att skapa objekt av typen Book.
 */

public class Book extends Media{
    private String author;

    public Book(){}

    public Book(String author, String title, int length, Publisher publisher){
        super(title, length, publisher);
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getLengthAsString(){
        if (length > 1){
            return (length + " pages");
        } else {
            return (length + " page");
        }
    }

    @Override
    public void print() {
        System.out.println("-- Book information for " + title + " --");
        super.print();
        System.out.println("Author: " + author + '\n' + "Length: " + getLengthAsString() + '\n');
    }

    @Override
    public String toString() {
        return author;
    }
}
