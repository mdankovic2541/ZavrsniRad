/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.dankovic.zavrsnirad;

import hr.dankovic.zavrsnirad.controller.ObradaVozilo;
import hr.dankovic.zavrsnirad.model.Vozilo;
import hr.dankovic.zavrsnirad.utility.DankovicException;
import hr.dankovic.zavrsnirad.utility.HibernateUtil;
import hr.dankovic.zavrsnirad.utility.PocetniInsert;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Marko
 */
public class Start {
    public static void main(String[] args) {
       
        //PocetniInsert.izvedi();     
        Vozilo s = new Vozilo();
     
        ObradaVozilo obradaVozilo = new ObradaVozilo(s);
        s.setNaziv("232422");
        try {
            obradaVozilo.create();
        } catch (DankovicException ex) {
          System.out.println(ex.getPoruka());      
       }
   }
   
}
