package com.engeto.hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Guest {

    private String name;
    private String surname;
    private LocalDate birthday;

    public Guest(String name, String surname, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return " " + name +" " + surname +" (" + birthday.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +")";
    }

    //region Get and Se
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    //endregion
}
