/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.view;

import hotel.controller.ObradaBoravak;
import hotel.controller.ObradaDjelatnik;
import hotel.controller.ObradaGost;
import hotel.controller.ObradaUsluga;
import hotel.model.Boravak;
import hotel.model.Djelatnik;
import hotel.model.Gost;
import hotel.model.HotelskaUsluga;
import hotel.model.Usluga;
import hotel.util.EdunovaException;
import hotel.util.HibernateUtil;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mativel
 */
public class BoravakForma extends javax.swing.JFrame {
    
    private ObradaBoravak obrada;
    private ObradaGost obradaGost;
    private ObradaUsluga obradaUsluga;
    private Object obradaBoravak;

    /**
     * Creates new form BoravciForma
     */
    public BoravakForma() {
        initComponents();
        obrada = new ObradaBoravak();
        obradaUsluga = new ObradaUsluga();
        setTitle(Aplikacija.Velimir + " Boravci");
        ucitaj();
        ucitajUsluge();
        ucitajGosti();
        ucitajDjelatnici();
       // ucitajUslugeBoravka();
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
        lstBoravci = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        ddDatumDolaska = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();
        doDatumOdlaska = new com.github.lgooddatepicker.components.DatePicker();
        cmbUsluge = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbGosti = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbDjelatnici = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        slBrojNocenja = new javax.swing.JSlider();
        lblNocenja = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnPromjeni = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        lblGost = new javax.swing.JLabel();
        btnTraziGosta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstUslugeUHotelu = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstUslugeNaBoravku = new javax.swing.JList<>();
        duDatumUsluge = new com.github.lgooddatepicker.components.DatePicker();
        btnSpremiUslugu = new javax.swing.JButton();
        btnDodajUslugu = new javax.swing.JButton();
        btnObrisiUslugu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstBoravci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstBoravciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstBoravci);

        jLabel1.setText("Datum dolaska");

        jLabel2.setText("Datum odlaska");

        jLabel3.setText("Usluga");

        jLabel4.setText("Naziv");

        jLabel5.setText("Gost");

        jLabel6.setText("Djelatnik");

        jLabel7.setText("Broj noćenja");

