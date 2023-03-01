package com.example.StudentsDetails.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name="courses")
public class Courses {
    @Id
    private String name;
    private long id;
    private String Title;

    public Courses() {
    }

    public Courses(String name, long id, String title) {
        this.name = name;
        this.id = id;
        Title = title;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", Title='" + Title + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
