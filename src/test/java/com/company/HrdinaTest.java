package com.company;

import org.junit.Test;

/**
 * Created by Vydra řičné on 22. 5. 2016.
 */
public class HrdinaTest {
    @Test
    public void HrdinaTest(){
        Hrdina hrdina= new Hrdina();
        String result = hrdina.serialize();
        System.out.println(result);
    }
}
