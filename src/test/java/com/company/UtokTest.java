package com.company;

import com.company.akce.Utok;
import org.junit.Test;
import static org.mockito.Mockito.*;

/**
 * Created by Vydra řičné on 1. 5. 2016.
 */
public class UtokTest {
    @Test
    public void testUtok(){
        Hrdina hrdina = new Hrdina();
        Mapa mapa = new Mapa(hrdina);
        Boj mockBoj = mock(Boj.class);
        mapa.aktualniPozice = new Pozice(1,2);
        Utok testovana = new Utok(hrdina, mapa, mockBoj);
        testovana.proveď(new String[]{"bojuj"});
        verify(mockBoj).kolo(eq(hrdina), any());
    }
}

