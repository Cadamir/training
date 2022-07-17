export class TrainingClass {
    date: String;
    startTime: String;
    endTime: String;
    sport: String;
    club: String;
    theme: String;
    id: String;

    constructor(date: String, startTime: String, endTime: String, sport: String, club: String, theme: String = "-"){
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.sport = sport;
        this.club = club;
        this.theme = theme;
        this.id = "1";
    }
}
