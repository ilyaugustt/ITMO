package ru.itmo.prog.Lab3.person;


import java.util.Objects;

public class Thing{
    private String name;
    private String description;
    Thing(String name, String description) {
        this.name = name;
        this.description = description;
    }
    Thing(String name){
        this.name = name;
        this.description = "";
    }

    Thing(){
        name = "домой";
        description = "";
    }

    public static void main(String[] args) {
        var p1 = new Thing("a");
        var p2 = new Thing("a");

        System.out.println(p1.equals(p2));
    }
    @Override
    public String toString(){
        return description +" "+ name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Thing thing = (Thing) obj;
        return Objects.equals(name, thing.name) && Objects.equals(description, thing.description);
    }
    

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
