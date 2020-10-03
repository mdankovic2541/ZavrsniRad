/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.dankovic.zavrsnirad.controller;

import hr.dankovic.zavrsnirad.model.Operater;
import hr.dankovic.zavrsnirad.utility.DankovicException;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Marko
 */
public class ObradaOperater extends Obrada<Operater> {

    public Operater autoriziraj(String email, char[] lozinka) {
        Operater operater = (Operater) session.createQuery(
                " from Operater o where o.email=:email")
                .setParameter("email", email).getSingleResult();
        if (operater == null) {
            return null;
        }
        return BCrypt.checkpw(new String(lozinka), operater.getLozinka())
                ? operater : null;
    }

    @Override
    public List<Operater> getPodaci() {
        return session.createQuery("from Operater").list();
    }

    @Override
    protected void kontrolaCreate() throws DankovicException {
        kontrolaIme();
        kontrolaPrezime();
    }

    @Override
    protected void kontrolaUpdate() throws DankovicException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void kontrolaDelete() throws DankovicException {
    }

    protected void kontrolaIme() throws DankovicException {
        if (entitet.getIme() == null || entitet.getIme().trim().isEmpty()) {
            throw new DankovicException("Ime obavezno!");
        }
    }

    protected void kontrolaPrezime() throws DankovicException {
        if (entitet.getPrezime() == null || entitet.getPrezime().trim().isEmpty()) {
            throw new DankovicException("Prezime obavezno!");
        }
    }

}
