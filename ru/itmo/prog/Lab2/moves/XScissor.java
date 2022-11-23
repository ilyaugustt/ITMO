package ru.itmo.prog.Lab2.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class XScissor extends PhysicalMove {
    public XScissor(){
        super(Type.BUG, 80, 100);

    }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double v) {
        super.applyOppDamage(pokemon, v);

    }

    @Override
    protected String describe() {

        return "Использует XScissor";
    }
}
