package nl.thenanne.tjeerdhans.spectrometer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tjeerdhans on 1-11-2017.
 */

class Spectrofotogram {
    public String Version;
    public ArrayList<Integer> Values;

    public Spectrofotogram(String version) {
        Version = version;
        Values = new ArrayList<>();
    }
}
