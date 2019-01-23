package com.train;

public class Ticket {

    int totalnumber;
    int roundtripnumber;
    int onewaymoney = 1000;
    int roundtripmoney = 1800;

    public Ticket(int totalnumber, int roundtripnumber) {
        this.totalnumber = totalnumber;
        this.roundtripnumber = roundtripnumber;
    }

    public void print(){
        System.out.println("Total tickets : "+totalnumber+"\n"+"Round-trip: "+roundtripnumber+"\n"+"Total: "+((totalnumber-roundtripnumber)*onewaymoney+roundtripnumber*roundtripmoney));

    }

}
