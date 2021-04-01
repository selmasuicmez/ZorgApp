import java.util.*;
import java.util.Scanner;

public class ZorgApp {
    int taal = 1;
    ResourceBundle messages;
    Scanner scan;
    private ProfielList profielList;
    private MedicijnLijst medicijnLijst;
    private Profile profile;
    Medicijn medicijn;

    public ZorgApp() {
        this.scan = new Scanner(System.in);
        this.medicijnLijst = new MedicijnLijst();
        this.medicijn = new Medicijn();
        Profile Selma = new Profile("selma", "suicmez", "Selma", "Suicmez", 38, 65.2, 1.75);
        Profile Mevlut = new Profile("mevlut", "suicmez", "Mevlut", "Suicmez", 47, 75, 1.80);
        Profile Maksud = new Profile("maksud", "suicmez", "Maksud", "Suicmez", 13, 60, 1.68);
        Profile Batuhan = new Profile("batuhan", "suicmez", "Batuhan", "Suicmez", 11, 55, 1.63);
        Profile Semiha = new Profile("semiha", "suicmez", "Semiha", "Suicmez", 7, 35, 1.30);
        Profile Ahmed = new Profile("ahmed", "suicmez", "Ahmed", "Suicmez", 2, 25, 0.84);
        this.profielList = new ProfielList();
        this.profielList.profielList.add(Selma);
        this.profielList.profielList.add(Mevlut);
        this.profielList.profielList.add(Maksud);
        this.profielList.profielList.add(Batuhan);
        this.profielList.profielList.add(Ahmed);
        this.profielList.profielList.add(Semiha);
        Medicijn Paracetamol = new Medicijn("\tParacetamol", "Gebruiken bij hoofdpijn, migraine, keelpijn, oorpijn, spierpijn, gewrichtspijn. Ook bij koorts, griep en verkoudheid.", "\tPijnstiller en koortsverlager", "\t\t\t\t\t\t\t\tVolwassenen mogen bij kortdurend gebruik 3 tot 4 keer per dag 1 tot 2 tabletten van 500 mg paracetamol gebruiken (niet langer dan 4 weken achter elkaar). ");
        Medicijn Daktarin = new Medicijn("\tDaktarin", "\t\t\tGebruiken bijschimmelinfecties van de huid, zoals voetschimmel, schimmelnagels en eikelontsteking. ", "\tantischimmelmiddel", "\t\t\t\t\t\t\t\t\t\t\t\t\tDaktarin maximaal 4x per dag");
        Medicijn Citalopram = new Medicijn("\tCitalopram", "\tGebruiken bij depressie en bij angststoornissen, zoals een dwangstoornis, paniekstoornis, specifieke fobie en posttraumatische stressstoornis.", "\tserotonineheropnameremmers ", "\t\tDe aanbevolen dosering is 20 mg eenmaal daags. Zonodig kan de dosis worden verhoogd tot 40 mg eenmaal daags.");
        Medicijn Aprokam = new Medicijn("\tAprokam", "\t\t\t\t\tGebruiken bij infecties met bacteriën, zoals  middenoorontsteking, blaasontsteking, huidinfecties,  sepsis de ziekte van Lyme en cystische fibrose.", "\t\tAntibiotica", "De aanbevolen dosis voor cefuroxim is 1 mg in 0,1 ml natriumchloride 9 mg/ml (0,9%) oplossing voor injectie");
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
        this.medicijnLijst.addMedicijn(Paracetamol);
        this.medicijnLijst.addMedicijn(Daktarin);
        this.medicijnLijst.addMedicijn(Citalopram);
        this.medicijnLijst.addMedicijn(Aprokam);
        this.medicijnLijst.addMedicijn(Baklofen);
        this.medicijnLijst.addMedicijn(Bonviva);
        this.medicijnLijst.addMedicijn(Cytomel);
        this.medicijnLijst.addMedicijn(DepoProvera);
        this.medicijnLijst.addMedicijn(Foster);
        this.medicijnLijst.addMedicijn(AtraZenaca);
        this.medicijnLijst.addMedicijn(Halaven);
        this.medicijnLijst.addMedicijn(Hytrin);
        this.medicijnLijst.addMedicijn(Broomhexine);
        this.medicijnLijst.addMedicijn(Kestine);
        this.medicijnLijst.addMedicijn(Lactulose);
        this.medicijnLijst.addMedicijn(Lorezapam);
        this.medicijnLijst.addMedicijn(Losec);
        this.medicijnLijst.addMedicijn(Rybelsus);
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
        GewichtsRegistratie selma08032021 = new GewichtsRegistratie("08/3/2021", "7.00", 69.1);
        GewichtsRegistratie selma09032021 = new GewichtsRegistratie("09/3/2021", "7.00", 60.3);
        GewichtsRegistratie selma10032021 = new GewichtsRegistratie("10/3/2021", "7.00", 65.4);
        GewichtsRegistratie selma11032021 = new GewichtsRegistratie("11/3/2021", "7.00", 80.9);
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

    public Profile inlogschermPatient() {
        do {
            scan = new Scanner(System.in);
            this.profile = null;
            System.out.println(getTaal("Welkom_patient_dit_is_het_inlogscherm"));
            System.out.println(getTaal("Wat_is_uw_gebruikersnaam"));
            String gebruikerNaam = scan.nextLine();
            System.out.println(getTaal("Wat_is_uw_wachtwoord"));
            String paswoord = scan.nextLine();

            for (int i = 0; i < this.profielList.sizeOf(); ++i) {
                if (this.profielList.get(i).getGebruikersNaam().equals(gebruikerNaam) && this.profielList.get(i).getPasWoord().equals(paswoord)) {
                    this.profile = this.profielList.get(i);
                }
            }

            if (this.profile == null) {
                System.out.print("Geen profiel gevonden probeer opnieuw");
            }
        } while (this.profile == null);

        if (this.profile != null) {
            this.menuPatient(profile);
        }

        return profile;
    }

    public Profile inlogschermZorgverlener() {
        do {
            Scanner scan = new Scanner(System.in);
            this.profile = null;
            System.out.println(getTaal("Welkom_zorgVerlener_dit_is_het_inlogscherm"));
            System.out.println(getTaal("Wat_is_uw_gebruikersnaam"));
            String gebruikerNaam = scan.nextLine();
            System.out.println(getTaal("Wat_is_uw_wachtwoord"));
            String paswoord = scan.nextLine();

            for (int i = 0; i < this.profielList.sizeOf(); ++i) {
                if (this.profielList.get(i).getGebruikersNaam().equals(gebruikerNaam) && this.profielList.get(i).getPasWoord().equals(paswoord)) {
                    this.profile = this.profielList.get(i);
                }
            }

            if (this.profile == null) {
                System.out.print("Geen profiel gevonden probeer opnieuw");
            }
        } while (this.profile == null);

        if (this.profile != null) {
            this.menuZorgverlener(profile);
        }

        return profile;
    }

    public void menuZorgverlener(Profile profile) {
        int choice;
        do {
            System.out.println();
            System.out.println("***************************************************************************************************");
            System.out.printf(getTaal("WELKOM_ZORGVERLENER") + profile.getVoorNaam() + " " + profile.getAchterNaam());
            System.out.println("**************************************************************************************************");
            System.out.println(getTaal("WAT_WILT_U_DOEN_ENTER_NUMMER"));
            System.out.println();
            System.out.println(getTaal("Om_patient_toe_te_voegen"));
            System.out.println(getTaal("Om_patient_te_zoeken"));
            System.out.println(getTaal("Om_alle_patienten_zien"));
            System.out.println(getTaal("Om_alle_medicijnen_te_zien"));
            System.out.println("*****************************************************************************************************");
            System.out.println(getTaal("Om_terug_te_keren_naar_hoofmenu"));

            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    registerPatient();
                    break;

                case 2:
                    zoekPatient();
                    break;

                case 3:
                    profielList.printAllePatienten();
                    break;

                case 4:
                    medicijnLijst.print();
                    break;

                case 5:
                    startScherm();
                    break;

                default:
                    System.out.println("***** FOUTE KEUZE!! Probeer opnieuw *******");
                    break;
            }
        } while (choice != 0);
    }

