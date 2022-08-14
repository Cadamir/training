import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AthletClass } from 'src/app/models/athlet/athlet-class';
import { TrainingClass } from 'src/app/models/training/training-class';

@Injectable({
  providedIn: 'root'
})
export class ProfileServiceService {

  constructor(private http: HttpClient) { }

  public getAthlet():Observable<AthletClass>{
    console.log("start request");

    let req = this.http.get<AthletClass>("http://localhost:8080/athlet");
    return req;
  }
}