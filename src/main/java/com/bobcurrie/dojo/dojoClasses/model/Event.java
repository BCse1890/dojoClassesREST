package com.bobcurrie.dojo.dojoClasses.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;


@Entity
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String dojo;
    private Date date;

//    @ManyToMany
//    @JoinTable(
//            name = "ATTENDEE",
//            joinColumns = @JoinColumn(name = "event_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id"))


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="event_student",
            joinColumns = @JoinColumn(name="event_id"),
            inverseJoinColumns = @JoinColumn(name="student_id"))
    private Set<Student> students = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDojo() {
        return dojo;
    }

    public void setDojo(String dojo) {
        this.dojo = dojo;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @JsonIgnore
    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }

    //    @ManyToMany(mappedBy = "ATTENDEE")
//    private Set<Student> students = new HashSet<>();


}


