/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edunova.jp23.view;

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
                Aplikacija.operater.getImePrezime());
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

        Vrijeme = new javax.swing.JToolBar();
        lblVrijeme = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Programi = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        Onama = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Vrijeme.setRollover(true);

        lblVrijeme.setText("vrijeme");
        Vrijeme.add(lblVrijeme);

        Programi.setText("Programi");

        jMenuItem1.setText("Smjerovi");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Programi.add(jMenuItem1);

        jMenuItem2.setText("Polaznici");
        Programi.add(jMenuItem2);

        jMenuItem3.setText("Predavači");
        Programi.add(jMenuItem3);

        jMenuItem4.setText("Grupe");
        Programi.add(jMenuItem4);

        jMenuItem5.setText("Izlaz");
        Programi.add(jMenuItem5);

        jMenuBar1.add(Programi);

        Onama.setText("O nama");
        Onama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OnamaMouseClicked(evt);
            }
        });
        jMenuBar1.add(Onama);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Vrijeme, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 253, Short.MAX_VALUE)
                .addComponent(Vrijeme, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void OnamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OnamaMouseClicked
        Date d = new Date();
        SimpleDateFormat df = new SimpleDateFormat("YYYY");
        JOptionPane.showMessageDialog(rootPane,
                "© " + Aplikacija.NASLOV_APP + 
                        " 2020 - " + df.format(d));
    }//GEN-LAST:event_OnamaMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new SmjerForma().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Onama;
    private javax.swing.JMenu Programi;
    private javax.swing.JToolBar Vrijeme;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JLabel lblVrijeme;
    // End of variables declaration//GEN-END:variables
}