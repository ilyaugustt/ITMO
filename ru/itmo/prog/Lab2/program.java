package ru.itmo.prog.Lab2;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.itmo.prog.Lab2.pokemons.*;

public class program {
    public static void main(String[] args){

        Battle b = new Battle();
        Zangoose p1 = new Zangoose("Jame", 1);
        Eevee p2 = new Eevee("Arnold", 1);
        Gallade p3 = new Gallade("Sirius", 1);
        Kirlia p4 = new Kirlia("Lomaka", 1);
        Ralts p5 = new Ralts("Victor", 1);
        Leafeon p6 = new Leafeon("Ronald", 1);

        b.addAlly(p4);
        b.addAlly(p5);
        b.addAlly(p6);
        b.addFoe(p1);
        b.addFoe(p2);
        b.addFoe(p3);
        b.go();

    }

    public static boolean chance(double d) {
        return d > Math.random();

    }
}

