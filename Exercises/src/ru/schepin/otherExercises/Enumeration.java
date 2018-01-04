package ru.schepin.otherExercises;

import java.util.Vector;

public class Enumeration {
    public static void main(String[] args) {
        Enumeration developers;
        Vector developerNames = new Vector();

        developerNames.add("First Developer");
        developerNames.add("Second Developer");
        developerNames.add("Third Developer");
        developerNames.add("Fourth Developer");
        developerNames.add("Fifth Developer");

        developers = (Enumeration) developerNames.elements();

        while (developers.hasMoreElements()){
          //  System.out.println(developers.nextElement());
        }
    }

    private boolean hasMoreElements() {
        return false;
    }
}
