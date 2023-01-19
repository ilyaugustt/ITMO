package ru.itmo.prog.Lab3.Place;

import ru.itmo.prog.Lab3.Skills.Skills;

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
            case Forest: typeName = "Лес";
                break;
            case Moon: typeName = "Луна";
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
    @Override
    public int hashCode() {
        return super.hashCode()+this.getPlace().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

}
