package ch.renhor.hotel.models;

import java.time.LocalDate;

public class Booking {
    private Guest guest;
    private Room room;
    private LocalDate dateCheckIn;
    private LocalDate dateCheckOut;
    private boolean payed = false;

    public Booking(Guest guest, Room room, LocalDate dateCheckIn, LocalDate dateCheckOut) {
        this.guest = guest;
        this.room = room;
        this.dateCheckIn = dateCheckIn;
        this.dateCheckOut = dateCheckOut;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getDateCheckIn() {
        return dateCheckIn;
    }

    public void setDateCheckIn(LocalDate dateCheckIn) {
        this.dateCheckIn = dateCheckIn;
    }

    public LocalDate getDateCheckOut() {
        return dateCheckOut;
    }

    public void setDateCheckOut(LocalDate dateCheckOut) {
        this.dateCheckOut = dateCheckOut;
    }

    public boolean isPayed() {
        return payed;
    }

    public void setPayed(boolean payed) {
        this.payed = payed;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "guest=" + guest +
                ", room=" + room +
                ", dateCheckIn=" + dateCheckIn +
                ", dateCheckOut=" + dateCheckOut +
                ", payed=" + payed +
                '}';
    }
}
