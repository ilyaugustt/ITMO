package ru.itmo.prog.Lab2.moves;

import ru.ifmo.se.pokemon.*;
public class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 0);

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        super.applyOppEffects(pokemon);
        if ((!pokemon.hasType(Type.GROUND)) || (!pokemon.hasType(Type.FLYING))) {
            new Effect().stat(Stat.SPECIAL_ATTACK, -1);
        }
    }



    @Override
    protected String describe() {
        return "Использует Confide";
    }
}
