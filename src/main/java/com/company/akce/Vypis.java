package com.company.akce;

import com.company.Boj;
import com.company.Hrdina;
import com.company.Inventar;
import com.company.Oziveni;

/**
 * Created by Vydra řičné on 16. 4. 2016.
 */
public class Vypis extends Akce {
    Hrdina hrdina;
    Oziveni oziveni;
    Boj boj;
    Inventar inventar;


    public Vypis (Hrdina hrdina, Oziveni oziveni) {
        super("vypis", 0);
        this.hrdina = hrdina;
        this.boj = new Boj();
        this.inventar = hrdina.getInventar();
        this.oziveni = oziveni;
    }

    public void proveď (String[] parametry){
        int zivoty = hrdina.getZivoty();
        int utok = hrdina.getUtok();
        int obrana = hrdina.getObrana();
        int pocetSmrti = oziveni.getPocetSmrti();
        int pocetZabiti = boj.getPocetZabiti();
        System.out.println(
                "Počet životů: " + zivoty + "\n" +
                "Útok: " + utok + "\n" +
                "Obrana: " + obrana + "\n" +
                "Počet smrtí: "+ pocetSmrti+"\n" +
                "Počet zabitých potvor: " + pocetZabiti);
        inventar.vypis();
    }
}
