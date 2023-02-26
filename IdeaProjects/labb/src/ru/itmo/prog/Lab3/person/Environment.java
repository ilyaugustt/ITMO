package ru.itmo.prog.Lab3.person;
import ru.itmo.prog.Lab3.dop.State;

public class Environment {
    static private State TYPE1 = State.FAVOURITE;
    static private State TYPE2 = State.FOREST;
    static class Woods {

        public void influence() {
            if (TYPE1 == State.FAVOURITE & TYPE2 == State.FOREST) {
                System.out.println("любимый Лес");

            }
        }
    }

}