/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.peoplelist.presentation.bean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import ch.hearc.ig.odi.peoplelist.service.Services;
import java.awt.event.ActionEvent;
import java.util.Date;
import java.util.List;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author renzo.scuderi
 */
@Named(value = "peopleListBean")
//@Dependent
@RequestScoped
public class PeopleListBean {
    @Inject
    Services services;
    
    private Long id;
    private String gender;
    private String firstName;
    private String lastName;
    private Boolean married;
    private Date birthDate;

    public PeopleListBean() {
    }

    public void addPeopleList() {
        services.savePerson("male", firstName, lastName, Boolean.TRUE, birthDate);
        firstName = "";
        lastName = "";
        birthDate = null;
    }

    public List getPeopleList() {
        return services.getPeopleList();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMarried(Boolean married) {
        this.married = married;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public String getGender() {
        return gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Boolean getMarried() {
        return married;
    }

    public Date getBirthDate() {
        return birthDate;
    }

}
