/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.view;

import hotel.controller.ObradaGost;
import hotel.model.Gost;
import hotel.util.EdunovaException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mativel
 */
public class GostForma extends javax.swing.JFrame {
    
    private ObradaGost obrada;
    

    /**
     * Creates new form GostForma
     */
    public GostForma() {
        initComponents();
        obrada = new ObradaGost();
        setTitle(Aplikacija.Velimir + " Gosti");
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
        lstGosti = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtIme = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPrezime = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtOib = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDrzavljanstvo = new javax.swing.JTextField();
        drDatumRodjenja = new com.github.lgooddatepicker.components.DatePicker();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstGosti.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstGosti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstGostiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstGosti);

        jLabel1.setText("Ime");

        jLabel2.setText("Prezime");

        jLabel3.setText("Email");

        jLabel4.setText("Oib");

        jLabel5.setText("Datum rođenja");

        jLabel6.setText("Državljanstvo");

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtOib)
                            .addComponent(txtDrzavljanstvo)
                            .addComponent(txtPrezime)
                            .addComponent(txtEmail)
                            .addComponent(txtIme)
                            .addComponent(drDatumRodjenja, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(334, 334, 334))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDodaj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPromjeni)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnObrisi)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrezime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOib, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(drDatumRodjenja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDrzavljanstvo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi))
                        .addGap(62, 62, 62))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstGostiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstGostiValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }
       
        if (lstGosti.getSelectedValue() == null) {
            return;
        }
        
         obrada.setEntitet(lstGosti.getSelectedValue());
         
         Gost g = obrada.getEntitet();


        // ovo se može zamijeniti tkz. Binding
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
            txtDrzavljanstvo.setText(obrada.getEntitet().getDrzavljanstvo().toString());
        } catch (Exception e) {
            txtDrzavljanstvo.setText("");
        }

        try {
            txtOib.setText(obrada.getEntitet().getOib().toString());
        } catch (Exception e) {
            txtOib.setText("");
        }
        
        if(g.getDatum_rodjenja()!=null) {
        drDatumRodjenja.setDate(g.getDatum_rodjenja().toInstant()
        .atZone(ZoneId.systemDefault()).toLocalDate());
        }else{
            drDatumRodjenja.setDate(null);
        }
    }//GEN-LAST:event_lstGostiValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Gost());
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
            JOptionPane.showMessageDialog(rootPane, "Odaberite stavku");
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
            JOptionPane.showMessageDialog(rootPane, "Odaberite stavku");
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
    private com.github.lgooddatepicker.components.DatePicker drDatumRodjenja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Gost> lstGosti;
    private javax.swing.JTextField txtDrzavljanstvo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIme;
    private javax.swing.JTextField txtOib;
    private javax.swing.JTextField txtPrezime;
    // End of variables declaration//GEN-END:variables

    private void ucitaj() {
        DefaultListModel<Gost> m = new DefaultListModel<>();

        m.addAll(obrada.getPodaci());

        lstGosti.setModel(m);
    }
    
    private void postaviVrijednostiNaEntitet() {
        var entitet=obrada.getEntitet();
        
        try {
            entitet.setIme(new String(txtIme.getText()));
        } catch (Exception e) {
            entitet.setIme(new String());
        }
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
            entitet.setOib(new String(txtOib.getText()));
        } catch (Exception e) {
            entitet.setOib(new String());
        }
        try {
            entitet.setDrzavljanstvo(new String(txtDrzavljanstvo.getText()));
        } catch (Exception e) {
            entitet.setDrzavljanstvo(new String());
        }
        try {
            entitet.setDatum_rodjenja(new Date(drDatumRodjenja.getDateStringOrEmptyString()));
        } catch (Exception e) {
            entitet.setDatum_rodjenja(new Date());
        }
    }
        private void pocisti() {
        txtIme.setText("");
        txtPrezime.setText("");
        txtEmail.setText("");
        txtOib.setText("");
        drDatumRodjenja.setDate(LocalDate.MIN);
 
        }
 }
