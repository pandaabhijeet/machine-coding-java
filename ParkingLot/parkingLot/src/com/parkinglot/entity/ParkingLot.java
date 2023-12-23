package com.parkinglot.entity;

import java.util.List;

public class ParkingLot {

    int parkingLotId;
    int noOfFloors;
    int noOfSlotsPerFloor;
    List<ParkingFloor> parkingFloors;

    public ParkingLot(int parkingLotId, int noOfFloors, int noOfSlotsPerFloor, List<ParkingFloor> parkingFloors) {
        this.parkingLotId = parkingLotId;
        this.noOfFloors = noOfFloors;
        this.noOfSlotsPerFloor = noOfSlotsPerFloor;
        this.parkingFloors = parkingFloors;
    }

    public int getParkingLotId() {
        return parkingLotId;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public int getNoOfSlotsPerFloor() {
        return noOfSlotsPerFloor;
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }

    public void setParkingLotId(int parkingLotId) {
        this.parkingLotId = parkingLotId;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public void setNoOfSlotsPerFloor(int noOfSlotsPerFloor) {
        this.noOfSlotsPerFloor = noOfSlotsPerFloor;
    }

    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }
}
