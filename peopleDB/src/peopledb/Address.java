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
public class Address {
    private Date beginDate, endDate;
    private int personID;
    private String addressOne, addressTwo, city, postcode, province, other, country;
    private boolean isCurrentAddress;

    public Address(Date beginDate, Date endDate, int personID, String addressOne, String addressTwo, String city, String postcode, String province, String other, String country, boolean isCurrentAddress) {
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.personID = personID;
        this.addressOne = addressOne;
        this.addressTwo = addressTwo;
        this.city = city;
        this.postcode = postcode;
        this.province = province;
        this.other = other;
        this.country = country;
        this.isCurrentAddress = isCurrentAddress;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getAddressOne() {
        return addressOne;
    }

    public void setAddressOne(String addressOne) {
        this.addressOne = addressOne;
    }

    public String getAddressTwo() {
        return addressTwo;
    }

    public void setAddressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isIsCurrentAddress() {
        return isCurrentAddress;
    }

    public void setIsCurrentAddress(boolean isCurrentAddress) {
        this.isCurrentAddress = isCurrentAddress;
    }
    
    
}
