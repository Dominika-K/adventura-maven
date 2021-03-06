package com.company;

/**
 * Created by Vydra řičné on 14. 2. 2016.
 */
public class Pozice {
    @Override
    public String toString() {
        return getX()+","+getY();
    }

    public Pozice(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int x;
    public int y;

    @Override //dostanu se k tomu přes alt+insert
    public boolean equals(Object obj) {
        if (!(obj instanceof Pozice))// zjistuje jestli objekt je instanci nějake tridy
        {
            return false;
        }
        Pozice Poz = (Pozice) obj;
        if (Poz.x == getX()&& Poz.y==getY()) {
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    public String serialize () {
        String result = "";
        result += "Lokace " + "#" + getX() + "#"+ getY(); //postupné spojování řetězce
        return result;
    }

    public static Pozice deserialize(String line){
        String [] lokline = line.split("#"); //parametrem rozdělovač - rozdělí řetezec na části
        Pozice pozice = new Pozice (Integer.parseInt(lokline[2]),Integer.parseInt(lokline[3]));
        return pozice;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

}





