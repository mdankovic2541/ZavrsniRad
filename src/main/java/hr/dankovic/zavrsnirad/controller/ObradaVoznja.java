/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.dankovic.zavrsnirad.controller;

import hr.dankovic.zavrsnirad.model.Voznja;
import hr.dankovic.zavrsnirad.utility.DankovicException;
import java.util.List;

/**
 *
 * @author Marko
 */
public class ObradaVoznja extends Obrada<Voznja>{

     @Override
    public List<Voznja> getPodaci() {
         return session.createQuery("from Voznja").list();
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


    private void kontrolaBroj_Putnika() throws DankovicException{
         kontrolaNull(entitet.getBroj_putnika(), "Broj putnika nije definiran!");
        if(entitet.getBroj_putnika().compareTo(Integer.SIZE) <=0){
            throw new DankovicException("Broj putnika ne može biti manji ili jednak nuli!");
        }
        
    }

    private void kontrolaCijena()throws DankovicException {
        kontrolaNull(entitet.getCijena(), "Cijena nije definirana!");
        if(entitet.getCijena().compareTo(Integer.SIZE) <=0){
            throw new DankovicException("Cijena ne može biti manja ili jednaka nuli!");
        }
       
    }

    private void kontrolaTrajanje()throws DankovicException {
         kontrolaNull(entitet.getTrajanje(), "Trajanje nije definirano!");
        if(entitet.getTrajanje().compareTo(Integer.SIZE) <=0){
            throw new DankovicException("Trajanje ne može biti manje ili jednako nuli!");
        }
        
    }

    private void kontrolaOdrediste()throws DankovicException {
       if(entitet.getOdrediste()== null || entitet.getOdrediste().trim().isEmpty()){
           throw new DankovicException("Odredište je obavezno!");
       }
    }

    private void kontrolaPolaziste() throws DankovicException{
        if(entitet.getPolaziste()== null || entitet.getPolaziste().trim().isEmpty()){
           throw new DankovicException("Polazište je obavezno!");
       }
    }
    private void kontrolaNull(Object o, String poruka)throws DankovicException{
       
        if(o == null){
            throw new DankovicException(poruka);
        } 
        
    }
}