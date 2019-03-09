package be.howest.lukas.addressbook.models;

import java.io.Serializable;

public class Contact implements Serializable {

    private String _firstName;
    private String _lastName;
    private String _email;
    private String _phonenumber;
    private Address _address;

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        this._firstName = firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        this._lastName = lastName;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        this._email = email;
    }

    public String getPhonenumber() {
        return _phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this._phonenumber = phonenumber;
    }

    public Address getAddress() {
        return _address;
    }

    public void setAddress(Address address) {
        this._address = address;
    }
}
