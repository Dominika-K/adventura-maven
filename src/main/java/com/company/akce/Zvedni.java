package com.company.akce;

import com.company.Hrdina;
import com.company.Inventar;
import com.company.Lokace;
import com.company.Mapa;

/**
 * Created by Vydra řičné on 20. 3. 2016.
 */
public class Zvedni extends Akce {
    Mapa mapa;
    Hrdina hrdina;

    public Zvedni(Mapa mapa, Hrdina hrdina) {
        super("zvedni", 1);
        this.mapa = mapa;
        this.hrdina = hrdina;
    }

    public void proveď(String[] parametry) {
        Lokace aktualniLokace = mapa.getAktualniLokace();
        Inventar inventar = hrdina.getInventar();
        if (aktualniLokace.jdeProvest(getPrikaz()) && aktualniLokace.muzuVzit(parametry[1])) {
            inventar.pridej(parametry[1]);
            aktualniLokace.odeberPredmet(parametry[1]);
            inventar.vypis();
        } else {
            System.out.println("Nemůžeš");
        }

    }

}

