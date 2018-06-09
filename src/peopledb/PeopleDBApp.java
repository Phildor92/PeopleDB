/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peopledb;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phildor
 */
public class PeopleDBApp {
    public static void main(String[] args) {
        PeopleDB.openDB();
        PeopleGUI pg = new PeopleGUI();
        Person person1 = null;
        //try {
        //    person1 = new Person("Joe", "Bloggs", "", "M", "", "N/A", "+32488323423", new SimpleDateFormat("yyyy-MM-dd").parse("2014-04-23"), new SimpleDateFormat("yyyy-MM-dd").parse("2018-06-09"));
        //} catch (ParseException ex) {
        //    Logger.getLogger(PeopleDBApp.class.getName()).log(Level.SEVERE, null, ex);
        //}
        //PeopleDB.insertPersonNoParents(person1);
        
        
        PeopleDB.closeAndCommitDB();
    }
}
