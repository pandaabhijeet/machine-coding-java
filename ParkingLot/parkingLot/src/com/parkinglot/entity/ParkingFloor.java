package com.parkinglot.entity;

import java.util.List;

public class ParkingFloor {

    int parkingFloorId;
    List<ParkingSlot> parkingSlots;

    public ParkingFloor(int parkingFloorId, List<ParkingSlot> parkingSlots) {
        this.parkingFloorId = parkingFloorId;
        this.parkingSlots = parkingSlots;
    }

    public int getParkingFloorId() {
        return parkingFloorId;
    }

    public void setParkingFloorId(int parkingFloorId) {
        this.parkingFloorId = parkingFloorId;
    }

    public List<ParkingSlot> getParkingSlots() {
        return parkingSlots;
    }

    public void setParkingSlots(List<ParkingSlot> parkingSlots) {
        this.parkingSlots = parkingSlots;
    }
}
