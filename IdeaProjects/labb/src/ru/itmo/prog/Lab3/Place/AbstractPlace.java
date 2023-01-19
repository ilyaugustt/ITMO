package ru.itmo.prog.Lab3.Place;

import ru.itmo.prog.Lab3.Interface.PlaceAble;

public abstract class AbstractPlace implements PlaceAble {
    public String placeName;
    public String typeName;


    @Override
    public int hashCode() {
        return super.hashCode() + this.getPlace().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    public String getPlace() {
        return placeName;
    }
}