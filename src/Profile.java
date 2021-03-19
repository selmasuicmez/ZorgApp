
import java.io.IOException;
import java.util.*;

public class Profile {

    private String voorNaam;
    private String achterNaam;
    private int leeftijd;
    private double gewicht;
    private double lengte;
    private double Bmi;

    private List<Medicijn> mcList;
    private List<GewichtsRegistratie> grLijst;

    ProfielList pl = new ProfielList();
    GewichtsRegistratie gw = new GewichtsRegistratie();

    public Profile(String voorNaam, String achterNaam, int leeftijd, double gewicht, double lengte) {
        this.voorNaam = voorNaam;
        this.achterNaam = achterNaam;
        this.leeftijd = leeftijd;
        this.gewicht = gewicht;
        this.lengte = lengte;
        mcList = new ArrayList<Medicijn>();
        grLijst = new ArrayList<GewichtsRegistratie>();
    }


    public Profile() {

    }

    public void addMedicijnPatientLijst(Medicijn mc) {
        mcList.add(mc);
    }

    public void deleteMedcijnPatientLijst(Medicijn mc) {
        mcList.remove(mc);

    }

    public List<Medicijn> getMcListPatient() {
        return mcList;
    }


    public void addGewichtRegistratiePatientLijst(GewichtsRegistratie gr) {
        grLijst.add(gr);
    }

    public void deleteGewichtRegistratiePatientLijst(GewichtsRegistratie gr) {
        grLijst.remove(gr);

    }

    public List<GewichtsRegistratie> getGrPatientLijst() {
        return getGrPatientLijst();
    }


    public void addMedicijnPatient() {
        Scanner scan = new Scanner(System.in);

        for (String exit = ""; !exit.equals("S"); exit = scan.nextLine()) {

            System.out.println("Voer de voornaam in van patient waar je medicijnen aan toe wil voegen :");
            String naam = scan.nextLine();
            scan = new Scanner(System.in);
            scan.useLocale(Locale.US);

            for (int i = 0; i < pl.profielList.size(); i++) {
                if (naam.equals(pl.profielList.get(i).voorNaam)) {

                    Medicijn m = new Medicijn();
                    System.out.println("Enter medicijn naam: ");
                    m.medicijnNaam = scan.nextLine();
                    System.out.println("Enter medicijn omschrijving:");
                    m.Omschrijving = scan.nextLine();
                    System.out.println("Enter medicijn soort");
                    m.soort = scan.nextLine();
                    System.out.println("Enter dosering");
                    m.dosering = scan.nextLine();
                    this.mcList.add(m);

                    System.out.println("Toegevoegde medicijn :" + mcList.toString());

                    System.out.println("Enter 'S' om te stoppen");
                    System.out.println("Druk enter om verder te gaan ");
                }
            }
        }
    }

    public void verwijderMedicijnPatient() {

        Scanner scan = new Scanner(System.in);
        String medicijnNaam = "";

        do {
            System.out.println("Toets voornaam van patient waar u medicijnen van wil verwijderen :");
            String patientNaam = scan.nextLine();

            for (int i = 0; i < pl.profielList.size(); i++) {
                if (patientNaam.equals(pl.profielList.get(i).voorNaam)) {
                    System.out.println("Enter medicijnnaam die je wil verwijderen!");
                    System.out.println("Enter 'X' om programma te beeindigen");
                    medicijnNaam = scan.nextLine();
                    if (!medicijnNaam.equals("X")) {
                        mcList.remove(medicijnNaam);

                        System.out.println("verwijderd van medicijnlijst");
                    }
                }
            }
        } while (!medicijnNaam.equals("X"));

    }

    public void alleMedicijnenPatient() {

        System.out.println("voer naam van patient in waar u medicijn gevens van wilt zien");
        Scanner scan = new Scanner(System.in);
        String naam = scan.nextLine();
        for (int i = 0; i < pl.profielList.size(); i++) {
            if (naam.equals(pl.profielList.get(i).voorNaam)) {
                System.out.println("yes");
                System.out.println(pl.profielList.get(i).getMcListPatient());

            }
        }
    }

    @Override
    public String toString() {
        return "Profile{" +
                "voorNaam='" + voorNaam + '\'' +
                ", achterNaam='" + achterNaam + '\'' +
                ", leeftijd=" + leeftijd +
                ", gewicht=" + gewicht +
                ", lengte=" + lengte +
                ", Bmi=" + Bmi +
                ", mcList=" + mcList +
                ", grLijst=" + grLijst +
                '}';
    }

    public String getVoorNaam() {
        return voorNaam;
    }

    public void setVoorNaam(String voorNaam) {
        this.voorNaam = voorNaam;
    }

    public String getAchterNaam() {
        return achterNaam;
    }

