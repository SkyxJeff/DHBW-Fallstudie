package Seiten;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Eintraege_Seite extends javax.swing.JPanel {

    //Initialisierung des Konstruktors
    // Aufruf der Komponenten
    public Eintraege_Seite() {
        initComponents();
        setOpaque(false);
        eintraege_tabelle.addTableStyle(jScrollPane1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        //Initialisierung der Komponenten
        hintergrund_panel = new Komponenten.RundesPanel();
        Ueberschrift_label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        eintraege_tabelle = new Tabelle.Table();

        hintergrund_panel.setBackground(new java.awt.Color(50, 50, 50));

        Ueberschrift_label.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Ueberschrift_label.setForeground(new java.awt.Color(255, 255, 255));
        Ueberschrift_label.setText("Einträge");

        jScrollPane1.setBackground(new java.awt.Color(50, 50, 50));
        jScrollPane1.setBorder(null);





        javax.swing.GroupLayout hintergrund_panelLayout = new javax.swing.GroupLayout(hintergrund_panel);
        hintergrund_panel.setLayout(hintergrund_panelLayout);
        hintergrund_panelLayout.setHorizontalGroup(
            hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hintergrund_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hintergrund_panelLayout.createSequentialGroup()
                        .addComponent(Ueberschrift_label)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE))
                .addContainerGap())
        );
        hintergrund_panelLayout.setVerticalGroup(
            hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hintergrund_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ueberschrift_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hintergrund_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hintergrund_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Tabelle.Table eintraege_tabelle;
    private Komponenten.RundesPanel hintergrund_panel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel Ueberschrift_label;
    // End of variables declaration//GEN-END:variables
}