    private Profile zoekPatient() {
        profielList.printAllePatienten();
        System.out.print(getTaal("Enter_nummer_van_patient"));
        int choice = this.scan.nextInt();
        choice = choice;
        Profile patient = profielList.get(choice);

        do {
            System.out.println(getTaal("Dit_zijn_de_gegevens_van") + patient.getVoorNaam() + " " + patient.getAchterNaam());
            System.out.println(getTaal("Kies_een_optie_voor_patient"));
            System.out.println();
            System.out.println(getTaal("bekijken"));
            System.out.println(getTaal("Persoongegevens_bekijken"));
            System.out.println(getTaal("Medicatie_bekijken"));
            System.out.println(getTaal("Gewichtsregistratie_bekijken"));
            System.out.println(getTaal("wijzigen"));
            System.out.println(getTaal("Wijzig_voornaam"));
            System.out.println(getTaal("Wijzig_achternaam"));
            System.out.println(getTaal("Wijzig_leeftijd"));
            System.out.println(getTaal("Wijzig_gewicht"));
            System.out.println(getTaal("Wijzig_lengte"));
            System.out.println(getTaal("toevoegen"));
            System.out.println(getTaal("Toevoegen_medicatie"));
            System.out.println(getTaal("Toevoegen_gewichtregistratie"));
            System.out.println(getTaal("verwijderen"));
            System.out.println(getTaal("Verwijder_medicijn_bij_patiënt"));
            System.out.println(getTaal("programma_beeindigen"));
            System.out.println(getTaal("Terug_naar_hoofmenu"));


            int switchChoice = scan.nextInt();
            switch (switchChoice) {

                case 1:
                    patient.printProfiel();
                    break;

                case 2:
                    patient.alleMedicaties();
                    break;

                case 3:
                    patient.alleGewichtRegistraties();
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
                    patient.medicijnToevoegen();
                    break;

                case 10:
                    patient.gewichtToevoegen();
                    break;

                case 11:
                    patient.verwijderMedicijn();
                    break;

                case 12:
                    startScherm();
                    break;

                default:
                    System.out.println("Invoer niet correct probeer opnieuw");
            }
        } while (choice != 0);

        return patient;
    }

