package com.example.common;

public enum Month {

    ///enumeration for the days of the week:


    JANUARY("JAN"),
    FEBRUARY("FEB"),
    MARCH("MARCH") ,
    APRIL("APRIL"),
    MAY("MAY") ,
    JUNE( "JUNE"),
    JULY("JULY"),
    AUGUST( "AUGUST"),
    SEPTEMBER("SEPTEMBER"),
    OCTOBER("OCTOBER"),
    NOVEMBER("NOVEMBER"),
    DECEMBER("DECEMBER");

    private String englishName;

    Month(String englishName) {
        this.englishName = englishName;
    }

    ////This is my getter:

    public String getEnglishName() {
        return englishName;
    }



}


