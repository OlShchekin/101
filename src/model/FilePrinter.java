package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilePrinter {
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
}
