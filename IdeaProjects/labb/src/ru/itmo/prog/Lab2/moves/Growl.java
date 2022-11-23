package ru.itmo.prog.Lab2.moves;

import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove {
    public Growl() {
        super(Type.NORMAL, 0, 100);

    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);

        Effect e = new Effect().stat(Stat.ATTACK, -1);

        pokemon.addEffect(e);

    }

    @Override
    protected String describe() {
        return "Использует Growl";
    }
}
