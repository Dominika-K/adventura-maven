package com.company;

/**
 * Created by Vydra řičné on 3. 4. 2016.
 */
public class Bytost {
    Integer zivoty;
    Integer utok;
    Integer obrana;
    String jmeno;
    Boolean zivaMrtva;

    public Bytost (String jmeno, Integer zivoty, Integer utok, Integer obrana, Boolean zivaMrtva){
        this.zivoty = zivoty;
        this.utok = utok;
        this.obrana = obrana;
        this.jmeno = jmeno;
        this.zivaMrtva = zivaMrtva;
    }



    public Integer getZivoty() {
        return zivoty;
    }

    public Integer getUtok() {
        return utok;
    }

    public Integer getObrana() {
        return obrana;
    }


    public void setZivaMrtva(Boolean zivaMrtva) {
        this.zivaMrtva = zivaMrtva;
    }

    public Boolean getZivaMrtva() {
        return zivaMrtva;
    }

    public void setZivoty(Integer zivoty) {
        this.zivoty = zivoty;
    }
    public String toString(){
        return jmeno;
    }
}
