import java.util.*;

public class ZorgApp {

    Scanner scan = new Scanner(System.in);
    Scanner switchChoice = new Scanner(System.in);

    private ProfielList profielList = new ProfielList();
    private MedicijnLijst medicijnLijst = new MedicijnLijst();

    private String gebruikerNaam;//kullanici adi
    private String paswoord;// pasword
    private Profile profile;
    private Profile patient;

    Medicijn medicijn = new Medicijn();

    public ZorgApp() {
//profilListe hasta ekle
        Profile Selma = new Profile("selma", "suicmez", "zorgverlener", "Selma", "Suicmez", 38, 65.2, 1.75);
        Profile Mevlut = new Profile("mevlut", "suicmez", "patient", "Mevlut", "Suicmez", 47, 75, 1.80);
        Profile Maksud = new Profile("maksud", "suicmez", "patient", "Maksud", "Suicmez", 13, 60, 1.68);
        Profile Batuhan = new Profile("batuhan", "suicmez", "patient", "Batuhan", "Suicmez", 11, 55, 1.63);
        Profile Semiha = new Profile("semiha", "suicmez", "patient", "Semiha", "Suicmez", 7, 35, 1.30);
        Profile Ahmed = new Profile("ahmed", "suicmez", "patient", "Ahmed", "Suicmez", 2, 25, 0.84);
        profielList.profielList.add(Selma);
        profielList.profielList.add(Mevlut);
        profielList.profielList.add(Maksud);
        profielList.profielList.add(Batuhan);
        profielList.profielList.add(Ahmed);
        profielList.profielList.add(Semiha);
        //ilaclari olustur
        Medicijn Paracetamol = new Medicijn("Paracetamol", "Bij verschillende soorten pijn, zoals: hoofdpijn, migraine, keelpijn, oorpijn, spierpijn, gewrichtspijn, menstruatieklachten en artrose (pijn doordat uw gewrichtskraakbeen dunner wordt). Ook bij koorts, griep en verkoudheid.", "Pijnstiller en koortsverlager", "Volwassenen mogen bij kortdurend gebruik 3 tot 4 keer per dag 1 tot 2 tabletten van 500 mg paracetamol gebruiken (niet langer dan 4 weken achter elkaar). Let op: Bij langdurig gebruik (langer dan 4 weken) mag u niet meer dan 5 keer per dag 1 tablet (geen 2) van 500 mg paracetamol gebruiken");
        Medicijn Daktarin = new Medicijn("Daktarin", "Het is te gebruiken bij schimmelinfecties van de huid, zoals voetschimmel, schimmelnagels en eikelontsteking. Het wordt ook gebruikt bij een aantal huidinfecties met bacteriën, zoals puistjes (acne). Het wordt ook gebruikt bij putjeszolen.", "antischimmelmiddel", "Daktarin maximaal 4x per dag");
        Medicijn Citalopram = new Medicijn("Citalopram", "Het regelt in de hersenen de hoeveelheid serotonine.Deze lichaamseigen stof speelt een rol bij emoties en stemmingen. SSRI's verbeteren de stemming en verminderen angsten. Artsen schrijven het voor bij depressie en bij angststoornissen, zoals een dwangstoornis, paniekstoornis, specifieke fobie en posttraumatische stressstoornis. Soms wordt citalopram ook gebruikt bij voortijdige zaadlozing.", "serotonineheropnameremmers ", "De aanbevolen dosering is 20 mg eenmaal daags. Zonodig kan de dosis worden verhoogd tot 40 mg eenmaal daags, of tot maximaal 60 mg per dag.");
        Medicijn Aprokam = new Medicijn("Aprokam", "Cefalosporine-antibiotica doden veel soorten bacteriën. Artsen schrijven het voor bij infecties met bacteriën, zoals luchtweginfecties (onder andere bronchitis, longontsteking, keelpijn door een keelontsteking en bijholteontsteking), middenoorontsteking, blaasontsteking, huidinfecties, sepsis de ziekte van Lyme en cystische fibrose.", "cefalosporine-antibiotica", "De aanbevolen dosis voor cefuroxim is 1 mg in 0,1 ml natriumchloride 9 mg/ml (0,9%) oplossing voor injectie");
        Medicijn Baklofen = new Medicijn("Baklofen", "Artsen schrijven het voor bij spastische spierkrampen, bijvoorbeeld door multipele sclerose (MS), amyotrofische laterale sclerose (ALS) of hersenbeschadigingen, zoals na een beroerte. Het wordt ook gebruikt bij hardnekkige hik, aangezichtspijn (een soort zenuwpijn) en bij alcoholverslaving.", "spierverslapper", "Volwassenen: Oraal: beginnen met 15 mg/dag verdeeld over 2–4 giften en iedere drie dagen verhogen met 15 mg/dag, tot de optimale dosering is bereikt, gewoonlijk 30–80 mg/dag. Alleen bij gehospitaliseerde patiënten onder bewaking zonodig verhogen tot 100–120 mg/dag.");
        Medicijn Bonviva = new Medicijn("Bonviva", "Bisfosfonaten remmen de botafbraak en versterken de botten.Artsen schrijven het voor bij uitzaaiingen in het bot door borstkanker en bij botontkalking (osteoporose).", "bisfosfonaten", "De aanbevolen dosis is één 150 mg filmomhulde tablet per maand. De tablet dient bij voorkeur elke maand op dezelfde datum ingenomen te worden");
        Medicijn Cytomel = new Medicijn("Cytomel", "Artsen schrijven het voor bij een te trage schildklierwerking en als toevoeging op de medicijnen gebruikt bij een te snelle schildklierwerking", "schildklierhormoon", "Cytomel 0,025 is werkzaam bij lage dosis. Een dagdosering van 6,25 tot 25 microgram kan voldoende zijn. Bij dosisverhoging dient te worden gelet op het optreden van eventuele symptomen van hyperthyreoïdie en cardiovasculaire en andere bijwerkingen");
        Medicijn DepoProvera = new Medicijn("Depo-Provera", "Het bevat een vrouwelijk geslachtshormoon, namelijk het progestageenhormoon medroxyprogesteron. Dit heeft ongeveer een zelfde werking als het natuurlijke progesteron. Progestageenhormonen spelen een belangrijke rol bij de vruchtbaarheidscyclus. Artsen schrijven dit medicijn voor om zwangerschap te voorkomen.", "anticonceptie-prikpil", "De aanbevolen dosis is 150 mg Depo-Provera 150 om de 12 weken, toegediend via diep intramusculaire injectie in de bilspier of eventueel de bovenarm");
        Medicijn Foster = new Medicijn("Foster", "Beclometason behoort totde bijnierschorshormonen of corticosteroïden. Het is een luchtwegbeschermer.Artsen schrijven de combinatie voor bij astma en COPD (chronische obstructieve longziekte).", "luchtwegverwijder", "De aanbevolen dosis is twee inhalaties in de ochtend en twee inhalaties in de avond. Risicopatiënten: Voor oudere patiënten hoeft de dosis niet te worden bijgesteld. Er is geen informatie beschikbaar over het gebruik van Foster door mensen met lever- of nierproblemen");
        Medicijn AtraZenaca = new Medicijn("AtraZenaca", "Het bevat een stukje code (DNA) voor het maken van een onschadelijk deel van het virus. COVID-19-vaccin AstraZeneca wordt ook het AstraZeneca-vaccin of het Oxford-vaccin genoemd.Het beschermt u tegen een infectie met het coronavirus, namelijk de ziekte COVID-19 (corona).", "vectorvaccin", "Personen van 18 jaar of ouder Het vaccinatieschema met COVID-19 Vaccine AstraZeneca bestaat uit twee afzonderlijke doses van elk 0,5 ml. De tweede dosis moet worden toegediend tussen de 4 en 12 weken (28 tot 84 dagen) na de eerste dosis");
        Medicijn Halaven = new Medicijn("Halaven", "Artsen schrijven het voor bij gevorderde of uitgezaaide kanker in een borst en in vetweefsel (liposarcoom).", "kankerremmend", ". De dosis kan worden verdund in maximaal 100 ml natriumchlorideoplossing 9 mg/ml (0,9%) voor injectie. Het mag niet worden verdund in 5% glucose- infusieoplossing.");
        Medicijn Hytrin = new Medicijn("Hytrin", "Het ontspant de spieren van de blaashals en de prostaat. Het verbetert de doorstroming van urine door de plasbuis en vermindert klachten als vaak moeten plassen. Artsen schrijven het voor bij een vergrote prostaat of bij een hoge bloeddruk.", "Alfablokkers", "De dagelijkse dosis Hytrin moet worden aangepast op basis van de reactie van de patiënt. Als u geen verbetering opmerkt, raadpleeg dan opnieuw uw arts. Aanvangsdosis De startdosis voor alle patiënten is 1 mg per dag bij het slapengaan. Deze dosis zal geleidelijk aan worden verhoogd");
        Medicijn Broomhexine = new Medicijn("Broomhexine", "Het maakt taai slijm in de luchtwegen dunner (ofwel vloeibaarder), waardoor het slijm makkelijker is op te hoesten.Het kan worden gebruikt bij hoest, COPD en cystische fibrose", "slijmverdunner", "De gebruikelijke dosering voor volwassenen is: 3 maal per dag ½ - 2 tabletten. De gebruikelijke dosering voor kinderen ouder dan 10 jaar is: 3 maal per dag ½ - 2 tabletten. De gebruikelijke dosering voor kinderen van 5 tot 10 jaar is: 3 maal per dag ½ - 1 tablet.");
        Medicijn Kestine = new Medicijn("Kestine", "Artsen schrijven het voor bij allergie, hooikoorts, langdurig ontstoken neusslijmvies, ontstoken ogen door allergie, netelroos en jeuk.", "anti-allergiemedicijn", "De aanbevolen dosering voor volwassenen en kinderen van 12 jaar en ouder is éénmaal daags 1 tablet. In ernstige gevallen kan de dosering worden verhoogd tot éénmaal daags 2 tabletten. In dit laatste geval kunt u ook Kestine 20 gebruiken waarbij de dosering éénmaal daags 1 tablet wordt.");
        Medicijn Lactulose = new Medicijn("Lactulose", "Het is te gebruiken bij obstipatie (verstopping). Artsen schrijven het ook voor bij een ernstige leverziekte met bewusteloosheid.", "laxeermiddel", "Volwassenen (incl. ouderen) en kinderen > 14 jaar: richtlijn: begindosering: 15–45 ml stroop of 24 g poeder per dag in 1–2 doses. Onderhoudsdosering 15–30 ml stroop of 12 g poeder per dag in 1–2 doses");
        Medicijn Lorezapam = new Medicijn("Lorezapam", "Het werkt rustgevend, spierontspannend, vermindert angstgevoelens en beïnvloedt de overdracht van elektrische prikkels in de hersenen. Artsen schrijven het voor bij angstgevoelens en gespannenheid, paniekstoornissen, slapeloosheid, epilepsie, alcoholontwenning, misselijkheid en braken door chemotherapie en onrust.", "benzodiazepinen", ": De gebruikelijke dosering is afhankelijk van de aandoening: Volwassenen: 0,5 – 4 mg per dag Kinderen: 0,02 – 0,1 mg/kg lichaamsgewicht per dag De dagdosering wordt zo nodig verdeeld over meerdere toedieningen per dag. Wijze van innemen: Neem LORAZEPAM 0,5 mg tabletten met vloeistof, bijvoorbeeld water, in");
        Medicijn Losec = new Medicijn("Losec", "Het vermindert de aanmaak van zuur in de maag. Artsen schrijven het voor bij maagklachten, maag- en darmzweren en bij het syndroom van Zollinger-Ellison.", "Maagzuurremmer", "De aanbevolen dosering is 20 mg eenmaal daags. Voor de behandeling van zweren veroorzaakt door een Helicobacter pylori-infectie en om te voorkomen dat de zweren terugkeren: De aanbevolen dosering is 20 mg Losec tweemaal daags, gedurende 1 week.");
        Medicijn Rybelsus = new Medicijn("Rybelsus", "Deze zorgen ervoor dat de hoeveelheid insuline na een maaltijd beter op niveau is en dat het lichaam minder glucose (suiker) vrijzet. Artsen schrijven het voor bij diabetes mellitus (suikerziekte).", "incretine-achtige stoffen", "De startdosis semaglutide is 3 mg eenmaal daags gedurende één maand. Na één maand moet de dosering worden verhoogd naar een onderhoudsdosering van 7 mg eenmaal daags.");
        //medicinList klastaki vasteMedicijnLijst ilac ekle
        medicijnLijst.vasteMedicijnLijst.put("Paracetamol", Paracetamol.toString());
        medicijnLijst.vasteMedicijnLijst.put("Daktarin", Daktarin.toString());
        medicijnLijst.vasteMedicijnLijst.put("Citalopram", Citalopram.toString());
        medicijnLijst.vasteMedicijnLijst.put("Aprokam", Aprokam.toString());
        medicijnLijst.vasteMedicijnLijst.put("Baklofen", Baklofen.toString());
        medicijnLijst.vasteMedicijnLijst.put("Bonviva", Bonviva.toString());
        medicijnLijst.vasteMedicijnLijst.put("Cytomel", Cytomel.toString());
//profillere ilac ekle
        Selma.addMedicijnPatientLijst(Paracetamol);
        Selma.addMedicijnPatientLijst(Lorezapam);
        Selma.addMedicijnPatientLijst(Kestine);
        Mevlut.addMedicijnPatientLijst(Broomhexine);
        Mevlut.addMedicijnPatientLijst(Hytrin);
        Maksud.addMedicijnPatientLijst(Halaven);
        Maksud.addMedicijnPatientLijst(Lactulose);
        Batuhan.addMedicijnPatientLijst(Cytomel);
        Batuhan.addMedicijnPatientLijst(Rybelsus);
        Semiha.addMedicijnPatientLijst(Foster);
        Semiha.addMedicijnPatientLijst(Paracetamol);
        Ahmed.addMedicijnPatientLijst(Aprokam);
        Ahmed.addMedicijnPatientLijst(Broomhexine);
// kilo kaydi olustur
        GewichtsRegistratie selma08032021 = new GewichtsRegistratie("08/3/2021", "7.00", "71.1");
        GewichtsRegistratie selma09032021 = new GewichtsRegistratie("09/3/2021", "7.00", "71.3");
        GewichtsRegistratie selma10032021 = new GewichtsRegistratie("10/3/2021", "7.00", "71.4");
        GewichtsRegistratie selma11032021 = new GewichtsRegistratie("11/3/2021", "7.00", "70.9");
        GewichtsRegistratie selma12032021 = new GewichtsRegistratie("12/3/2021", "7.00", "71.1");
        GewichtsRegistratie selma13032021 = new GewichtsRegistratie("13/3/2021", "7.00", "71.3");
        // kilo kayitlari profile ekle
        Selma.addGewichtRegistratiePatientLijst(selma13032021);
        Selma.addGewichtRegistratiePatientLijst(selma12032021);
        Selma.addGewichtRegistratiePatientLijst(selma11032021);
        Selma.addGewichtRegistratiePatientLijst(selma10032021);
        Selma.addGewichtRegistratiePatientLijst(selma09032021);
        Selma.addGewichtRegistratiePatientLijst(selma08032021);

    }

