package com.company.akce;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by Vydra řičné on 15. 5. 2016.
 */
public class Nacti extends Akce {
    public Nacti() {
        super("Načti", 1);
    }
    public void proveď (String[] parametry){
        try {
            FileReader fr = new FileReader(parametry[1] + ".txt");
            BufferedReader bf = new BufferedReader(fr);
            bf.lines();
            String line = new String();
            while ((line = bf.readLine())!=null){
                System.out.println(line);
            }
            bf.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public void deserialize(){

    }

}
