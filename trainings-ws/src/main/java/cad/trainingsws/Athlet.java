package cad.trainingsws;

import java.util.Random;

public class Athlet {
    public String name;
    public Athlet(String name){
        this.name = name;
    }

    static public Athlet random(){
        String[] name = {"Justin", "Maximilian", "Marina", "Maya", "Fritz"};
        return new Athlet(name[new Random().nextInt(0, name.length)]);
    }
}
