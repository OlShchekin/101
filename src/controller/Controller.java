package controller;

import entities.FirstString;
import model.FilePrinter;
import model.WordSearcher;

public class Controller {

    View view = new View();


    public void run() {

        do {
            view.printMenu();
            model.setTextElementList();
            executeMenuItem(MenuScanner.checkMenuItem(view, MenuScanner.scanMenuItem(view)));

        } while (true);
    }


     private void executeMenuItem(int menuItem) {
        switch (menuItem) {
            case (1):
                view.printTextFromTxtFile(view.INIT_TEXT, FilePrinter.stringBufferText);
                break;
            case (2):
                view.printFirstStringFromText(view.RESULT_TEXT, FirstString.theFirstString);
                break;
            case (3):
                view.printSearchedWords(view.RESULT_FILE);
                FilePrinter.createResultTextFile(WordSearcher.sc.hasNext);

                break;
            case (0):
                view.printMessage("Bye!");
                System.exit(0);
                break;
        }
    }
}
