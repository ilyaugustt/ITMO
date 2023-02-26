package ru.itmo.prog.Lab3.person;

import ru.itmo.prog.Lab3.dop.NotToBeBlownAwayByTheWindException;

import java.util.Objects;

public class Piglet extends Person {

    private String name;

    Piglet(String name){
        this.name = name;
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


    public void fullSpeed() {
        class Inf {
            private String information = ",понесся во весь дух, ";

            public void getInformation() {
                System.out.print(information);
            }

        }
        Inf inf = new Inf();
        inf.getInformation();

    }
    public void meantime() {
        Thing home = new Thing("домой");
        System.out.print("Тем временем " + super.toString() + " успел сбегать" + home + ",");

    }
    public void grip(Object obj) throws NotToBeBlownAwayByTheWindException {
            System.out.println(" и, захватив воздушный шарик для Иа-иа,");
            class Something {
                public boolean check(Object obj) {
                    if (obj instanceof Home && ((Home) obj).swept) {
                        return true;
                    } else {
                        return false;
                    }

                }
            }
            Something something = new Something();
            if (something.check(obj)){
                System.out.println("");
            }
            else{
                throw new NotToBeBlownAwayByTheWindException("чтобы его не унесло ветром. ");
            }


    }
    @Override
    public int hashCode () {
        return Objects.hash(name);
    }

    @Override
    public String toString () {
        return name.toString();
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return Objects.equals(name, person.getName());
    }

}

