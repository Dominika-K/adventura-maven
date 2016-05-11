package com.company;

import com.company.akce.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) { //každý program musí mít metodu main, která musí mít přesně takovouhle podobu
        Hrdina hrdina = new Hrdina();
        Mapa mapa = new Mapa(hrdina);
        Jdi jdi = new Jdi(mapa);
        Zvedni zvedni = new Zvedni(mapa, hrdina);
        Poloz poloz = new Poloz(mapa, hrdina);
        Utok utok = new Utok(hrdina, mapa);
        Oziveni oziveni = new Oziveni();
        Vypis vypis = new Vypis(hrdina, oziveni);
        Scanner Nacitej = new Scanner(System.in);
        System.out.println("Vítej dobrodruhu! Nacházíš se v místnosti 1,1. Na zemi leží provaz a meč, proti tobě se řítí skřet. Co děláš?");
        while (Nacitej.hasNextLine()) {
            Lokace lokace = mapa.getAktualniLokace();
            String Akce = Nacitej.nextLine();
            String[] rozdeleni = Akce.split(" ");
            if (lokace.jdeProvest(rozdeleni[0])) {
                if (jdi.rozumneni_prikazu(rozdeleni)) {
                    jdi.proveď(rozdeleni);
                }
                if (zvedni.rozumneni_prikazu(rozdeleni)) {
                    zvedni.proveď(rozdeleni);
                }
                if (poloz.rozumneni_prikazu(rozdeleni)) {
                    poloz.proveď(rozdeleni);
                }

                if (utok.rozumneni_prikazu(rozdeleni)) {
                        utok.proveď(rozdeleni);
                }
                if (vypis.rozumneni_prikazu(rozdeleni)) {
                    vypis.proveď(rozdeleni);
                }
            } else {
                System.out.println("Tohle nemůžeš udělat");
            }

        }
    }

}



