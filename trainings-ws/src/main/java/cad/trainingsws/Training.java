package cad.trainingsws;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Training {
    static AtomicInteger aID;
    public int id;
    public String sport;
    public String club;
    public String date;
    public String startTime;
    public String endTime;
    public String comment;
    public ArrayList<Athlet> athlets;

    public Training(String sport, String club, String date, String startTime, String endTime, String comment){
        aID = new AtomicInteger();
        this.id = aID.addAndGet(1);
        this.sport = sport;
        this.club = club;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.comment = comment;
        this.athlets = new ArrayList<>();
    }

    public Training(int id, String sport, String club, String date, String startTime, String endTime, String comment, ArrayList<Athlet> athlets){
        aID = new AtomicInteger();
        this.id = id;
        this.club = club;
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.comment = comment;
        this.athlets = athlets;
    }

    public void addAthlet(Athlet athlet, int id){
        athlets.add(id, athlet);
    }

    public Athlet getAthlet(int id){
        return athlets.get(id);
    }

    public static Training random(){
        Random random = new Random();
        String[] sports = {"Taekwondo", "Kickboxen", "Schach", "Karate"};
        String[] clubs = {"Nickelhütte", "TUS", "DTU", "DKU", "DSU"};
        String date = random.nextInt(1,31) + "." + random.nextInt(1,12) + "." + random.nextInt(2022, 2100);
        int time = random.nextInt(16, 21);
        String startTime = time + ":00";
        String endTime = (time - random.nextInt(1,2)) + ":00";
        String comment = "-";
        Training training = new Training(
                sports[random.nextInt(0, sports.length)],
                clubs[random.nextInt(0, clubs.length)],
                date,
                startTime,
                endTime,
                comment
        );
        int azAthlet = random.nextInt(0,20);
        for(int i = 0; i < azAthlet; i++){
            training.addAthlet(Athlet.random(), i);
        }
        return training;
    }

}