    //menu sifreli giris
    public Profile inlogscherm() {
        do {
            profile = null;
            patient = null;
            System.out.println("\nWelkom in de ZorgApp, dit is het inlogscherm.\n");
            System.out.println("Wat is uw gebruikersnaam: ");
            gebruikerNaam = scan.nextLine();
            System.out.println("Wat is uw wachtwoord: ");
            paswoord = scan.nextLine();

            for (int i = 0; i < profielList.sizeOf(); i++) {
                if ((profielList.get(i).getGebruikersNaam().equals(gebruikerNaam) && (profielList.get(i).getPasWoord().equals(paswoord)))) {
                    profile = profielList.get(i);
                }
            }
            if (profile == null) {
                System.out.print("Geen goede invoer.Probeer opnieuw");
            }
        } while (profile == null);


        if (profile != null) {
            String functie = profile.getFunctie();
            switch (functie) {

                case "zorgverlener":

                    menuZorgverlener(profile);

                    break;
                case "patient":

                    menuPatient(profile);

                    break;
            }
        }
        return profile;
    }


    // menu doktor
    public void menuZorgverlener(Profile profile) {
        int choice = 0;
        do {
            System.out.println();
            System.out.println("***************************************************************************************************");
            System.out.println("WELKOM ZORGVERLENER : " + profile.getVoorNaam() + profile.getAchterNaam());
            System.out.println("**************************************************************************************************");
            System.out.println("WAT WILT U DOEN? ");

            System.out.println("****************************************************************************************************");
            System.out.println("***************** PATIENTEN DATABASE **************************************************************");
            System.out.println("1-  Nieuwe patient toevoegen ");//hasta ekle
            System.out.println("2-  Patient zoeken  ");//hasta ara
            System.out.println("3-  Patient verwijderen  ");//hasta sil
            System.out.println("4-  Alle patienten zien ");//tum hastalari gor
            System.out.println("***************** VASTE MEDICIJNENLIJST DATABASE  ******************************************************");
            System.out.println("5- Om alle medicijnen te zien");//database ilaclari gor
            System.out.println("6- Om een specifieke medicijn te zoeken");//ilac bilgisi al
            System.out.println("7- Om medicijn aan vastelijst toe te voegen");// ilac ekle
            System.out.println("8- Om medicijn van vastelijst te verwijderen");//ilac sil
            System.out.println("*****************************************************************************************************");
            System.out.println("9- Om terug te keren naar hoofmenu");// inlog a geri don


            choice = scan.nextInt();

            switch (choice) {
                case 1:

                    registerPatient();//yeni kayit

                    break;
                case 2:
                    zoekPatient(patient);//hasta ara
                    break;
                case 3:
                    //patient verwijderen// hastas sil
                    break;

                case 4:
                    profielList.allePatientenZien();//butun hastalari gor
                    break;

                case 5:
                    medicijnLijst.alleMedicijnentZien();//butun ilaclari gor
                    break;

                case 6:
                    medicijnLijst.getMedicijnInfo();//ilac bilgisi al
                    break;
                case 7:
                    medicijnLijst.addMedicijnToVasteLijst();//ilac database listesine ilac ekle
                    break;
                case 8:
                    medicijnLijst.verwijderMedicijnVasteMedicijnLijst();//ilac sil
                    break;
                case 9:
                    inlogscherm();//inloga geri don
                    break;
                default:
                    System.out.println("***** FOUTE KEUZE!! Probeer opnieuw *******");
                    inlogscherm();// inloga don
                    break;
            }
        } while (choice != 0);
    }

