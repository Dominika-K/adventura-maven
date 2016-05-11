package com.company;

/**
 * Created by Vydra řičné on 11. 5. 2016.
 */
public class Random {
    public Random(){
    }

    public int getD6Value() {
        return (int) Math.round(Math.random() * 6);
    }
}
