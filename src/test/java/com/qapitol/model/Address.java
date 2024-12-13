package com.qapitol.model;

public class Address {
    private String streetName;
    private String completeAddress;
    private int  pincode;
    public Address() {
    }

    public Address(String streetName, String completeAddress, int pincode) {
        this.streetName = streetName;
        this.completeAddress = completeAddress;
        this.pincode = pincode;

    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCompleteAddress() {
        return completeAddress;
    }

    public void setCompleteAddress(String completeAddress) {
        this.completeAddress = completeAddress;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", completeAddress='" + completeAddress + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
