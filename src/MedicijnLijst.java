import java.util.*;

public class MedicijnLijst {

    // Butun ilaclarin listesi
    private  ArrayList<Medicijn> lijst = new ArrayList<>();


    MedicijnLijst() {
    }

    public void addMedicijn(Medicijn medicijn){
        lijst.add(medicijn);
    }

    //listeden ilac sil
    public void verwijderMedicijn(int index) {
            lijst.remove(index);
    }

// butun ilaclari liste seklinde gor
    public void print() {
        System.out.println("LIJST VAN ALLE MEDICIJNEN  ");
        for (int i=0;i<lijst.size();i++){
            System.out.print(i+". ");
            System.out.println(lijst.get(i).getMedicijnNaam());
        }

    }
}


