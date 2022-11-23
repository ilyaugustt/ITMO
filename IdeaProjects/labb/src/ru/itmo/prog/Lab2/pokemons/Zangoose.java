package ru.itmo.prog.Lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.prog.Lab2.moves.FireBlast;
import ru.itmo.prog.Lab2.moves.FocusBlast;
import ru.itmo.prog.Lab2.moves.Swagger;
import ru.itmo.prog.Lab2.moves.Thunder;


public class Zangoose extends Pokemon {

    public Zangoose(String name, int level){
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(73, 115, 60, 60, 60, 90);


        super.setMove(new FireBlast(), new FocusBlast(), new Thunder(), new Swagger());
    }
}
