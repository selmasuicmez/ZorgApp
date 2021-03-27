import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Medicijn {

    String medicijnNaam;//ilac ismi
    String Omschrijving;//genel bilgisi
    String soort;//cesit
    String dosering;// doz


    Medicijn() {

    }

    public Medicijn(String medicijnNaam, String omschrijving, String soort, String dosering) {
        this.medicijnNaam = medicijnNaam;
        Omschrijving = omschrijving;
        this.soort = soort;
        this.dosering = dosering;
    }

    @Override
    public String toString() {
        return "  " +
                "Medicijnnaam ='" + medicijnNaam + '\'' +
                ", Omschrijving ='" + Omschrijving + '\'' +
                ", Soort ='" + soort + '\'' +
                ", Dosering ='" + dosering + "\n"
                ;
    }


    public String getMedicijnNaam() {
        return medicijnNaam;
    }

    public void setMedicijnNaam(String medicijnNaam) {
        this.medicijnNaam = medicijnNaam;
    }

    public String getOmschrijving() {
        return Omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        Omschrijving = omschrijving;
    }

    public String getSoort() {
        return soort;
    }

    public void setSoort(String soort) {
        this.soort = soort;
    }

    public String getDosering() {
        return dosering;
    }

    public void setDosering(String dosering) {
        this.dosering = dosering;
    }

    public void printInfo(){
        System.out.println("Medicijn naam :"+ getMedicijnNaam());
        System.out.println("Medicijn soort:"+ getSoort());
        System.out.println("Medicijn omschrijving :"+ getOmschrijving());
        System.out.println("Medicijn dosering:"+ getDosering());
    }
}

