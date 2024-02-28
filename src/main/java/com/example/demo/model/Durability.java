package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Durability {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private double relationship;

    private double t;
    private double R;

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRelationship() {
        return relationship;
    }

    public void setRelationship(double relationship) {
        this.relationship = relationship;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }
}
