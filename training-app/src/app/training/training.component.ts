import { Component, OnInit, Input } from '@angular/core';
import { AthletClass } from '../models/athlet/athlet-class';

@Component({
  selector: 'app-training',
  templateUrl: './training.component.html',
  styleUrls: ['./training.component.css']
})
export class TrainingComponent implements OnInit {

  @Input()
  athlets: AthletClass[] = [];

  constructor() {
   }

  ngOnInit(): void {
  }


}
