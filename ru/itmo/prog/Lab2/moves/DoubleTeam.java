package ru.itmo.prog.Lab2.moves;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove {
    public DoubleTeam() {
        super(Type.NORMAL, 0, 0);

    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);

        Effect e = new Effect().stat(Stat.EVASION, 1);

        pokemon.addEffect(e);

    }

    @Override
    protected String describe() {
        return "Использует DoubleTeam";
    }
}
