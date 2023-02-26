package ru.itmo.prog.Lab3.dop;


public enum FeelingEnum {
    AIR("воздух");
    private String value;
    FeelingEnum(String s){
        value = s;
    }
    @Override
    public String toString(){
        return value;
    }
}
