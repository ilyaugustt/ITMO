package ru.itmo.prog.Lab2.pokemons;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.prog.Lab2.moves.Confide;
import ru.itmo.prog.Lab2.moves.DoubleTeam;
import ru.itmo.prog.Lab2.moves.ShadowBall;



public class Eevee extends Pokemon {

    public Eevee(String name, int level){
        super(name, level);

        super.setType(Type.NORMAL);
        super.setStats(55, 55, 50, 45, 65, 55);


        super.setMove(new Confide(), new DoubleTeam(), new ShadowBall());
    }
}
