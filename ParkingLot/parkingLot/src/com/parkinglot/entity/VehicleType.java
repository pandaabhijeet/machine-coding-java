package com.parkinglot.entity;

public enum VehicleType {

    CAR("car"),
    TRUCK("truck"),
    BIKE("bike");

    private final String v;

    VehicleType(String type)
    {
        this.v = type;
    }


}
