import { AthletClass } from "../athlet/athlet-class";

export class TrainingClass {
    date: string;
    startTime: string;
    endTime: string;
    sport: string;
    club: string;
    theme: string;
    id: string;
    athlets: AthletClass[];

    constructor(date: string, startTime: string, endTime: string, sport: string, club: string, theme: string = "-", id="1", athlets=[new AthletClass("Maximilian"), new AthletClass("Justin"), new AthletClass("Marina")]){
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.sport = sport;
        this.club = club;
        this.theme = theme;
        this.id = id;
        this.athlets = athlets;
    }
}
