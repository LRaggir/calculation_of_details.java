package com.example.demo.IServis;


import com.example.demo.model.Calcuation;
import com.example.demo.model.Empirical;

public interface ICalculation {
    public Calcuation chet (Empirical empirical);
    public Iterable<Calcuation> Get();
    public void DDelete();
}
