package ru.itmo.prog.Lab3.person;

public class Piglet extends Person {
    Piglet(){

    }
    public void toLie(){
        Thing lie = new Thing("земле");
        System.out.print(super.toString() + " лежал на" + lie.toString());
    }

    public void toLieMoon() {
        Thing lieMoon = new Thing("Луне");
        System.out.print(super.toString() + " лежит где-нибудь на" + lieMoon.toString());
    }
    public void itch(){
        System.out.print(super.toString() + " осторожно встал, ");
    }


}