package com.train;

public class Ticket {

    int total;
    int roundTrip;
    int oneWayMoney = 1000;
    int roundTripMoney = 1800;

    public Ticket(int total, int roundTrip) {
        this.total = total;
        this.roundTrip = roundTrip;
    }

    public void print(){
        System.out.println("Total tickets : "+total+"\n"+"Round-trip: "+roundTrip+"\n"+"Total: "+((total-roundTrip)*oneWayMoney+roundTrip*roundTripMoney));

    }

}
