import { HttpClient, HttpHandler } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { waitForAsync } from '@angular/core/testing';
import { withLatestFrom } from 'rxjs';
import { AthletClass } from '../models/athlet/athlet-class';
import { TrainingClass } from '../models/training/training-class';
import { TrainingService } from '../services/training/training.service';

@Component({
  selector: 'app-main',
  templateUrl: './main.component.html',
  styleUrls: ['./main.component.css']
})
export class MainComponent implements OnInit {

  spinner:boolean = true;

  trainings: TrainingClass[] = [
    new TrainingClass("heute", "anfang", "ende", "sport", "club","-", "1"),
    new TrainingClass("15.07.2022", "17:00", "18:00", "Taekwondo", "SG Nickelhütte Aue","-", "2", [new AthletClass("Max"), new AthletClass("Marina")]),
    new TrainingClass("15.07.2022", "18:00", "19:00", "Kickboxen", "Hansul Boxen", "Wettkampf", "3")
  ];

  expand = new Map<string, boolean>();

  constructor(private trainingService: TrainingService) { 
    for(let training of this.trainings){
      this.expand.set(training.id, false);
    }
    trainingService.getTrainings(10).subscribe(a => {
      this.trainings = a;
      this.spinner = false;
    });
    console.debug(this.trainings);
  }

  ngOnInit(): void {
  }

  changeExpand(id:string):void{
      this.expand.set(id, !this.expand.get(id))
  }


}
