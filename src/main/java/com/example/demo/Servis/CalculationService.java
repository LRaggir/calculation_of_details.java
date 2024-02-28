package com.example.demo.Servis;

import com.example.demo.IServis.ICalculation;
import com.example.demo.model.*;
import com.example.demo.repo.CalcuationRepository;
import com.example.demo.repo.CoefficientRepository;
import com.example.demo.repo.DurabilityRepository;
import com.example.demo.repo.RemenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CalculationService implements ICalculation {

    Calcuation calcuation = new Calcuation();
    @Autowired
    private RemenRepository remen;
    @Autowired
    private DurabilityRepository durability;
    @Autowired
    private CoefficientRepository coefficient;
    @Autowired
    private CalcuationRepository calcuationRepository;

    public Calcuation chet(Empirical empirical) {

        Optional<Remen> rem = remen.findById(empirical.getR());
        Remen re = rem.get();
        calcuation.setϬц(re.getE() * empirical.getQ() / empirical.getD1());
        calcuation.setϬр(empirical.getW() + (empirical.getF() / (2 * empirical.getB() * empirical.getQ())) + calcuation.getϬц());
        calcuation.setϬmax(calcuation.getϬр() + empirical.getY());
        if (empirical.getU() == "")
            if (empirical.getU() == "Быстроходная")
                empirical.setIч(50);
            else
                empirical.setIч(5);
        calcuation.setCp(empirical.getIp() / (((calcuation.getϬmax() / calcuation.getϬmax()) * (empirical.getIx() / empirical.getLk())) * empirical.getK()));
        Iterable<Coefficient> coefficientIterable = coefficient.findAll();
        List<Coefficient> coefficients = new ArrayList<>();
        coefficientIterable.forEach(coefficients::add);
        calcuation.setE(Math.round(calcuation.getϬр() / empirical.getY() * 10));
        calcuation.setE(calcuation.getE()/10);
        for (int i = 0; i < coefficients.size(); i++) {
            if (coefficients.get(i).getU() == empirical.getU1() && coefficients.get(i).getG() == calcuation.getE()) {
                calcuation.setC1(coefficients.get(i).getC());
            }
        }

            if (calcuation.getC1() == 0)
                calcuation.setC1(2 / (1 + Math.pow((calcuation.getϬр() + empirical.getY() / empirical.getU1()) / calcuation.getϬmax(), 6)));
            Iterable<Durability> durabilities = durability.findAll();
            List<Durability> durabilitiess = new ArrayList<>();
            durabilities.forEach(durabilitiess::add);
            for (int j = 0; j < durabilitiess.size(); j++) {
                if (durabilitiess.get(j).getR() == calcuation.getϬр() && durabilitiess.get(j).getRelationship() == (empirical.getD1() / empirical.getQ())) {
                    calcuation.setT1(durabilitiess.get(j).getT());
                }
            }

        calcuation.setTч(calcuation.getT1() / 2 * calcuation.getC1() * calcuation.getCp());
        calcuation.setA(Math.pow(calcuation.getϬmax(), 6) * 3200 * empirical.getIч() * empirical.getZ() * calcuation.getTч());
        calcuation.setB(Math.pow(7.5, 6) * Math.pow(10, 7));

calcuation.setϬх(calcuation.getϬmax());
        calcuation.setDel(Math.abs(calcuation.getA() - calcuation.getB()));
        calcuationRepository.save(calcuation);
        if(calcuation.getDel()>1000)
            calcuation.setDost("Рассчет недостоверен");
        else
            calcuation.setDost("Рассчет достоверен");
        return calcuation;
    }


    public Iterable<Calcuation> Get()
    {
        return calcuationRepository.findAll();
    }

    public void DDelete()
    {
        calcuationRepository.deleteAll();
    }
}
