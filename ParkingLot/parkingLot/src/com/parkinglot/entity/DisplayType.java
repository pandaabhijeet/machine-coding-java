package com.parkinglot.entity;

import java.util.HashMap;

public enum DisplayType {

    FREE_COUNT("free_count"),
    OCCUPIED_SLOTS("occupied_slots"),
    FREE_SLOTS("free_slots");


    private final String displayType;
    DisplayType( String d)
    {
        this.displayType = d;
    }

    public String toString()
    {
        return this.displayType;
    }

    private static final HashMap<String, DisplayType> displayMap = new HashMap<>(values().length,1);

    static{
        for (DisplayType d : values()){
             displayMap.put(d.displayType, d);
        }
    }

    public static DisplayType of(String name){
        return displayMap.get(name);
    }
}
