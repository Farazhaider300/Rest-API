package com.example.StudentsDetails.Controller;

import com.example.StudentsDetails.Entity.Courses;
import com.example.StudentsDetails.Service.CoursesImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class StudentController
{
    @Autowired
    private CoursesImp coursesImp;


    @GetMapping("/courses")
    public List<Courses> getCourses(){
        return this.coursesImp.getCourses();
    }
    @GetMapping("/courses/{courseId}")
    public Courses courseId(@PathVariable String courseId){

        return this.coursesImp.courseId(Long.parseLong(courseId));
    }
    @PostMapping("/addcourse")
    public Courses addcourse(@RequestBody Courses add){

        return this.coursesImp.addcourse(add);
    }
    @PutMapping("/courses")
    public Courses update(@RequestBody Courses update){

        return this.coursesImp.updateCourse(update);
    }
}
