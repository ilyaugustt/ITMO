package ru.itmo.prog.Lab3;

import ru.itmo.prog.Lab3.Interface.HumanAble;
import ru.itmo.prog.Lab3.Interface.PlaceAble;
import ru.itmo.prog.Lab3.Person.Human;
import ru.itmo.prog.Lab3.Place.Place;
import ru.itmo.prog.Lab3.Place.Places;
import ru.itmo.prog.Lab3.Skills.Skills;

public class main {
    public static void main(String[] args){
        System.out.println();
        HumanAble puh = new Human("Пух");

        System.out.println();

        HumanAble KristoferRobin = new Human("Кристофер Робин");

        System.out.println();

        HumanAble Ia = new Human("Иа");

        System.out.println();

        HumanAble Mir = new Human("Мир");

        System.out.println();

        HumanAble pyatachok = new Human("Пятачок");
        pyatachok.addSkill(new Skills("Лежать", "на земле"));
        pyatachok.addSkill(new Skills("Подумать", null));
        pyatachok.addSkill(new Skills("Взлететь", null));
        pyatachok.addSkill(new Skills("Увидеть", null));
        pyatachok.addSkill(new Skills("Встать", null));
        pyatachok.addSkill(new Skills("Осмотреться", "кругом"));
        System.out.println();

        PlaceAble location1 = new Place("Локация1");
        location1.setType(Places.Forest);

        System.out.println();

        PlaceAble location2 = new Place("Локация2");
        location2.setType(Places.Moon);

        System.out.println();

        Human.lie(pyatachok.getName().toString());
        Human.think(pyatachok.getName().toString(), Mir.getName().toString(), location1.getType().toString());
        Human.fly(pyatachok.getName().toString(), location2.getType().toString(), puh.getName().toString(), KristoferRobin.getName().toString(), Ia.getName().toString());
        Human.insight(location2.getType().toString());
        Human.away(pyatachok.getName().toString());
    }



}
