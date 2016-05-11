package com.company;

import com.company.akce.Akce;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by Vydra řičné on 1. 2. 2016.
 */
public class AkceTest {

    @Test
    public void testRozumneni_prikazu() throws Exception {
        Akce testovana = new Akce("jdi", 1);
        String[] prikazy = "jdi sever".split(" ");
        assertEquals(true, testovana.rozumneni_prikazu(prikazy));
    }
}