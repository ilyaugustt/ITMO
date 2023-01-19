package ru.itmo.prog.Lab3.Person;

import ru.itmo.prog.Lab3.Interface.HumanAble;

public abstract class AbstractHuman implements HumanAble {
    public String name;
    public int age;

    public AbstractHuman() {

    }

    public AbstractHuman(String name) {
        this.name = name;

    }

    public AbstractHuman(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public int hashCode() {
        return super.hashCode()+this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }



}


