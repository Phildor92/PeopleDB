/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peopledb;

import java.util.ArrayList;
import java.sql.*;
import java.util.Arrays;

/**
 *
 * @author phildor
 */
public class PeopleDB {
    private static Connection c = null;
    public static void openDB() {

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:/media/LinData/home/phildor/NetBeansProjects/peopleDB/people.db");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Opened database successfully");
        
    }
    
    public static void closeAndCommitDB(){
        try{
            c.commit();
            c.close();            
        }
        catch (Exception e) {
            System.out.println(e.getMessage() + " " + Arrays.toString(e.getStackTrace()));
        }

    }

    public static void insertPerson(Person p) {
        
        
        try
        {
            String sql = "INSERT INTO PERSON(PER_FIRST_NAME, PER_LAST_NAME, PER_NICKNAME, "
                    + "PER_GENDER, PER_DATE_OF_BIRTH, PER_FATHER, PER_MOTHER, PER_TELEPHONE_NR"
                    + "PER_ENTRY_DATE, PER_WHERE_MET, PER_COMMENT)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
            
             PreparedStatement preparedStmt = c.prepareStatement(sql);
             preparedStmt.setString(1,p.getFirstName());
             preparedStmt.setString(2,p.getLastName());
             preparedStmt.setString(3,p.getNickname());
             preparedStmt.setString(4,p.getGender());
             preparedStmt.setInt(5, (int)p.getBirthDate().getTime());
             preparedStmt.setInt(6, (int)p.getBirthDate().getTime());
             preparedStmt.setInt(7, p.getFatherID());
             preparedStmt.setInt(8, p.getMotherID());
             preparedStmt.setInt(9, p.getTelephoneNr());
             preparedStmt.setInt(10,(int)p.getEntryDate().getTime());
             preparedStmt.setString(11, p.getLocMet());
             preparedStmt.setString(12, p.getComment());
             
             preparedStmt.execute();
        } 
        catch (Exception e)
        {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }

    public static Person selectPersonByID(int personID) {

        return null;
    }

    /**
     * return list of people to put in popup that user can then select to call
     * selectPersonByID
     *
     * @param lastName
     * @return
     */
    public static ArrayList<Person> findPerson(String lastName) {

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
