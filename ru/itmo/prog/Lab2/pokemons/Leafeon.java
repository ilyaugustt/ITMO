package ru.itmo.prog.Lab2.pokemons;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.prog.Lab2.moves.Confide;
import ru.itmo.prog.Lab2.moves.DoubleTeam;
import ru.itmo.prog.Lab2.moves.ShadowBall;
import ru.itmo.prog.Lab2.moves.XScissor;


public class Leafeon extends Pokemon {

    public Leafeon(String name, int level){
        super(name, level);

        super.setType(Type.GRASS);
        super.setStats(65, 110, 130, 60, 65, 95);


        super.setMove(new Confide(), new DoubleTeam(), new ShadowBall(), new XScissor());
    }

}
