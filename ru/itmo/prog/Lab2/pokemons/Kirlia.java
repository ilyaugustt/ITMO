package ru.itmo.prog.Lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.prog.Lab2.moves.Growl;
import ru.itmo.prog.Lab2.moves.Psychic;
import ru.itmo.prog.Lab2.moves.Swagger;

public class Kirlia extends Pokemon {

    public Kirlia(String name, int level){
        super(name, level);

        super.setType(Type.PSYCHIC, Type.FAIRY);
        super.setStats(38, 35, 35, 65, 55, 50);


        super.setMove(new Psychic(), new Swagger(), new Growl());
    }

}
