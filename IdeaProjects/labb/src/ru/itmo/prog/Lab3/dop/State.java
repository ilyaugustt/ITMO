package ru.itmo.prog.Lab3.dop;

public enum State {
    STUFFY("любимый"),  UNBEARABLY("Лес");
    private String value;
    State(String s){
        value = s;
    }
    @Override
    public String toString(){
        return value;
    }
}
