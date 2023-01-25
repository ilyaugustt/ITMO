package ru.itmo.prog.Lab3.person;

public class Story {
    public static void main(String[] args) {
        Boom boom = new Boom("БУМ!!!");
        boom.boom();
        Piglet dunno = new Piglet();
        dunno.toLie();
        Understand understand = new Understand();
        understand.notUnderstanding();
        understand.happened();
        Thing smell = new Thing("мир", "весь");
        dunno.smell(smell);
        dunno.stretchOnSomething(smell);
        dunno.toLieMoon();
        Puh puh = new Puh("Пух");
        dunno.neverNever(smell);
        puh.puh();
        KristoferRobin robin = new KristoferRobin("Кристофер Робин");
        robin.kristofer();
        Ia ia = new Ia("Иа");
        ia.ia();
        Head shirt = new Head("Луне");
        dunno.occurToHead(shirt);
        dunno.itch();
        Around around = new Around();
        around.inc();
    }
}

