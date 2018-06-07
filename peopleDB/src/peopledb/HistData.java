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
public class HistData {
    private Date dateChanged, MissionDate;
    private int personID, mobileNr, fixedNr;
    private String emailAddr, job, school, schoolStudy, sports, politicalPar, churchUnit, churchLead,religion,mission,ancestry,other,notes;
    private boolean isCurrentInfo;

    public HistData(Date dateChanged, Date MissionDate, int personID, int mobileNr, int fixedNr, String emailAddr, String job, String school, String schoolStudy, String sports, String politicalPar, String churchUnit, String churchLead, String religion, String mission, String ancestry, String other, String notes, boolean isCurrentInfo) {
        this.dateChanged = dateChanged;
        this.MissionDate = MissionDate;
        this.personID = personID;
        this.mobileNr = mobileNr;
        this.fixedNr = fixedNr;
        this.emailAddr = emailAddr;
        this.job = job;
        this.school = school;
        this.schoolStudy = schoolStudy;
        this.sports = sports;
        this.politicalPar = politicalPar;
        this.churchUnit = churchUnit;
        this.churchLead = churchLead;
        this.religion = religion;
        this.mission = mission;
        this.ancestry = ancestry;
        this.other = other;
        this.notes = notes;
        this.isCurrentInfo = isCurrentInfo;
    }

    public Date getDateChanged() {
        return dateChanged;
    }

    public void setDateChanged(Date dateChanged) {
        this.dateChanged = dateChanged;
    }

    public Date getMissionDate() {
        return MissionDate;
    }

    public void setMissionDate(Date MissionDate) {
        this.MissionDate = MissionDate;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public int getMobileNr() {
        return mobileNr;
    }

    public void setMobileNr(int mobileNr) {
        this.mobileNr = mobileNr;
    }

    public int getFixedNr() {
        return fixedNr;
    }

    public void setFixedNr(int fixedNr) {
        this.fixedNr = fixedNr;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchoolStudy() {
        return schoolStudy;
    }

    public void setSchoolStudy(String schoolStudy) {
        this.schoolStudy = schoolStudy;
    }

    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    public String getPoliticalPar() {
        return politicalPar;
    }

    public void setPoliticalPar(String politicalPar) {
        this.politicalPar = politicalPar;
    }

    public String getChurchUnit() {
        return churchUnit;
    }

    public void setChurchUnit(String churchUnit) {
        this.churchUnit = churchUnit;
    }

    public String getChurchLead() {
        return churchLead;
    }

    public void setChurchLead(String churchLead) {
        this.churchLead = churchLead;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getAncestry() {
        return ancestry;
    }

    public void setAncestry(String ancestry) {
        this.ancestry = ancestry;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public boolean isIsCurrentInfo() {
        return isCurrentInfo;
    }

    public void setIsCurrentInfo(boolean isCurrentInfo) {
        this.isCurrentInfo = isCurrentInfo;
    }
            
          
}
