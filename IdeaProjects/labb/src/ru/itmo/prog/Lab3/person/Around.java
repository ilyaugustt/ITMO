package ru.itmo.prog.Lab3.person;

import java.util.Objects;

public class Around {
    public void inc() {
        System.out.print(" осмотрелся кругом");
    }
    private String name;

    Around(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Around around = (Around) o;
        return Objects.equals(name, around.name);
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
