/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hr.dankovic.zavrsnirad.view;

import hr.dankovic.zavrsnirad.controller.ObradaVozac;
import hr.dankovic.zavrsnirad.controller.ObradaVoznja;
import hr.dankovic.zavrsnirad.model.Vozac;
import hr.dankovic.zavrsnirad.model.Voznja;
import hr.dankovic.zavrsnirad.utility.DankovicException;
import java.awt.Component;
import javax.swing.DefaultListModel;
import javax.swing.JTextField;

/**
 *
 * @author Marko
 */
public class Voznje extends javax.swing.JFrame {
    
    
       private ObradaVoznja obrada;
       private Voznja entitet;
    /**
     * Creates new form Vozaci
     */
    public Voznje() {
        initComponents();
        lstPodaci.setCellRenderer(new VoznjaCellRenderer());
        obrada = new ObradaVoznja();
        setTitle(Aplikacija.operater.getIme() + " " + Aplikacija.operater.getPrezime() + " - Vožnje");

        ucitajPodatke();
       
      
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstPodaci = new javax.swing.JList<>();
        pnlPodaci = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPolaziste = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtOdrediste = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCijena = new javax.swing.JTextField();
        lblPoruka = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnPromijeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        txtBrojPutnika = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTrajanje = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel1.setText("Polazište");

        txtPolaziste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPolazisteActionPerformed(evt);
            }
        });

        jLabel2.setText("Odredište");

        txtOdrediste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOdredisteActionPerformed(evt);
            }
        });

        jLabel3.setText("Cijena");

        txtCijena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCijenaActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromijeni.setText("Promijeni");
        btnPromijeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromijeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        txtBrojPutnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrojPutnikaActionPerformed(evt);
            }
        });

        jLabel4.setText("Broj putnika");

        txtTrajanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrajanjeActionPerformed(evt);
            }
        });

        jLabel6.setText("Trajanje");

        javax.swing.GroupLayout pnlPodaciLayout = new javax.swing.GroupLayout(pnlPodaci);
        pnlPodaci.setLayout(pnlPodaciLayout);
        pnlPodaciLayout.setHorizontalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPoruka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTrajanje)
                    .addComponent(txtOdrediste, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCijena, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPolaziste)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPromijeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnObrisi, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE))
                    .addComponent(txtBrojPutnika)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlPodaciLayout.setVerticalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPolaziste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtOdrediste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtCijena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtBrojPutnika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnPromijeni)
                    .addComponent(btnObrisi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(pnlPodaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(pnlPodaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if(evt.getValueIsAdjusting()){
            return;
        }
        entitet = lstPodaci.getSelectedValue();
        if(entitet == null){
            return;
        }
        txtPolaziste.setText(entitet.getPolaziste());
        txtOdrediste.setText(entitet.getOdrediste());
        txtBrojPutnika.setText(entitet.getBroj_putnika().toString());
        txtCijena.setText(entitet.getCijena().toString());
        txtTrajanje.setText(entitet.getTrajanje().toString());
        
        
        
        
        
    }//GEN-LAST:event_lstPodaciValueChanged

    private void txtBrojPutnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrojPutnikaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrojPutnikaActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        entitet = lstPodaci.getSelectedValue();
        if(entitet == null){
            return;
        }
        obrada.setEntitet(entitet);
        try{
            obrada.delete();
            ucitajPodatke();
            ocistiPolja();

        }catch(DankovicException e){
            lblPoruka.setText(e.getPoruka());}
    
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnPromijeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromijeniActionPerformed
        entitet = lstPodaci.getSelectedValue();
        if(entitet == null){
            return;
        }
        postaviVrijednostiUEntitet();
        try{
            obrada.update();
            ucitajPodatke();
            ocistiPolja();

        }catch(DankovicException e){
            lblPoruka.setText(e.getPoruka());
        }
    }//GEN-LAST:event_btnPromijeniActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        entitet =new Voznja();
        postaviVrijednostiUEntitet();

        try {
            obrada.create();
            ucitajPodatke();
            ocistiPolja();
        } catch (DankovicException ex) {
            lblPoruka.setText(ex.getPoruka());
        }

    }//GEN-LAST:event_btnDodajActionPerformed

    private void txtCijenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCijenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCijenaActionPerformed

    private void txtOdredisteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOdredisteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOdredisteActionPerformed

    private void txtPolazisteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPolazisteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPolazisteActionPerformed

    private void txtTrajanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrajanjeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrajanjeActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromijeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JList<Voznja> lstPodaci;
    private javax.swing.JPanel pnlPodaci;
    private javax.swing.JTextField txtBrojPutnika;
    private javax.swing.JTextField txtCijena;
    private javax.swing.JTextField txtOdrediste;
    private javax.swing.JTextField txtPolaziste;
    private javax.swing.JTextField txtTrajanje;
    // End of variables declaration//GEN-END:variables

    private void ucitajPodatke() {
          
        DefaultListModel<Voznja> m = new DefaultListModel<>();
        obrada.getPodaci().forEach(s->m.addElement(s));
        lstPodaci.setModel(m);

    }

    private void ocistiPolja() {
        
        for(Component c : pnlPodaci.getComponents()){
            if(c instanceof JTextField){
                ((JTextField) c).setText("");
                
            }       
        
        }
        lblPoruka.setText("");
        
//        entitet.setIme("");
//        entitet.setPrezime("");
//        entitet.setSpol("");   
//        entitet.setDob(null);
    }

    private void postaviVrijednostiUEntitet() {
        entitet.setPolaziste(txtPolaziste.getText());
        entitet.setOdrediste(txtOdrediste.getText());
        
        
        obrada.setEntitet(entitet);
}
}
