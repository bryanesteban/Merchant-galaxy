package com.core.Merchant_Galaxy.Enums;

public enum GalaxyChangeEnum {

    glob("1"),
    prok("5"),
    pish("10"),
    tegj("50"),
    silver("17"),
    gold("14450"),
    iron("195.5");

    private final String itsValue;

    GalaxyChangeEnum(String theValue)
    {
        this.itsValue = theValue;
    }

    public String getValue()
    {
        return itsValue;
    }
}
