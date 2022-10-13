/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moreb2;

/**
 *
 * @author Korisnik
 */
public class Mornar {
    private String ime;
    private int kvalitet;

    public Mornar(String ime, int kvalitet) {
        this.ime = ime;
        this.kvalitet = kvalitet;
        
        if(this.kvalitet < 0){
        
        this.kvalitet = 0;
            
        }
        
        if(this.kvalitet > 100){
        
        this.kvalitet = 100;
            
        }
        
    }

    public String dohvatiIme() {
        return ime;
    }

    public int dohvatiKvalitet() {
        return kvalitet;
        
    }
    
    public String toString() {
    return "M_" + ime + " :  " + kvalitet;
    }
    
}
