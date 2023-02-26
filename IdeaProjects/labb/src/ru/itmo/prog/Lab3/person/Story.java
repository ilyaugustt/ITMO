package ru.itmo.prog.Lab3.person;

import ru.itmo.prog.Lab3.dop.NotToBeBlownAwayByTheWindException;
import ru.itmo.prog.Lab3.dop.IncorrectTextException;
import ru.itmo.prog.Lab3.dop.Understand;


public class Story {
    public static void main(String[] args) throws IncorrectTextException {
        Understand happened = new Understand() {
            @Override
            public void insight() {
                System.out.println(" не понимая, что же произошло");
            }
        };

        Piglet piglet = new Piglet("");
        Home shelf = new Home();
        Home.Balloon balloon = shelf.new Balloon();
        piglet.meantime();
        try {
                piglet.grip(shelf);
            } catch (NotToBeBlownAwayByTheWindException e) {
            piglet.fullSpeed();
            balloon.pressed();
            System.out.print(e.getMessage());
        }
       Boom boom = new Boom("БУМ!!!");
       boom.boom();
       Piglet dunno = new Piglet("Пятачок");
       dunno.toLie();
       happened.insight();
       Thing smell = new Thing("мир", "весь");
       dunno.smell(smell);
       dunno.stretchOnSomething(smell);
       dunno.toLieMoon();
       Puh puh = new Puh("Пух");
       try {
           dunno.neverNever(smell);
       }
       catch(IncorrectTextException e) {
           System.out.println(e.getMessage());
       }

       puh.puh();
       KristoferRobin robin = new KristoferRobin("Кристофер Робин");
       robin.kristofer();
       Ia ia = new Ia("Иа");
       ia.ia();
       Head shirt = new Head("Луне");
       dunno.occurToHead(shirt);
       dunno.itch();
       Around around = new Around("осмотрелся вокруг");
       around.inc();



    }

}