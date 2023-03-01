package com.example.StudentsDetails.Service;

import com.example.StudentsDetails.DaoRepository.StudentDao;
import com.example.StudentsDetails.Entity.Courses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoursesImp implements CourseService {
    @Autowired
    public StudentDao studentDao;

   /* List<Courses>list;*/

public CoursesImp(){
    /*list=new ArrayList<>();
    list.add(new Courses("java",123,"This course have all core java details"));
    list.add(new Courses("Spring Boot",234,"This course have all Spring boot details"));*/
}


    @Override
    public List<Courses> getCourses() {
        return studentDao.findAll();
    }

    @Override
    public Courses courseId(long courseId) {
   /* Courses c=null;
        for (Courses course:list) {
            if (course.getId()==courseId){
                c=course;
                break;
            }

        }*/
        return studentDao.getOne(courseId);
    }

    @Override
    public Courses addcourse(Courses add) {

    /*list.add(add);*/
        studentDao.save(add);
        return add;
    }

    @Override
    public Courses updateCourse(Courses update) {
     /*   for (Courses courses: list){
            if (courses.getId()== update.getId()){
                 list.add(updateCourse(courses));
              break;
          }
        }*/
        studentDao.save(update);
        return update;
    }
}
