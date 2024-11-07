package com.core.Merchant_Galaxy.Enums;

public enum GalaxyChangeEnum {

    glob(1),
    prok(5),
    pish(10),
    tegj(50),
    Silver(17),
    Gold(14450),
    Iron(195.5);

    private final double itsValue;

    GalaxyChangeEnum(double theValue)
    {
        this.itsValue = theValue;
    }

    public double getValue()
    {
        return itsValue;
    }
}
