/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peopledb;

import java.util.Date;

/**
 *
 * @author phildor
 */
public class Reporting {
    private Date entryDate;
    private int personID;
    private String location, reportContent;

    public Reporting(Date entryDate, int personID, String location, String reportContent) {
        this.entryDate = entryDate;
        this.personID = personID;
        this.location = location;
        this.reportContent = reportContent;
    }

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
    
    
}
