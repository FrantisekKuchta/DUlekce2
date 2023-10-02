package com.engeto.hotel;

import java.time.LocalDate;
import java.util.List;

public class Booking {

    private LocalDate arrival;
    private LocalDate departure;

    private  int day;
    private Room room;
    private Guest guest;
    private Guest guest2;
    private List<Guest> otherGuests;


    public Booking(LocalDate arrival, LocalDate departure, int day, Room room, Guest guest) {
        this.arrival = arrival;
        this.departure = departure;
        this.day = day;
        this.room = room;
        this.guest = guest;
    }

    public Booking(LocalDate arrival, LocalDate departure, int day, Room room, Guest guest, Guest guest2) {
        this.arrival = arrival;
        this.departure = departure;
        this.day = day;
        this.room = room;
        this.guest = guest;
        this.guest = guest2;
    }

    @Override
    public String toString() {
        return "Rezervace" +
                " pokoje č." + room.getNumberRoom() +
                " je od: " + arrival +
                ", do: " + departure +
                ", na " + day +
                " dní. Hoste jsou:" + guest.getName() + " " + guest.getSurname()+
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

    public Guest getGuest2() {
        return guest2;
    }

    public void setGuest2(Guest guest2) {
        this.guest2 = guest2;
    }
}
