/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.dankovic.zavrsnirad.controller;

import hr.dankovic.zavrsnirad.model.Vozilo;
import hr.dankovic.zavrsnirad.utility.DankovicException;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Marko
 */
public class ObradaVozilo extends Obrada<Vozilo>{

    public ObradaVozilo(Vozilo vozilo){
        super(vozilo);
    }

    public ObradaVozilo() {
        super();
        
    }

    

      @Override
    public List<Vozilo> getPodaci() {
            return session.createQuery("from Vozilo").list();

    }
   public List<Vozilo> getPodaci(String uvjet) {
       
            return session.createQuery("from Vozilo p" +
                    " where concat(p.naziv) " + 
                    " like :uvjet ").setParameter("uvjet", "%"+uvjet+"%")
                    .setMaxResults(20)
                    .list();

    }
    
    
    @Override
    protected void kontrolaCreate() throws DankovicException {
        kontrolaNaziv();
        kontrolaTablice();
        kontrolaBoja();
    }

    @Override
    protected void kontrolaUpdate() throws DankovicException {
        kontrolaNaziv();
    }

    @Override
    protected void kontrolaDelete() throws DankovicException {
        if(entitet.getVozaci().size() > 0){
            throw new DankovicException("Vozilo se ne može obrisati jer ga koristi jedan vozač!\n Obrišite vozača.");
        }
    }

    private void kontrolaNaziv() throws DankovicException {
     kontrolaNull(entitet.getNaziv(),"Naziv nije definiran!");  
    if(entitet.getNaziv().trim().isEmpty()){
            throw new DankovicException("Naziv nije postavljen,unijeti naziv!");
        }  
    
        boolean broj = false;
        try {
             new BigDecimal(entitet.getNaziv());
             broj=true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(broj){
           throw new DankovicException("Naziv ne može biti broj,unijeti naziv!");
        }
        if(entitet.getNaziv().length()> 50){
            throw new DankovicException("Naziv ne može biti veći od 50 znakova!");
        }
        
    }

    private void kontrolaTablice() throws DankovicException{
        
        kontrolaNull(entitet.getTablica(),"Tablica nije definirana!");
        if(entitet.getTablica().trim().isEmpty()){
            throw new DankovicException("Tablica nije postavljena,unijeti tablicu!");
        } 
         if(entitet.getTablica().length()> 15){
            throw new DankovicException("Tablica ne može biti veća od 15 znakova!");
        }
        
        
        }
    
    
    private void kontrolaBoja() throws DankovicException {
    kontrolaNull(entitet.getBoja(),"Boja nije definirana!");
        if(entitet.getBoja().trim().isEmpty()){
            throw new DankovicException("Boja nije postavljena,unijeti boju!");
        }   
    }

    private void kontrolaNull(Object o, String poruka)throws DankovicException{
       
        if(o == null){
            throw new DankovicException(poruka);
        } 
        
    }

    
  
    
    
    
    
    
}
    