        slBrojNocenja.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slBrojNocenjaStateChanged(evt);
            }
        });

        lblNocenja.setText("Nocenja");

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

        lblGost.setText("Odabrani Gost");

        btnTraziGosta.setText("Traži Gosta");
        btnTraziGosta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziGostaActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(lstUslugeUHotelu);

        jScrollPane3.setViewportView(lstUslugeNaBoravku);

        btnSpremiUslugu.setText("Spremi Uslugu");
        btnSpremiUslugu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpremiUsluguActionPerformed(evt);
            }
        });

        btnDodajUslugu.setText("<<");
        btnDodajUslugu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajUsluguActionPerformed(evt);
            }
        });

        btnObrisiUslugu.setText(">>");
        btnObrisiUslugu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiUsluguActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 27, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(ddDatumDolaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(75, 75, 75)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(doDatumOdlaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNaziv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)))
                        .addGap(77, 77, 77)
                        .addComponent(jLabel7)
                        .addGap(190, 190, 190))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbGosti, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbDjelatnici, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbUsluge, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel3))
                                .addGap(202, 202, 202))
                            .addComponent(slBrojNocenja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(btnDodajUslugu))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnObrisiUslugu))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj)
                                .addGap(18, 18, 18)
                                .addComponent(btnPromjeni)
                                .addGap(18, 18, 18)
                                .addComponent(btnObrisi))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(duDatumUsluge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSpremiUslugu)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblGost)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNocenja)
                                    .addComponent(btnTraziGosta))
                                .addGap(144, 144, 144))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ddDatumDolaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doDatumOdlaska, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbUsluge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(slBrojNocenja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblNocenja)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbGosti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDjelatnici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGost, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnTraziGosta, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnObrisiUslugu)
                                .addGap(62, 62, 62)
                                .addComponent(btnDodajUslugu)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(duDatumUsluge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSpremiUslugu))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjeni)
                            .addComponent(btnObrisi)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lstBoravciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstBoravciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        if (lstBoravci.getSelectedValue() == null) {
            return;
        }

        obrada.setEntitet(lstBoravci.getSelectedValue());
        
        var g= obrada.getEntitet();
        
        txtNaziv.setText(g.getNaziv());
        
        if(g.getDatum_dolaska()!=null) {
            ddDatumDolaska.setDate(g.getDatum_dolaska().toInstant()
        .atZone(ZoneId.systemDefault()).toLocalDate());
        }else{
            ddDatumDolaska.setDate(null);
        }
        
        
      // cmbUsluge.setSelectedItem(g.getUsluga());
       cmbGosti.setSelectedItem(g.getGost());
       cmbDjelatnici.setSelectedItem(g.getDjelatnik());
       
        DefaultListModel<Usluga> m = new DefaultListModel<>();
        m.addAll(g.getUsluga());
        lstUslugeNaBoravku.setModel(m);
        
        
        //cmbPredavaci.setSelectedItem(g.getPredavac());
       
        
    }//GEN-LAST:event_lstBoravciValueChanged

    private void slBrojNocenjaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slBrojNocenjaStateChanged
        lblNocenja.setText(String.valueOf(slBrojNocenja.getValue()));
    }//GEN-LAST:event_slBrojNocenjaStateChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Boravak());
        postaviVrijednostiNaEntitet();

        try {
            obrada.create();
            pocisti();
            ucitajEntitete(); //nije optimizirano. Bolje bi bilo samo taj novi dodati u listu
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

    private void btnTraziGostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziGostaActionPerformed
        new GostForma(this).setVisible(true);
    }//GEN-LAST:event_btnTraziGostaActionPerformed

    private void btnSpremiUsluguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpremiUsluguActionPerformed
        if (lstUslugeNaBoravku.getSelectedValue() == null) {
            return;
        }
         Usluga u = lstUslugeNaBoravku.getSelectedValue();
         
          if(duDatumUsluge.getDate()!=null){
           u.setDatumUsluge(
                   Date.from(duDatumUsluge.getDate()
                           .atStartOfDay()
                   .atZone(ZoneId.systemDefault()).toInstant())
           );
       }
          
          try {
              obradaUsluga.setEntitet(u);
            obradaUsluga.update();
        } catch (EdunovaException e) {
              System.out.println(e.getPoruka());
        }
    }//GEN-LAST:event_btnSpremiUsluguActionPerformed

    private void btnDodajUsluguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajUsluguActionPerformed
        DefaultListModel<Usluga> m;
        try {
           m = (DefaultListModel<Usluga>) lstUslugeNaBoravku.getModel();
           m.get(0).toString();
        } catch (Exception e) {
            m = new DefaultListModel<>();
            lstUslugeNaBoravku.setModel(m);
        } 
            boolean postoji;
        
        for(Usluga u : lstUslugeUHotelu.getSelectedValuesList()){
            postoji = false;
            for(int i = 0; i < m.size(); i++){
                if(u.getId().equals(m.get(i).getId())){
                    postoji = true;
                    break;
                }
            }
            if(!postoji){
                m.addElement(u);
            }
            
        }
        lstUslugeNaBoravku.repaint();
        
    }//GEN-LAST:event_btnDodajUsluguActionPerformed
        
    private void btnObrisiUsluguActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiUsluguActionPerformed
        DefaultListModel<Usluga> m;
        try {
           m = (DefaultListModel<Usluga>) lstUslugeNaBoravku.getModel();
           m.get(0).toString();
        } catch (Exception e) {
            return;
        }
        
        for(Usluga u : lstUslugeNaBoravku.getSelectedValuesList()){
            
            for(int i = 0; i < m.size(); i++){
                if(u.getId().equals(m.get(i).getId())){
                    m.removeElementAt(i);
                    break;
                }
            } 
        }
    }//GEN-LAST:event_btnObrisiUsluguActionPerformed
        
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodajUslugu;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnObrisiUslugu;
    private javax.swing.JButton btnPromjeni;
    private javax.swing.JButton btnSpremiUslugu;
    private javax.swing.JButton btnTraziGosta;
    private javax.swing.JComboBox<Djelatnik> cmbDjelatnici;
    private javax.swing.JComboBox<Gost> cmbGosti;
    private javax.swing.JComboBox<Usluga> cmbUsluge;
    private com.github.lgooddatepicker.components.DatePicker ddDatumDolaska;
    private com.github.lgooddatepicker.components.DatePicker doDatumOdlaska;
    private com.github.lgooddatepicker.components.DatePicker duDatumUsluge;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblGost;
    private javax.swing.JLabel lblNocenja;
    private javax.swing.JList<Boravak> lstBoravci;
    private javax.swing.JList<Usluga> lstUslugeNaBoravku;
    private javax.swing.JList<Usluga> lstUslugeUHotelu;
    private javax.swing.JSlider slBrojNocenja;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables

       private void ucitaj() {
            DefaultListModel<Boravak> m = new DefaultListModel<>();

        m.addAll(obrada.getPodaci());

        lstBoravci.setModel(m);
    }
    
    
    private void ucitajUsluge() { 
        
        DefaultComboBoxModel<Usluga> m =
                 new DefaultComboBoxModel<>();
         
       m.addAll(new ObradaUsluga().getPodaci()); 
        lstUslugeUHotelu.setModel(m);

        cmbUsluge.setModel(m);
        cmbUsluge.setSelectedIndex(0);
    }
    
    
    private void ucitajGosti() {
        DefaultComboBoxModel<Gost> m =
                 new DefaultComboBoxModel<>();
         
       m.addAll(new ObradaGost().getPodaci()); 
        

        cmbGosti.setModel(m);
        cmbGosti.setSelectedIndex(0);
    }

    private void ucitajDjelatnici() {
        DefaultComboBoxModel<Djelatnik> m =
                 new DefaultComboBoxModel<>();
         
       m.addAll(new ObradaDjelatnik().getPodaci()); 
        

        cmbDjelatnici.setModel(m);
        cmbDjelatnici.setSelectedIndex(0);
    }

    private void postaviVrijednostiNaEntitet() {
        var g = obrada.getEntitet();
       g.setNaziv(txtNaziv.getText());
       //g.setUsluga(Usluga).cmbUsluge.getSelectedItem();
       g.setDjelatnik((Djelatnik) cmbDjelatnici.getSelectedItem());
       g.setGost((Gost) cmbGosti.getSelectedItem());
       g.setNocenje(slBrojNocenja.getValue());
       if(ddDatumDolaska.getDate()!=null){
           g.setDatum_dolaska(new Date());
                   Date.from(ddDatumDolaska.getDate()
                           .atStartOfDay()
                   .atZone(ZoneId.systemDefault()).toInstant());
           
       }
       
       DefaultListModel<Usluga> m;
        try {
           m = (DefaultListModel<Usluga>) lstUslugeNaBoravku.getModel();
           g.setUsluga(new ArrayList<>());
           for(int i = 0; i < m.getSize(); i++){
               g.getUsluga().add(m.get(i));
           }
        } catch (Exception e) {
        }
       
    }

    private void pocisti() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void ucitajEntitete() {
        DefaultListModel<Boravak> m = new DefaultListModel<>();

        

        m.addAll(obrada.getPodaci());

        lstBoravci.setModel(m);
    }

    private void ucitajUslugeBoravka() {
        /*        List<Usluga> usluge = obradaBoravak.getEntitet().getUsluge();
                DefaultListModel<Usluga> m = new DefaultListModel<>(); 
                m.addAll(usluge);
                lstUslugeNaBoravku.setModel(m);
*/
    }

    
}

    
    

