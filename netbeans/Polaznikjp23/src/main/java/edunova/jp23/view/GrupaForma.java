/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23.view;

import com.github.lgooddatepicker.components.DatePickerSettings;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import edunova.jp23.controller.ObradaClan;
import edunova.jp23.controller.ObradaGrupa;
import edunova.jp23.controller.ObradaPolaznik;
import edunova.jp23.controller.ObradaPredavac;
import edunova.jp23.controller.ObradaSmjer;
import edunova.jp23.model.Clan;
import edunova.jp23.model.Grupa;
import edunova.jp23.model.Mjesto;
import edunova.jp23.model.Operater;
import edunova.jp23.model.Polaznik;
import edunova.jp23.model.Predavac;
import edunova.jp23.model.Smjer;
import edunova.jp23.util.EdunovaException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Mativel
 */
public class GrupaForma extends javax.swing.JFrame 
    implements MjestoTrazitelj{

    private ObradaGrupa obrada;
    private ObradaPolaznik obradaPolaznik;
    private ObradaClan obradaClan;
    private Mjesto odabranoMjesto;
    
    /**
     * Creates new form GrupaForma
     */
    public GrupaForma() {
        initComponents();
        obrada = new ObradaGrupa();
        obradaPolaznik=new ObradaPolaznik();
        obradaClan=new ObradaClan();
        setTitle(Aplikacija.NASLOV_APP + " Grupe");
        ucitajEntitete();
        ucitajSmjerove();
        ucitajPredavacee();
        prilagodiDpDatumPocetka();
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
        lstEntiteti = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        cmbSmjerovi = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cmbPredavaci = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPolazniciNaGrupi = new javax.swing.JList<>();
        dpDatumPocetka = new com.github.lgooddatepicker.components.DatePicker();
        jLabel3 = new javax.swing.JLabel();
        slBrojPolaznika = new javax.swing.JSlider();
        jLabel5 = new javax.swing.JLabel();
        lblPolaznika = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstPolazniciUSkoli = new javax.swing.JList<>();
        txtUvjet = new javax.swing.JTextField();
        btnTrazi = new javax.swing.JButton();
        btnDodajUGrupu = new javax.swing.JButton();
        btnObrisiIzGrupe = new javax.swing.JButton();
        btnDodaj = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();
        btnBrisanje = new javax.swing.JButton();
        dpDatumUpisa = new com.github.lgooddatepicker.components.DatePicker();
        btnSpremiClana = new javax.swing.JButton();
        lblMjesto = new javax.swing.JLabel();
        btnTraziMjesto = new javax.swing.JButton();
        btnJsonExport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstEntiteti.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstEntiteti.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEntitetiValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstEntiteti);

        jLabel1.setText("Naziv");

        jLabel2.setText("Smjer");

        jLabel4.setText("Predavač");

        lstPolazniciNaGrupi.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPolazniciNaGrupiValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(lstPolazniciNaGrupi);

        jLabel3.setText("Datum početka");

        slBrojPolaznika.setMaximum(20);
        slBrojPolaznika.setMinimum(1);
        slBrojPolaznika.setValue(12);
        slBrojPolaznika.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                slBrojPolaznikaStateChanged(evt);
            }
        });

        jLabel5.setText("Maksimalno polaznika: ");

        jScrollPane3.setViewportView(lstPolazniciUSkoli);

        btnTrazi.setText("Traži");
        btnTrazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziActionPerformed(evt);
            }
        });

        btnDodajUGrupu.setText("<<");
        btnDodajUGrupu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajUGrupuActionPerformed(evt);
            }
        });

        btnObrisiIzGrupe.setText(">>");
        btnObrisiIzGrupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiIzGrupeActionPerformed(evt);
            }
        });

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnPromjena.setText("Pomjena");
        btnPromjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaActionPerformed(evt);
            }
        });

        btnBrisanje.setText("Brisanje");
        btnBrisanje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrisanjeActionPerformed(evt);
            }
        });

        btnSpremiClana.setText("Spremi Člana");
        btnSpremiClana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSpremiClanaActionPerformed(evt);
            }
        });

        lblMjesto.setText("Odabrano Mjesto");

        btnTraziMjesto.setText("Traži Mjesto");
        btnTraziMjesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraziMjestoActionPerformed(evt);
            }
        });

        btnJsonExport.setText("JSON");
        btnJsonExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJsonExportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbSmjerovi, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbPredavaci, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDodajUGrupu)
                                    .addComponent(jLabel4)
                                    .addComponent(btnObrisiIzGrupe))))
                        .addGap(136, 136, 136)
                        .addComponent(lblPolaznika)
                        .addGap(381, 381, 381))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dpDatumUpisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSpremiClana))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(slBrojPolaznika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnPromjena))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(dpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnDodaj))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnTrazi))
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(203, 203, 203)
                                        .addComponent(btnBrisanje))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMjesto)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTraziMjesto)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnJsonExport)))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(80, 80, 80))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dpDatumPocetka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDodaj))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel5)
                                        .addGap(21, 21, 21))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPromjena)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(cmbSmjerovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(slBrojPolaznika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblMjesto)
                                    .addComponent(btnTraziMjesto)
                                    .addComponent(btnJsonExport))
                                .addGap(25, 25, 25)
                                .addComponent(txtUvjet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPolaznika)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cmbPredavaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBrisanje)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(btnTrazi)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dpDatumUpisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSpremiClana)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnDodajUGrupu)
                                .addGap(38, 38, 38)
                                .addComponent(btnObrisiIzGrupe)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstEntitetiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEntitetiValueChanged
       if (evt.getValueIsAdjusting()) {
            return;
        }

        if (lstEntiteti.getSelectedValue() == null) {
            return;
        }

        obrada.setEntitet(lstEntiteti.getSelectedValue());
        
        var g= obrada.getEntitet();
        // nema potrebe za sljedećom linijom, piše se kao iznad
        //Grupa g = obrada.getEntitet();
        
        txtNaziv.setText(g.getNaziv());
        
        
        //Ukoliko nemate dvije identične instance
        // ovo neće proći
        cmbSmjerovi.setSelectedItem(g.getSmjer());
        
        
        //cmbPredavaci.setSelectedItem(g.getPredavac());
        DefaultComboBoxModel<Predavac> mp = 
                (DefaultComboBoxModel<Predavac>) 
                cmbPredavaci.getModel();
        for(int i=0;i<mp.getSize();i++){
            if(mp.getElementAt(i).getId().equals(g.getId())){
                cmbPredavaci.setSelectedIndex(i);
                break;
            }
        }
        
        if(g.getDatumPocetka()!=null) {
            dpDatumPocetka.setDate(g.getDatumPocetka().toInstant()
        .atZone(ZoneId.systemDefault()).toLocalDate());
        }else{
            dpDatumPocetka.setDate(null);
        }
        
        if(g.getBrojPolaznika()!=null) {
            slBrojPolaznika.setValue(g.getBrojPolaznika());
        }else{
            slBrojPolaznika.setValue(0);
        }
        
        
        
        DefaultListModel<Clan> m = new DefaultListModel<>();
        m.addAll(g.getPolaznici());
        lstPolazniciNaGrupi.setModel(m);
    }//GEN-LAST:event_lstEntitetiValueChanged

    private void slBrojPolaznikaStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_slBrojPolaznikaStateChanged
      lblPolaznika.setText(String.valueOf(slBrojPolaznika.getValue()));
    }//GEN-LAST:event_slBrojPolaznikaStateChanged

    private void btnTraziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziActionPerformed
        
        DefaultListModel<Polaznik> m = new DefaultListModel<>();
        m.addAll(obradaPolaznik.getPodaci(txtUvjet.getText()));
        lstPolazniciUSkoli.setModel(m);
        
        
        
    }//GEN-LAST:event_btnTraziActionPerformed

    private void btnDodajUGrupuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajUGrupuActionPerformed
        DefaultListModel<Clan> m;
        try {
            m=(DefaultListModel<Clan>) lstPolazniciNaGrupi.getModel();
            m.get(0).toString();
        } catch (Exception e) {
            m= new DefaultListModel<>();
            lstPolazniciNaGrupi.setModel(m);
        }
        boolean postoji;
       for(Polaznik p : lstPolazniciUSkoli.getSelectedValuesList()){
           postoji=false;
           for(int i=0;i<m.size();i++){
               if(p.getId().equals(m.get(i).getPolaznik().getId())){
                   postoji=true;
                   break;
               }
           }
           if(!postoji){
               Clan c = new Clan();
               c.setGrupa(lstEntiteti.getSelectedValue());
               c.setPolaznik(p);
               c.setDatumUpisa(new Date()); // pozvati forma koja nudi odabir datuma
               m.addElement(c);
           }
       }
        
        lstPolazniciNaGrupi.repaint();
    }//GEN-LAST:event_btnDodajUGrupuActionPerformed

    private void btnObrisiIzGrupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiIzGrupeActionPerformed
        DefaultListModel<Clan> m;
        try {
            m=(DefaultListModel<Clan>) lstPolazniciNaGrupi.getModel();
            m.get(0).toString();
        } catch (Exception e) {
           return;
        }
        
        for(Clan p : lstPolazniciNaGrupi.getSelectedValuesList()){
          
           for(int i=0;i<m.size();i++){
               if(p.getId().equals(m.get(i).getId())){
                   m.removeElementAt(i);
                   break;
               }
           }
          
       }
    }//GEN-LAST:event_btnObrisiIzGrupeActionPerformed

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed
        obrada.setEntitet(new Grupa());
        postaviVrijednostiNaEntitet();

        try {
            obrada.create();
            pocisti();
            ucitajEntitete(); //nije optimizirano. Bolje bi bilo samo taj novi dodati u listu
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getPoruka());
        }
    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
        if (obrada.getEntitet()==null || 
                obrada.getEntitet().getId() == null) {
            JOptionPane.showMessageDialog(rootPane, "Prvo odaberite stavku");
            return;
        }
        postaviVrijednostiNaEntitet();

        try {
            obrada.update();
            pocisti();
            ucitajEntitete();
        } catch (EdunovaException e) {
            JOptionPane.showMessageDialog(rootPane, e.getPoruka());
        }
    }//GEN-LAST:event_btnPromjenaActionPerformed

    private void btnBrisanjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrisanjeActionPerformed
        if (obrada.getEntitet()==null || 
                obrada.getEntitet().getId() == null) {
            JOptionPane.showMessageDialog(rootPane, "Prvo odaberite stavku");
            return;
        }

        try {
            obrada.delete();
            pocisti();
            ucitajEntitete();
        } catch (EdunovaException e) {
            JOptionPane.showMessageDialog(rootPane, e.getPoruka());
        }
    }//GEN-LAST:event_btnBrisanjeActionPerformed

    private void btnSpremiClanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSpremiClanaActionPerformed
        if (lstPolazniciNaGrupi.getSelectedValue() == null) {
            return;
        }
         Clan c = lstPolazniciNaGrupi.getSelectedValue();
         
          if(dpDatumUpisa.getDate()!=null){
           c.setDatumUpisa(
                   Date.from(dpDatumUpisa.getDate()
                           .atStartOfDay()
                   .atZone(ZoneId.systemDefault()).toInstant())
           );
       }
          
          try {
              obradaClan.setEntitet(c);
            obradaClan.update();
        } catch (EdunovaException e) {
              System.out.println(e.getPoruka());
        }
    }//GEN-LAST:event_btnSpremiClanaActionPerformed

    private void btnTraziMjestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraziMjestoActionPerformed
        new MjestoForma(this).setVisible(true);
    }//GEN-LAST:event_btnTraziMjestoActionPerformed

    private void lstPolazniciNaGrupiValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPolazniciNaGrupiValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        if (lstPolazniciNaGrupi.getSelectedValue() == null) {
            return;
        }
        
        Clan c = lstPolazniciNaGrupi.getSelectedValue();
        
         if(c.getDatumUpisa()!=null){
            dpDatumUpisa.setDate(c.getDatumUpisa().toInstant()
        .atZone(ZoneId.systemDefault()).toLocalDate());
       }else{
           dpDatumUpisa.setDate(null);
       }
    }//GEN-LAST:event_lstPolazniciNaGrupiValueChanged

    private void btnJsonExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJsonExportActionPerformed
        ExclusionStrategy strategija = new ExclusionStrategy() {
            @Override
            public boolean shouldSkipField(FieldAttributes fa) {
                
                if(fa.getDeclaredClass()==Smjer.class && fa.getName().equals("grupe")){
                    return true;
                }
                
                 if(fa.getDeclaredClass()==Grupa.class && fa.getName().equals("polaznici")){
                    return true;
                }
                 if(fa.getDeclaredClass()==Smjer.class && fa.getName().equals("operaterUnosa")){
                    return true;
                }
                 if(fa.getDeclaredClass()==Smjer.class && fa.getName().equals("operaterPromjene")){
                    return true;
                }
                 
                 if(fa.getDeclaredClass()==Grupa.class && fa.getName().equals("operaterUnosa")){
                    return true;
                }
                 if(fa.getDeclaredClass()==Grupa.class && fa.getName().equals("operaterPromjene")){
                    return true;
                }
                 
                 
                 if(fa.getDeclaredClass()==Polaznik.class && fa.getName().equals("operaterUnosa")){
                    return true;
                }
                 if(fa.getDeclaredClass()==Polaznik.class && fa.getName().equals("operaterPromjene")){
                    return true;
                }
                 
                 if(fa.getDeclaredClass()==Predavac.class && fa.getName().equals("operaterUnosa")){
                    return true;
                }
                 if(fa.getDeclaredClass()==Predavac.class && fa.getName().equals("operaterPromjene")){
                    return true;
                }
                 
                 
                 if(fa.getDeclaredClass()==Mjesto.class && fa.getName().equals("operaterUnosa")){
                    return true;
                }
                 if(fa.getDeclaredClass()==Mjesto.class && fa.getName().equals("operaterPromjene")){
                    return true;
                }
                 
                 
                 if(fa.getDeclaredClass()==Clan.class && fa.getName().equals("operaterUnosa")){
                    return true;
                }
                 if(fa.getDeclaredClass()==Clan.class && fa.getName().equals("operaterPromjene")){
                    return true;
                }
                 
                  if(fa.getDeclaredClass()==Operater.class && fa.getName().equals("operaterUnosa")){
                    return true;
                }
                 if(fa.getDeclaredClass()==Operater.class && fa.getName().equals("operaterPromjene")){
                    return true;
                }
                
                return false;
            }

            @Override
            public boolean shouldSkipClass(Class<?> type) {
                if(type==Operater.class){
                    return true;
                }
               return false;
            }
        };
        
        
        
        Gson gson = new GsonBuilder()
                .setExclusionStrategies(strategija)
                .setPrettyPrinting().create();
        JFileChooser jfc=new JFileChooser();
        jfc.setCurrentDirectory(
                new File(System.getProperty("user.home")));
        jfc.setSelectedFile(new File(System.getProperty("user.home") + 
                File.separator + "grupe.json"));
        
        if(jfc.showSaveDialog(this)==JFileChooser.APPROVE_OPTION){
            try {
                BufferedWriter bw = new BufferedWriter(
                new FileWriter(jfc.getSelectedFile(),StandardCharsets.UTF_8));
                bw.write(gson.toJson(obrada.getPodaci()));
                bw.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnJsonExportActionPerformed

    
    private void ucitajEntitete() {
        DefaultListModel<Grupa> m = new DefaultListModel<>();

        //m.addAll(obrada.getPodaci());
        System.out.println("Smjerovi na grupama");
        obrada.getPodaci().forEach(xxxx -> {
            m.addElement(xxxx);
            System.out.println(
                    xxxx.getSmjer().getNaziv() + ": " +
                    xxxx.getSmjer().hashCode());
        });

        lstEntiteti.setModel(m);
        
        
    }
    
    
     private void ucitajSmjerove() {
         
         DefaultComboBoxModel<Smjer> m =
                 new DefaultComboBoxModel<>();
         Smjer s=new Smjer();
         s.setId(-1L);
         s.setNaziv("Odaberite smjer");
         m.addElement(s);
         System.out.println("Smjerovi u CMB");
         new ObradaSmjer().getPodaci().forEach(sm->{
              m.addElement(sm);
              System.out.println(sm.getNaziv() + ": " + 
                      sm.hashCode());
         });
       
        

        cmbSmjerovi.setModel(m);
        cmbSmjerovi.setSelectedIndex(0);
        
    }
     
      private void ucitajPredavacee() {
         
         DefaultComboBoxModel<Predavac> m =
                 new DefaultComboBoxModel<>();
         
        m.addAll(new ObradaPredavac().getPodaci());
        

        cmbPredavaci.setModel(m);
        cmbPredavaci.setSelectedIndex(0);
        
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBrisanje;
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnDodajUGrupu;
    private javax.swing.JButton btnJsonExport;
    private javax.swing.JButton btnObrisiIzGrupe;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JButton btnSpremiClana;
    private javax.swing.JButton btnTrazi;
    private javax.swing.JButton btnTraziMjesto;
    private javax.swing.JComboBox<Predavac> cmbPredavaci;
    private javax.swing.JComboBox<Smjer> cmbSmjerovi;
    private com.github.lgooddatepicker.components.DatePicker dpDatumPocetka;
    private com.github.lgooddatepicker.components.DatePicker dpDatumUpisa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblMjesto;
    private javax.swing.JLabel lblPolaznika;
    private javax.swing.JList<Grupa> lstEntiteti;
    private javax.swing.JList<Clan> lstPolazniciNaGrupi;
    private javax.swing.JList<Polaznik> lstPolazniciUSkoli;
    private javax.swing.JSlider slBrojPolaznika;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtUvjet;
    // End of variables declaration//GEN-END:variables

    private void prilagodiDpDatumPocetka() {
        
        DatePickerSettings dps= new DatePickerSettings(
                new Locale("hr","HR"));
        dps.setFormatForDatesCommonEra("dd.MM.yyyy");
        dpDatumPocetka.setSettings(dps);
        
    }

    private void postaviVrijednostiNaEntitet() {
       var g = obrada.getEntitet();
       g.setNaziv(txtNaziv.getText());
       g.setPredavac((Predavac) cmbPredavaci.getSelectedItem());
       g.setSmjer((Smjer) cmbSmjerovi.getSelectedItem());
       g.setBrojPolaznika(slBrojPolaznika.getValue());
       if(dpDatumPocetka.getDate()!=null){
           g.setDatumPocetka(
                   Date.from(dpDatumPocetka.getDate()
                           .atStartOfDay()
                   .atZone(ZoneId.systemDefault()).toInstant())
           );
       }
       
       DefaultListModel<Clan> m;
        try {
            m=(DefaultListModel<Clan>) lstPolazniciNaGrupi.getModel();
            g.setPolaznici(new ArrayList<>());
            for(int i=0;i<m.getSize();i++){
                g.getPolaznici().add(m.get(i));
            }
        } catch (Exception e) {
           
        }
        
        g.setMjesto(odabranoMjesto);
       
       
    }

    private void pocisti() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void postaviOdabranoMjesto(Mjesto m) {
        odabranoMjesto=m;
        lblMjesto.setText(m.getNaziv());
        
    }
}
