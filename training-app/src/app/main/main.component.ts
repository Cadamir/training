import { Component, OnInit } from '@angular/core';
import { TrainingClass } from '../models/training-class';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {
  trainings: TrainingClass[] = [
    new TrainingClass("heute", "anfang", "ende", "sport", "club"),
    new TrainingClass("15.07.2022", "17:00", "18:00", "Taekwondo", "SG Nickelhütte Aue"),
    new TrainingClass("15.07.2022", "18:00", "19:00", "Kickboxen", "Hansul Boxen", "Wettkampf")
  ];

  expand = new Map<string, boolean>();

  constructor() { 
    for(let training of this.trainings){
      this.expand.set(training.id, false);
    }
  }

  ngOnInit(): void {
  }

  changeExpand(id:string):void{
      this.expand.set(id, !this.expand.get(id))
  }

}
