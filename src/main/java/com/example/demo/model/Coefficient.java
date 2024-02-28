package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Coefficient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private double u;
    private double C;
private  double G;

    public double getG() {
        return G;
    }

    public void setG(double g) {
        G = g;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getU() {
        return u;
    }

    public void setU(double u) {
        this.u = u;
    }

    public double getC() {
        return C;
    }

    public void setC(double c) {
        C = c;
    }
}
