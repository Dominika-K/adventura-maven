package com.company.akce;

import com.company.Mapa;
import com.company.Pozice;

/**
 * Created by Vydra řičné on 28. 2. 2016.
 */
public class Jdi extends Akce { //říkáme, že třída je potomkem třídy akce, podědí to všechny metody a fieldy, ke kterým má přístup
    //potřeba vytvořit konstruktor, který nepřijímá žádné parametry, známe je odjinud:
    public Jdi(Mapa mapa) { //zvnějšku tomu dá někdo instanci mapy
        super("jdi", 1); //super - volám konstruktor předka, obecně super odkaz na předka
        this.mapa = mapa;
    }

    Mapa mapa;

    public void proveď(String[] parametry) { //stejná signatura metody jako v předkovi
        if (!mapa.muzuJit(parametry[1])) {
            System.out.println("Tam nemůžeš!");
        }
        else {
            Pozice poziceNova = mapa.jdi(parametry[1]);
            System.out.println("došels na " + poziceNova);
            mapa.getAktualniLokace().vypis();
        }
    }


}
