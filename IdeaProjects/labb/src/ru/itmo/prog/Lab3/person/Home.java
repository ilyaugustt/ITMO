package ru.itmo.prog.Lab3.person;

public class Home extends Thing{
    boolean swept = false;
    Home(){
        super();
    }
    public class Balloon{
        String name = "шар";
        String description = "воздушный";
        public void pressed(){

            Thing breasts = new Thing("к груди");
            System.out.println("прижимая " + description + " " + name + breasts);
        }
    }

}
