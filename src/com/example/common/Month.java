package com.example.common;

public enum Month {

    ///enumeration for the days of the week:


    JANUARY("January", 1),
    FEBRUARY("Febuary", 2),
    MARCH("March", 3),
    APRIL("April", 4),
    MAY("May", 5) ,
    JUNE( "June", 6),
    JULY("July", 7),
    AUGUST( "August", 8),
    SEPTEMBER("September", 9),
    OCTOBER("October", 10 ),
    NOVEMBER("November", 11),
    DECEMBER("December", 12);

    public String englishName;
    public int monthNum;


//    Month
//
//    Month(String englishName) {
//        this.englishName = englishName;
//    }
//    Month(String monthNum) {this.monthNum = monthNum};

    Month(String englishName, int monthNum) {
        this.englishName = englishName;
        this.monthNum = monthNum;
    }



    ////This is my getter:
//
//    public String getEnglishName() {
//        return englishName;
//    }
//
//    Month(String englishName, int monthNum) {
//        this.englishName = englishName;
//        this.monthNum = monthNum;
//    }
//


    public String getEnglishName() {
        return englishName;
    }

    public int getMonthNumber() {
        return monthNum;
    }







}


