package com.company;

import com.company.akce.Uloz;
import org.junit.Test;

/**
 * Created by Vydra řičné on 15. 5. 2016.
 */
public class UlozTest {
    @Test
    public void UlozTest(){
        Uloz testovana = new Uloz();
        testovana.proveď(new String[]{"ulož"});
    }
}
