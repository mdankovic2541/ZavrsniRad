/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.dankovic.zavrsnirad.model;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Marko
 */

@Entity
public class Vozilo extends Entitet{
    
    private String naziv;
    private String boja;
    private String tablica;

     
    @OneToMany(mappedBy = "vozilo")
     private List<Vozac> vozaci = new ArrayList<>();

    public List<Vozac> getVozaci() {
        return vozaci;
    }

    public void setVozaci(List<Vozac> vozaci) {
        this.vozaci = vozaci;
    }
     
     
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

    @Override
    public String toString() {
        return getNaziv();
    }
    
    
}
