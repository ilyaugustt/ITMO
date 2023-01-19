package ru.itmo.prog.Lab3.Skills;

public class Skills {
    private final String name;
    private final String info;

    public Skills(String name, String info){
        this.name = name;
        this.info = info;
    }

    public String getName(){
        return name;
    }

    public String getInfo(){
        if (info == null)
            return "...";
        else
            return info;

    }

    @Override
    public int hashCode() {
        return super.hashCode()+this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

}