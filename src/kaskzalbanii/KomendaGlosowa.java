/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaskzalbanii;

/**
 * Klasa odpowiadająca za komendy głosowe
 * @author Leszek
 */
public class KomendaGlosowa 
{
    public String komenda;
    public String opis;
    public int indeks;
    private static int licznik = 1;

    /**
     *
     * @param komenda
     */
    public KomendaGlosowa(String komenda)
    {
        this.komenda = komenda;
        this.indeks = licznik;
        licznik++;
    }
    
    /**
     *
     * @param opis
     */
    public void dodajOpis(String opis)
    {
        this.opis = opis;
    }
}
