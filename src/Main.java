import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        StringBuffer stringBufferText = new StringBuffer();
        try (BufferedReader reader = new BufferedReader(new FileReader("Source_Txt_File.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBufferText.append(line + "\n");

            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        String analyzedText = stringBufferText.toString();

        System.out.println("Analyzed text: "+ "\n" + analyzedText);


        String str = analyzedText;
        String[] arryaStrings;
        arryaStrings = str.split("\\.");
//        for (String temp : arryaStrings) {
//            System.out.println(temp);
//        }

        String theFirstString = (arryaStrings[0]);
        System.out.println("The first string is: " +"\n" + theFirstString);

        String[] search1 = theFirstString.split(" ");
        System.out.println("Researched word is: " + "\n" + Arrays.toString(search1));

        String[] sub = new String[arryaStrings.length - 1];
        System.arraycopy(arryaStrings, 1, sub, 0, arryaStrings.length - 1);
//        for (String temp : sub) {
//            System.out.println("temp = " + temp);
//        }

        Scanner sc = new Scanner(Arrays.toString(sub));
//        for (int i=0; i<=sub.length; i++){
//            while (sc.hasNext()){
//                if (sc.hasNext(search1[i])){
//                    System.out.println(sc.next());
//            }else {sc.next();


        while (sc.hasNext()) {
            if (sc.hasNext(search1[0])) {
                System.out.println(sc.next());
            } else if (sc.hasNext(search1[1])) {
                System.out.println(sc.next());
            } else if (sc.hasNext(search1[2])) {
                System.out.println(sc.next());
            } else if (sc.hasNext(search1[3])) {
                System.out.println(sc.next());
            } else if (sc.hasNext(search1[4])) {
                System.out.println(sc.next());
            } else if (sc.hasNext(search1[5])) {
                System.out.println(sc.next());
            } else if (sc.hasNext(search1[6])) {
                System.out.println(sc.next());
            } else if (sc.hasNext(search1[7])) {
                System.out.println(sc.next());
            } else if (sc.hasNext(search1[8])) {
                System.out.println(sc.next());
            } else if (sc.hasNext(search1[9])) {
                System.out.println(sc.next());
            } else if (sc.hasNext(search1[10])) {
                System.out.println(sc.next());
            } else if (sc.hasNext(search1[11])) {
                System.out.println(sc.next());
            } else {
                sc.next();
            }
        }

    }

}

