import { Component, OnInit } from '@angular/core';
import { AthletClass } from '../models/athlet/athlet-class';
import { ProfileServiceService } from '../services/profile/profile-service.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  spinner:boolean = true;

  athlet:AthletClass = new AthletClass("Justin");

  constructor(private profileService:ProfileServiceService) { 
    profileService.getAthlet().subscribe(a => {
      this.athlet = a;
      this.spinner = false;
    });
    console.log(this.athlet);
  }

  ngOnInit(): void {
  }

  showWeight():string{
    return this.athlet.weight.toFixed(2);
  }

  showHeight():string{
    return this.athlet.height.toFixed();
  }

}
