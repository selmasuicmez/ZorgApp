import java.util.*;

public class ZorgApp {
    /*
    hasta doktor aplication u
    USER STORIES

    DOKTOR
    **********************************************
    aplikasyona giris yapa bilmeli
    yeni bir hasta eklemek istiyor
    hastalari tek tek bulmak istiyor
    hastalara ilac eklemek istiyor
    bir hastanin tum ilaclarini gormek istiyor
    bir hastanin tum kilo kayitlarini gormek istiyor
    hastaya kilo kaydi eklemek istiyor
    hastanin dosyasindan ilac silmek istiyor

    Systemdeki butun ilaclari gormek istiyor
    hastalarin tumunu gormek istiyor
    ************************************

    hastanin ismini degistirmek istiyor
    hastanin soy ismini degistirmek istiyor
    hastanin yasini degistirmek istiyor
    hastanin boyunu degistirmek istiyor
    hastanin kilosunu degistirmek istiyor

    ******************************************
    hastanin bir onceki kilo kaydina gore nekadar kilo alip almadigini CIZELGE olarak consolda gormek istiyor. (Kilosuna gore yildiz consola basabiliriz)
****************************************************************************************************************************
    HASTA

    kendi bilgilerini gormek istiyor
    kilo kayitlarini gormek istiyor
    ilaclarini gormek istiyor
    *****************************************
    yasini degistirmek istiyor
    kilosunu degistirmek istiyor
    boyunu degistirmek istiyor
    kullanici adini degistirmek istiyor
    sifresini degistirmek istiyor
******************************************************************************************************
    Doktor ve Hasta aplikasyonun dilini degistirebilmelidir. 3 dil secenekli seklinde olabilir
     */

    Scanner scan = new Scanner(System.in);
    Scanner switchChoice = new Scanner(System.in);

    private ProfielList profielList;
    private MedicijnLijst medicijnLijst = new MedicijnLijst();
    private GewichtRegistraties gewichtRegistraties= new GewichtRegistraties();

    private Profile profile;


    Medicijn medicijn = new Medicijn();

