import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AboutUsComponent } from './about-us/about-us.component';
import { StudentComponent } from './student/student.component';
import { FacultyComponent } from './faculty/faculty.component';
import { CourseComponent } from './course/course.component';
import { LoginComponent } from './login/login.component';
import { PlacementComponent } from './placement/placement.component';

const routes: Routes = [
  {path:"home",component:HomeComponent},
  {path:"aboutus",component:AboutUsComponent},
  {path:"student",component:StudentComponent},
  {path:"faculty",component:FacultyComponent},
  {path:"course",component:CourseComponent},
  {path:"login",component:LoginComponent},
  {path:"placement",component:PlacementComponent},
 

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
