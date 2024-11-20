package ar.edu.unnoba.poo2020.ProyectoMaven.DTO;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class NewBookingRequestDTO {
    private Long roomId;
    private String checkIn;
    private String checkOut;
    private int occupancy;

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public int getOccupancy() {
        return occupancy;
    }

    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }

    public LocalDate getCheckInDateConverted() {
        return LocalDate.parse(this.checkIn, dateFormatter);
    }

    public LocalDate getCheckOutDateConverted() {
        return LocalDate.parse(this.checkOut, dateFormatter);
    }

    public boolean isDateRangeValid() {
        return getCheckInDateConverted().isBefore(getCheckOutDateConverted());
    }
}

