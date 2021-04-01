
import java.util.List;
import java.util.Scanner;

public class GewichtsRegistratie {

    String datum;
    String tijd;
    double gewicht;

    GewichtsRegistratie() {
    }

    public GewichtsRegistratie(String datum, String tijd, double gewicht) {
        this.datum = datum;
        this.tijd = tijd;
        this.gewicht = gewicht;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getTijd() {
        return tijd;
    }

    public void setTijd(String tijd) {
        this.tijd = tijd;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void printInfo() {
        System.out.println("Datum :" + this.getDatum());
        System.out.println("Tijd " + this.getDatum());
        System.out.println("Gewicht " +this.getGewicht());
    }

    public String sterLijn(double nummerVanSterren) {

        String sterren = "";
        for (int i = 0; i < nummerVanSterren; i++) {
            sterren = sterren + "*";
        }
        return sterren;
    }

    public void printSterren() {
        System.out.println(sterLijn(gewicht*0.50));
    }

    @Override
    public String toString() {
        return "GewichtsRegistratie{" +
                "datum='" + datum + '\'' +
                ", tijd='" + tijd + '\'' +
                ", gewicht=" + gewicht +
                '}';
    }
}



