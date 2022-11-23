package ru.itmo.prog.Lab2.moves;

import ru.ifmo.se.pokemon.*;
import ru.itmo.prog.Lab2.program;

public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST, 80, 100);

    }
    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);

        if(program.chance(0.2)) {
            Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);


        }

    }

    @Override
    protected String describe() {
        return "Использует ShadowBall";
    }
}
