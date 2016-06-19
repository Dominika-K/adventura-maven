package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vydra řičné on 1. 2. 2016.
 */
public class Lokace {
    public List povoleneAkce;
    private ArrayList predmety;
    private Bytost bytost;

    public Lokace(List akce) {
        this(akce, new ArrayList<>());
    }

    public Lokace(List akce, ArrayList predmety) {
        this(akce, predmety, null);
    }

    public Lokace(List akce, Bytost bytost) {
        this(akce, new ArrayList<>(), bytost);
    }

    public Lokace(List akce, ArrayList predmety, Bytost bytost) {
        this.povoleneAkce = akce;
        this.predmety = predmety;
        this.bytost = bytost;
    }

    public Lokace (String deserialize){

    }


    public boolean jdeProvest(String akce) {
        return povoleneAkce.contains(akce);
    }

    public boolean muzuVzit(String predmet) {
        return predmety.contains(predmet);
    }

    public void odeberPredmet(String predmet) {
        predmety.remove(predmet);
    }

    public void pridejPredmet(String predmet) {
        predmety.add(predmet);
    }

    public void pridejPredmet (Object vec) {predmety.add(vec); System.out.println(predmety);}

    public Bytost getBytost() {
        return bytost;
    }

    public String serialize () {

        String result = ""; //"" - funguje jako new string
        result += "" + predmety + povoleneAkce + bytost + "\n";
        return result;
    }

    public void vypis() {
        if (!predmety.isEmpty()) {
            System.out.println("v místnosti je");
            for (Object vec : predmety) {
                System.out.println(vec);
            }
        }
            if (bytost != null && bytost.getZivaMrtva()) {
                System.out.println("Řítí se proti tobě " + bytost);
            }else {
                System.out.println("v místnosti není žádná potvora");
            }
            if(!bytost.getZivaMrtva()){
                System.out.println ("hnije tu jenom nějaká mrtvola: " + bytost);
            }




    }
}

