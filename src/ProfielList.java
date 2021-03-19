

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProfielList {

    public ArrayList<Profile> profielList = new ArrayList();

    public ProfielList() {
    }

    public int get(int i)
    {
       profielList.get(i);
        return i;
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



}

