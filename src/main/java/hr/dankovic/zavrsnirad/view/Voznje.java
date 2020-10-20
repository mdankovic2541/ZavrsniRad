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
     * Creates new form Voznje
     */
    public Voznje() {
        initComponents();
        lstPodaci.setCellRenderer(new VoznjaCellRenderer());
        obrada = new ObradaVoznja();
        setTitle(Aplikacija.operater.getIme() + " " + Aplikacija.operater.getPrezime() + " - Vožnje");
        btnObrisi.setText("\u274C"+ " Obriši");
        btnPromijeni.setText("\u2611\uFE0F" + " Promijeni");
        btnDodaj.setText("\u2795" + " Dodaj");
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
        jcbBrojPutnika = new javax.swing.JComboBox<>();
        lblBrojPutnika = new javax.swing.JLabel();
        jcbCijena = new javax.swing.JComboBox<>();
        lblCijena = new javax.swing.JLabel();
        cmbVozaci = new javax.swing.JComboBox<>();
        lvlVozaci = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(java.awt.Color.gray);

        lstPodaci.setSelectionForeground(new java.awt.Color(153, 153, 153));
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        pnlPodaci.setToolTipText("Podaci\n");

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

        jcbBrojPutnika.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jcbBrojPutnika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbBrojPutnikaActionPerformed(evt);
            }
        });

        lblBrojPutnika.setText("Broj putnika");

        jcbCijena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "20 ", "25", " 30", " 35 ", "40", " 45", " 50", " 55", " 60", " 65", " 70", " 75 ", "80", " 85", " 90", " 95 ", "100 ", "105 ", "110", " 115", " 120", " 125", " 130", "135", "140", "145", "150", "155", "160", "165", "170", "175", "180", "185", "190", "195", "200", " ", " ", " " }));
        jcbCijena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCijenaActionPerformed(evt);
            }
        });

        lblCijena.setText("Cijena");

        lvlVozaci.setText("Vozači");

        javax.swing.GroupLayout pnlPodaciLayout = new javax.swing.GroupLayout(pnlPodaci);
        pnlPodaci.setLayout(pnlPodaciLayout);
        pnlPodaciLayout.setHorizontalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPoruka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtTrajanje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(txtPolaziste, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOdrediste, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCijena, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBrojPutnika, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblCijena)
                                .addComponent(lblBrojPutnika)
                                .addComponent(jcbBrojPutnika, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbCijena, javax.swing.GroupLayout.Alignment.TRAILING, 0, 116, Short.MAX_VALUE)
                                .addComponent(cmbVozaci, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lvlVozaci))
                        .addGap(24, 24, 24))
                    .addGroup(pnlPodaciLayout.createSequentialGroup()
                        .addComponent(btnDodaj, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPromijeni, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnObrisi, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlPodaciLayout.setVerticalGroup(
            pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPodaciLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBrojPutnika))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPolaziste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbBrojPutnika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCijena))
                .addGap(1, 1, 1)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOdrediste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCijena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lvlVozaci))
                .addGap(1, 1, 1)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCijena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbVozaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtBrojPutnika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(txtTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(pnlPodaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDodaj)
                    .addComponent(btnPromijeni)
                    .addComponent(btnObrisi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPodaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlPodaci, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
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
        txtTrajanje.setText(entitet.getTrajanje());
        
        
        
        
        
        
        
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

    private void jcbBrojPutnikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbBrojPutnikaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbBrojPutnikaActionPerformed

    private void jcbCijenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCijenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCijenaActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromijeni;
    private javax.swing.JComboBox<Vozac> cmbVozaci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcbBrojPutnika;
    private javax.swing.JComboBox<String> jcbCijena;
    private javax.swing.JLabel lblBrojPutnika;
    private javax.swing.JLabel lblCijena;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JList<Voznja> lstPodaci;
    private javax.swing.JLabel lvlVozaci;
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
    
//     entitet.setIme("");
//        entitet.setPrezime("");
//        entitet.setSpol("");   
//        entitet.setDob(null);
    }

    private void postaviVrijednostiUEntitet() {
        entitet.setPolaziste(txtPolaziste.getText());
        entitet.setOdrediste(txtOdrediste.getText());
        entitet.setTrajanje(txtTrajanje.getText());
        entitet.setBroj_putnika((Integer) jcbBrojPutnika.getSelectedItem());
        entitet.setCijena((Integer) jcbCijena.getSelectedItem());
        
        obrada.setEntitet(entitet);
}
}
