package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=2)
    private String carmake;

    @NotNull
    @Size(min=2)
    private String carmodel;

    @NotNull
    @Size(min=4, max=4)
    private String caryear;

    public Todo(@NotNull @Size(min = 2) String carmake, @NotNull @Size(min = 2) String carmodel, @NotNull @Size(min = 4, max = 4) String caryear) {
        this.carmake = carmake;
        this.carmodel = carmodel;
        this.caryear = caryear;
    }

    public Todo() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCarmake() {
        return carmake;
    }

    public void setCarmake(String carmake) {
        this.carmake = carmake;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public void setCarmodel(String carmodel) {
        this.carmodel = carmodel;
    }

    public String getCaryear() {
        return caryear;
    }

    public void setCaryear(String caryear) {
        this.caryear = caryear;
    }
}
