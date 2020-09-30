/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.dankovic.zavrsnirad.utility;

/**
 *
 * @author Marko
 */
public class DankovicException extends Exception{
    
    private String poruka;

    public DankovicException(String poruka) {
        this.poruka = poruka;
    }
    
    public String getPoruka() {
        return poruka;
    }

    
    
}
