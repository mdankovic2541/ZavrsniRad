/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.dankovic.zavrsnirad.utility;

import com.github.javafaker.Faker;
import hr.dankovic.zavrsnirad.controller.ObradaOperater;
import hr.dankovic.zavrsnirad.model.Operater;
import hr.dankovic.zavrsnirad.model.Vozac;
import hr.dankovic.zavrsnirad.model.Vozilo;
import hr.dankovic.zavrsnirad.model.Voznja;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Session;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author Marko
 */
public class PocetniInsert {

    public static void izvedi() {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Operater operater = new Operater();
        operater.setIme("Marko");
        operater.setPrezime("Danković");
        operater.setUloga("oper");
        operater.setEmail("mdankovic@gmail.com");
        operater.setLozinka(BCrypt.hashpw("m", BCrypt.gensalt()));
       
        ObradaOperater oo = new ObradaOperater();
        oo.setEntitet(operater);
        try {
            oo.create();
        } catch (DankovicException ex) {
            ex.printStackTrace();
        }

        Vozilo bmw = kreirajVozilo("BMW", "Plava", "SB-678-GH");
        Vozilo audi = kreirajVozilo("AUDI", "Crna", "OS-531-AF");
        Vozilo renault = kreirajVozilo("RENAULT", "Siva", "ZG-9581-JG");
        session.beginTransaction();
        session.save(bmw);
        session.save(audi);
        session.save(renault);
        session.getTransaction().commit();
        session.beginTransaction();
        Faker faker = new Faker();
        Vozac v, vozacBMW = null, vozacAUDI = null, vozacRENAULT = null;
        for (int i = 0; i < 3; i++) {
            v = new Vozac();
            v.setIme(faker.name().firstName());
            v.setPrezime(faker.name().lastName());
            v.setSpol("M");
            if (i == 0) {
                vozacAUDI = v;
                v.setVozilo(audi);
                v.setDob("23");
            }
            if (i == 1) {
                vozacBMW = v;
                v.setVozilo(bmw);
                v.setDob("26");
            }
            if (i == 2) {
                vozacRENAULT = v;
                v.setVozilo(renault);
                v.setDob("28");
            }
            session.save(v);

        }
        session.getTransaction().commit();

        session.beginTransaction();

        Voznja voznja;
        List<Voznja> voznjaAUDI = new ArrayList<>();
        List<Voznja> voznjaBMW = new ArrayList<>();
        List<Voznja> voznjaRENAULT = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            voznja = new Voznja();
         
            if (i < 25) {
                voznjaAUDI.add(voznja);
                voznja.setVozac(vozacAUDI);
                voznja.setOdrediste("KBC Osijek");
                voznja.setPolaziste("Sjenjak 32");
                voznja.setBroj_putnika(4);
                voznja.setTrajanje("14");
                voznja.setCijena(25);
            }
            if (i < 40 && i >= 25) {
                voznjaBMW.add(voznja);
                voznja.setVozac(vozacBMW);
                voznja.setOdrediste("Medulinska 12");
                voznja.setPolaziste("Kolodvor");
                voznja.setBroj_putnika(3);
                voznja.setTrajanje("23");
                voznja.setCijena(35);
            }
            if (i < 50 && i >= 40) {
                voznjaRENAULT.add(voznja);
                voznja.setVozac(vozacRENAULT);
                voznja.setOdrediste("Vukovarska 74");
                voznja.setPolaziste("FERIT [K]");
                voznja.setBroj_putnika(2);
                voznja.setTrajanje("8");
                voznja.setCijena(15);
            }
            session.save(voznja);
        }

        session.getTransaction().commit();

    }

    private static Vozilo kreirajVozilo(String naziv, String boja, String tablica) {
        Vozilo vozilo = new Vozilo();
        vozilo.setNaziv(naziv);
        vozilo.setBoja(boja);
        vozilo.setTablica(tablica);
        return vozilo;
    }

    public static void adminOperater() {
{
        Operater operater = new Operater();
        operater.setIme("Edunova");
        operater.setPrezime("Operater");
        operater.setUloga("admin");
        operater.setEmail("edunova@edunova.hr");
        operater.setLozinka(BCrypt.hashpw("e", BCrypt.gensalt()));

        ObradaOperater oo = new ObradaOperater();
        oo.setEntitet(operater);
        try {
            oo.create();
        } catch (DankovicException ex) {
            ex.printStackTrace();
        }

        

       

    }    }
}
