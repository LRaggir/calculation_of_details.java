package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Remen {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private  String material;
    private double E;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getE() {
        return E;
    }

    public void setE(double e) {
        E = e;
    }
}
