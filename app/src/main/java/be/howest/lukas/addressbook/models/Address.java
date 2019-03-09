package be.howest.lukas.addressbook.models;

import java.io.Serializable;

public class Address implements Serializable {

    private String _streetName;
    private String _streetNumber;
    private String _postalCode;
    private String _city;
    private String _country;

    public String getStreetName() {
        return _streetName;
    }

    public void setStreetName(String streetName) {
        this._streetName = streetName;
    }

    public String getStreetNumber() {
        return _streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this._streetNumber = streetNumber;
    }

    public String getPostalCode() {
        return _postalCode;
    }

    public void setPostalCode(String postalCode) {
        this._postalCode = postalCode;
    }

    public String getCity() {
        return _city;
    }

    public void setCity(String city) {
        this._city = city;
    }

    public String getCountry() {
        return _country;
    }

    public void setCountry(String country) {
        this._country = country;
    }
}
