package com.parkinglot.repository;

import com.parkinglot.entity.ParkingFloor;
import com.parkinglot.entity.ParkingSlot;
import com.parkinglot.entity.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingDataRepository {

    List<ParkingFloor> parkingFloorsData;
    List<ParkingSlot> parkingSlotsData;

    public List<ParkingFloor> getParkingFloorsData(int noOfFloors, int noOfSlots)
    {
        for(int i=0; i<noOfFloors; i++)
        {
            parkingFloorsData = new ArrayList<>(noOfFloors);
            initialiseSlots(noOfSlots);
            parkingSlotsData = getParkingSlotData(i);
            parkingFloorsData.add(new ParkingFloor(i,parkingSlotsData));
        }

        return parkingFloorsData;
    }

    private List<ParkingSlot> getParkingSlotData(int i)
    {
        //parkingSlotsData.forEach(parkingSlot -> parkingSlot.setFloorId(i));

        for(ParkingSlot parkingSlot : parkingSlotsData)
        {
            parkingSlot.setFloorId(i);
        }

        return parkingSlotsData;
    }

    private void initialiseSlots(int noOfSlots) {
        List<ParkingSlot> parkingSlots = new ArrayList<>(noOfSlots);
        if(noOfSlots >= 1)
        {
            parkingSlots.add(getTruckData(0));
        }

        if(noOfSlots >= 3)
        {
            for(int i=1; i<3; i++)
            {
                parkingSlots.add(getBikeData(i));
            }
        }

        if(noOfSlots > 3)
        {
            for(int i =3; i<noOfSlots; i++)
            {
                parkingSlots.add(getCarData(i));
            }
        }
    }

    private ParkingSlot getCarData(int i) {

        return new ParkingSlot(VehicleType.CAR,i,true);
    }

    private ParkingSlot getBikeData(int i) {
        return new ParkingSlot(VehicleType.BIKE,i,true);
    }

    private ParkingSlot getTruckData(int i) {
        return new ParkingSlot(VehicleType.TRUCK,i,true);
    }
}
