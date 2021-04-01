import java.util.ArrayList;
import java.util.List;

public class ProfielList {
    public ArrayList<Profile> profielList = new ArrayList();

    public ProfielList() {
    }

    public Profile get(int i) {
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

    public void printAllePatienten() {
        System.out.println("LIJST VAN ALLE PATIENTEN  ");
        System.out.println("Nr. \tNaam\t\tAchternaam\t\tLeeftijd\tLengte\t\tGewicht\t\tBMI\t");

        for (int i = 0; i < profielList.size(); i++) {
            System.out.println(i+"."+"\t\t"+profielList.get(i).getVoorNaam() + " \t\t" + profielList.get(i).getAchterNaam()
                    + "\t\t\t " + profielList.get(i).getLeeftijd() + "\t\t\t " + profielList.get(i).getLengte()
                    + "\t\t " + profielList.get(i).getGewicht() + "\t\t " + profielList.get(i).getBmi());

        }
    }
}

