package com.core.Merchant_Galaxy.Enums;

public enum GalaxyChangeEnum {

    glob(1.0),
    prok(5.0),
    pish(10.0),
    tegj(50.0),
    Silver(17.0),
    Gold(14450.0),
    Iron(195.5);

    private final Double itsValue;

    GalaxyChangeEnum(Double theValue)
    {
        this.itsValue = theValue;
    }

    public Double getValue()
    {
        return itsValue;
    }
}
