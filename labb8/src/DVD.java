/**
 * Namn: Marielle Jonasdotter
 * Kurs: Java I
 * Programnamn: CD.java
 * Datum: 21/2-24
 * Beskrivning: Klass för att skapa objekt av typen DVD.
 */

public class DVD extends Media{
    private int ageLimit;

    public DVD () {;
    }

    public DVD (String title, int length, int ageLimit, Publisher publisher){
        super(title, length, publisher);
        this.ageLimit = ageLimit;
    }

    public void setAgeLimit(int ageLimit) {
        this.ageLimit = ageLimit;
        if (ageLimit < 0)
        {
            ageLimit = 0;
        }

        this.ageLimit = ageLimit;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public String getLengthAsString() {
        int hours = length / 3600;
        int minutes = (length % 3600) / 60;
        int seconds = length % 60;

        return String.format("%02dh %02dm %02ds", hours, minutes, seconds);
    }

    @Override
    public void print () {
        System.out.println("-- DVD information for " + title + " --");
        super.print();
        System.out.println("Length: " + getLengthAsString() + '\n' + "Age limit: " + ageLimit + "+" + '\n');
    }

    @Override
    public String toString () {
        return String.valueOf(ageLimit);
    }
}