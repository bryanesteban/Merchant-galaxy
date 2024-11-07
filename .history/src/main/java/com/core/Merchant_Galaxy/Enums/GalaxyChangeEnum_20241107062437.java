package com.core.Merchant_Galaxy.Enums;

public enum GalaxyChangeEnum {

    I(1),

    int itsValue;

    GalaxyChangeEnum(int theValue)
    {
        this.itsValue = theValue;
    }

    public int getValue()
    {
        return itsValue;
    }
}
