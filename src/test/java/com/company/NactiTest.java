package com.company;

import com.company.akce.Nacti;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by Vydra řičné on 19. 6. 2016.
 */
public class NactiTest {
    @Test
    public void test () throws IOException{
        Nacti testovana = new Nacti();
        testovana.proveď(new String[]{"ulož","ulož1"});
    }
}
