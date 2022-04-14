package com.bridgelabz;

public class InvoiceDetails {
    public int totalRides;
    public int totalFare;
    public double aggregateFarePerRide;

    public InvoiceDetails(int totalRides, int totalFare) {
        this.totalRides = totalRides;
        this.totalFare = totalFare;
        this.aggregateFarePerRide = totalFare / totalRides;
    }

    public int getTotalRides() {
        return  totalRides;
    }
    public int getTotalFare() {
        return totalFare;
    }
    public double getAggregateFarePerRide() {
        return aggregateFarePerRide;
    }

