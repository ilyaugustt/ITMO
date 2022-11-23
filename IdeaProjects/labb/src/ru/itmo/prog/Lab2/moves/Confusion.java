package ru.itmo.prog.Lab2.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.itmo.prog.Lab2.program;

public class Confusion extends SpecialMove {
    public Confusion() {
        super(Type.PSYCHIC, 50, 100);

    }
    @Override
    protected  void applySelfEffects(Pokemon pokemon) {
        super.applySelfEffects(pokemon);
        if (program.chance(0.1)) {
            Effect.confuse(pokemon);


        }

    }

    @Override
    protected String describe() {
        return "Использует Confusion";
    }
}
