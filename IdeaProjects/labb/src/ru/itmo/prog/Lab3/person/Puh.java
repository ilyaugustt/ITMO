package ru.itmo.prog.Lab3.person;

import java.util.Objects;

public class Puh {
    private String name;

    Puh(String name){
        this.name = name;
    }

    public void puh(){
        System.out.print("ни Пуха, ");
    }

    public static void main(String[] args) {
        var p1 = new Puh("a");
        var p2 = new Puh("a");

        System.out.println(p1.equals(p2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Puh puh = (Puh) o;
        return Objects.equals(name, puh.name);
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
