package ru.itmo.prog.Lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.prog.Lab2.moves.Psychic;
import ru.itmo.prog.Lab2.moves.Swagger;


public class Ralts extends Pokemon {

    public Ralts(String name, int level){
        super(name, level);

        super.setType(Type.PSYCHIC, Type.FAIRY);
        super.setStats(28, 25, 25, 45, 35, 40);


        super.setMove(new Psychic(), new Swagger());
    }
}
