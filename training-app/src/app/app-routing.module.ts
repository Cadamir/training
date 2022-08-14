import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ImpressumComponent } from './impressum/impressum.component';
import { MainComponent } from './main/main.component';
import { ProfileComponent } from './profile/profile.component';
import { TrainingComponent } from './training/training.component';

const routes: Routes = [
  { path: 'training', component: TrainingComponent },
  { path: 'impressum', component: ImpressumComponent },
  { path: 'profile', component: ProfileComponent },
  { path: '', component: MainComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
