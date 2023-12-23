package com.parkinglot.entity;

public class ParkingSlot {
    Vehicle slotType;
    int slotId;
    int floorId;
    boolean isFree;
    VehicleType vehicleType;

    public ParkingSlot()
    {
    }

    public ParkingSlot(Vehicle slotType, int slotId, int floorId, boolean isFree, VehicleType vehicleType) {
        this.slotType = slotType;
        this.slotId = slotId;
        this.floorId = floorId;
        this.isFree = isFree;
        this.vehicleType = vehicleType;
    }

    public ParkingSlot(VehicleType vehicleType, int slotId, boolean isFree) {

        this.slotId = slotId;
        this.isFree = isFree;
        this.vehicleType = vehicleType;
    }


    public Vehicle getSlotType() {
        return slotType;
    }

    public void setSlotType(Vehicle slotType) {
        this.slotType = slotType;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
