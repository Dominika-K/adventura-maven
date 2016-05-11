package com.company.akce;

/**
 * Created by Vydra řičné on 1. 2. 2016.
 */
public class Akce {
    public Akce(String prikaz, int pocet_parametru) {      //konstruktor se dvěma parametry
        this.prikaz = prikaz; //ukazatel na konkrétní objekt
        this.pocetParametru = pocet_parametru;
    }

    public String prikaz;
    public int pocetParametru;

    public boolean rozumneni_prikazu(String[] parametry) {
        if (parametry[0].equals(prikaz)) {
            if (parametry.length == pocetParametru + 1) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void proveď (String[] parametry){
    }

    public boolean equals (Object akce){
        if(!(akce instanceof Akce)){
            return false;
        }
        Akce porovnani = (Akce) akce;
        if (porovnani.getPocetParametru() == pocetParametru && getPrikaz()== prikaz){
            return true;
        }
        return false;
    }
    public String getPrikaz (){
        return prikaz;
    }
    public Integer getPocetParametru(){
        return pocetParametru;
    }
}
