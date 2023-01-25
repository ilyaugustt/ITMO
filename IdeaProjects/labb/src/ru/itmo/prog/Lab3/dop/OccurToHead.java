package ru.itmo.prog.Lab3.dop;

import ru.itmo.prog.Lab3.person.Thing;

public interface OccurToHead {
    default void notOccurToHead(){
        System.out.println("ему не пришло в голову");
    }

    void occurToHead(Thing obj);
}