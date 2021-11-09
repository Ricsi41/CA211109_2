package com.company;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        ArrayList<kutya_2> kutyak = new ArrayList<>();
        try
        {
            System.setProperty("file.encoding","UTF8");
            FileReader fr = new FileReader("kutyak.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while((line = br.readLine())!=null)
            {
                String[] db = line.split(";");
                String fajta = db[0];
                String nem = db[1];
                int eletkor = Integer.parseInt(db[2]);
                String nev = db[3];
                kutya_2 kk = new kutya_2(fajta,nem,eletkor,nev);
                kutyak.add(kk);

            }
            br.close();
        }
        catch (IOException e)
        {
            System.out.println("Hiba a beolvasáskor "+e);
        }
        for(int i = 0; i < kutyak.size(); i++)
        {
            System.out.println(kutyak.get(i).getNev()+" ");
        }
        int ossz=0;
        for(int i = 0; i <kutyak.size(); i++)
        {
            ossz+=kutyak.get(i).getEletkor();
        }
        System.out.printf("A kutyák átlagos életkora: %.2f",(double)ossz/(double)kutyak.size());
        int megsz_1=0;
        int megsz_2=0;
        for (int i = 0; i <kutyak.size(); i++)
        {
            if (kutyak.get(i).getNem().equals("szuka"))
            {
                megsz_1++;
            }
            else
            {
                megsz_2++;
            }
        }
        System.out.println("\nEnnyi szuka van: "+megsz_1+" és ennyi kan: "+megsz_2);
        System.out.print("Ezek a kutyák 2 év alattiak / 2 évesek: ");
        for(int i=0; i < kutyak.size();i++)
        {
            if(kutyak.get(i).getEletkor()<=2)
            {
                System.out.print(kutyak.get(i).getNev()+" ");
            }
        }
    }

}
