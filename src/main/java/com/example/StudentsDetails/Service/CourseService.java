package com.example.StudentsDetails.Service;

import com.example.StudentsDetails.Entity.Courses;

import java.util.List;

public interface CourseService {
    public List<Courses> getCourses();
   public Courses courseId(long id);
   public Courses addcourse(Courses add);
   public Courses updateCourse(Courses update);


}
