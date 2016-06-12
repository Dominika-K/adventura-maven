package com.company;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Vydra řičné on 12. 6. 2016.
 */
public class DateServerTest {
    @Test
    public void test () throws IOException {
        Socket out = new Socket("localhost",9090);//localhost - textová reprezentace místního uživatele, přeložen jako aktuální ip adresa počítače
        BufferedReader in = new BufferedReader(new InputStreamReader(out.getInputStream())); //nechceme pracovat po kouskách bajtů, ale nějak vcelku, načítá data do nějakého bufferu, z ktarého je pak vytahuje
        System.out.println(in.readLine());
    }

}
