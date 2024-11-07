package com.core.Merchant_Galaxy.Enums;

public enum GalaxyChangeEnum {

    glob("I"),
    prok("V"),
    pish("X"),
    tegj("L");

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