    public ZorgApp() {
//profilListe hasta ekle
        Profile Selma = new Profile("selma", "suicmez", "zorgverlener", "Selma", "Suicmez", 38, 65.2, 1.75);
        Profile Mevlut = new Profile("mevlut", "suicmez", "patient", "Mevlut", "Suicmez", 47, 75, 1.80);
        Profile Maksud = new Profile("maksud", "suicmez", "patient", "Maksud", "Suicmez", 13, 60, 1.68);
        Profile Batuhan = new Profile("batuhan", "suicmez", "patient", "Batuhan", "Suicmez", 11, 55, 1.63);
        Profile Semiha = new Profile("semiha", "suicmez", "patient", "Semiha", "Suicmez", 7, 35, 1.30);
        Profile Ahmed = new Profile("ahmed", "suicmez", "patient", "Ahmed", "Suicmez", 2, 25, 0.84);
        profielList = new ProfielList();
        profielList.profielList.add(Selma);
        profielList.profielList.add(Mevlut);
        profielList.profielList.add(Maksud);
        profielList.profielList.add(Batuhan);
        profielList.profielList.add(Ahmed);
        profielList.profielList.add(Semiha);
        //ilaclari olustur
        Medicijn Paracetamol = new Medicijn("\tParacetamol","Gebruiken bij hoofdpijn, migraine, keelpijn, oorpijn, spierpijn, gewrichtspijn. Ook bij koorts, griep en verkoudheid.", "\tPijnstiller en koortsverlager", "\t\t\t\t\t\t\t\tVolwassenen mogen bij kortdurend gebruik 3 tot 4 keer per dag 1 tot 2 tabletten van 500 mg paracetamol gebruiken (niet langer dan 4 weken achter elkaar). ");
        Medicijn Daktarin = new Medicijn("\tDaktarin","\t\t\tGebruiken bijschimmelinfecties van de huid, zoals voetschimmel, schimmelnagels en eikelontsteking. ", "\tantischimmelmiddel", "\t\t\t\t\t\t\t\t\t\t\t\t\tDaktarin maximaal 4x per dag");
        Medicijn Citalopram = new Medicijn("\tCitalopram","\tGebruiken bij depressie en bij angststoornissen, zoals een dwangstoornis, paniekstoornis, specifieke fobie en posttraumatische stressstoornis.", "\tserotonineheropnameremmers ", "\t\tDe aanbevolen dosering is 20 mg eenmaal daags. Zonodig kan de dosis worden verhoogd tot 40 mg eenmaal daags.");
        Medicijn Aprokam = new Medicijn("\tAprokam","\t\t\t\t\tGebruiken bij infecties met bacteriën, zoals  middenoorontsteking, blaasontsteking, huidinfecties,  sepsis de ziekte van Lyme en cystische fibrose.", "\t\tAntibiotica", "De aanbevolen dosis voor cefuroxim is 1 mg in 0,1 ml natriumchloride 9 mg/ml (0,9%) oplossing voor injectie");
        Medicijn Baklofen = new Medicijn("Baklofen", "Artsen schrijven het voor bij spastische spierkrampen, bijvoorbeeld door multipele sclerose (MS), amyotrofische laterale sclerose (ALS) of hersenbeschadigingen, zoals na een beroerte. Het wordt ook gebruikt bij hardnekkige hik, aangezichtspijn (een soort zenuwpijn) en bij alcoholverslaving.", "spierverslapper", "Volwassenen: Oraal: beginnen met 15 mg/dag verdeeld over 2–4 giften en iedere drie dagen verhogen met 15 mg/dag, tot de optimale dosering is bereikt, gewoonlijk 30–80 mg/dag. Alleen bij gehospitaliseerde patiënten onder bewaking zonodig verhogen tot 100–120 mg/dag.");
        Medicijn Bonviva = new Medicijn("Bonviva", "Bisfosfonaten remmen de botafbraak en versterken de botten.Artsen schrijven het voor bij uitzaaiingen in het bot door borstkanker en bij botontkalking (osteoporose).", "bisfosfonaten", "De aanbevolen dosis is één 150 mg filmomhulde tablet per maand. De tablet dient bij voorkeur elke maand op dezelfde datum ingenomen te worden");
        Medicijn Cytomel = new Medicijn("Cytomel", "Artsen schrijven het voor bij een te trage schildklierwerking en als toevoeging op de medicijnen gebruikt bij een te snelle schildklierwerking", "schildklierhormoon", "Cytomel 0,025 is werkzaam bij lage dosis. Een dagdosering van 6,25 tot 25 microgram kan voldoende zijn. Bij dosisverhoging dient te worden gelet op het optreden van eventuele symptomen van hyperthyreoïdie en cardiovasculaire en andere bijwerkingen");
        Medicijn DepoProvera = new Medicijn("Depo-Provera", "Het bevat een vrouwelijk geslachtshormoon, namelijk het progestageenhormoon medroxyprogesteron. Dit heeft ongeveer een zelfde werking als het natuurlijke progesteron. Progestageenhormonen spelen een belangrijke rol bij de vruchtbaarheidscyclus. Artsen schrijven dit medicijn voor om zwangerschap te voorkomen.", "anticonceptie-prikpil", "De aanbevolen dosis is 150 mg Depo-Provera 150 om de 12 weken, toegediend via diep intramusculaire injectie in de bilspier of eventueel de bovenarm");
        Medicijn Foster = new Medicijn("Foster", "Beclometason behoort totde bijnierschorshormonen of corticosteroïden. Het is een luchtwegbeschermer.Artsen schrijven de combinatie voor bij astma en COPD (chronische obstructieve longziekte).", "luchtwegverwijder", "De aanbevolen dosis is twee inhalaties in de ochtend en twee inhalaties in de avond. Risicopatiënten: Voor oudere patiënten hoeft de dosis niet te worden bijgesteld. Er is geen informatie beschikbaar over het gebruik van Foster door mensen met lever- of nierproblemen");
        Medicijn AtraZenaca = new Medicijn("AtraZenaca", "Het bevat een stukje code (DNA) voor het maken van een onschadelijk deel van het virus. COVID-19-vaccin AstraZeneca wordt ook het AstraZeneca-vaccin of het Oxford-vaccin genoemd.Het beschermt u tegen een infectie met het coronavirus, namelijk de ziekte COVID-19 (corona).", "vectorvaccin", "Personen van 18 jaar of ouder Het vaccinatieschema met COVID-19 Vaccine AstraZeneca bestaat uit twee afzonderlijke doses van elk 0,5 ml. De tweede dosis moet worden toegediend tussen de 4 en 12 weken (28 tot 84 dagen) na de eerste dosis");
        Medicijn Halaven = new Medicijn("Halaven", "Artsen schrijven het voor bij gevorderde of uitgezaaide kanker in een borst en in vetweefsel (liposarcoom).", "kankerremmend", ". De dosis kan worden verdund in maximaal 100 ml natriumchlorideoplossing 9 mg/ml (0,9%) voor injectie. Het mag niet worden verdund in 5% glucose- infusieoplossing.");
        Medicijn Hytrin = new Medicijn("Hytrin", "Het ontspant de spieren van de blaashals en de prostaat. Het verbetert de doorstroming van urine door de plasbuis en vermindert klachten als vaak moeten plassen. Artsen schrijven het voor bij een vergrote prostaat of bij een hoge bloeddruk.", "Alfablokkers", "De dagelijkse dosis Hytrin moet worden aangepast op basis van de reactie van de patiënt. Als u geen verbetering opmerkt, raadpleeg dan opnieuw uw arts. Aanvangsdosis De startdosis voor alle patiënten is 1 mg per dag bij het slapengaan. Deze dosis zal geleidelijk aan worden verhoogd");
        Medicijn Broomhexine = new Medicijn("Broomhexine", "Het maakt taai slijm in de luchtwegen dunner (ofwel vloeibaarder), waardoor het slijm makkelijker is op te hoesten.Het kan worden gebruikt bij hoest, COPD en cystische fibrose", "slijmverdunner", "De gebruikelijke dosering voor volwassenen is: 3 maal per dag ½ - 2 tabletten. De gebruikelijke dosering voor kinderen ouder dan 10 jaar is: 3 maal per dag ½ - 2 tabletten. De gebruikelijke dosering voor kinderen van 5 tot 10 jaar is: 3 maal per dag ½ - 1 tablet.");
        Medicijn Kestine = new Medicijn("Kestine", "\t\tGebruiken bij allergie, hooikoorts, langdurig ontstoken neusslijmvies, ontstoken ogen door allergie, netelroos en jeuk.", "\t\tanti-allergiemedicijn", "\t\t\t\t\t\tDe aanbevolen dosering voor volwassenen en kinderen van 12 jaar en ouder is éénmaal daags 1 tablet. In ernstige gevallen kan de dosering worden verhoogd tot éénmaal daags 2 tabletten. In dit laatste geval kunt u ook Kestine 20 gebruiken waarbij de dosering éénmaal daags 1 tablet wordt.");
        Medicijn Lactulose = new Medicijn("Lactulose", "Het is te gebruiken bij obstipatie (verstopping). Artsen schrijven het ook voor bij een ernstige leverziekte met bewusteloosheid.", "laxeermiddel", "Volwassenen (incl. ouderen) en kinderen > 14 jaar: richtlijn: begindosering: 15–45 ml stroop of 24 g poeder per dag in 1–2 doses. Onderhoudsdosering 15–30 ml stroop of 12 g poeder per dag in 1–2 doses");
        Medicijn Lorezapam = new Medicijn("\tLorezapam", "\t\t\t\tGebruiken bij angstgevoelens paniekstoornissen, slapeloosheid, epilepsie, misselijkheid en braken door chemotherapie en onrust.", "\tbenzodiazepinen", "\t\t\t\t\tDosering is afhankelijk van de aandoening: Volwassenen: 0,5 – 4 mg per dag Kinderen: 0,02 – 0,1 mg/kg lichaamsgewicht per dag De dagdosering wordt zo nodig verdeeld over meerdere toedieningen per dag. Wijze van innemen: Neem LORAZEPAM 0,5 mg tabletten met vloeistof, bijvoorbeeld water, in");
        Medicijn Losec = new Medicijn("Losec", "Het vermindert de aanmaak van zuur in de maag. Artsen schrijven het voor bij maagklachten, maag- en darmzweren en bij het syndroom van Zollinger-Ellison.", "Maagzuurremmer", "De aanbevolen dosering is 20 mg eenmaal daags. Voor de behandeling van zweren veroorzaakt door een Helicobacter pylori-infectie en om te voorkomen dat de zweren terugkeren: De aanbevolen dosering is 20 mg Losec tweemaal daags, gedurende 1 week.");
        Medicijn Rybelsus = new Medicijn("Rybelsus", "Deze zorgen ervoor dat de hoeveelheid insuline na een maaltijd beter op niveau is en dat het lichaam minder glucose (suiker) vrijzet. Artsen schrijven het voor bij diabetes mellitus (suikerziekte).", "incretine-achtige stoffen", "De startdosis semaglutide is 3 mg eenmaal daags gedurende één maand. Na één maand moet de dosering worden verhoogd naar een onderhoudsdosering van 7 mg eenmaal daags.");
        //medicinList klastaki vasteMedicijnLijst ilac ekle
        medicijnLijst.addMedicijn(Paracetamol);
        medicijnLijst.addMedicijn(Daktarin);
        medicijnLijst.addMedicijn(Citalopram);
        medicijnLijst.addMedicijn(Aprokam);
        medicijnLijst.addMedicijn(Baklofen);
        medicijnLijst.addMedicijn(Bonviva);
        medicijnLijst.addMedicijn(Cytomel);
        medicijnLijst.addMedicijn(DepoProvera);
        medicijnLijst.addMedicijn(Foster);
        medicijnLijst.addMedicijn(AtraZenaca);
        medicijnLijst.addMedicijn(Halaven);
        medicijnLijst.addMedicijn(Hytrin);
        medicijnLijst.addMedicijn(Broomhexine);
        medicijnLijst.addMedicijn(Kestine);
        medicijnLijst.addMedicijn(Lactulose);
        medicijnLijst.addMedicijn(Lorezapam);
        medicijnLijst.addMedicijn(Losec);
        medicijnLijst.addMedicijn(Rybelsus);
//profillere ilac ekle
        Selma.addMedicijn(Paracetamol);
        Selma.addMedicijn(Lorezapam);
        Selma.addMedicijn(Kestine);
        Mevlut.addMedicijn(Broomhexine);
        Mevlut.addMedicijn(Hytrin);
        Mevlut.addMedicijn(Broomhexine);
        Maksud.addMedicijn(Halaven);
        Batuhan.addMedicijn(Cytomel);
        Batuhan.addMedicijn(Rybelsus);
        Semiha.addMedicijn(Foster);
        Semiha.addMedicijn(Paracetamol);

        Ahmed.addMedicijn(Broomhexine);
// kilo kaydi olustur
        GewichtsRegistratie selma08032021 = new GewichtsRegistratie("08/3/2021", "7.00", 70.1);
        GewichtsRegistratie selma09032021 = new GewichtsRegistratie("09/3/2021", "7.00", 72.3);
        GewichtsRegistratie selma10032021 = new GewichtsRegistratie("10/3/2021", "7.00", 73.4);
        GewichtsRegistratie selma11032021 = new GewichtsRegistratie("11/3/2021", "7.00", 74.9);
        GewichtsRegistratie mevlut12032021 = new GewichtsRegistratie("12/3/2021", "7.00", 75.1);
        GewichtsRegistratie mevlut13032021 = new GewichtsRegistratie("13/3/2021", "7.00", 79.3);
        GewichtsRegistratie mevlut28032021 = new GewichtsRegistratie("28/3/2021", "7.00", 85.3);
        GewichtsRegistratie mevlut29032021 = new GewichtsRegistratie("29/3/2021", "7.00", 86.3);

        GewichtsRegistratie maksud10032021 = new GewichtsRegistratie("10/3/2021", "7.00", 55.3);
        GewichtsRegistratie maksud11032021 = new GewichtsRegistratie("11/3/2021", "7.00", 56.3);
        GewichtsRegistratie maksud12032021 = new GewichtsRegistratie("12/3/2021", "7.00", 57.3);

        GewichtsRegistratie semiha10032021 = new GewichtsRegistratie("10/3/2021", "7.00", 40.3);
        GewichtsRegistratie semiha11032021 = new GewichtsRegistratie("11/3/2021", "7.00", 41.3);
        GewichtsRegistratie semiha12032021 = new GewichtsRegistratie("12/3/2021", "7.00", 39.3);

        GewichtsRegistratie ahmed10032021 = new GewichtsRegistratie("10/3/2021", "7.00", 20.3);
        GewichtsRegistratie ahmed11032021 = new GewichtsRegistratie("11/3/2021", "7.00", 21.3);
        GewichtsRegistratie ahmed12032021 = new GewichtsRegistratie("12/3/2021", "7.00", 22.3);
        // kilo kayitlari profile ekle

        Selma.addGewichtRegistratie(selma11032021);
        Selma.addGewichtRegistratie(selma10032021);
        Selma.addGewichtRegistratie(selma09032021);
        Selma.addGewichtRegistratie(selma08032021);
        Mevlut.addGewichtRegistratie(mevlut12032021);
        Mevlut.addGewichtRegistratie(mevlut13032021);
        Mevlut.addGewichtRegistratie(mevlut28032021);
        Mevlut.addGewichtRegistratie(mevlut29032021);
        Maksud.addGewichtRegistratie(maksud10032021);
        Maksud.addGewichtRegistratie(maksud11032021);
        Maksud.addGewichtRegistratie(maksud12032021);
        Semiha.addGewichtRegistratie(semiha10032021);
        Semiha.addGewichtRegistratie(semiha11032021);
        Semiha.addGewichtRegistratie(semiha12032021);
        Ahmed.addGewichtRegistratie(ahmed10032021);
        Ahmed.addGewichtRegistratie(ahmed11032021);
        Ahmed.addGewichtRegistratie(ahmed12032021);
    }
    //menu sifreli giris
    public Profile inlogschermPatient() {

        do {
            profile = null;
            System.out.println("Welkom patient, dit is het inlogscherm.");
            System.out.println("Wat is uw gebruikersnaam: ");
            String gebruikerNaam = scan.nextLine();
            System.out.println("Wat is uw wachtwoord: ");
            String paswoord = scan.nextLine();

            for (int i = 0; i < profielList.sizeOf(); i++) {
                if ((profielList.get(i).getGebruikersNaam().equals(gebruikerNaam) && (profielList.get(i).getPasWoord().equals(paswoord)))) {
                    profile = profielList.get(i);
                }
            }
            if (profile == null) {
                System.out.print("Geen profiel gevonden probeer opnieuw");
            }
        } while (profile == null);

        if (profile != null) {
            menuPatient(profile);

        }return  profile;
    }

