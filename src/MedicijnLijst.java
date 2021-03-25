import java.util.*;

public class MedicijnLijst {

    // Butun ilaclarin listesi
    Map<String, String> vasteMedicijnLijst = new HashMap<>();


    MedicijnLijst() {

    }
//listeye ilac ekle
    public void addMedicijnToVasteLijst() {

        Scanner scan = new Scanner(System.in);

        for (String exit = ""; !exit.equals("S"); exit = scan.nextLine()) {
            Medicijn m = new Medicijn();

            System.out.println("Enter medicijn naam: ");
            m.medicijnNaam = scan.nextLine();
            System.out.println("Enter medicijn omschrijving:");
            m.Omschrijving = scan.nextLine();
            System.out.println("Enter medicijn soort");
            m.soort = scan.nextLine();
            System.out.println("Enter dosering");
            m.dosering = scan.nextLine();


            vasteMedicijnLijst.put(m.medicijnNaam, m.toString());
            System.out.println("Het volgende medicijn is toegevoegd: \n" + m.toString());
            System.out.println("Druk 'S' om te stoppen");
            System.out.println("Druk enter om verder te gaan ");
        }
    }

    // ilaclarin tek tek bilgilerini gor
    public void getMedicijnInfo() {
        Scanner scan = new Scanner(System.in);
        String medicijnNaam = "";
        String result = "";

        do {
            System.out.println("Enter medicijnnaam voor informatie");
            System.out.println("Enter'X' om programma te beeindigen ");
            medicijnNaam = scan.nextLine();

            result = vasteMedicijnLijst.get(medicijnNaam);
            if (!medicijnNaam.equals("X")) {
                System.out.println(result);
            }
        } while (!medicijnNaam.equals("X"));

    }

    //listeden ilac sil
    public void verwijderMedicijnVasteMedicijnLijst() {
        Scanner scan = new Scanner(System.in);
        String medicijnNaam = "";

        do {
            System.out.println("Enter medicijnnaam om te verwijderen!");
            System.out.println("Enter 'X' om programmma te beeindigen");
            medicijnNaam = scan.nextLine();

            if (!medicijnNaam.equals("X")) {
                String deTeVerwijderenMedicijn = (String) vasteMedicijnLijst.remove(medicijnNaam);


                System.out.println("Verwijderde medicijn : " + deTeVerwijderenMedicijn);

                System.out.println("Nieuwe lijst is : " + vasteMedicijnLijst);
            }
        } while (!medicijnNaam.equals("X"));


    }
// butun ilaclari liste seklinde gor
    public void alleMedicijnentZien() {

        //FOR LOOP
        System.out.println("LIJST VAN ALLE MEDICIJNEN  ");
        for (Map.Entry me : vasteMedicijnLijst.entrySet()) {
            System.out.println("***************************************************************************************************************************************************************************************");
            System.out.println("MEDICIJN NAAM: " + me.getKey() + me.getValue());
        }
        System.out.println("***************************************************************************************************************************************************************************************");
    }


}


