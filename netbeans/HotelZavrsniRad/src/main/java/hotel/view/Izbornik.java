/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Mativel
 */
public class Izbornik extends javax.swing.JFrame {

    /**
     * Creates new form Izbornik
     */
    public Izbornik() {
        initComponents();
        setTitle(Aplikacija.NASLOV_APP + " " + 
                Aplikacija.djelatnik.getImePrezime());
        new Vrijeme().start();
    }

    private class Vrijeme extends Thread {

        private SimpleDateFormat df = 
                new SimpleDateFormat("dd. MMMM YYYY. HH:mm:ss");
        
        
        @Override
        public void run() {
            while (true) {
                lblVrijeme.setText(df.format(new Date()));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
                
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jToolBar1 = new javax.swing.JToolBar();
        lblVrijeme = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmProgrami = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jmOnama = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);
        jToolBar1.setMaximumSize(new java.awt.Dimension(48, 16));
        jToolBar1.setMinimumSize(new java.awt.Dimension(48, 16));
        jToolBar1.setPreferredSize(new java.awt.Dimension(48, 16));

        lblVrijeme.setText("Vrijeme");
        jToolBar1.add(lblVrijeme);

        jmProgrami.setText("Programi");
        jmProgrami.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmProgramiActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Boravci");
        jmProgrami.add(jMenuItem1);

        jMenuItem2.setText("Gosti");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jmProgrami.add(jMenuItem2);

        jMenuItem3.setText("Usluge");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmProgrami.add(jMenuItem3);

        jMenuItem4.setText("Djelatnici");
        jmProgrami.add(jMenuItem4);

        jMenuItem5.setText("Izlaz");
        jmProgrami.add(jMenuItem5);

        jMenuBar1.add(jmProgrami);

        jmOnama.setText("O nama");
        jmOnama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmOnamaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmOnama);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 253, Short.MAX_VALUE)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmProgramiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmProgramiActionPerformed
        
    }//GEN-LAST:event_jmProgramiActionPerformed

    private void jmOnamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmOnamaMouseClicked
        Date d = new Date();
        SimpleDateFormat df = new SimpleDateFormat("YYYY");
        JOptionPane.showMessageDialog(rootPane, 
                "© " + Aplikacija.Velimir + 
                        " 2020 - " + df.format(d));
    }//GEN-LAST:event_jmOnamaMouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new UslugaForma().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new GostForma().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenu jmOnama;
    private javax.swing.JMenu jmProgrami;
    private javax.swing.JLabel lblVrijeme;
    // End of variables declaration//GEN-END:variables
}
