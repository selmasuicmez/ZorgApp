
import java.io.IOException;
import java.util.*;

public class Profile {
    private String gebruikersNaam;
    private String pasWoord;
    private String functie;
    private String voorNaam;
    private String achterNaam;
    private int leeftijd;
    private double gewicht;
    private double lengte;
    private double Bmi;
    private MedicijnLijst mcList;
    private GewichtRegistraties grLijst;
    Scanner scan = new Scanner(System.in);

    public Profile(String gebruikersNaam, String paswoord, String voorNaam, String achterNaam, int leeftijd, double gewicht, double lengte) {
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

    public void addMedicijn(Medicijn mc) {
        mcList.addMedicijn(mc);
    }

    public void addGewichtRegistratie(GewichtsRegistratie gewichtsRegistratie) {
        grLijst.addGewichtRegistratie(gewichtsRegistratie);
    }

    public void verwijderMedicijn() {
        Scanner scan = new Scanner(System.in);
        mcList.print();
        System.out.println("Geef nummer van medicijn die je wilt verwijderen");
        int index = scan.nextInt();
        mcList.verwijderMedicijn(index);
    }

    @Override
    public String toString() {
        return "Profile{voorNaam='" + this.voorNaam + '\'' + ", achterNaam='" + this.achterNaam + '\'' + ", leeftijd=" + this.leeftijd + ", gewicht=" + this.gewicht + ", lengte=" + this.lengte + ", Bmi=" + this.Bmi + ", mcList=" + this.mcList + ", grLijst=" + this.grLijst + '}';
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

    public String getGebruikersNaam() {
        return gebruikersNaam;
    }

    public void setGebruikersNaam(String gebruikersNaam) {
        this.gebruikersNaam = gebruikersNaam;
    }

    public String getPasWoord() {
        return pasWoord;
    }

    public void setPasWoord(String pasWoord) {
        this.pasWoord = pasWoord;
    }

    public void printProfiel() {

        System.out.println("Voornaam: " + voorNaam);
        System.out.println("Achternaam: " + achterNaam);
        System.out.println("Leeftijd: " + leeftijd);
        System.out.println("Lengte :" + lengte);
        System.out.println("Gewicht:" + gewicht);
        System.out.println("BMI:" + getBmi());
    }

    public void wijzigProfielVoornaam() {
        System.out.println("Enter nieuwe voornaam: ");
        setVoorNaam(scan.nextLine());
        System.out.print("Nieuwe voornaam is: " + getVoorNaam());
    }

    public void wijzigProfielAchternaam() {
        System.out.print("Enter nieuwe achternaam: ");
        setAchterNaam(scan.nextLine());
        System.out.print("Nieuwe achternaam is: " + getAchterNaam());
    }

    public void wijzigProfielLeeftijd() {
        System.out.println("Enter nieuwe leeftijd: ");
        setLeeftijd(scan.nextInt());
        System.out.println("Nieuwe leeftijd is: " + getLeeftijd());
    }

    public void wijzigProfielLengte() {
        System.out.print("Enter nieuwe lengte: ");
        setLengte(scan.nextDouble());
        System.out.println("Uw lengte is: " + getLengte());
    }

    public void wijzigProfielGewicht() {
        System.out.println("Enter nieuwe gewicht: ");
        setGewicht(scan.nextDouble());
        System.out.println("Nieuwe gewicht is:" + getGewicht());
    }

    public void wijzigProfielGebruikerNaam(){ //Username bewerken
        System.out.println("Enter nieuwe gebruikersnaam: ");
        setGebruikersNaam(scan.nextLine());
        System.out.println("Nieuwe gebruikersnaam is: " + getGebruikersNaam());
    }

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
        System.out.println("Enter datum in formaat DD/MM/JJJ");
        gw.setDatum(scan.nextLine());
        System.out.println("Enter tijd in formaat UU:MM");
        gw.setTijd(scan.nextLine());
        System.out.println("Enter gewicht in 1 decimaal achter komma");
        try {
            gw.setGewicht(scan.nextDouble());
            scan.useLocale(Locale.US);
        }catch(InputMismatchException e){
            System.out.println("Geen goede invoer van gewicht. Schrijf je gewicht met komma. Niet met punt (Voorbeeld 70,6 ) Probeer opnieuw");
        }
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

