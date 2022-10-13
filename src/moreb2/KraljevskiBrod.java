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
public class KraljevskiBrod extends Brod{
    
    public KraljevskiBrod(String naziv, int brMornara, Mornar kapetan) {
        super(naziv, brMornara, kapetan, 'K');
    }

    @Override
    public void napadni(Brod b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