    public Profile menuPatient(Profile profile) {
        int choice;
        do {
            System.out.printf(getTaal("Welkom_wat_wil_je_doen"),profile.getVoorNaam());
            System.out.println(getTaal("gegevens_inzien"));
            System.out.println(getTaal("Uw_persoonlijke_gegevens_inzien"));
            System.out.println(getTaal("Uw_medicijnen_inzien"));
            System.out.println(getTaal("Uw_gewichtregistratie_inzien"));
            System.out.println(getTaal("gegevens_wijzigen"));
            System.out.println(getTaal("Uw_leeftijd_wijzigen"));
            System.out.println(getTaal("Uw_gewicht_wijzigen"));
            System.out.println(getTaal("Uw_lengte_wijzigen"));
            System.out.println(getTaal("Uw_gebruikersnaam_wijzigen"));
            System.out.println(getTaal("Uw_wachtwoord_wijzigen"));
            System.out.println(getTaal("programma_beeindigen"));
            System.out.println(getTaal("Terug_naar_login_scherm"));

            choice = scan.nextInt();
            switch (choice) {

                case 1:
                    System.out.println(getTaal("Uw_persoons_gegevens"));
                    profile.printProfiel();
                    break;

                case 2:
                    profile.alleMedicaties();
                    break;

                case 3:
                    profile.alleGewichtRegistraties();
                    break;

                case 4:
                    profile.wijzigProfielLeeftijd();
                    break;

                case 5:
                    profile.wijzigProfielGewicht();
                    break;

                case 6:
                    profile.wijzigProfielLengte();
                    break;

                case 7:
                    profile.wijzigProfielGebruikerNaam();
                    break;

                case 8:
                    profile.wijzigProfielPaswoord();
                    break;

                case 9:
                    startScherm();
                    break;

                default:
                    System.out.println("Geen goede invoer probeer opnieuw");
            }
        } while (choice != 0);
        return profile;
    }

