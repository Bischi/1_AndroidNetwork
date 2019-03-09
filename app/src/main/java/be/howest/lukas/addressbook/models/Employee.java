package be.howest.lukas.addressbook.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Employee implements Serializable {
    private String _firstname;
    private String _lastname;
    private String _title;

    public String getFirstname() {
        return _firstname;
    }

    @JsonSetter("FirstName")
    public void setFirstname(String firstname) {
        _firstname = firstname;
    }

    public String getLastname() {
        return _lastname;
    }

    @JsonSetter("LastName")
    public void setLastname(String lastname) {
        _lastname = lastname;
    }

    public String getTitle() {
        return _title;
    }

    @JsonSetter("Title")
    public void setTitle(String title) {
        _title = title;
    }
}