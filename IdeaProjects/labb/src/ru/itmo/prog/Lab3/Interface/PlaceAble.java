package ru.itmo.prog.Lab3.Interface;

import ru.itmo.prog.Lab3.Place.Places;

public interface PlaceAble {
    String getPlace();
    void setType(Places type);
    Places getType();
}