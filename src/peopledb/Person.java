/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peopledb;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author phildor
 */
public class Person {
    private String firstName, lastName, nickname, gender, comment, locMet, telephoneNr;
    private int fatherID, motherID, personID;
    private Date birthDate, deathDate, entryDate;
    private ArrayList<Address> addressList;
    private ArrayList<HistData> histdataList;
    private ArrayList<Reporting> reportList;

    public Person(String firstName, String lastName, String nickname, String gender, String comment, String locMet, String telephoneNr, Date birthDate, Date entryDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = nickname;
        this.gender = gender;
        this.comment = comment;
        this.locMet = locMet;
        this.telephoneNr = telephoneNr;
        this.birthDate = birthDate;
        this.entryDate = entryDate;
        this.addressList = this.getListOfAddresses();
        this.histdataList = this.getListofHistData();
        this.reportList = this.getListofReports();
    }
    
    public Person(){
        this.lastName = "Smith";
        this.gender = "F";
        this.locMet = "Earth";
    }

    public Person(String lastName, String gender, String locMet) {
        this.lastName = lastName;
        this.gender = gender;
        this.locMet = locMet;
    }
    
    

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getLocMet() {
        return locMet;
    }

    public void setLocMet(String locMet) {
        this.locMet = locMet;
    }

    public int getFatherID() {
        return fatherID;
    }

    public void setFatherID(int fatherID) {
        this.fatherID = fatherID;
    }

    public int getMotherID() {
        return motherID;
    }

    public void setMotherID(int motherID) {
        this.motherID = motherID;
    }

    public String getTelephoneNr() {
        return telephoneNr;
    }

    public void setTelephoneNr(String telephoneNr) {
        this.telephoneNr = telephoneNr;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getDeathDate() {
        return deathDate;
    }

    public void setDeathDate(Date deathDate) {
        this.deathDate = deathDate;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public ArrayList<Address> getAddressList() {
        return addressList;
    }

    public void setAddressList(ArrayList<Address> addressList) {
        this.addressList = addressList;
    }

    public ArrayList<HistData> getHistdataList() {
        return histdataList;
    }

    public void setHistdataList(ArrayList<HistData> histdataList) {
        this.histdataList = histdataList;
    }

    public ArrayList<Reporting> getReportList() {
        return reportList;
    }

    public void setReportList(ArrayList<Reporting> reportList) {
        this.reportList = reportList;
    }

    private ArrayList<Address> getListOfAddresses() {
        return PeopleDB.getListofAddressesByPersonID(personID);
    }

    private ArrayList<HistData> getListofHistData() {
        return PeopleDB.getListofHistDataByPersonID(personID);
    }

    private ArrayList<Reporting> getListofReports() {
        return PeopleDB.getListofReportsByPersonID(personID);
    }


    
    
    
    
    
    
    
}//end of class
