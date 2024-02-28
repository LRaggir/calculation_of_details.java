package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Calcuation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private  double A;
    private double B;
    private double   Ϭц;
    private double   Ϭр;
    private double   Ϭmax;
    private double   Ϭх;
    private double   Cp;

    private double   tч;
    private double E;
    private double C1;
    private double t1;
private String dost;

    public String getDost() {
        return dost;
    }

    public void setDost(String dost) {
        this.dost = dost;
    }

    public double getT1() {
        return t1;
    }

    public void setT1(double t1) {
        this.t1 = t1;
    }

    public double getC1() {
        return C1;
    }

    public void setC1(double c1) {
        C1 = c1;
    }

    public double getE() {
        return E;
    }

    public void setE(double e) {
        E = e;
    }
private  double del;

    public double getDel() {
        return del;
    }

    public void setDel(double del) {
        this.del = del;
    }

    public double getϬmax() {
        return Ϭmax;
    }

    public void setϬmax(double ϭmax) {
        Ϭmax = ϭmax;
    }

    public double getA() {
        return A;
    }

    public void setA(double a) {
        A = a;
    }

    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    public double getϬц() {
        return Ϭц;
    }

    public void setϬц(double ϭц) {
        Ϭц = ϭц;
    }

    public double getϬр() {
        return Ϭр;
    }

    public void setϬр(double ϭр) {
        Ϭр = ϭр;
    }

    public double getϬх() {
        return Ϭх;
    }

    public void setϬх(double ϭх) {
        Ϭх = ϭх;
    }

    public double getCp() {
        return Cp;
    }

    public void setCp(double cp) {
        Cp = cp;
    }



    public double getTч() {
        return tч;
    }

    public void setTч(double tч) {
        this.tч = tч;
    }
}
