package com.engeto.hotel;

public class Room {

    private int numberRoom;
    public int numberBed;
    private double priceRoom;
    private boolean balcony;
    private boolean seaViews;

    public Room(int numberRoom, int numberBed, double priceRoom, boolean balcony, boolean seaViews) {
        this.numberRoom = numberRoom;
        this.numberBed = numberBed;
        this.priceRoom = priceRoom;
        this.balcony = balcony;
        this.seaViews = seaViews;
    }

    @Override
    public String toString() {
        return "Pokoj " +
                "č." + numberRoom +
                ", počat lůžek:" + numberBed +
                ", cena za noc: " + priceRoom +
                " Kč, balkon: " + balcony +
                ", výhled na moře: " + seaViews +
                '.';
    }
//region Get and Set
    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public int getNumberBed() {
        return numberBed;
    }

    public void setNumberBed(int numberBed) {
        this.numberBed = numberBed;
    }

    public double getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(double priceRoom) {
        this.priceRoom = priceRoom;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaViews() {
        return seaViews;
    }

    public void setSeaViews(boolean seaViews) {
        this.seaViews = seaViews;
    }

    //endregion
}
