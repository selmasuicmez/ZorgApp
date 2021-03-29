import java.util.ArrayList;

public class GewichtRegistraties {

    //kilo kaydi icin liste
    private ArrayList<GewichtsRegistratie> lijst = new ArrayList<>();

    GewichtRegistraties() {
    }
//kilo kaydi listesine yeni bir tane ekle
    public void addGewichtRegistratie(GewichtsRegistratie gewichtsRegistratie) {
        lijst.add(gewichtsRegistratie);
    }
// listeyi gor
    public void print() {
        System.out.println("LIJST VAN ALLE GEWICHTREGISTRATIES  ");
        System.out.println("Datum\t\t\t Tijd \t\t\t\tGewicht");
        System.out.println();
        for (GewichtsRegistratie gewichtsRegistratie : lijst) {

            System.out.println(gewichtsRegistratie.getDatum()+"\t\t "+gewichtsRegistratie.getTijd()+" \t\t\t\t"+gewichtsRegistratie.getGewicht());

           // gewichtsRegistratie.printSterren();
           //bu methodu cagirdigimda kilo kaydini yildizlarla konsola basmasi lazim
        }
    }
}