    public Profile inlogschermZorgverlener() {

        do {
            profile = null;
            System.out.println("Welkom zorgverlener, dit is het inlogscherm.");
            System.out.println("Wat is uw gebruikersnaam: ");
            String gebruikerNaam = scan.nextLine();
            System.out.println("Wat is uw wachtwoord: ");
            String paswoord = scan.nextLine();

            for (int i = 0; i < profielList.sizeOf(); i++) {
                if ((profielList.get(i).getGebruikersNaam().equals(gebruikerNaam) && (profielList.get(i).getPasWoord().equals(paswoord)))) {
                    profile = profielList.get(i);
                }
            }
            if (profile == null) {
                System.out.print("Geen profiel gevonden probeer opnieuw");
            }
        } while (profile == null);

        if (profile != null) {
            menuZorgverlener(profile);
        }return  profile;
    }

    // menu doktor
    public void menuZorgverlener(Profile profile) {
        int choice;
        do {
            System.out.println();
            System.out.println("***************************************************************************************************");
            System.out.println("WELKOM ZORGVERLENER : " + profile.getVoorNaam() +" "+ profile.getAchterNaam());
            System.out.println("**************************************************************************************************");
            System.out.println("WAT WILT U DOEN. ENTER NUMMER? ");
            System.out.println();
            System.out.println("1-  Om patient toe te voegen");//hasta ekle
            System.out.println("2-  Om patient te zoeken  ");//hasta ara
            System.out.println("3-  Om alle patienten zien");//tum hastalari gor
            System.out.println("4-  Om alle medicijnen te zien");//butun ilaclari gor
            System.out.println("*****************************************************************************************************");
            System.out.println("5- Om terug te keren naar hoofmenu");// inlog a geri don


           choice = scan.nextInt();

            switch (choice) {
                case 1:
                    registerPatient();//yeni kayit
                    break;

                case 2:
                    zoekPatient();//hasta ara
                    break;

                case 3:
                    profielList.printAllePatienten();//butun hastalari gor
                    break;

                case 4:
                    medicijnLijst.print();//butun ilaclari gor
                    break;

                case 5: startScherm();//girise donus
                    break;

                default:
                    System.out.println("***** FOUTE KEUZE!! Probeer opnieuw *******");
                    break;
            }
        } while (choice != 0);
    }

