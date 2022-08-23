package cad.trainingsws;

import java.util.ArrayList;
import java.util.Random;

public class Athlet {
    public String name;
    public String[] clubs;
    public String[] achievments;
    public int age;
    public double weight;
    public int height;
    public String description;

    public Athlet(String name){
        this.name = name;
    }

    public Athlet(
            String name,
            String[] clubs,
            String[] achievments,
            int age,
            double weight,
            int height,
            String description
            )
    {
        this.name = name;
        this.clubs = clubs;
        this.achievments = achievments;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.description = description;
    }

    static public Athlet randomEasy(){
        String[] name = {"Justin", "Maximilian", "Marina", "Maya", "Fritz"};
        return new Athlet(name[new Random().nextInt(0, name.length)]);
    }

    static public Athlet randomFull(){
        String[] names = {"Justin", "Maximilian", "Marina", "Maya", "Fritz"};
        String[] clubs = {"Nickelhütte", "DTU", "Taifun", "Dresden TKD", "TUS"};
        String[] achievments = {
                "1. Platz Deutsche Meisterschaft TKD",
                "2. Platz Deutsche Meisterschaft TKD",
                "3. Platz Deutsche Meisterschaft TKD",
                "1. Platz Oyympia Kickboxen",
                "2. Platz Olympia Kickboxen",
                "1. Platz Anfängertunier Bautzen",
                "1. Platz Bei meiner Freundin"
        };
        String[] descriptions = {
                "Ich bin cool",
                "Ich bin heiß",
                "Ich bin motiviert",
                "Ich fange erst an",
                "Ich fühle mich wie ein Großmeister"
        };
        Random random = new Random();
        ArrayList<String> club = new ArrayList<>();
        for(int i = 0; i < random.nextInt(0, 4); i++){
            club.add(clubs[random.nextInt(0, clubs.length)]);
        }
        ArrayList<String> achievement = new ArrayList<>();
        for(int i = 0; i < random.nextInt(0, 5); i++){
            achievement.add(achievments[random.nextInt(0, achievments.length)]);
        }
        return new Athlet(
                names[random.nextInt(0, names.length)], //Name
                club.toArray(new String[0]), //club
                achievement.toArray(new String[0]), //achievements
                random.nextInt(0,80), //age
                random.nextDouble(0.,160.), //weight
                random.nextInt(120, 220), //size
                descriptions[random.nextInt(0, descriptions.length)] //description
        );
    }

    public boolean matchWeightClass(int minAge, int maxAge, int maxWeight){
        if(this.weight > maxWeight) return false;
        if(this.age > maxAge) return false;
        if(this.age < minAge) return false;

        return true;
    }
}
