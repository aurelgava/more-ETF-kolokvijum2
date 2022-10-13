/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moreb2;

public class Flota{
    private static class Elem {
        Brod b; Elem sled;
        //Elem(Brod b) { this.b = b; }
    }
    
    String naziv;
    Elem brodovi = null;
    char vrsta = '-'; // g - kraljevski, k - piratski
    
    public Flota(String s){
        naziv = s;
    }
    
    void dodaj(Brod brod) throws Exception{
        if(brodovi == null){
            vrsta = brod.dohvatiVrstu();
            brodovi = new Elem();
            brodovi.sled = null;
        }
        else{
            if(brod.dohvatiVrstu() != vrsta)
                throw new GNeadekvatan();           
            
            Elem e = brodovi;
            while(e.sled != null){
                e = e.sled;
            }
            e.b = brod;
            e.sled = null;
        }
    }
    Brod dohvBrod(int i) throws Exception{
        Elem e = brodovi;
        if(e == null)
            throw new GIndeks();
        while(i>=0){
            i--;
            if(e.sled == null)
                break;
            e = e.sled;
        }
        if(i != -1)
            throw new GIndeks();
        return e.b;
    }
    
}
