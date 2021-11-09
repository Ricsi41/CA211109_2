package com.company;

public class kutya_2 {
    private String fajta;
    private String nem;
    private int eletkor;
    private String nev;

    public kutya_2(String fajta, String nem, int eletkor, String nev)
    {
        this.fajta = fajta;
        this.nem = nem;
        this.eletkor = eletkor;
        this.nev = nev;
    }

    public String getFajta()
    {
        return fajta;
    }
    public String getNem()
    {
        return nem;
    }
    public int getEletkor()
    {
        return eletkor;
    }

    public String getNev()
    {
        return nev;
    }
}