    //hasta ara
    private Profile zoekPatient() {

        profielList.printAllePatienten();

        System.out.print("Enter nummer van patient:  ");

        int choice = scan.nextInt();
        choice = choice ;
        Profile patient = profielList.get(choice);

        do {
            System.out.println("Dit zijn de gegevens van: " + patient.getVoorNaam() + " " + patient.getAchterNaam());
            System.out.println("Kies een optie voor patient: ");
            System.out.println();
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
            System.out.println("************************** TOEVOEGEN ****************************************");
            System.out.println("9. Toevoegen medicatie");//hastanin profiline ilac ekle
            System.out.println("10. Toevoegen gewichtregistratie");//hastanin profiline kilo kaydi ekle
            System.out.println("************************** VERWIJDEREN ****************************************");
            System.out.println("11. Verwijder medicijn bij patiënt");//hastanin profilinden ilac sil
            System.out.println("************************* PROGRAMMA BEEINDIGEN ********************************");
            System.out.println("12.  Terug naar hoofmenu");//menuye don


            int switchChoice = scan.nextInt();
            switch (switchChoice) {

                case 1:
                    patient.printProfiel();//hasta bilgileri gor
                    break;

                case 2:
                    patient.alleMedicaties();//butun ilaclari gor
                    break;

                case 3:
                    patient.alleGewichtRegistraties();// Hastanin tum kilo kayitlari
                    break;

                case 4:
                    patient.wijzigProfielVoornaam();//ismi degistir
                    break;

                case 5:
                    patient.wijzigProfielAchternaam();//soy ismi degistir
                    break;

                case 6:
                    patient.wijzigProfielLeeftijd();//yas degistir
                    break;

                case 7:
                    patient.wijzigProfielGewicht();//kilo degistir
                    break;

                case 8:
                    patient.wijzigProfielLengte();//boy degistir
                    break;

                case 9:
                   patient.medicijnToevoegen();//hasta ya ilac ekle
                    break;

                case 10:
                    patient.gewichtToevoegen();//hastaya kilo kaydi ekle
                    break;

                case 11:
                    patient.verwijderMedicijn();//hastadan ilac sil
                    break;

                case 12:
                    startScherm();//basa don
                    break;

                default:
                    System.out.println("Invoer niet correct probeer opnieuw");
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
            System.out.println(" 9. Terug naar login scherm");//inlog menuye git

            choice = scan.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("Uw persoons gegevens: ");
                    profile.printProfiel();//bilgileri gor
                    break;

                case 2:
                    profile.alleMedicaties();// Hastanin tum ilaclarini gor
                    break;

                case 3:
                    profile.alleGewichtRegistraties();// Hastanin tum kilo kayitlarini gor
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

                case 9: // inlog menu ye don
                    startScherm();
                    break;

                default:
                    System.out.println("Geen goede invoer probeer opnieuw");
            }
        } while (choice != 0);
        return profile;
    }

    public void startScherm() {
        int choice;
        do {
            System.out.println("WELKOM BIJ DE ZORGAPP");
            System.out.println();
            System.out.println("Ben je zorgverlener toets 1 ");
            System.out.println("Ben je patient toets 2 ");

            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    inlogschermZorgverlener();
                    break;

                case 2:
                    inlogschermPatient();
                    break;

                default:
                    System.out.println("geen goede invoer probeer opnieuw");

            }
        } while (choice != 0);
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





