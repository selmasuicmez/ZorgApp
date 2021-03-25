

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProfielList {

    public ArrayList<Profile> profielList = new ArrayList();

    public ProfielList() {
    }

    public Profile get(int i) //get index
    {
        return profielList.get(i);
    }


    public void addProfile(Profile profile) {
        profielList.add(profile);
    }


    public void deleteProfiel(Profile p) {
        profielList.remove(p);
    }

    public List<Profile> getProfielListPatienten() {
        return profielList;
    }


    public int sizeOf() {
        return profielList.size();
    }

    void allePatientenZien() {
        System.out.println("PATIENTENLIJST ");
        System.out.println("patient-Naam\tAchternaam \tLeeftijd\t Gewicht \tLengte \t BMI");
        for (int i = 0; i < profielList.size(); i++) {
            System.out.println(profielList.get(i).getVoorNaam() +"\t\t\t" + profielList.get(i).getAchterNaam() + "\t\t\t" + profielList.get(i).getLeeftijd() +
                    "\t\t" + profielList.get(i).getGewicht() + "\t\t" + profielList.get(i).getLengte() + "\t\t" + profielList.get(i).getBmi());

        }

}}

