package com.company.akce;

import com.company.Hrdina;

import java.io.FileWriter;

/**
 * Created by Vydra řičné on 15. 5. 2016.
 */
    public class Uloz extends Akce  {
    public Uloz() {
        super ("ulož", 1);
        Hrdina hrdina;

    }

    public void proveď (String[] parametry){
       try {
       FileWriter fw =  new FileWriter (parametry[1]+ ".txt"); //relativní cesta
       fw.write(); //append připíše  do souboru, write to přepíše, potřeba vědět v jakém stavu hrdina a stav lokací
       }catch(Exception e){ //Exeption - typ výjimky, kterou zachytáváme, e je jméno, pomocí kterého ji můžeme adresovat uvnitř catch bloku
        e.printStackTrace(); //tím zachytíme, co za chybu se tam stalo, jenom jí to vypíše
       }


    }
}

