/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peopledb;

import java.util.ArrayList;

/**
 *
 * @author phildor
 */
public class PeopleDB {
    public static void insertPerson(Person p){
        
    }
    
    public static Person selectPersonByID(int personID){
        
        return null;
    }
    
    /**
     * return list of people to put in popup that user can then select to call selectPersonByID
     * @param lastName
     * @return 
     */
    public static ArrayList<Person> findPerson(String lastName){
        
        return null;
    }

    static ArrayList<Address> getListofAddressesByPersonID(int personID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static ArrayList<Reporting> getListofReportsByPersonID(int personID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static ArrayList<HistData> getListofHistDataByPersonID(int personID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
