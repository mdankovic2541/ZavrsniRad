/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.dankovic.zavrsnirad.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Marko
 */

@Entity
public class Vozac extends Entitet{

    @ManyToOne
    private Voznja voznja;
    private String ime;
    private String prezime;
    private String dob;
    private String spol;

  
    @OneToMany(mappedBy = "vozac")
    private List<Voznja> voznje = new ArrayList<>();
    
    
    @OneToOne
    @ManyToOne
    private Vozilo vozilo;

    public List<Voznja> getVoznje() {
        return voznje;
    }

    public void setVoznje(List<Voznja> voznje) {
        this.voznje = voznje;
    }

  
    
    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

  

    public String getSpol() {
        return spol;
    }

    public void setSpol(String spol) {
        this.spol = spol;
    }

    public Vozilo getVozilo() {
        return vozilo;
    }

    public void setVozilo(Vozilo vozilo) {
        this.vozilo = vozilo;
    }

 

    

  
    
    
}
