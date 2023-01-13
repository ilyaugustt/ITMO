package ru.itmo.prog.Lab3;

import java.util.ArrayList;
import java.util.List;

public class Place extends AbstractPlace {
    private final List<Skills> skills = new ArrayList<Skills>();

    private Places type;

    public Place(String name){
        this.placeName = name;
        System.out.println("Место - " + name  + " успешно создана!");
    }

    public void setType(Places type){
        this.type = type;
        typeName = "";
        switch (type){
            case Лес : typeName = "Лес";
                break;
            case Луна : typeName = "Луна";
                break;
        }
        System.out.println(placeName +" объявлена как " + typeName);
    }

    public Places getType() {
        return this.type;
    }

    public String getPlace() {
        return placeName == null ? "..." : placeName;
    }

    public List<Skills> getSkills() {
        return skills;
    }

}