    //hasta ara
    private Profile zoekPatient(Profile patient) {
        profielList.allePatientenZien();
        System.out.print("\nGeef het getal van uw keuze: ");
        int choice = scan.nextInt();
        choice = choice - 1;
        patient = profielList.get(choice);

        do {
            System.out.println("Dit zijn de gegevens van: " + patient.getVoorNaam() + "\t" + patient.getAchterNaam());
            System.out.println("Kies een optie voor patient: ");
            System.out.println("********************** BEKIJKEN ********************************************");
            System.out.println(" 1. Persoongegevens bekijken ");//hastanin bilgilerini gor
            System.out.println(" 2. Medicatie bekijken");//hastanin ilaclarini gor
            System.out.println(" 3. Gewichtsregistratie bekijken");// hastanin kilo kayitlarini gor
            System.out.println("************************** WIJZIGEN ****************************************");

            System.out.println(" 4. Wijzig voornaam");//hastanin ismini degistir
            System.out.println(" 5. Wijzig achternaam");//hastanin soy ismini degistir
            System.out.println(" 6. Wijzig leeftijd");//hastanin yasini degistir
            System.out.println(" 7. Wijzig gewicht");//hastanin kilosunu degistir
            System.out.println(" 8. Wijzig lengte");//hastanin boyunu degistir
            //   System.out.println(" 9. Wijzig alle gegevens");//hastanin tum bilgilerini degistir
            System.out.println("************************** TOEVOEGEN ****************************************");
            System.out.println("10. Toevoegen medicatie");//hastanin profiline ilac ekle
            System.out.println("11. Toevoegen gewichtregistratie");//hastanin profiline kilo kaydi ekle
            System.out.println("************************** VERWIJDEREN ****************************************");
            System.out.println("12. Verwijder patiënt");//hasta sil
            System.out.println("13. Verwijder medicijn bij patiënt");//hastanin profilinden ilac sil
            System.out.println("************************* PROGRAMMA BEEINDIGEN ********************************");
            System.out.println("14. Terug naar de patiëntenlijst");
            System.out.println("0.  Terug naar hoofmenu");


            int switchChoice = scan.nextInt();
            switch (switchChoice) {

                case 1:
                    patient.printProfiel();//hasta bilgileri gor
                    break;
                case 2:
                    // zie alle medicijnen patient
                    // hastanin ilaclarini gor
                    break;
                case 3:
                    //zie alle gewichtregistratie patient.
                    // Hastanin tum kilo kayitlari
                    break;

                case 4:
                    patient.wijzigProfielVoornaam();
                    break;

                case 5:
                    patient.wijzigProfielAchternaam();
                    break;

                case 6:
                    patient.wijzigProfielLeeftijd();
                    break;

                case 7:
                    patient.wijzigProfielGewicht();
                    break;

                case 8:
                    patient.wijzigProfielLengte();
                    break;
                case 9:
                    //wijzig alle gegevens//butun bilgileri degistir
                    break;
                case 10:
                    //     addMedicinePatient(patient);
                    // hastaya ilac ekle
                    break;
                case 11:
                    // patient.addGewichtRegistratiePatient();
                    //hastaya kilo kaydi ekle
                    break;
                case 12://verwijder patient
                    // hasta sil
                    break;
                case 13:
                    //verwijdermedicijn patient
                    // hastanin listesinden ilac sil
                    break;

                case 14:
                    menuZorgverlener(profile);
                    break;
                case 0:
                    inlogscherm();
                    break;


                default:
                    System.out.println("Probeer opnieuw. \n");
            }
        } while (choice != 0);
        return patient;
    }

