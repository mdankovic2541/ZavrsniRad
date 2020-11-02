/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.dankovic.zavrsnirad;

import hr.dankovic.zavrsnirad.controller.ObradaVozac;
import hr.dankovic.zavrsnirad.controller.ObradaVozilo;
import hr.dankovic.zavrsnirad.model.Vozac;
import hr.dankovic.zavrsnirad.model.Vozilo;
import hr.dankovic.zavrsnirad.utility.DankovicException;
import hr.dankovic.zavrsnirad.utility.HibernateUtil;
import hr.dankovic.zavrsnirad.utility.PocetniInsert;
import hr.dankovic.zavrsnirad.utility.SplashScreen;
import hr.dankovic.zavrsnirad.view.Autorizacija;
import hr.dankovic.zavrsnirad.view.Izbornik;
import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marko
 */
public class Start {

    public static void main(String[] args) {

         SplashScreen sC = new SplashScreen();
        sC.setLocationRelativeTo(null);
        sC.setVisible(true);
     //   new Autorizacija().setVisible(true);
        
        
      //PocetniInsert.izvedi();
//        ObradaVozac obradaVozac = new ObradaVozac();
//
////       for(Vozac v: obradaVozac.getPodaci()){
////           System.out.println(v.getIme() + " " + v.getPrezime());
////       }
//        Vozac v = new Vozac();
//
//        obradaVozac.setEntitet(v);
//        try {
//            obradaVozac.create();
//        } catch (DankovicException ex) {
//            System.out.println(ex.getPoruka());
//        }

        // Vozilo s;
//      ObradaVozilo obradaVozilo = new ObradaVozilo();
//      
//      List<Vozilo> podaci = obradaVozilo.getPodaci();
//      
//        for (Vozilo vozilo : podaci) {
//            System.out.println(vozilo.getId() + " " + vozilo.getNaziv());
//        }
//        List<Vozilo> lista = new ArrayList<Vozilo>();
//        long pocetak = System.currentTimeMillis();
//        for (int i = 0; i < 1000; i++) {
//            s = new Vozilo();
//            s.setNaziv("AUDI");
//            s.setTablica("SB-666-GG");
//            lista.add(s);
//        }
//            try {
//                obradaVozilo.createAll(lista);
//
//            } catch (DankovicException ex) {
//                System.out.println(ex.getPoruka());
//            }
//        
//        long kraj = System.currentTimeMillis();
//
//        System.out.println(kraj - pocetak);
    }
}
