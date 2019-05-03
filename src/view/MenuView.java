package view;

import entities.FirstString;
import model.FilePrinter;
import model.WordSearcher;

public interface MenuView {
    String EDITOR_MENU = "TEXT EDITOR MENU: \n" + "1. Read and show initial text from the TXT file.\n" +
            "2. Show the first string.\n" +
            "3. Show the checked words.\n" +
            "0. Exit";

    String CHOOSE_MENU_ITEM = "Choose a menu item (0-3): ";
    String WRONG_NUMBER = "Wrong input. Please try again. ";


    String INIT_TEXT = "Source text from the file " + FilePrinter.stringBufferText + "':";
    String RESULT_FILE = "The first string " + FirstString.theFirstString + "' ";
    String RESULT_TEXT = "Show the checked words,\n" + WordSearcher.sc.hasNext();
    /**
     * Default interface method
     * Displays menu.
     */
    default void printMenu() {
        System.out.println(EDITOR_MENU + '\n');

    }
}
