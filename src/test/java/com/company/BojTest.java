package com.company;

import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.mock;

/**
 * Created by Vydra řičné on 11. 5. 2016.
 */
public class BojTest {
    @Test
    public void BojTest(){
        Hrdina hrdina = new Hrdina();
        Bytost bytost = new Bytost("Bytost", 5, 5, 5, true);
        Random mockRandom = mock(Random.class);
        Boj testovana = new Boj();
        testovana.kolo(hrdina,bytost);

    }
}
