/**
 * Namn: Marielle Jonasdotter
 * Kurs: Java I
 * Programnamn: CD.java
 * Datum: 21/2-24
 * Beskrivning: Klass för att skapa objekt av typen CD.
 */

public class CD extends Media{
    private String artist;

    public CD(){}

    public CD(String artist, String title, int length, Publisher publisher) {
        super(title,length,publisher);
        this.artist = artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public String getLengthAsString() {
        int hours = length / 3600;
        int minutes = (length % 3600) / 60;
        int seconds = length % 60;

        return String.format("%02d h %02d m %02d s", hours, minutes, seconds);
    }

    @Override
    public void print() {
        System.out.println("-- CD information for " + title + " --");
        super.print();
        System.out.println("Artist: " + artist + '\n' + "Length: " + getLengthAsString() + '\n');
    }

    @Override
    public String toString() {
        return artist;
    }
}