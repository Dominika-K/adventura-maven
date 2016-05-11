package com.company;

import com.company.akce.Poloz;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Vydra řičné on 21. 4. 2016.
 */
public class PolozTest {
    @Test
    public void testPoloz (){
        Hrdina hrdina = new Hrdina();
        Mapa mapa = new Mapa(hrdina);
        Poloz testovana = new Poloz(mapa, hrdina);
        Lokace lokace = mapa.getAktualniLokace();
        Inventar inventar = hrdina.getInventar();
        inventar.pridej("dělo");
        ArrayList predmetyInv = inventar.getPredmety();
        testovana.proveď(new String[]{"polož", "dělo"});
        assertTrue(!predmetyInv.contains("dělo"));
        assertTrue(lokace.muzuVzit("dělo"));
        }
    }

