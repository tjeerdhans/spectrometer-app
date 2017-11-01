package nl.thenanne.tjeerdhans.spectrometer;

import java.util.List;

/**
 * Created by tjeerdhans on 1-11-2017.
 */

class DataHelper {
    static Spectrofotogram RandomSpectrofotogram(String version){
        Spectrofotogram result = new Spectrofotogram("v1");
        for (int i = 0; i < 288; i++) {
            Integer value = (int) (Math.random() * 2048);
            result.Values.add(value);
        }
        return result;
    }
}
