/**
 * Namn: Marielle Jonasdotter
 * Kurs: Java I
 * Programnamn: MediaTest.java
 * Datum: 21/2-24
 * Beskrivning:
 * */

public class MediaTest {
    public static void main(String [] args){
        Publisher parlophone = new Publisher("Parlophone", "+44 20 7605 5000");
        Publisher dreamWorksPictures = new Publisher("DreamWorks Pictures", "+47 83 7945 0037");
        Publisher ballatineBooks = new Publisher("Ballatine Books", "+108 9392 029382");

        CD weedkillerCD = new CD();
        weedkillerCD.setTitle("WEEDKILLER");
        weedkillerCD.setArtist("Ashnikko");
        weedkillerCD.setLength(1991);
        weedkillerCD.setPublisher(parlophone);

        DVD theRingDVD = new DVD();
        theRingDVD.setTitle("The Ring (2002)");
        theRingDVD.setLength(6900);
        theRingDVD.setAgeLimit(13);
        theRingDVD.setPublisher(dreamWorksPictures);

        Book fahrenheit451Book = new Book();
        fahrenheit451Book.setAuthor("Ray Bradbury");
        fahrenheit451Book.setTitle("Fahrenheit 451");
        fahrenheit451Book.setLength(272);
        fahrenheit451Book.setPublisher(ballatineBooks);

        CD wipedOutCD = new CD("The Neighborhood","Wiped out!", 2722, new Publisher("Columbia Records", "+348 2920 32820"));
        DVD theShiningDVD = new DVD("The Shining", 8760, 18, new Publisher("Warner Bros.", "+482 93482 329832"));
        Book theGreatGatsbyBook = new Book("F. Scott Fitzgerald", "The Great Gatsby", 192, new Publisher("Charles Scribner's Sons", "+29 2938 023994"));

        weedkillerCD.print();
        wipedOutCD.print();
        theRingDVD.print();
        theShiningDVD.print();
        fahrenheit451Book.print();
        theGreatGatsbyBook.print();
    }
}