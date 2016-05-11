package com.company;

/**
 * Created by Vydra řičné on 3. 4. 2016.
 */
public class Boj {

    private Random randomNumberProvider;
    static int pocetZabiti = 0;

    public Boj() {
        randomNumberProvider = new Random();
    }

    public Boj(Random numberGenerator){
        randomNumberProvider = numberGenerator;
    }

    public void kolo(Hrdina hrdina, Bytost bytost) {
        utok(hrdina, bytost);
        obrana(hrdina, bytost);
    }

    private void utok(Hrdina hrdina, Bytost bytost) {
        int utokHrdina = hrdina.getUtok() + randomNumberProvider.getD6Value();
        int obranaBytost = bytost.getObrana() + (int) Math.round(Math.random() * 6);

        if (utokHrdina > obranaBytost) {
            System.out.println("Zasáhl jsi!");
            Integer zivotyBytost = bytost.getZivoty() - (utokHrdina - obranaBytost);
            System.out.println("Potvoře zbylo " + zivotyBytost + " životů");
            bytost.setZivoty(zivotyBytost);
            if (zivotyBytost <= 0) {
                System.out.println("Jupí, zabil jsi potvoru!");
                pocetZabiti = pocetZabiti + 1;
                System.out.println("Už jsi zabil potvor: " + pocetZabiti);
            }
        } else {
            System.out.println("Minuls");
        }
    }

    private void obrana(Hrdina hrdina, Bytost bytost) {
        Integer obranaHrdina = hrdina.getObrana() + (int) Math.round(Math.random() * 6);
        Integer utokBytost = bytost.getUtok()+ (int) Math.round(Math.random() * 6);
        if ( obranaHrdina < utokBytost) {
            System.out.println("Byl jsi zasazen");
            Integer zivotyHrdina = hrdina.getZivoty() - ( utokBytost - obranaHrdina);
            System.out.println("Zbylo ti " + zivotyHrdina + " životů");
            hrdina.setZivoty(zivotyHrdina);
            if (zivotyHrdina <= 0) {
                System.out.println("Tvůj příběh končí");
            }
        } else {
            System.out.println("Uhnul jsi");
        }


    }

    public int getPocetZabiti() {
        return pocetZabiti;
    }

}
