package ru.itmo.prog.Lab2.moves;

import ru.ifmo.se.pokemon.*;
import ru.itmo.prog.Lab2.program;


public class Thunder extends SpecialMove {
    public Thunder() {
        super(Type.ELECTRIC, 110, 70);

    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);

        if(program.chance(0.3)) {
            Effect.paralyze(pokemon);


        }

    }

    @Override
    protected String describe() {
        return "Использует Thunder";
    }
}
