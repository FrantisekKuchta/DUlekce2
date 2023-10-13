package com.engeto.hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Booking {

    private LocalDate arrival;
    private LocalDate departure;

    private  int day;
    private Room room;
    private Guest guest;
    private List<Guest> otherGuests =  new ArrayList<>();

    private boolean working;
    private boolean recreational;


    public <get> Booking(LocalDate arrival, LocalDate departure, int day, Room room, Guest guest, boolean working, boolean recreational) {
        this.arrival = arrival;
        this.departure = departure;
        this.day = day;
        this.room = room;
        this.guest = guest;
        this.working = working;
        this.recreational = recreational;
    }

    public Booking(LocalDate arrival, LocalDate departure, int day, Room room,Guest guest, List otherGuests, boolean working, boolean recreational) {
        this.arrival = arrival;
        this.departure = departure;
        this.day = day;
        this.room = room;
        this.otherGuests = otherGuests;
        this.working = working;
        this.recreational = recreational;
        this.guest = guest;
    }



    @Override
    public String toString() {
        return "Rezervace" +
                " pokoje č." + room.getNumberRoom() +
                " je od: " + arrival.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                ", do: " + departure.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) +
                ", na " + day +
                " dní. Hoste jsou:" + guest.getName() + " " + guest.getSurname() + " "
                + guest.getBirthday().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")) + otherGuests +
                '.';
    }



    public LocalDate getArrival() {
        return arrival;
    }

    public void setArrival(LocalDate arrival) {
        this.arrival = arrival;
    }

    public LocalDate getDeparture() {
        return departure;
    }

    public void setDeparture(LocalDate departure) {
        this.departure = departure;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public List<Guest> getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List<Guest> otherGuests) {
        this.otherGuests = otherGuests;
    }


    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }

    public boolean isRecreational() {
        return recreational;
    }

    public void setRecreational(boolean recreational) {
        this.recreational = recreational;
    }
}
