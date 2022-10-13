/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moreb2;

/**
 *
 * @author aurel
 */
public abstract class Brod {
    protected String naziv;
    protected int brMornara; // kapacitet broda
    protected Mornar[] mornari;
    private int trenutniBrMornara;
    private char vrsta;
    public Brod(String naziv, int brMornara, Mornar kapetan, char vrsta) {
        this.naziv = naziv;
        this.brMornara = brMornara;
        mornari = new Mornar[brMornara];
        mornari[0] = kapetan;
        this.vrsta = vrsta;
        trenutniBrMornara = 1;
    }
    public void dodajMorn(Mornar m) {
        mornari[trenutniBrMornara] = m;
        if(mornari[trenutniBrMornara].dohvatiKvalitet() > mornari[0].dohvatiKvalitet()){
            mornari[trenutniBrMornara] = mornari[0];
            mornari[0] = m;
        }
        trenutniBrMornara++;
    }
    
    public int dohvBr() {
        return trenutniBrMornara;
    }
    public Mornar dohvatiKapetana() {
        return mornari[0];
    }
    public int indeksNajgoregMornara(){
        int najgori = mornari[1].dohvatiKvalitet();
        for(int i=2; i<trenutniBrMornara; i++){
            if(mornari[i].dohvatiKvalitet() < najgori)
                najgori = mornari[i].dohvatiKvalitet();
        }
        return najgori;
    }
    public Mornar dohvatiNajboljegMornara(){
        return mornari[0];
    }
    public int dohvatiTrenutniBrMornara(){
        return trenutniBrMornara;
    }
    public char dohvatiVrstu(){
        return vrsta;
    }
    public void ukloniSveMornare(){
        mornari = null;
        trenutniBrMornara = 0;
    }
    public abstract void napadni(Brod b);
    //public Mornar dohvatiKapetana() {}
    //public int indeksNajgoregMornara(){}
    //public Mornar dohvatiNajboljegMornara(){}
    //public int dohvatiTrenutniBrMornara(){}
    //public char dohvatiVrstu(){}
    //public void ukloniSveMornare(){}
    public double kvalitetPosade(){
    
    double zbir = 0;    
    for (int i = 0; i < trenutniBrMornara; i++){
    
    zbir += mornari[i].dohvatiKvalitet();
        
    }
        
    return zbir/trenutniBrMornara;
    
    }
    public String toString() {
    
    String opis = vrsta + " - " + naziv + " : " + kvalitetPosade();
        
    for (int i = 0; i < trenutniBrMornara; i++){
    
    opis += mornari[i] + ", ";
        
    }
    
    return opis;
    
    }
    //public abstract void napadni(Brod b);
    Mornar dohvMorn(int i) throws GIndeks{
        if(i > trenutniBrMornara-1)
            throw new GIndeks();
        return mornari[i];
    }
    
}
