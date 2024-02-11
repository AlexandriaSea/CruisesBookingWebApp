package com.wenjiezhou.assignment1;

/*
Student Name: Wenjie Zhou
Student Number: 301337168
Submission Date: Feb 11, 2024
*/

public class Cruise {

    private String firstName;
    private String lastName;
    private String areaCode;
    private String phoneNumber;
    private String streetAddress_1;
    private String streetAddress_2;
    private String city;
    private String province;
    private String postalCode;
    private String country;
    private String email;
    private int roomNumber;
    private String roomType;
    private int guestNumber;
    private boolean isInsideCabin;
    private boolean isOutsideCabin;
    private String ageGroup;
    private double roomPrice;
    public double tripPrice;
    public double discount = 0.00;
    private double taxRate = 0.13;

    public double tax;
    private double seniorDiscount = 0.10;
    private double additionalPersonFee = 1000.00;

    public Cruise(String firstName, String lastName, String areaCode, String phoneNumber,
                  String streetAddress_1, String streetAddress_2, String city, String province,
                  String postalCode, String country, String email, int roomNumber, String roomType,
                  double roomPrice, int guestNumber, String ageGroup) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
        this.streetAddress_1 = streetAddress_1;
        this.streetAddress_2 = streetAddress_2;
        this.city = city;
        this.province = province;
        this.postalCode = postalCode;
        this.country = country;
        this.email = email;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.guestNumber = guestNumber;
        this.ageGroup = ageGroup;

        tripPrice = roomPrice * roomNumber + (guestNumber - roomNumber * 2) * additionalPersonFee;

        if (ageGroup.equals("Yes")) {
            discount = tripPrice * seniorDiscount;
            tripPrice -= discount;
        }

        tax = tripPrice * taxRate;
        tripPrice += tax;
    }

    public double getAdditionalCharge() {
        return (guestNumber - roomNumber * 2) * additionalPersonFee;
    }

    public double getTotalRoomPrice() {
        return roomPrice * roomNumber;
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

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreetAddress_1() {
        return streetAddress_1;
    }

    public void setStreetAddress_1(String streetAddress_1) {
        this.streetAddress_1 = streetAddress_1;
    }

    public String getStreetAddress_2() {
        return streetAddress_2;
    }

    public void setStreetAddress_2(String streetAddress_2) {
        this.streetAddress_2 = streetAddress_2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getGuestNumber() {
        return guestNumber;
    }

    public void setGuestNumber(int guestNumber) {
        this.guestNumber = guestNumber;
    }

    public boolean isInsideCabin() {
        return isInsideCabin;
    }

    public void setInsideCabin(boolean insideCabin) {
        isInsideCabin = insideCabin;
    }

    public double getTripPrice() {
        return tripPrice;
    }

    public double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public boolean isOutsideCabin() {
        return isOutsideCabin;
    }

    public void setOutsideCabin(boolean outsideCabin) {
        isOutsideCabin = outsideCabin;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
