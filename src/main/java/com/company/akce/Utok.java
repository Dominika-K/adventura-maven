package com.company.akce;

import com.company.*;

/**
 * Created by Vydra řičné on 10. 4. 2016.
 */
public class Utok extends Akce {
    Mapa mapa;
    Hrdina hrdina;
    Boj boj;
    Oziveni oziveni;

public Utok (Hrdina hrdina, Mapa mapa){
    super ("bojuj",0); //druhé číslo je počet parametrů, které akce přijímá, píšu jenom "bojuj", ne "bojuj goblin"
    this.hrdina = hrdina;
    this.mapa = mapa;
    this.boj = new Boj();
    this.oziveni = new Oziveni();

}
    public Utok (Hrdina hrdina, Mapa mapa, Boj boj) {
        super("bojuj", 0);
        this.hrdina = hrdina;
        this.mapa = mapa;
        this.boj = boj;
        this.oziveni = new Oziveni();
    }

    public void proveď(String[] parametry) {
        Lokace aktualniLokace = mapa.getAktualniLokace();
        Bytost bytost = aktualniLokace.getBytost();

        if (bytost != null) {
            Boolean zivaMrtva = bytost.getZivaMrtva();
            if (zivaMrtva) {
                boj.kolo(hrdina, bytost);
                int bytostZivoty = bytost.getZivoty();
                int hrdinaZivoty = hrdina.getZivoty();
                if (bytostZivoty <= 0) {
                    bytost.setZivaMrtva(false);
                }
                if (hrdinaZivoty <= 0) {
                    hrdina.setZivaMrtva(false);
                    oziveni.oziveni(mapa, hrdina);
                }
            } else {
                if (!zivaMrtva) {
                    System.out.println("Vždyť už jsi ho zabil, chudák " + bytost);
                }
            }
        } else {
            System.out.println("Do čeho to pícháš? Vždyť tu nic není!");
        }
    }
}