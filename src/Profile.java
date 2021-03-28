
import com.sun.java.swing.plaf.windows.WindowsDesktopIconUI;

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


    private MedicijnLijst mcList;
    private GewichtRegistraties grLijst;

    Scanner scan = new Scanner(System.in);


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
        mcList = new MedicijnLijst();
        grLijst = new GewichtRegistraties();
    }


    public Profile() {

    }

    //hastanin ilac listesine  ilac ekle
    public void addMedicijn(Medicijn mc) {
        mcList.addMedicijn(mc);
    }


    //hastanin ilac listesini gor
    public MedicijnLijst getMcListPatient() {
        return mcList;
    }

    // hastanin ağırlık ölçüm kaydi
    public void addGewichtRegistratie(GewichtsRegistratie gewichtsRegistratie) {
        grLijst.addGewichtRegistratie(gewichtsRegistratie);
    }

    //// hastanin ağırlık ölçüm kayitlarini gor
    public GewichtRegistraties getGrPatientLijst() {
        return grLijst;
    }

    // hastanin ilac listesinden ilac sil
    public void verwijderMedicijn() {
        Scanner scan = new Scanner(System.in);
        mcList.print();
        System.out.println("Geef nummer van medicijn die je wilt verwijderen");
        int index = scan.nextInt();

        mcList.verwijderMedicijn(index);
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
    public void wijzigProfielVoornaam() {
        System.out.println("Enter nieuwe voornaam: ");
        setVoorNaam(scan.nextLine());
        System.out.print("Nieuwe voornaam is: " + getVoorNaam());
    }

    //soy isim degistir
    public void wijzigProfielAchternaam() {
        System.out.print("Enter nieuwe achternaam: ");
        setAchterNaam(scan.nextLine());
        System.out.print("Nieuwe achternaam is: " + getAchterNaam());
    }

    //yas degistir
    public void wijzigProfielLeeftijd() {
        System.out.println("Enter nieuwe leeftijd: ");
        setLeeftijd(scan.nextInt());
        System.out.println("Nieuwe leeftijd is: " + getLeeftijd());
    }

    //boy degistir
    public void wijzigProfielLengte() {
        System.out.print("Enter nieuwe lengte: ");
        setLengte(scan.nextDouble());
        System.out.println("Uw lengte is: " + getLengte());
    }

    //kilo degistir
    public void wijzigProfielGewicht() {
        System.out.println("Enter nieuwe gewicht: ");
        setGewicht(scan.nextDouble());
        System.out.println("Nieuwe gewicht is:" + getGewicht());
    }

    //kullanici adi degistir
    public void wijzigProfielGebruikerNaam() //Username bewerken
    {
        System.out.println("Enter nieuwe gebruikersnaam: ");
        setGebruikersNaam(scan.nextLine());
        System.out.println("Nieuwe gebruikersnaam is: " + getGebruikersNaam());
    }

    //sifre degistir
    public void wijzigProfielPaswoord() {
        System.out.println("Enter nieuwe wachtwoord: ");
        setPasWoord(scan.nextLine());
        System.out.println("Nieuwe wachtwoord is: " + getPasWoord());
    }

    public void alleGewichtRegistraties() {
        grLijst.print();
    }

    public void alleMedicaties() {
        mcList.print();
    }

    public void gewichtToevoegen() {

        Scanner scan = new Scanner(System.in);
        GewichtsRegistratie gw = new GewichtsRegistratie();
        System.out.println("Enter datum :");//tarih
        gw.setDatum(scan.nextLine());
        System.out.println("Enter tijd:");//saat
        gw.setTijd(scan.nextLine());
        System.out.println("Enter gewicht:");//kilo
        gw.setGewicht(scan.nextDouble());
        scan.useLocale(Locale.US);

        grLijst.addGewichtRegistratie(gw);
        System.out.println("*********************************************");
        System.out.println("*******GEWICHT SUCCESFULL AANGEMAAKT*********");
        System.out.println("*********************************************");
        System.out.println("Zo staat gewicht geregistreert :\n" + gw.toString());

    }

    public void medicijnToevoegen() {

        Scanner scan = new Scanner(System.in);
        Medicijn m = new Medicijn();
        System.out.println("Enter medicijn naam :");//tarih
        m.setMedicijnNaam(scan.nextLine());
        System.out.println("Enter medicijn soort :");//saat
        m.setSoort(scan.nextLine());
        System.out.println("Enter omschrijving:");//kilo
        m.setOmschrijving(scan.nextLine());
        System.out.println("Enter dosering");
        m.setDosering(scan.nextLine());

        mcList.addMedicijn(m);
        System.out.println("*********************************************");
        System.out.println("*******GEWICHT SUCCESFULL AANGEMAAKT*********");
        System.out.println("*********************************************");
        System.out.println("Zo staat gewicht geregistreert :\n" + m.toString());

    }

}

