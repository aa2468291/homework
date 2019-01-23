package com.train

import java.util.*

fun main(args: Array<String>) {


    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets: ")
    var totalnumber = scanner.nextInt()
    println("How many round-trip tickets:  ")
    var roundtripnumber = scanner.nextInt()

    val person = Ticket(totalnumber, roundtripnumber)
    person.print();


}


class Ticket(var totalnumber :Int,var roundtripnumber:Int){

    val onewaymoney = 1000
    val roundtripmoney = 1800

    fun print(){
        println("Total tickets : " + totalnumber + "\n" + "Round-trip: " + roundtripnumber + "\n" + "Total: " + ((totalnumber - roundtripnumber) * onewaymoney + roundtripnumber * roundtripmoney))
    }




}