    // menu hasta
    public Profile menuPatient(Profile profile) {
        int choice = 0;
        do {


            System.out.println("Welkom : " + profile.getVoorNaam() + " Wat wilt u doen?");
            System.out.println("********************* GEGEVENS INZIEN *******************************************");
            System.out.println(" 1. Uw persoonlijke gegevens inzien ");//bilgilerimi gor
            System.out.println(" 2. Uw medicijnen inzien");//ilaclarimi gor
            System.out.println(" 3. Uw gewichtregistratie inzien");//kilo kayitlarimi gor
            System.out.println("********************* GEGEVENS WIJZIGEN *************************************************************");
            System.out.println(" 4. Uw leeftijd wijzigen.");//yasimi degistir
            System.out.println(" 5. Uw gewicht wijzigen.");//kilomu degistir
            System.out.println(" 6. Uw lengte wijzigen.");//boyumu degistir
            System.out.println(" 7. Uw gebruikersnaam wijzigen");//kulanici adimi degistir
            System.out.println(" 8. Uw wachtwoord wijzigen");//pasword umu degistir
            System.out.println("******************** PROGRAMMA BEEINDIGEN *****************************************************************");
            System.out.println(" 0. Terug naar login scherm");//inlog menuye git


            choice = scan.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Uw persoons gegevens: ");
                    profile.printProfiel();//bilgileri print
                    break;
                case 2:
                    //alle medicijnen van patient inzien
                    // Hastanin butun ilaclarini gor
                    break;
                case 3://gewichtregistratie inzien
                    // Hastanin kilo kayitlarini gor

                    break;
                case 4:
                    profile.wijzigProfielLeeftijd();//hasta yas degistir
                    break;
                case 5:
                    profile.wijzigProfielGewicht();//hasta kilo degistir
                    break;

                case 6:
                    profile.wijzigProfielLengte();//hastanin boy degistir
                    break;

                case 7:
                    profile.wijzigProfielGebruikerNaam();// hasta kullanici adi degistiriyor
                    break;

                case 8:
                    profile.wijzigProfielPaswoord();//hasta pasword degistiriyor
                    break;

                case 0://hier krijg ik een fout melding// '0' a bastigimda hata veriyor
                    System.out.println("Je gaat weer terug naar hoofdmenu");// inlog menu ye don
                    inlogscherm();
                    break;

                default:
                    System.out.println("Geen goede invoer probeer opnieuw");
            }
        } while (choice != 0);
        return profile;

    }

    //yeni hasta ekle
    void registerPatient() {

        Scanner scan = new Scanner(System.in);
        Profile pr = new Profile();
        System.out.println("Enter je voornaam:");//isim
        pr.setVoorNaam(scan.nextLine());
        System.out.println("Enter je achternaam:");//soy isim
        pr.setAchterNaam(scan.nextLine());
        System.out.println("Enter je leeftijd:");//yas
        pr.setLeeftijd(scan.nextInt());
        System.out.println("Enter je gewicht:");//kilo
        pr.setGewicht(scan.nextFloat());
        scan.useLocale(Locale.US);
        System.out.println("Enter je lengte");//boy
        pr.setLengte(scan.nextFloat());
        scan.useLocale(Locale.US);

        profielList.addProfile(pr);//profielliste ekle
        System.out.println("*********************************************");
        System.out.println("*******PATIENT SUCCESFULL AANGEMAAKT*********");
        System.out.println("*********************************************");
        System.out.println("Zo staat patient geregistreert :\n" + pr);
    }
}


