import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { TrainingClass } from 'src/app/models/training/training-class';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TrainingService {

  constructor(private http: HttpClient) { }

  public getTrainings(num:number):Observable<TrainingClass[]>{
    console.log("start request");

    let req = this.http.get<TrainingClass[]>("http://localhost:8080/training?number=20", {headers: new HttpHeaders({
      'Content-Type': 'application/json',
      'Accept': 'application/json',
      'Access-Control-Allow-Origin': 'http://localhost:8080'
    })});
    return req;
  }
}
