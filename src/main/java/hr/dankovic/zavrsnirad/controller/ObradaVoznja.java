/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.dankovic.zavrsnirad.controller;

import hr.dankovic.zavrsnirad.utility.DankovicException;
import java.util.List;

/**
 *
 * @author Marko
 */
public class ObradaVoznja extends Obrada{

     @Override
    public List getPodaci() {
         return session.createQuery("from Vozac").list();
    }
    
    @Override
    protected void kontrolaCreate() throws DankovicException {
       kontrolaBroj_Putnika();
       kontrolaTrajanje();
       kontrolaCijena();
       kontrolaOdrediste();
       kontrolaPolaziste();
    }
    @Override
    protected void kontrolaUpdate() throws DankovicException {
    }

    @Override
    protected void kontrolaDelete() throws DankovicException {
    }


   
    private void kontrolaBroj_Putnika() {
    }

    private void kontrolaCijena() {
    }

    private void kontrolaTrajanje() {
    }

    private void kontrolaOdrediste() {
    }

    private void kontrolaPolaziste() {
    }
}