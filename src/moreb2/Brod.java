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
    }
    
    public int dohvBr() {
        return brMornara;
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
    public double kvalitetPosade(){
    }
    public String toString() {}
    public abstract void napadni(Brod b);
    
}
