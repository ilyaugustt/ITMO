package ru.itmo.prog.Lab3;

import java.util.ArrayList;
import java.util.List;

public class Human extends AbstractHuman {
    private final List<Skills> skills = new ArrayList<Skills>();

    public Human(){
        System.out.println("Обычный человек успешно создан...");
    }

    public Human (String name){
        this.name = name;
        System.out.println("Человек - " + name  + " успешно создан!");
    }

    public List<Skills> getSkills() {
        return skills;
    }

    public boolean addSkill(Skills skill){
        if (skills.add(skill)){
            System.out.println("Объекту - \"" + this.getName() + "\" успешно присвоено умение " + skill.getName()
                    + " (" + skill.getInfo()+ ")");
            return true;
        }
        else{
            System.out.println("При добавлении умения произошла ошибка...");
            return false;
        }
    }

    public static void think(String name1, String name2,String name3,String name4, String place1, String place2){
        System.out.println("Сперва " + name1 + " подумал, что весь мир взлетел на воздух,потом " + name1 + " подумал, что, может быть, только их любимый " + place1 + "; ещё потом-- что, может быть, только " + name1 + ", взлетел и сейчас он один-одинешенек лежит где-нибудь на " + place2 + " и никогда-никогда не увидит больше ни " + name2 + ", ни " + name3 + ", ни " + name4 + "...");
    }
    public static void away(String name1){
        System.out.println(name1 + " осторожно встал, осмотрелся кругом.");
    }
    public static void lie(String name){
        System.out.println("БУМ!!!" + name + " лежал на земле, не понимая, что же произошло. ");
    }

    public static void insight(String place2){
        System.out.println("И тут ему пришло в голову, что даже на " + place2 + " не обязательно все время лежать носом вниз.");
    }

    @Override
    public int hashCode() {
        return super.hashCode()+this.getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.hashCode() == this.hashCode();
    }

    @Override
    public String getName() {
        return name;
    }
}
