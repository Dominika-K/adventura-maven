package com.company;


import java.util.ArrayList;

/**
 * Created by Vydra řičné on 18. 1. 2016.
 */
public class Inventar { /*tělo třídy*/
    public String predmet; //public - modifikátor přístupu; string/array list/void/boolean říká, co ta funkce bude vracet; naposled jméno funkce void nevrací nic//
    public ArrayList predmety;
    public void pridej (String vec){
        predmety.add(vec);
    }

    public void vypis (){
        if (predmety.isEmpty()){
            System.out.println ("V batohu nic nemáš");
        }else {
            System.out.println("V batohu máš:");
            for (Object vec : predmety) {
                System.out.println(vec);
            }
        }
    }
    public void smaz (String vec){
        predmety.remove(vec);
    }


    public Inventar(){
        predmety= new ArrayList();


    } /*konstruktor - je ve všech třídách, skládá se z "public" a jména classy, (prostor pro parametry, vlastnosti) a {tělo metody}*/
 public boolean ověř (String vec){
     return predmety.contains(vec);
 }

    public ArrayList getPredmety() {
        return predmety;
    }
}
