
import java.io.IOException;
import java.util.*;

public class Profile {
    private String gebruikersNaam;//kullanici adi
    private String pasWoord;//pasword
    private String functie;//function(Hasta veya doktormu)
    private String voorNaam;//isim
    private String achterNaam;//soyisim
    private int leeftijd;//yas
    private double gewicht;//kilo
    private double lengte;//boy
    private double Bmi;//bmi


    private List<Medicijn> mcList;
    private List<GewichtsRegistratie> grLijst;

    Scanner scan=new Scanner(System.in);


    //constructor
    public Profile(String gebruikersNaam, String paswoord, String functie, String voorNaam, String achterNaam, int leeftijd, double gewicht, double lengte) {
        this.gebruikersNaam = gebruikersNaam;
        this.pasWoord = paswoord;
        this.functie = functie;
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
//hastanin ilac listesine  ilac ekle
    public void addMedicijnPatientLijst(Medicijn mc) {
        mcList.add(mc);
    }
//hastanin ilac listesinden ilac sil
    public void deleteMedcijnPatientLijst(Medicijn mc) {
        mcList.remove(mc);

    }
//hastanin ilac listesini gor
    public List<Medicijn> getMcListPatient() {
        return mcList;
    }
// hastanin ağırlık ölçüm kaydi
    public void addGewichtRegistratiePatientLijst(GewichtsRegistratie gr) {
        grLijst.add(gr);
    }
//// hastanin ağırlık ölçüm kaydi sil (buna gerek yok)
    public void deleteGewichtRegistratiePatientLijst(GewichtsRegistratie gr) {
        grLijst.remove(gr);

    }
//// hastanin ağırlık ölçüm kayitlarini gor
    public List<GewichtsRegistratie> getGrPatientLijst() {
        return getGrPatientLijst();
    }

    //hastanin  ilaclistesine ilac ekle
    public void addMedicijnPatient() {
        Scanner scan = new Scanner(System.in);

        for (String exit = ""; !exit.equals("S"); exit = scan.nextLine()) {

            System.out.println("Voer de voornaam in van patient waar je medicijnen aan toe wil voegen :");
            String naam = scan.nextLine();
            scan = new Scanner(System.in);
            scan.useLocale(Locale.US);

            for (int i = 0; i < profielList.size(); i++) {
                if (naam.equals(profielList.get(i).voorNaam)) {

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

// hastanin ilac listesinden ilac sil
    public void verwijderMedicijnPatient() {

        Scanner scan = new Scanner(System.in);
        String medicijnNaam = "";

        do {
            System.out.println("Toets voornaam van patient waar u medicijnen van wil verwijderen :");
            String patientNaam = scan.nextLine();

            for (int i = 0; i < profielList.size(); i++) {
                if (patientNaam.equals(profielList.get(i).voorNaam)) {
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
// isim al
    public String getVoorNaam() {
        return voorNaam;
    }
//isim set et
    public void setVoorNaam(String voorNaam) {
        this.voorNaam = voorNaam;
    }
//soyisim al
    public String getAchterNaam() {
        return achterNaam;
    }
//soyisim set et
    public void setAchterNaam(String achterNaam) {
        this.achterNaam = achterNaam;
    }
//yas al
    public int getLeeftijd() {
        return leeftijd;
    }
//yas set et
    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }
//kilo al
    public double getGewicht() {
        return gewicht;
    }
//kilo set et
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }
// boy al
    public double getLengte() {
        return lengte;
    }
// boy set et
    public void setLengte(double lengte) {
        this.lengte = Math.round(lengte);
    }
//bmi hesapla
    public double getBmi() {
        Bmi = Math.round(gewicht / (lengte * lengte));
        return Bmi;
    }
    //kulanici adi al
    public String getGebruikersNaam() {
        return gebruikersNaam;
    }
    //kullanici adi set
    public void setGebruikersNaam(String gebruikersNaam) {
        this.gebruikersNaam = gebruikersNaam;
    }
    //pasword al
    public String getPasWoord() {
        return pasWoord;
    }
    //pasword set et
    public void setPasWoord(String pasWoord) {
        this.pasWoord = pasWoord;
    }
    // hasta veya doktoru profillerde ayirt etmek icin  function( patient veya zorgverlener olarak constructora ekliyor)
    public String getFunctie() {
        return functie;
    }
    //function set et
    public void setFunctie(String functie) {
        this.functie = functie;
    }
// profil yazdir
    public void printProfiel() {

        System.out.println("Voornaam: " + voorNaam);
        System.out.println("Achternaam: " + achterNaam);
        System.out.println("Leeftijd: " + leeftijd);
        System.out.println("Lengte :" + lengte);
        System.out.println("Gewicht:" + gewicht);
        System.out.println("BMI:" + getBmi());

    }
//isim degistir
            public void wijzigProfielVoornaam()
            {
                System.out.println("Enter nieuwe voornaam: ");
                setVoorNaam(scan.nextLine());
                System.out.print("Nieuwe voornaam is: " + getVoorNaam());
            }
//soy isim degistir
            public void wijzigProfielAchternaam()
            {
                System.out.print("Enter nieuwe achternaam: ");
                setAchterNaam(scan.nextLine());
                System.out.print("Nieuwe achternaam is: " + getAchterNaam());
            }
//yas degistir
            public void wijzigProfielLeeftijd()
            {
                System.out.println("Enter nieuwe leeftijd: ");
                setLeeftijd(scan.nextInt());
                System.out.println("Nieuwe leeftijd is: " + getLeeftijd());
            }
//boy degistir
            public void wijzigProfielLengte()
            {
                System.out.print("Enter nieuwe lengte: ");
                setLengte(scan.nextDouble());
                System.out.println("Uw lengte is: "+getLengte());
            }
//kilo degistir
            public void wijzigProfielGewicht()
            {
                System.out.println("Enter nieuwe gewicht: ");
                setGewicht(scan.nextDouble());
                System.out.println("Nieuwe gewicht is:"+ getGewicht());
            }
//kullanici adi degistir
            public void wijzigProfielGebruikerNaam() //Username bewerken
            {
                System.out.println("Enter nieuwe gebruikersnaam: ");
                setGebruikersNaam(scan.nextLine());
                System.out.println("Nieuwe gebruikersnaam is: "+getGebruikersNaam());
            }
//sifre degistir
            public void wijzigProfielPaswoord()
            {
                System.out.println("Enter nieuwe wachtwoord: ");
                setPasWoord(scan.nextLine());
                System.out.println("Nieuwe wachtwoord is: "+ getPasWoord());
            }

//hastanin tum bilgilerini birden degistir
//    public void editPatient() {
//        char l;
//        Profile patient1 = new Profile(gebruikersNaam,pasWoord,functie,voorNaam, achterNaam, leeftijd, gewicht, lengte);
//        Scanner scan = new Scanner(System.in);
//        do {
//            l = 'n';
//            System.out.println("Voer de voornaam in van patient die je wil updaten :");
//            String naam = scan.nextLine();
//            scan = new Scanner(System.in);
//            scan.useLocale(Locale.US);
//
//            for (int i = 0; i < pl.profielList.size(); i++) {
//                if (naam.equals(pl.profielList.get(i).voorNaam)) {
//
//                    System.out.println("Welke gegevens wilt u updaten. Maak een keuze: ");
//                    System.out.println("****************************************************************");
//                    System.out.println("1- Leeftijd wijzigen");
//                    System.out.println("2- Gewicht wijzigen");
//                    System.out.println("3- Lengte wijzigen");
//                    System.out.println("4- Terug naar hoofdmenu");
//                    System.out.println("****************************************************************");
//
//                    int nummer = scan.nextInt();
//
//                    switch (nummer) {
//
//                        case 1:
//                            System.out.println("voer nieuw patients leeftijd in:");
//
//                            patient1.leeftijd = scan.nextInt();
//
//                            patient1.voorNaam = pl.profielList.get(i).voorNaam;
//                            patient1.achterNaam = pl.profielList.get(i).achterNaam;
//                            patient1.lengte = pl.profielList.get(i).lengte;
//                            patient1.gewicht = pl.profielList.get(i).gewicht;
//
//                            pl.profielList.set(i, patient1);
//
//                            System.out.println("Patient leeftijd gewijzigt !!!");
//                            System.out.println(patient1);
//                            break;
//                        case 2:
//                            System.out.println("Voer nieuw patients gewicht in:");
//
//                            patient1.gewicht = scan.nextFloat();
//                            scan.useLocale(Locale.US);
//
//                            patient1.voorNaam = pl.profielList.get(i).voorNaam;
//                            patient1.achterNaam = pl.profielList.get(i).achterNaam;
//                            patient1.leeftijd = pl.profielList.get(i).leeftijd;
//                            patient1.lengte = pl.profielList.get(i).lengte;
//
//                            pl.profielList.set(i, patient1);
//
//                            System.out.println("Patient gewicht gewijzigt !!!");
//                            System.out.println(patient1);
//                            break;
//                        case 3:
//                            System.out.println("Voer nieuw patients lengte in :");
//
//                            patient1.lengte = scan.nextFloat();
//                            scan.useLocale(Locale.US);
//
//                            patient1.voorNaam = pl.profielList.get(i).voorNaam;
//                            patient1.achterNaam = pl.profielList.get(i).achterNaam;
//                            patient1.leeftijd = pl.profielList.get(i).leeftijd;
//                            patient1.gewicht = pl.profielList.get(i).gewicht;
//
//                            pl.profielList.set(i, patient1);
//
//                            System.out.println("Patient lengte gewijzigt!!!");
//                            System.out.println("Nieuwe gegevens  " + patient1);
//                            break;
//                        case 4:
//                            //  menuScherm();
//                        default:
//                            System.out.println("Geen goede invoer");
//                            break;
//                    }
//                }
//            }
//
//            System.out.println("Wilt u verder gaan met updaten y/n.");
//            System.out.println("Bij intoetsen van -- n --- gaat u terug naar hoofdmenu");
//            l = scan.next().charAt(0);
//            scan.useLocale(Locale.US);
//        } while (l == 'y');
//
//    }
// hastaya kilo kaydi ekle
    public void addGewichtRegistratiePatient() {
        Scanner scan = new Scanner(System.in);

        for (String exit = ""; !exit.equals("S"); exit = scan.nextLine()) {

            System.out.println("Voer de voornaam in van patient waar je gewicht aan toe wil voegen :");
            String naam = scan.nextLine();
            scan = new Scanner(System.in);
            scan.useLocale(Locale.US);

            for (int i = 0; i < profielList.size(); i++) {
                if (naam.equals(profielList.get(i).voorNaam)) {

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

//hastanin tum kilo kayitlari
    public void alleGewichtRegistratiesvanPatient() {

        System.out.println("Voer naam van patient in waar u gewichtregistratie gegevens van wilt zien");
        Scanner scan = new Scanner(System.in);
        String naam = scan.nextLine();
        for (int i = 0; i < profielList.size(); i++) {
            if (naam.equals(profielList.get(i).voorNaam)) {

                System.out.println("Datum " + "\t" + "Tijd " + "\t" + "Gewicht " + "\t" + "registratie " + "\t");
                System.out.println(grLijst.get(Integer.parseInt(Integer.parseInt(grLijst.get(i).getDatum()
                        + grLijst.get(i).tijd + grLijst.get(i).gewicht) + sterLijn((int) gewicht))));
            }
        }
    }
// yildizlarla kilo kaydi takip cizelgesi olusturmam lazim. Kilosuna gore yildiz consolda gozukmesi lazim. Kilosunu monitorlamak icin
    public static String sterLijn(int nummerVanSterren) {

        String sterren = "";
        for (int i = 0; i < nummerVanSterren; i++)
            sterren = sterren + "*";
        return sterren;
    }
}