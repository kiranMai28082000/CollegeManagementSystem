import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent {StudentArray:any[]=[];
  isResultLoaded=false;
  isUpdateFormActive=false;
  name:string="";
  course:string="";
  email:string="";
  address:string="";
  currentStudentID="";
  constructor(private http:HttpClient)
  {
    this.getAllStudent();
  }
  getAllStudent(): void
  {
    this.http.get("http://localhost:9090/api/v1/student/getAllStudents")
    .subscribe((resultData: any)=>
      {
          this.isResultLoaded = true;
          console.log(resultData);
          this.StudentArray = resultData;
      });
  }
  register()
  {
    let bodyData={
      "name":this.name,"course":this.course,"email":this.email,
      "address":this.address
    };
    this.http.post("http://localhost:9090/api/v1/student/save",bodyData,{responseType:'text'}).subscribe((resultData: any)=>
    {
  console.log(resultData);
  alert("Student registered successfully");
  this.getAllStudent();
  this.name="";
  this.course="";
  this.email="";
  this.address="";
});
  }
 

setUpdate(data: any){
  this.name=data.name;
  this.course=data.course;
  this.email=data.email;
  this.address=data.address;
  this.currentStudentID=data.currentStudentid;
}
updateRecords()
{
  let bodyData={
    "studentid":this.currentStudentID,"name":this.name,"course":this.course,"email":this.email,
    "address":this.address
  };
 
  
this.http.put("http://localhost:9090/api/v1/student/update/id",bodyData,{responseType:'text'}).subscribe((resultData: any)=>
{
  console.log(resultData);
  alert("Student details updated successfully");
  this.getAllStudent();
  this.name="";
  this.course="";
  this.email="";
  this.address="";

});
}
save()
  {
    if(this.currentStudentID == '')
    {
        this.register();
    }
      else
      {
       this.updateRecords();
      }      
  }
  setDelete(data: any)
  {
    
    
    this.http.delete("http://localhost:9090/api/v1/student/deleteStudent"+ "/"+ data.studentid,{responseType: 'text'}).subscribe((resultData: any)=>
    {
        console.log(resultData);
        alert("Student Deletedddd")
        this.getAllStudent();
        this.name="";
        this.course="";   
        this.email="";
        this.address="";
      });
    }
   

    

}