    public void startScherm() {
        this.messages = this.getDefaultLanguage();

        int choice;
        do {
            System.out.println(this.getTaal("WELKOM_BIJ_DE_ZORGAPP"));
            System.out.println();
            System.out.println(this.getTaal("Ben_je_zorgverlener_toets_1"));
            System.out.println(this.getTaal("Ben_je_patient_toets_2"));
            System.out.println(this.getTaal("Taal_3"));
            choice = this.scan.nextInt();
            switch(choice) {
                case 1:
                    this.inlogschermZorgverlener();
                    break;
                case 2:
                    this.inlogschermPatient();
                    break;
                case 3:
                    this.taalWijzigen();
                    break;
                default:
                    System.out.println("geen goede invoer probeer opnieuw");
            }
        } while(choice != 0);
    }

    void registerPatient() {
        Scanner scan = new Scanner(System.in);
        Profile patient = new Profile();
        System.out.println(getTaal("Enter_je_voornaam"));
        patient.setVoorNaam(scan.nextLine());
        System.out.println(getTaal("Enter_je_achternaam"));
        patient.setAchterNaam(scan.nextLine());
        System.out.println(getTaal("Enter_je_leeftijd"));

        try {
            patient.setLeeftijd(scan.nextInt());
        } catch(InputMismatchException e){
            System.out.println(getTaal("geen_goede_invoer_int"));
            menuZorgverlener(profile);
        }
        System.out.println(getTaal("Enter_je_gewicht"));
        try {
            patient.setGewicht(scan.nextDouble());
            scan.useLocale(Locale.US);
        }
        catch(InputMismatchException e){
            System.out.println(getTaal("geen_goede_invoer_komma"));
            menuZorgverlener(profile);
        }
        System.out.println(getTaal("Enter_je_lengte"));
        try{
            patient.setLengte(scan.nextDouble());
            scan.useLocale(Locale.US);
        }catch(InputMismatchException e){
            System.out.println(getTaal("geen_goede_invoer_punt"));
            menuZorgverlener(profile);
        }
        profielList.addProfile(patient);
        System.out.println("*********************************************");
        System.out.println(getTaal("PATIENT_SUCCESFULL_AANGEMAAKT"));
        System.out.println("*********************************************");
        System.out.println(getTaal("Zo_staat_patient_geregistreert") + patient);
    }

    private ResourceBundle getDefaultLanguage() {
        return ResourceBundle.getBundle("MessagesBundle");
    }

    private String getTaal(String word) {
        return this.messages.getString(word);
    }

     void taalWijzigen() {
        Scanner scan = new Scanner(System.in);
        System.out.printf(getTaal("Nederlands"), 1);
        System.out.printf(getTaal("Engels"), 2);
        System.out.printf(getTaal("Turks"), 3);
        taal = scan.nextInt();
        if (taal == 2) {
            messages = ResourceBundle.getBundle("MessagesBundle", new Locale("en", "EN"));
        } else if (taal == 3) {
            messages = ResourceBundle.getBundle("MessagesBundle", new Locale("tr", "TR"));
        } else {
            messages = ResourceBundle.getBundle("MessagesBundle");
        }
    }
}