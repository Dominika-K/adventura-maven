package com.company;

/**
 * Created by Vydra řičné on 3. 4. 2016.
 */
public class Hrdina extends Bytost {
    Inventar inventar;


    public Hrdina (){
        super("Hrdina", 10 , 1, 1, true);//volá parametry předka - rovnou do nich ukládá proměnné, ekvivalent new Bytost
        inventar = new Inventar();
    }


    public Inventar getInventar() {
        return inventar;
    }

}
