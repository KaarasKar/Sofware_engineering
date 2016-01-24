/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kaskzalbanii;

/**
 * Klasa odpowiadająca zastacje radiowe
 * @author Leszek
 */
public class StacjaRadiowa 
{
    public String nazwa;
    public double czestotliwosc;
    
    /**
     *
     * @param nazwa
     * @param czestotliwosc
     */
    public StacjaRadiowa(String nazwa,double czestotliwosc){
        this.nazwa = nazwa;
        this.czestotliwosc = czestotliwosc;
    }
}
