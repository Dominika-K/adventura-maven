package com.company;

import org.junit.Test;

/**
 * Created by Vydra řičné on 22. 5. 2016.
 */
public class MapaTest {
    @Test
    public void MapaTest(){
    Hrdina hrdina= new Hrdina();
    Mapa mapa = new Mapa(hrdina);
    String result = mapa.serialize();
    System.out.println(result);
    }
}
