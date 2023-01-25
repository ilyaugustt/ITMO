package ru.itmo.prog.Lab3.person;
import ru.itmo.prog.Lab3.dop.State;

public class Environment {
    private State TYPE1;
    private State TYPE2;
    Environment(State type1, State type2){
        TYPE1 = type1;
        TYPE2 = type2;
    }
    public void influence() {
        if (TYPE1 == State.STUFFY & TYPE2 == State.UNBEARABLY) {
            System.out.println("любимый Лес");
        }
    }
}