package com.company.akce;

import com.company.Hrdina;
import com.company.Inventar;
import com.company.Lokace;
import com.company.Mapa;

/**
 * Created by Vydra řičné on 26. 3. 2016.
 */
public class Poloz extends Akce {
    Mapa mapa;
    Hrdina hrdina;

    public Poloz(Mapa mapa, Hrdina hrdina) {
        super("polož", 1);
        this.mapa = mapa;
        this.hrdina = hrdina;
    }
    public void proveď(String[] parametry){
        Lokace aktualniLokace = mapa.getAktualniLokace();
        Inventar inventar = hrdina.getInventar();
        if (inventar.ověř(parametry[1])){  // proč nejde volat funkce contains?
            inventar.smaz(parametry[1]);
            aktualniLokace.pridejPredmet(parametry[1]);
            inventar.vypis();
        }else{
            System.out.println("To nemáš");
        }

    }
}
