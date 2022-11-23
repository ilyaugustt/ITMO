package ru.itmo.prog.Lab2.moves;

import ru.ifmo.se.pokemon.*;
import ru.itmo.prog.Lab2.program;


public class FireBlast extends SpecialMove {
    public FireBlast() {
        super(Type.FIRE, 110, 85);

    }
    @Override
    protected  void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        if (program.chance(0.1)) {
            Effect.burn(pokemon);


        }

    }

    @Override
    protected String describe() {
        return "Использует FireBlast";

    }


}
