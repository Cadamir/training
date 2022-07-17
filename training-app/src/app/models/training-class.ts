export class TrainingClass {
    date: string;
    startTime: string;
    endTime: string;
    sport: string;
    club: string;
    theme: string;
    id: string;

    constructor(date: string, startTime: string, endTime: string, sport: string, club: string, theme: string = "-"){
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.sport = sport;
        this.club = club;
        this.theme = theme;
        this.id = "1";
    }
}
