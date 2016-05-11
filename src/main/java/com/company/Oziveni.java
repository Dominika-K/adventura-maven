package com.company;

import java.util.ArrayList;

/**
 * Created by Vydra řičné on 13. 4. 2016.
 */
public class Oziveni {

    Hrdina hrdina;
    Inventar invetar;
    Mapa mapa;
    Lokace lokace;
    static int pocetSmrti = 0;

    public void oziveni(Mapa mapa, Hrdina hrdina) {
        this.mapa = mapa;
        this.invetar = hrdina.getInventar();
        this.lokace = mapa.getAktualniLokace();
        this.hrdina = hrdina;
        Boolean zivaMrtva = hrdina.getZivaMrtva();
        if (!zivaMrtva) {


            lokacePridejInventarOdeber();

            mapa.setAktualniPozice(new Pozice(1, 1));
            hrdina.setZivaMrtva(true);
            hrdina.setZivoty(10);
            System.out.println("Máš druhý pokus, vracíš se do pozice 1,1");
            invetar.vypis();
            setPocetSmrti(getPocetSmrti() + 1);
            System.out.println("Počet smrtí: " + pocetSmrti);
        }
    }

    public void lokacePridejInventarOdeber () {
        Lokace aktualniLokace = mapa.getAktualniLokace();
       ArrayList predmetyInventar = invetar.getPredmety();


        while (!predmetyInventar.isEmpty()) {
            Object vec = predmetyInventar.get(0);
            aktualniLokace.pridejPredmet(vec);
            predmetyInventar.remove(0);
        }

    }

    public int getPocetSmrti() {
        return pocetSmrti;
    }

    public void setPocetSmrti(int pocetSmrti) {
        this.pocetSmrti = pocetSmrti;
    }
}
