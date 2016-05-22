package com.company;

import org.junit.Test;

/**
 * Created by Vydra řičné on 22. 5. 2016.
 */
public class SerializeTest {
    @Test
    public void SerializeTest(){
        Hrdina hrdina= new Hrdina();
        Mapa mapa = new Mapa(hrdina);
        String result = mapa.serialize();
        result += hrdina.serialize();
        System.out.println(result);
    }
}
