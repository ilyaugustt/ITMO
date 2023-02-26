package ru.itmo.prog.Lab3.person;

import java.util.Objects;

public class KristoferRobin {
    private String name;

    KristoferRobin(String name){
        this.name = name;
    }

    public void kristofer(){
        System.out.print("ни Кристофера Робина, ");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KristoferRobin kristoferRobin = (KristoferRobin) o;
        return Objects.equals(name, kristoferRobin.name);
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
