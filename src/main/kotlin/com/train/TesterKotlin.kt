package com.train

import java.util.*

fun main(args: Array<String>) {
    var total = 0;
    var roundTrip = 0;

    do{
        val scanner = Scanner(System.`in`)
        println("Please enter number of tickets: ")
        total = scanner.nextInt()

        if (total == -1){
            println("***Thank you***")
        }
        else{
            do {
                println("How many round-trip tickets:  ")
                roundTrip = scanner.nextInt()
                if(roundTrip > total){
                    println("Total tickets must be more than round-trip tickets,please input number of round-trip tickets again!")
                }
            }while(roundTrip > total)

            val person = Ticket(total, roundTrip)
            person.print();
        }

    }
        while(total != -1)




}


class Ticket(var total :Int,var roundTrip:Int){

    val oneWayMoney = 1000
    val roundTripMoney = 1800

    fun print(){
        println("Total tickets : $total\nRound-trip:$roundTrip\nTotal:${count()}")
    }

    fun count() = (total - roundTrip) * oneWayMoney + roundTrip * roundTripMoney






}