import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

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
        System.out.println("Datum :" + getDatum());
        System.out.println("Tijd " + getDatum());
        System.out.println("Gewicht " + getGewicht());
    }

    //
    public static String sterLijn(int nummerVanSterren) {

        String sterren = "";
        for (int i = 0; i < nummerVanSterren; i++) {
            sterren = sterren + "*";
        }
        return sterren;
    }

    //burada yildizlarla kilo kaydini gormek icin method
    public void printSterren() {

        System.out.println("TO DO");
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



