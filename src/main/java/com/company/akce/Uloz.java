package com.company.akce;

import com.company.Hrdina;
import com.company.Mapa;

import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by Vydra řičné on 15. 5. 2016.
 */
    public class Uloz extends Akce  {
    Mapa mapa;
    Hrdina hrdina;

    public Uloz(Hrdina hrdina, Mapa mapa) {
        super ("ulož", 1);
        this.hrdina = hrdina;
        this.mapa = mapa;

    }

    public void proveď (String[] parametry){
       try {
       FileWriter fw =  new FileWriter (parametry[1]+ ".txt"); //relativní cesta
       fw.write(mapa.serialize()+hrdina.serialize()); //append připíše  do souboru, write to přepíše, potřeba vědět v jakém stavu hrdina a stav lokací
       fw.flush(); //není u ulož
       fw.close();
       }catch(Exception e){ //Exeption - typ výjimky, kterou zachytáváme, e je jméno, pomocí kterého ji můžeme adresovat uvnitř catch bloku
        e.printStackTrace(); //tím zachytíme, co za chybu se tam stalo, jenom jí to vypíše
       }
   }

}



