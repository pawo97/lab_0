package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;

public class TailsGenerator {

    public List<String> tails(String value) {
        if (value == null) {
            return new ArrayList<>();
        }
        List<String> listOfWords = new ArrayList<>(value.length());
        for (int i = 0; i < (value.length() + 1); i++) {
            System.out.println(value.substring(i));
            listOfWords.add(value.substring(0));
        }
        return listOfWords;
    }

}
