package com.company;

import com.company.akce.Jdi;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Vydra řičné on 17. 4. 2016.
 */
public class JdiTest {
    @Test //musí být před každou testovací metodou
    public void testJdi () throws Exception { //testovací metody jsou vždycku public a nikdy nic nevracej
        Hrdina hrdina = new Hrdina();
        Mapa mapa = new Mapa(hrdina);
        Jdi testovana = new Jdi(mapa);
        Pozice pozice = new Pozice(1,2);
        testovana.proveď(new String[]{"jdi","sever"}); //složené závorky - rovnou inicializuju hodnoty
        assertEquals(pozice,mapa.aktualniPozice); //alt + enter - potřeba naimportovat
    }
    @Test
    public void testTamNejdu () throws Exception {
        Hrdina hrdina = new Hrdina();
        Mapa mapa = new Mapa(hrdina);
        Jdi testovana = new Jdi(mapa);
        Pozice pozice = new Pozice(1,2);
        testovana.proveď(new String[]{"jdi","sever"});
        testovana.proveď(new String[]{"jdi","sever"});
        assertEquals(pozice,mapa.aktualniPozice);
    }
}
