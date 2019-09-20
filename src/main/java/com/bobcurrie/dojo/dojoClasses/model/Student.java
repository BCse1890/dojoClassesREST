package com.bobcurrie.dojo.dojoClasses.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter

@Entity
public class Student {

    @Id
    private int id;
    private String name;
    private String email;


}
