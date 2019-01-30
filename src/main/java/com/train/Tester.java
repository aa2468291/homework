package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0 ;
        int roundTrip = 0;



        do {

            System.out.println("Please enter number of tickets: ");
            total = scanner.nextInt();

            if (total == -1) {
                System.out.println("***Thank you***");
            } else {
                do {
                    System.out.println("How many round-trip tickets:  ");
                    roundTrip = scanner.nextInt();
                    if (roundTrip > total) {
                        System.out.println("Total tickets must be more than round-trip tickets,please input number of round-trip tickets again!");
                    }
                } while (roundTrip > total);


                Ticket person = new Ticket(total, roundTrip);
                person.print();
            }
        }
            while (total != -1) ;



    }



}
