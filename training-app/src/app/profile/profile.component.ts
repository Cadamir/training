import { Component, OnInit } from '@angular/core';
import { AthletClass } from '../models/athlet/athlet-class';
import { ProfileServiceService } from '../services/profile/profile-service.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  athlet:AthletClass = new AthletClass("Justin");

  constructor(private profileService:ProfileServiceService) { 
    profileService.getAthlet().subscribe(a => {this.athlet = a;});
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
