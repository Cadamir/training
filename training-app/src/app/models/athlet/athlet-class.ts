export class AthletClass {
    name:string;
    clubs:string[];
    achievments: string[] = ["none"];
    age:number = 0;
    weight:number = 0;
    height:number = 0;
    description:string = "-";


    constructor(
        name:string,
        clubs:string[] = ["none"], 
        achievements:string[] = ["none"],
        age:number = 0,
        weight:number = 0,
        height:number = 0,
        description: string = "-",
        ){
        this.name = name;
        this.clubs = clubs;
        this.achievments = achievements;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.description = description;
    }

}
