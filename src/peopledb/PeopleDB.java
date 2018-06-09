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

    public static void closeAndCommitDB() {
        try {
            c.commit();
            c.close();
        } catch (Exception e) {
            System.out.println(e.getMessage() + " " + Arrays.toString(e.getStackTrace()));
        }

    }

    public static void insertPerson(Person p) {

        try {
            String sql = "INSERT INTO PERSON(PER_FIRST_NAME, PER_LAST_NAME, PER_NICKNAME, "
                    + "PER_GENDER, PER_DATE_OF_BIRTH, PER_FATHER, PER_MOTHER, PER_TELEPHONE_NR, "
                    + "PER_ENTRY_DATE, PER_WHERE_MET, PER_COMMENT) "
                    + "VALUES(?,?,?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStmt = c.prepareStatement(sql);
            preparedStmt.setString(1, p.getFirstName());
            preparedStmt.setString(2, p.getLastName());
            preparedStmt.setString(3, p.getNickname());
            preparedStmt.setString(4, p.getGender());
            preparedStmt.setLong(5, p.getBirthDate().getTime());
            preparedStmt.setInt(6, p.getFatherID());
            preparedStmt.setInt(7, p.getMotherID());
            preparedStmt.setString(8, p.getTelephoneNr());
            preparedStmt.setLong(9, p.getEntryDate().getTime());
            preparedStmt.setString(10, p.getLocMet());
            preparedStmt.setString(11, p.getComment());

            preparedStmt.execute();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
    
    public static void insertPersonNoParents(Person p) {

        try {
            String sql = "INSERT INTO PERSON(PER_FIRST_NAME, PER_LAST_NAME, PER_NICKNAME, "
                    + "PER_GENDER, PER_DATE_OF_BIRTH, PER_TELEPHONE_NR, "
                    + "PER_ENTRY_DATE, PER_WHERE_MET, PER_COMMENT) "
                    + "VALUES(?,?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStmt = c.prepareStatement(sql);
            preparedStmt.setString(1, p.getFirstName());
            preparedStmt.setString(2, p.getLastName());
            preparedStmt.setString(3, p.getNickname());
            preparedStmt.setString(4, p.getGender());
            preparedStmt.setLong(5, p.getBirthDate().getTime());
            preparedStmt.setString(6, p.getTelephoneNr());
            preparedStmt.setLong(7, p.getEntryDate().getTime());
            preparedStmt.setString(8, p.getLocMet());
            preparedStmt.setString(9, p.getComment());

            preparedStmt.execute();
        } catch (Exception e) {
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
        ArrayList<Person> personList = new ArrayList<>();
        try {
            String sql = "SELECT PERSON_ID, PER_FIRST_NAME, PER_LAST_NAME FROM person WHERE PER_LAST_NAME = ?";

            PreparedStatement preparedStmt = c.prepareStatement(sql);
            preparedStmt.setString(1, lastName);
            
            ResultSet rs = preparedStmt.executeQuery();
            
            while(rs.next()){
                Person p = new Person();
                p.setPersonID(rs.getInt("PERSON_ID"));
                p.setFirstName(rs.getString("PER_FIRST_NAME"));
                p.setLastName(rs.getString("PER_LAST_NAME"));
                personList.add(p);
            }
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        
        return personList;
    }

    static ArrayList<Address> getListofAddressesByPersonID(int personID) {
        //
        return new ArrayList<>();
    }

    static ArrayList<Reporting> getListofReportsByPersonID(int personID) {
        //
        return new ArrayList<>();
    }

    static ArrayList<HistData> getListofHistDataByPersonID(int personID) {
        //
        return new ArrayList<>();
    }
}
