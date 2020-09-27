/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.dankovic.zavrsnirad.model;


import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Marko
 */

@Entity
public class Vozilo extends Entitet{
    
    private String naziv;
    private String boja;
    private String tablica;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }

    public String getTablica() {
        return tablica;
    }

    public void setTablica(String tablica) {
        this.tablica = tablica;
    }
    
    
}
