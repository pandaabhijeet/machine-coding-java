package com.parkinglot.entity;

public class Vehicle {

    VehicleType vehicleType;
    ParkingSlot parkingSlot;
    String color;
    String registrationNo;
    String tickets;

    public Vehicle(VehicleType vehicleType, ParkingSlot parkingSlot, String color, String registrationNo, String tickets) {
        this.vehicleType = vehicleType;
        this.parkingSlot = parkingSlot;
        this.color = color;
        this.registrationNo = registrationNo;
        this.tickets = tickets;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public void setRegistrationNo(String registrationNo) {
        this.registrationNo = registrationNo;
    }

    public String getTickets() {
        return tickets;
    }

    public void setTickets(String tickets) {
        this.tickets = tickets;
    }
}
