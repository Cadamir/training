export class AthletClass {
    name:string;
    clubs:string[] | undefined;
    achievements: string[] | undefined;
    age:number = 0;
    weight:number = 0;
    height:number = 0;
    description:string = "-";


    constructor(
        name:string,
        clubs:string[] = [], 
        achievements:string[] = [],
        age:number = 0,
        weight:number = 0,
        height:number = 0,
        description: string = "-",
        ){
        this.name = name;
        this.clubs = clubs;
        this.achievements = achievements;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.description = description;
    }

}
