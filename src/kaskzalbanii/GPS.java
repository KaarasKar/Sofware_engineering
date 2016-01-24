/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaskzalbanii;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Klasa odpowiadająca za GPS
 * @author Leszek (Hejmej remix)
 */
public class GPS 
{
    public List<String> listaTras = new ArrayList<>();
    public Trasa aktualnaTrasa;
    Random rand = new Random();
    public boolean wlaczony;
    public boolean szukam;
    public boolean trasa_znaleziona;
    public boolean trasa_wybrana;
    public boolean trasa_zapamietana;
    public boolean trasa_zakonczona;
    
   /**
    * Funkcja odpowiada za włączenie GPS-nawigacji
    */
    public void wlacz()
    {
        System.out.println("GPS aktywny");
        wlaczony = true;
    }
    /**
     * Funkcja odpowiada za wyłaczenie GPS - nawigacji 
     */
    public void wylacz()
    {
        System.out.println("GPS wyłączony");
        wlaczony = false;
    }
    
    /**
     * Funkcja wyszukuje trase 
     * @param cel
     * @throws InterruptedException 
     */
    public void wyszukaj_trase(String cel) throws InterruptedException
    {
        System.out.println("Szukam Trasy do "+ cel);
        szukam = true;
        sleep(2000);
        System.out.println("Trasa znaleziona");
        szukam = false;
        trasa_znaleziona = true;
    }
    /**
     * Funkcja odpowiada za wprowadzenie celu  : forma
     */
    public void wprowadz_cel()
    {
        
    }
    /**
     * Funkcja odpowiada za wybranie trasy ; Forma
     */
    public void wybierz_trase()
    {
        
    }
    /**
     *Funkcja odpowiada za zapamietywanie tras
     * @param trasa 
     */
    public void zapamietaj_trase(String trasa)
    {
        trasa_zapamietana = true;
        listaTras.add(trasa);
        trasa_zapamietana = false;
    }
    
    /**
     * Funkcja odpowiada za obsługe nawigacji 
     * @param input 
     */
    public void nawiguj(String input)
    {
        trasa_zakonczona = false;
        trasa_wybrana = true;
        System.out.println("Nawiguje do "+input);
        utrudnienia();
    }
    /**
     * Funkcja odpowiada za konczenie nawigacji 
     */
    public void koniec_nawiguj()
    {
        System.out.println("Koniec nawigowania");
        trasa_wybrana = false;
        trasa_zakonczona = true;
    }
    
    /**
     * Funkcja odpowiada za wyswietlenie utrudnien na trasie 
    */
    public void utrudnienia()
    {
        System.out.println("Radary: ");
        for(int i=0;i<rand.nextInt(5);i++) System.out.println("Radar "+i+" "+i*0.1);
        System.out.println("Roboty:");
        for(int i=0;i<rand.nextInt(5);i++) System.out.println("Roboty "+i+" "+i*0.1);
        System.out.println("Wypadki:");
        for(int i=0;i<rand.nextInt(5);i++) System.out.println("Wypadek "+i+" "+i*0.1);

    }
    /**
     * Konstruktor GPS, obiekty
     */
    public GPS()
    {
        zapamietaj_trase(new String("Wałbrzych"));
        zapamietaj_trase("Kraków");
        zapamietaj_trase("Sosnowiec");
        zapamietaj_trase("Nowy Jork");
    }

 
}
