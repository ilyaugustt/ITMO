package ru.itmo.prog.Lab3.person;

import java.util.Objects;

public class Boom {
    private String name;

    Boom(String name){
        this.name = name;
    }

    public void boom(){
        System.out.print("БУМ!!! ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Boom boom = (Boom) o;
        return Objects.equals(name, boom.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString(){
        return name.toString();
    }
}
