import java.util.*;

public class MedicijnLijst {
    private  ArrayList<Medicijn> lijst = new ArrayList<>();

    MedicijnLijst() {
    }

    public void addMedicijn(Medicijn medicijn){
        lijst.add(medicijn);
    }

    public void verwijderMedicijn(int index) {
            lijst.remove(index);
    }

    public void print() {
        System.out.println("LIJST VAN ALLE MEDICIJNEN  ");
        System.out.println();
        System.out.println("NR.\tMEDICIJNNAAM\t\tMEDICIJNSOORT\t\t\t\t\t\t\tOMSCHRJVING\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDOSERING");

        for (int i=0;i<lijst.size();i++){
            System.out.println(i+". "+lijst.get(i).getMedicijnNaam()+"\t\t "+lijst.get(i).getSoort()+"\t\t\t "+lijst.get(i).getOmschrijving()+"\t\t\t\t\t\t "+lijst.get(i).getDosering());
        }
    }
}


