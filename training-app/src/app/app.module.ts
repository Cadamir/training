import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuComponent } from './menu/menu.component';
import { MainComponent } from './main/main.component';
import { CalendarComponent } from './calendar/calendar.component';
import { TrainingComponent } from './training/training.component';
import { ImpressumComponent } from './impressum/impressum.component';
import { ProfileComponent } from './profile/profile.component';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { HttpClientModule } from '@angular/common/http';

import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import {MatCardModule} from '@angular/material/card';
import {MatDividerModule} from '@angular/material/divider'; 
import {MatListModule} from '@angular/material/list';
import {MatGridListModule} from '@angular/material/grid-list'; 
import {MatProgressSpinnerModule} from '@angular/material/progress-spinner';




@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    MainComponent,
    CalendarComponent,
    TrainingComponent,
    ImpressumComponent,
    ProfileComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatToolbarModule,
    MatIconModule,
    MatCardModule,
    MatDividerModule,
    MatListModule,
    HttpClientModule,
    MatGridListModule,
    MatProgressSpinnerModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