////hasta sil
//    public void verwijderPatient() {
//        Scanner scan = new Scanner(System.in);
//        String patientNaam = "";
//        String result = "";
//
//        do {
//            System.out.println("Enter patient om te verwijderen!");
//            System.out.println("Enter 'X' om programmma te beeindigen");
//            patientNaam = scan.nextLine();
//            profielList.profielList.remove(patientNaam);
//            if (patientNaam.equals("X")) {
//            } else {
//                System.out.println(profielList.toString());
//                System.out.println("verwijderd van profiellist");
//            }
//        } while (!patientNaam.equals("X"));


// hastanin nutun ilaclarini gor
//    void alleMedicijnenPatientZien() {
//        System.out.println("Medicijn LIJST ");
//        System.out.println("medicijn naam\t soort \t omshrijving\t dosering \t");
//        for (int i = 0; i < medicijnLijst.mcList.size(); i++) {
//
//
//            System.out.println(medicijnLijst.mcList.get(i).getMedicijnNaam() +"\t\t\t" + medicijnLijst.mcList.get(i).soort + "\t\t\t" + medicijnLijst.mcList.get(i).Omschrijving +
//                    "\t\t" + medicijnLijst.mcList.get(i).dosering);


//hastaya ilac ekle
//    public void addMedicijnPatient(Medicijn medicijn) {
//        Scanner scan = new Scanner(System.in);
//        String medicijnNaam = "";
//        for (String exit = ""; !exit.equals("S"); exit = scan.nextLine()) {
//
//
//                    Medicijn m = new Medicijn();
//                    System.out.println("Enter medicijn naam: ");
//                    m.medicijnNaam = scan.nextLine();
//                    System.out.println("Enter medicijn omschrijving:");
//                    m.Omschrijving = scan.nextLine();
//                    System.out.println("Enter medicijn soort");
//                    m.soort = scan.nextLine();
//                    System.out.println("Enter dosering");
//                    m.dosering = scan.nextLine();
//                    medicijnLijst.mcList.add(m);
//
//                    System.out.println("Toegevoegde medicijn :" + medicijnLijst.mcList.toString());
//
//                    System.out.println("Enter 'S' om te stoppen");
//                    System.out.println("Druk enter om verder te gaan ");
//                }
//            }
//        }




