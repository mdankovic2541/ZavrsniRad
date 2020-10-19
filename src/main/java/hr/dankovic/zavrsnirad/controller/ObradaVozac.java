/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.dankovic.zavrsnirad.controller;

import hr.dankovic.zavrsnirad.model.Vozac;
import hr.dankovic.zavrsnirad.utility.DankovicException;
import java.util.List;

/**
 *
 * @author Marko
 */
public class ObradaVozac extends Obrada<Vozac> {

    @Override
    public List<Vozac> getPodaci() {
        return session.createQuery("from Vozac").list();
    }
    public List<Vozac> getPodaci(String uvjet) {
       
    return session.createQuery("from Vozac p" +
                    " where concat(p.ime, ' ', p.prezime) " + 
                    " like :uvjet ").setParameter("uvjet", "%"+uvjet+"%")
                    .setMaxResults(20)
                    .list();
 }
    @Override
    protected void kontrolaCreate() throws DankovicException {
        kontrolaIme();
        kontrolaPrezime();
        kontrolaSpol();
        kontrolaDob();
    }

    @Override
    protected void kontrolaUpdate() throws DankovicException {
    }

    @Override
    protected void kontrolaDelete() throws DankovicException {
         if(!entitet.getVozilo().getNaziv().isEmpty()){
            throw new DankovicException("Vozač se ne može obrisati jer sadrži jedno ili više vozila.");
        }
        
    }

    protected void kontrolaIme() throws DankovicException {
        if (entitet.getIme() == null || entitet.getIme().trim().isEmpty()) {
            throw new DankovicException("Ime obavezno!");
        }
    }

    protected void kontrolaSpol() throws DankovicException {
        if (entitet.getSpol() == null || entitet.getSpol().trim().isEmpty()) {
            throw new DankovicException("Spol obavezan!");
        }
    }

    protected void kontrolaPrezime() throws DankovicException {
        if (entitet.getPrezime() == null || entitet.getPrezime().trim().isEmpty()) {
            throw new DankovicException("Prezime obavezno!");
        }
    }

    protected void kontrolaDob() throws DankovicException {
        if (entitet.getDob() == null || entitet.getDob().trim().isEmpty()) {
            throw new DankovicException("Dob obavezna!");
        }
    }

}
