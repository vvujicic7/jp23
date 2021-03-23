/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23.view;

import edunova.jp23.controller.ObradaGrupa;
import edunova.jp23.controller.ObradaPredavac;
import edunova.jp23.controller.ObradaSmjer;
import edunova.jp23.model.Grupa;
import edunova.jp23.model.Polaznik;
import edunova.jp23.model.Predavac;
import edunova.jp23.model.Smjer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

/**
 *
 * @author Mativel
 */
public class GrupaForma extends javax.swing.JFrame {

    private ObradaGrupa obrada;
    /**
     * Creates new form GrupaForma
     */
    public GrupaForma() {
        initComponents();
        obrada = new ObradaGrupa();
        setTitle(Aplikacija.NASLOV_APP + " Grupe");
        ucitajEntitete();
        ucitajSmjerove();
        ucitajPredavacee();
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

        jScrollPane2.setViewportView(lstPolazniciNaGrupi);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(cmbSmjerovi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNaziv)
                    .addComponent(cmbPredavaci, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSmjerovi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbPredavaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)))
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
        
        
        DefaultListModel<Polaznik> m = new DefaultListModel<>();
        m.addAll(g.getPolaznici());
        lstPolazniciNaGrupi.setModel(m);
    }//GEN-LAST:event_lstEntitetiValueChanged

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
    private javax.swing.JComboBox<Predavac> cmbPredavaci;
    private javax.swing.JComboBox<Smjer> cmbSmjerovi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<Grupa> lstEntiteti;
    private javax.swing.JList<Polaznik> lstPolazniciNaGrupi;
    private javax.swing.JTextField txtNaziv;
    // End of variables declaration//GEN-END:variables
}
