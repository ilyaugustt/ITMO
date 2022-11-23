package ru.itmo.prog.Lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.prog.Lab2.moves.Confusion;
import ru.itmo.prog.Lab2.moves.Growl;
import ru.itmo.prog.Lab2.moves.Psychic;
import ru.itmo.prog.Lab2.moves.Swagger;


public class Gallade extends Pokemon {
    public Gallade(String name, int level){
        super(name, level);

        super.setType(Type.PSYCHIC, Type.FIGHTING);
        super.setStats(68, 125, 65, 65, 115, 80);


        super.setMove(new Psychic(), new Swagger(), new Growl(), new Confusion());
    }

}
