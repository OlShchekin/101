package view;

import entities.FirstString;
import model.FilePrinter;
import model.WordSearcher;

public class View implements MenuView {
    public void printMessage(String message) {
        System.out.print(message);
    }

    public void printTextFromTxtFile(String message, String fileName) {
        System.out.println(message);
        System.out.println(FilePrinter.createStringBufferFromTxtFile(FilePrinter.stringBufferText));

    }

    public void printFirstStringFromText(String message) {
        System.out.println(message);
        System.out.println(FirstString.theFirstString);

    }

    public void printSearchedWords(String message) {
        System.out.println(message);
        System.out.println(WordSearcher.sc.hasNext);

    }
}
