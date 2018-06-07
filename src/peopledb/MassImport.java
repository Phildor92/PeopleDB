/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peopledb;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eurofins1
 */
public class MassImport {

    public ArrayList<String> readFromCsv(String file) {
        ArrayList<String> lines = new ArrayList<>();
        int curLine = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

            while (reader.readLine() != null) {
                lines.add(reader.readLine());
                curLine++;
            }

            reader.close();
        } catch (Exception ex) {
            System.out.println(ex.getMessage() + " " + ex.getStackTrace());
        }
        return lines;
    }

    public Person[] importPersons(String file) {
        ArrayList<String> persons = readFromCsv(file);

        return null;

    }

    public Reporting[] importReports(String file) {
        ArrayList<String> reports = readFromCsv(file);
        return null;

    }

    public Address[] importAddresses(String file) {
        ArrayList<String> addresses = readFromCsv(file);
        return null;

    }
    
    public HistData[] importHistData (String file) {
        ArrayList<String> histData = readFromCsv(file);
        
        
        return null;

    }
}
