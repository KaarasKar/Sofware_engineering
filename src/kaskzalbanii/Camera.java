/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaskzalbanii;

/**
 * Klasa odpowiadająca za Camere
 * @author Hejmej
 */
public class Camera {
   
    /**
     * Funkcja odpowiada za włączenie podlągu na ekranie
     */
    public void wlacz()
    {
        System.out.println("Podgląd włączony");
    }
    /**
     * Funkcja odpowiada za nagyrwanie obrazu 
     */
    public void record()
    {
        System.out.println("Nagrywam Obraz");
    }
    /**
     * Funkcja konczy nagrywanie kamery 
     */
    public void stop_record()
    {
        System.out.println("Koniec nagrywania obrazu");
    }
    /**
     * Funkcja odpowiada za zapis nagrania z podrózy 
     * do pliku w folderze. 
     * @return nagranie
     */
    public Camera_record zapisz()
    {
        Camera_record nagranie = new Camera_record(true);
        System.out.println("Zapisuje nagranie do pliku");
        
        return nagranie;
    }
    /**
     * Funkcja odpowiada za wyłączenie podgladu 
     */
    public void wylacz()
    {
        System.out.println("Podgląd wyłączony");
    }
    
    /**
     * Konstruktor 
     */
    public Camera()
            {
                
            }
}
