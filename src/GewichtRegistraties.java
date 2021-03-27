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
        for (GewichtsRegistratie gewichtsRegistratie : lijst) {
            System.out.println("***************************************************************************************************************************************************************************************");
            gewichtsRegistratie.printSterren();
            System.out.println("***************************************************************************************************************************************************************************************");
        }
    }
}
