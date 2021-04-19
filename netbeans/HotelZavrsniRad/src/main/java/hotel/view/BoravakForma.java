/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
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
import java.util.Locale;
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
        prilagodiDdDatumDolaska();
        prilagodiDoDatumOdlaska();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        lstUslugeUHotelu = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstUslugeNaBoravku = new javax.swing.JList<>();
        btnDodajUslugu = new javax.swing.JButton();
        btnObrisiUslugu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstBoravci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstBoravciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstBoravci);

        jLabel1.setText("Datum dolaska");

        jLabel2.setText("Datum odlaska");

        jLabel4.setText("Naziv boravka");

        jLabel5.setText("Gost");

        jLabel6.setText("Djelatnik");

        jLabel7.setText("Broj noćenja");

        slBrojNocenja.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slBrojNocenjaStateChanged(evt);
            }
        });

        lblNocenja.setText("Noćenja");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjeni.setText("Promijeni");
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

        jScrollPane2.setViewportView(lstUslugeUHotelu);

        jScrollPane3.setViewportView(lstUslugeNaBoravku);

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

        jLabel3.setText("Korištene usluge");

        jLabel8.setText("Hotelske usluge");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                                .addComponent(cmbDjelatnici, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(slBrojNocenja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(202, 202, 202)))
                                    .addComponent(jLabel6))
                                .addGap(83, 83, 83))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbGosti, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(73, 73, 73))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnDodaj)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnPromjeni)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnObrisi))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(44, 44, 44)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnObrisiUslugu)
                                                    .addComponent(btnDodajUslugu))))
                                        .addGap(39, 39, 39)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblNocenja)
                                        .addGap(192, 192, 192))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(130, 130, 130))))
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
                        .addComponent(slBrojNocenja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNocenja)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbGosti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbDjelatnici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(btnObrisiUslugu)
                                .addGap(62, 62, 62)
                                .addComponent(btnDodajUslugu)))
                        .addGap(53, 53, 53)
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
    private javax.swing.JComboBox<Djelatnik> cmbDjelatnici;
    private javax.swing.JComboBox<Gost> cmbGosti;
    private com.github.lgooddatepicker.components.DatePicker ddDatumDolaska;
    private com.github.lgooddatepicker.components.DatePicker doDatumOdlaska;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblNocenja;
    private javax.swing.JList<Boravak> lstBoravci;
    private javax.swing.JList<Usluga> lstUslugeNaBoravku;
    private javax.swing.JList<Usluga> lstUslugeUHotelu;
    private javax.swing.JSlider slBrojNocenja;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables

    private void prilagodiDdDatumDolaska() {
        
        DatePickerSettings dps= new DatePickerSettings(
                new Locale("hr","HR"));
        dps.setFormatForDatesCommonEra("dd.MM.yyyy");
        ddDatumDolaska.setSettings(dps);
        
        
    }
    
    private void prilagodiDoDatumOdlaska() {
        
        DatePickerSettings dps= new DatePickerSettings(
                new Locale("hr","HR"));
        dps.setFormatForDatesCommonEra("dd.MM.yyyy");
        doDatumOdlaska.setSettings(dps);
        
        
    }
    
    
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

    
    

