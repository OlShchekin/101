package entities;

import entities.Text;

public class FirstString {
    String str = analyzedText;
    String[] arryaStrings;
    arryaStrings = str.split("\\.");
//        for (String temp : arryaStrings) {
//            System.out.println(temp);
//        }

    String theFirstString = (arryaStrings[0]);
        System.out.println("The first string is: " +"\n" + theFirstString);
}
