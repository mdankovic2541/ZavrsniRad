/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.dankovic.zavrsnirad.controller;

import hr.dankovic.zavrsnirad.utility.DankovicException;
import hr.dankovic.zavrsnirad.utility.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author Marko
 */
public abstract class Obrada<T> {
    
    protected T entitet;
    protected Session session;

    protected abstract void kontrolaCreate() throws DankovicException; 
     protected abstract void kontrolaUpdate() throws DankovicException;  
     protected abstract void kontrolaDelete() throws DankovicException;  

   
     
     public Obrada(T entitet) {
        this();
        this.entitet = entitet;
    }
     
     
    public Obrada() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
    public T create() throws DankovicException{
        kontrolaCreate();
        save();
        return entitet;
       }          
      public T update() throws DankovicException{
        kontrolaUpdate();
        save();
        return entitet;
       }        
       public boolean delete() throws DankovicException{
        kontrolaDelete();
        session.beginTransaction();
        session.delete(entitet);
        session.getTransaction().commit();
              return true;
          }
    
      
       private void save(){
        session.beginTransaction();
        session.save(entitet);
        session.getTransaction().commit();
       }
            
    
     
    
}
