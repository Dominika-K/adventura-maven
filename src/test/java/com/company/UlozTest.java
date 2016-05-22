package com.company;

import com.company.akce.Uloz;
import org.junit.Test;

/**
 * Created by Vydra řičné on 15. 5. 2016.
 */
public class UlozTest {
    @Test
    public void UlozTest() throws Exception {
        Hrdina hrdina = new Hrdina();
        Mapa mapa = new Mapa(hrdina);
        Uloz testovana = new Uloz(hrdina, mapa);
        testovana.proveď(new String[]{"ulož","ulož1"});
    }
}