    public void setAchterNaam(String achterNaam) {
        this.achterNaam = achterNaam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getLengte() {
        return lengte;
    }

    public void setLengte(double lengte) {
        this.lengte = Math.round(lengte);
    }

    public double getBmi() {
        Bmi = Math.round(gewicht / (lengte * lengte));
        return Bmi;
    }


    public void editPatient() throws IOException {
        char l;
        Profile patient1 = new Profile(voorNaam, achterNaam, leeftijd, gewicht, lengte);
        Scanner scan = new Scanner(System.in);
        do {
            l = 'n';
            System.out.println("Voer de voornaam in van patient die je wil updaten :");
            String naam = scan.nextLine();
            scan = new Scanner(System.in);
            scan.useLocale(Locale.US);

            for (int i = 0; i < pl.profielList.size(); i++) {
                if (naam.equals(pl.profielList.get(i).voorNaam)) {

                    System.out.println("Welke gegevens wilt u updaten. Maak een keuze: ");
                    System.out.println("****************************************************************");
                    System.out.println("1- Leeftijd wijzigen");
                    System.out.println("2- Gewicht wijzigen");
                    System.out.println("3- Lengte wijzigen");
                    System.out.println("4- Terug naar hoofdmenu");
                    System.out.println("****************************************************************");

                    int nummer = scan.nextInt();

                    switch (nummer) {

                        case 1:
                            System.out.println("voer nieuw patients leeftijd in:");

                            patient1.leeftijd = scan.nextInt();

                            patient1.voorNaam = pl.profielList.get(i).voorNaam;
                            patient1.achterNaam = pl.profielList.get(i).achterNaam;
                            patient1.lengte = pl.profielList.get(i).lengte;
                            patient1.gewicht = pl.profielList.get(i).gewicht;

                            pl.profielList.set(i, patient1);

                            System.out.println("Patient leeftijd gewijzigt !!!");
                            System.out.println(patient1);
                            break;
                        case 2:
                            System.out.println("Voer nieuw patients gewicht in:");

                            patient1.gewicht = scan.nextFloat();
                            scan.useLocale(Locale.US);

                            patient1.voorNaam = pl.profielList.get(i).voorNaam;
                            patient1.achterNaam = pl.profielList.get(i).achterNaam;
                            patient1.leeftijd = pl.profielList.get(i).leeftijd;
                            patient1.lengte = pl.profielList.get(i).lengte;

                            pl.profielList.set(i, patient1);

                            System.out.println("Patient gewicht gewijzigt !!!");
                            System.out.println(patient1);
                            break;
                        case 3:
                            System.out.println("Voer nieuw patients lengte in :");

                            patient1.lengte = scan.nextFloat();
                            scan.useLocale(Locale.US);

                            patient1.voorNaam = pl.profielList.get(i).voorNaam;
                            patient1.achterNaam = pl.profielList.get(i).achterNaam;
                            patient1.leeftijd = pl.profielList.get(i).leeftijd;
                            patient1.gewicht = pl.profielList.get(i).gewicht;

                            pl.profielList.set(i, patient1);

                            System.out.println("Patient lengte gewijzigt!!!");
                            System.out.println("Nieuwe gegevens  " + patient1);
                            break;
                        case 4:
                            //  menuScherm();
                        default:
                            System.out.println("Geen goede invoer");
                            break;
                    }
                }
            }

            System.out.println("Wilt u verder gaan met updaten y/n.");
            System.out.println("Bij intoetsen van -- n --- gaat u terug naar hoofdmenu");
            l = scan.next().charAt(0);
            scan.useLocale(Locale.US);
        } while (l == 'y');

    }

    public void addGewichtRegistratiePatient() {
        Scanner scan = new Scanner(System.in);

        for (String exit = ""; !exit.equals("S"); exit = scan.nextLine()) {

            System.out.println("Voer de voornaam in van patient waar je gewicht aan toe wil voegen :");
            String naam = scan.nextLine();
            scan = new Scanner(System.in);
            scan.useLocale(Locale.US);

            for (int i = 0; i < pl.profielList.size(); i++) {
                if (naam.equals(pl.profielList.get(i).voorNaam)) {

                    GewichtsRegistratie gw = new GewichtsRegistratie();
                    System.out.println("Enter datum van registratie: ");
                    gw.datum = scan.nextLine();
                    System.out.println("Enter tijd van regstratie:");
                    gw.tijd = scan.nextLine();
                    System.out.println("Enter gewicht van patient:");
                    gw.gewicht = scan.nextLine();

                    grLijst.add(gw);

                    System.out.println("Toegevoegde gewichtregistartie :" + grLijst.toString());

                    System.out.println("Enter 'S' om te stoppen");
                    System.out.println("Druk enter om verder te gaan ");
                }
            }
        }

    }

    public void verwijderGewichtRegistratiePatient() {

        Scanner scan = new Scanner(System.in);
        String registratieDatum = "";

        do {
            System.out.println("Toets voornaam van patient waar u medicijnen van wil verwijderen :");
            String patientNaam = scan.nextLine();

            for (int i = 0; i < pl.profielList.size(); i++) {
                if (patientNaam.equals(pl.profielList.get(i).voorNaam)) {
                    System.out.println("Enter datum die je wil verwijderen!");
                    System.out.println("Enter 'X' om programma te beeindigen");
                    registratieDatum = scan.nextLine();
                    if (!registratieDatum.equals("X")) {
                        grLijst.remove(registratieDatum);

                        System.out.println("registratie datum verwijderd");
                    }
                }
            }
        } while (!registratieDatum.equals("X"));

    }

    public void alleGewichtRegistartiesvanPatient() {

        System.out.println("voer naam van patient in waar u gewichtregistratie gevens van wilt zien");
        Scanner scan = new Scanner(System.in);
        String naam = scan.nextLine();
        for (int i = 0; i < pl.profielList.size(); i++) {
            if (naam.equals(pl.profielList.get(i).voorNaam)) {

                System.out.println(pl.profielList.get(i).getGrPatientLijst());

            }
        }
    }
}