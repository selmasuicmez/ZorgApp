import java.util.List;

public class GewichtsRegistratie {

    String datum;
    String tijd;
    String gewicht;


    GewichtsRegistratie(){

    }

    public GewichtsRegistratie( String datum, String tijd, String gewicht) {

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

    public String getGewicht() {
        return gewicht;
    }

    public void setGewicht(String gewicht) {
        this.gewicht = gewicht;
    }

    public void gewichtRegistratiePatient(){

    }


}


