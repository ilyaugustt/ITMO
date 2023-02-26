package ru.itmo.prog.Lab3.person;

import java.util.Objects;

public class Ia {
    private String name;

    Ia(String name){
        this.name = name;
    }

    public void ia(){
        System.out.print("ни Иа...");
    }

    public static void main(String[] args) {
        var p1 = new Ia("a");
        var p2 = new Ia("a");

        System.out.println(p1.equals(p2));
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ia ia = (Ia) o;
        return Objects.equals(name, ia.name);
    }


    @Override
    public String toString(){
        return name.toString();
    }
}
