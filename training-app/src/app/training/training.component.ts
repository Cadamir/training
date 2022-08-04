import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-training',
  templateUrl: './training.component.html',
  styleUrls: ['./training.component.css']
})
export class TrainingComponent implements OnInit {

  @Input()
  athlets: string[] = [];

  constructor() {
   }

  ngOnInit(): void {
  }


}
