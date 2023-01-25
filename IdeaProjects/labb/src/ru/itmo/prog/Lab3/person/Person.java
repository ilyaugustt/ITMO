package ru.itmo.prog.Lab3.person;

import ru.itmo.prog.Lab3.dop.State;
import ru.itmo.prog.Lab3.dop.FeelingEnum;
import ru.itmo.prog.Lab3.dop.PersonInt;
import ru.itmo.prog.Lab3.dop.OccurToHead;

import java.util.Objects;

public abstract class Person extends Object implements PersonInt, OccurToHead {
    private final String name;
    private Feeling senseOfSmell;
    Person(String name){
        this.name = name;
        senseOfSmell = new Feeling(FeelingEnum.AIR);

    }
    Person(){
        this.name = "Пятачок";
        senseOfSmell = new Feeling(FeelingEnum.AIR, true);

    }

    public void stretchOnSomething(Thing obj){
        System.out.print("ещё потом-- что, может быть, только " + name + " взлетел и сейчас ");
    }

    public void neverNever(Thing obj) {
        System.out.print(" и никогда-никогда " + name + " не увидит больше ");
    }

    @Override
    public void smell(Thing obj) {
        System.out.print("Сперва " + name + " подумал, что " + obj.toString() + " взлетел на " + this.senseOfSmell.toString() + ", потом " + name + " подумал, что, ");
        Environment env = new Environment(State.STUFFY, State.UNBEARABLY);
        System.out.print("может быть, только их ");
        env.influence();
    }


    @Override
    public void occurToHead(Thing obj){
        if(obj instanceof Head){
            System.out.println(" И тут " + this.toString() + " пришло в голову, что даже и на" + obj.toString() + " не обязательно все время лежать носом вниз");
        }
        else{
            notOccurToHead();
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.name) && Objects.equals(senseOfSmell, person.senseOfSmell);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, senseOfSmell);
    }

    @Override
    public String toString(){
        return name;
    }
}