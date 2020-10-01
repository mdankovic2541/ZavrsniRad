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
    }

    protected void kontrolaIme() throws DankovicException {
        if (entitet.getIme() == null || entitet.getIme().isEmpty()) {
            throw new DankovicException("Ime obavezno!");
        }
    }

    protected void kontrolaSpol() throws DankovicException {
        if (entitet.getSpol() == null || entitet.getSpol().isEmpty()) {
            throw new DankovicException("Spol obavezan!");
        }
    }

    protected void kontrolaPrezime() throws DankovicException {
        if (entitet.getPrezime() == null || entitet.getPrezime().isEmpty()) {
            throw new DankovicException("Prezime obavezno!");
        }
    }

    protected void kontrolaDob() throws DankovicException {
        if (entitet.getDob() == null) {
            throw new DankovicException("Dob obavezna!");
        }
    }

}
