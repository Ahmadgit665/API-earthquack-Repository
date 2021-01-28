package com.example.android.quakereport;

public class Earthquake {

    private String location;
    private double magnitude;
    private long date;
    private String mUrl;

    public Earthquake( double magnitude,String location, long date, String mUrl) {
        this.location = location;
        this.magnitude = magnitude;
        this.date = date;
        this.mUrl=mUrl;
    }
    public String getLocation() {
        return location;
    }
    public String getmUrl() {
        return mUrl;
    }
    public double getMagnitude() {
        return magnitude;
    }
    public long getDate() {
        return date;

    }
}
