package com.company;

import com.company.akce.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vydra řičné on 14. 2. 2016.
 */
public class Mapa {
    public Pozice aktualniPozice;
    public Map<Pozice, Lokace> povolenePozice;//přijímá jenom věci z pozice a vrací jenom Lokace

    public Mapa(Hrdina hrdina)

    {
        Jdi prikazJdi = new Jdi(this);
        Zvedni prikazZvedni = new Zvedni(this,hrdina);
        Poloz prikazPoloz = new Poloz(this, hrdina);
        Utok prikazUtok = new Utok(hrdina, this);
        Oziveni oziveni = new Oziveni();
        Vypis prikazVypis = new Vypis(hrdina, oziveni);

        ArrayList jdiPolozUtoc = new ArrayList();
        jdiPolozUtoc.add(prikazJdi.getPrikaz());
        jdiPolozUtoc.add(prikazPoloz.getPrikaz());
        jdiPolozUtoc.add(prikazUtok.getPrikaz());

        ArrayList jdiZvedniPolozUtoc = new ArrayList();
        jdiZvedniPolozUtoc.add(prikazJdi.getPrikaz()); // add ma jenom jeden parametr
        jdiZvedniPolozUtoc.add(prikazZvedni.getPrikaz());
        jdiZvedniPolozUtoc.add(prikazPoloz.getPrikaz());
        jdiZvedniPolozUtoc.add(prikazVypis.getPrikaz());
        jdiZvedniPolozUtoc.add(prikazUtok.getPrikaz());

        ArrayList predmety = new ArrayList();
        predmety.add("meč");
        predmety.add("provaz");


        povolenePozice = new HashMap<>();
        povolenePozice.put(new Pozice(0, 1), new Lokace(jdiZvedniPolozUtoc, new Bytost("drak",10,5,5,true)));
        povolenePozice.put(new Pozice(1, 1), new Lokace(jdiZvedniPolozUtoc, predmety, null));  //, new Bytost("skřet",5, 10, 5, true)));
        povolenePozice.put(new Pozice(1, 0), new Lokace(jdiZvedniPolozUtoc, new Bytost("goblin",1,1,1, true)));
        povolenePozice.put(new Pozice(1, 2), new Lokace(jdiZvedniPolozUtoc, new Bytost("goblin",1,1,1, true)));
        povolenePozice.put(new Pozice(2, 1), new Lokace(jdiZvedniPolozUtoc, new Bytost("goblin",1,1,1, true)));
        aktualniPozice = new Pozice(1, 1);
    }

    public boolean muzuJit(String smer) {
        if (smer.equals("sever")) {
            Pozice nova = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() + 1);
            return povolenePozice.containsKey(nova);// overi jestli nova je v povolenych pozicich
        } else if (smer.equals("vychod")) {
            Pozice nova = new Pozice(aktualniPozice.getX() + 1, aktualniPozice.getY());
            return povolenePozice.containsKey(nova);
        } else if (smer.equals("zapad")) {
            Pozice nova = new Pozice(aktualniPozice.getX() - 1, aktualniPozice.getY());
            return povolenePozice.containsKey(nova);
        } else if (smer.equals("jih")) {
            Pozice nova = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() - 1);
            return povolenePozice.containsKey(nova);//
        } else {
            return false;
        }

    }

    public Pozice jdi(String smer) {
        if (smer.equals("sever")) {
            aktualniPozice = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() + 1);
            return aktualniPozice;
        } else if (smer.equals("vychod")) {
            aktualniPozice = new Pozice(aktualniPozice.getX() + 1, aktualniPozice.getY());
            return aktualniPozice;
        } else if (smer.equals("zapad")) {
            aktualniPozice = new Pozice(aktualniPozice.getX() - 1, aktualniPozice.getY());
            return aktualniPozice;
        } else if (smer.equals("jih")) {
            aktualniPozice = new Pozice(aktualniPozice.getX(), aktualniPozice.getY() - 1);
            return aktualniPozice;
        } else {
            return aktualniPozice;
        }
    }



    public Lokace getAktualniLokace (){
       return povolenePozice.get(aktualniPozice);
    }

    public void setAktualniPozice(Pozice aktualniPozice) {
        this.aktualniPozice = aktualniPozice;
    }
}
