package com.apress.springrecipes.court.domain;

import java.util.Date;

import org.obliquid.helpers.DateHelper;

public class Reservation {

    private String courtName;
    private Date date;
    private int hour;
    private Player player;
    private SportType sportType;

    public Reservation(String courtName, Date date, int hour, Player player, SportType sportType) {
        this.courtName = courtName;
        this.date = new Date(date.getTime()); //defensive copy required because Date is mutable
        this.hour = hour;
        this.player = player;
        this.sportType = sportType;
    }

    public Object getCourtName() {
        return courtName;
    }

    @Override
    public String toString() {
        return courtName + " " + DateHelper.formatIsoDate(date) + " " + hour + " " + player + " " + sportType;
    }

}
