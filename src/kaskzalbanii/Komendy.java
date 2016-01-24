/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaskzalbanii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Klasa odpowiadająca za komendy 
 * @author Leszek
 */
public class Komendy 
{
    List<KomendaGlosowa> listaKomend = new ArrayList<>();
    /**
     * Funkcja odpowiada za dodawanie komend
     * @param kom 
     */
    public void dodaj_komende(String kom)
    {
        KomendaGlosowa komenda = new KomendaGlosowa(kom);
        listaKomend.add(komenda);
        System.out.println("Komenda dodana pomyslnie!");
    }
    /**
     * Funkcja odpowiada za wykonywanie komend
     * @param komenda
     * @return 
     */
    public int wykonaj_komende(String komenda)
    {
        for (KomendaGlosowa kom : listaKomend)
        {
            if (kom.komenda.equals(komenda)) return kom.indeks;
        }
        return -1;
    }

    /**
     * Konstruktor, baza komend
     */
    public Komendy()
    {
        dodaj_komende("Uruchom radio");//1
        dodaj_komende("Uruchom GPS");//2
        dodaj_komende("Uruchom kamere");//3
        dodaj_komende("Zmien stacje");//4
        dodaj_komende("Zapisz stacje");//5
        dodaj_komende("Usun stacje");//6
        dodaj_komende("Wylacz radio");//7
        dodaj_komende("Wyszukaj trae");
        dodaj_komende("wybierz_trase");
        dodaj_komende("zapamietaj_trase");
    }
}
