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
    protected int brMornara;
    protected Mornar[] mornari;
    private int trenutniBrMornara;
    private char vrsta;
    public Brod(String naziv, int brMornara, Mornar kapetan, char vrsta) {}
    public void dodajMorn(Mornar m) {}
    public int dohvBr() {}
    public Mornar dohvatiKapetana() {}
    public int indeksNajgoregMornara(){}
    public Mornar dohvatiNajboljegMornara(){}
    public int dohvatiTrenutniBrMornara(){}
    public char dohvatiVrstu(){}
    public void ukloniSveMornare(){}
    public double kvalitetPosade(){}
    public String toString() {}
    public abstract void napadni(Brod b);
    
}
