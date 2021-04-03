/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.view;

import hotel.controller.ObradaDjelatnik;
import hotel.model.Djelatnik;
import hotel.util.EdunovaException;
import java.math.RoundingMode;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mativel
 */
public class DjelatnikForma extends javax.swing.JFrame {
    
    private ObradaDjelatnik obrada;

    /**
     * Creates new form DjelatnikForma
     */
    public DjelatnikForma() {
        initComponents();
        obrada = new ObradaDjelatnik();
        setTitle(Aplikacija.Velimir + " Usluge");
        ucitaj();
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
        lstDjelatnici = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtLozinka = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtOib = new javax.swing.JTextField();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstDjelatnici.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstDjelatnici.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstDjelatniciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstDjelatnici);

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel3.setText("Email");

        jLabel4.setText("Lozinka");

        jLabel5.setText("Oib");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promjeni");
        btnPromjeni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjeniActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail)
                    .addComponent(txtLozinka)
                    .addComponent(txtOib)
                    .addComponent(txtIme)
                    .addComponent(txtPrezime)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addGap(18, 18, 18)
                        .addComponent(btnPromjeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(btnObrisi)))
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtLozinka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstDjelatniciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstDjelatniciValueChanged
       if (evt.getValueIsAdjusting()) {
            return;
        }
       
        if (lstDjelatnici.getSelectedValue() == null) {
            return;
        }
        
         obrada.setEntitet(lstDjelatnici.getSelectedValue());


        txtIme.setText(obrada.getEntitet().getIme());
        if (obrada.getEntitet().getPrezime()!= null) {
            txtPrezime.setText(obrada.getEntitet().getPrezime().toString());
        } else {
            txtPrezime.setText("");
        }
        try {
            txtEmail.setText(obrada.getEntitet().getEmail().toString());
        } catch (Exception e) {
            txtEmail.setText("");
        }

        try {
            txtLozinka.setText(obrada.getEntitet().getLozinka().toString());
        } catch (Exception e) {
            txtLozinka.setText("");
        }
        try {
            txtOib.setText(obrada.getEntitet().getOib().toString());
        } catch (Exception e) {
            txtOib.setText("");
        }
    }//GEN-LAST:event_lstDjelatniciValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Djelatnik());
        postaviVrijednostiNaEntitet();

        try {
            obrada.create();
            pocisti();
            ucitaj(); //nije optimizirano. Bolje bi bilo samo taj novi dodati u listu
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjeniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjeniActionPerformed
        if (obrada.getEntitet()==null || 
                obrada.getEntitet().getId() == null) {
            JOptionPane.showMessageDialog(rootPane, "Prvo odaberite stavku");
            return;
        }
        postaviVrijednostiNaEntitet();

        try {
            obrada.update();
            pocisti();
            ucitaj();
        } catch (EdunovaException e) {
            JOptionPane.showMessageDialog(rootPane, e.getPoruka());
        }
    }//GEN-LAST:event_btnPromjeniActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        if (obrada.getEntitet()==null || 
                obrada.getEntitet().getId() == null) {
            JOptionPane.showMessageDialog(rootPane, "Prvo odaberite stavku");
            return;
        }

        try {
            obrada.delete();
            pocisti();
            ucitaj();
        } catch (EdunovaException e) {
            JOptionPane.showMessageDialog(rootPane, e.getPoruka());
        }
    }//GEN-LAST:event_btnObrisiActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Djelatnik> lstDjelatnici;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtLozinka;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables

    private void ucitaj() {
        DefaultListModel<Djelatnik> m = new DefaultListModel<>();

        m.addAll(obrada.getPodaci());

        lstDjelatnici.setModel(m);
    }
    private void postaviVrijednostiNaEntitet() {
        var entitet=obrada.getEntitet();
        
        entitet.setIme(txtIme.getText());

            try {
            entitet.setPrezime(new String(txtPrezime.getText()));
        } catch (Exception e) {
            entitet.setPrezime(new String());
        }
            try {
            entitet.setEmail(new String(txtEmail.getText()));
        } catch (Exception e) {
            entitet.setEmail(new String());
        }
            try {
            entitet.setLozinka(new String(txtLozinka.getText()));
        } catch (Exception e) {
            entitet.setLozinka(new String());
        }
            try {
            entitet.setOib(new String(txtOib.getText()));
        } catch (Exception e) {
            entitet.setOib(new String());
        }
    }
    private void pocisti() {
        txtIme.setText("");
        txtPrezime.setText("");
        txtEmail.setText("");
        txtLozinka.setText("");
        txtOib.setText("");
    }

}