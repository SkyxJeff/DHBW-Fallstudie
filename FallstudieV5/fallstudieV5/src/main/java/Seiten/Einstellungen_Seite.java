package Seiten;

import java.awt.JobAttributes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import LoginLogout.Login;
import Passwort�ndern.Passwort;

public class Einstellungen_Seite extends javax.swing.JPanel {

	String gr�n;
	String gelb;
	String rot;

	
    public Einstellungen_Seite() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hintergrund_panel = new Komponenten.RundesPanel();
        �berschrift_label = new javax.swing.JLabel();
        sprache_label = new javax.swing.JLabel();
        sprache_combobox = new javax.swing.JComboBox<>();
        passwort�ndern_label = new javax.swing.JLabel();
        passwort�ndern_button = new javax.swing.JButton();
        grenzwerte_label = new javax.swing.JLabel();
        rotes_panel = new Komponenten.RundesPanel();
        gelbes_panel = new Komponenten.RundesPanel();
        gr�nes_panel = new Komponenten.RundesPanel();
        rot_grenzwert_textfeld = new javax.swing.JTextField();
        gelb_grenzwert_textfeld = new javax.swing.JTextField();
        gr�n_grenzwert_textfeld = new javax.swing.JTextField();
        speichern_button = new javax.swing.JButton();
        l�schen_button = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(742, 496));

        hintergrund_panel.setBackground(new java.awt.Color(50, 50, 50));

        �berschrift_label.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        �berschrift_label.setForeground(new java.awt.Color(255, 255, 255));
        �berschrift_label.setText("Einstellungen");

        sprache_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        sprache_label.setForeground(new java.awt.Color(255, 255, 255));
        sprache_label.setText("Sprache:");

        sprache_combobox.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        sprache_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deutsch", "English" }));
        sprache_combobox.setBorder(null);
        sprache_combobox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        passwort�ndern_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        passwort�ndern_label.setForeground(new java.awt.Color(255, 255, 255));
        passwort�ndern_label.setText("Passwort �ndern:");

        passwort�ndern_button.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        passwort�ndern_button.setText("Passwort �ndern");
        passwort�ndern_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwort�ndern_buttonActionPerformed(evt);
            }
        });

        grenzwerte_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        grenzwerte_label.setForeground(new java.awt.Color(255, 255, 255));
        grenzwerte_label.setText("Grenzwerte f�r die Ampel:");

        rotes_panel.setBackground(new java.awt.Color(255, 0, 0));
        rotes_panel.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout rotes_panelLayout = new javax.swing.GroupLayout(rotes_panel);
        rotes_panel.setLayout(rotes_panelLayout);
        rotes_panelLayout.setHorizontalGroup(
            rotes_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        rotes_panelLayout.setVerticalGroup(
            rotes_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        gelbes_panel.setBackground(new java.awt.Color(255, 255, 0));
        gelbes_panel.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout gelbes_panelLayout = new javax.swing.GroupLayout(gelbes_panel);
        gelbes_panel.setLayout(gelbes_panelLayout);
        gelbes_panelLayout.setHorizontalGroup(
            gelbes_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        gelbes_panelLayout.setVerticalGroup(
            gelbes_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );

        gr�nes_panel.setBackground(new java.awt.Color(51, 255, 0));
        gr�nes_panel.setPreferredSize(new java.awt.Dimension(35, 35));

        javax.swing.GroupLayout gr�nes_panelLayout = new javax.swing.GroupLayout(gr�nes_panel);
        gr�nes_panel.setLayout(gr�nes_panelLayout);
        gr�nes_panelLayout.setHorizontalGroup(
            gr�nes_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        gr�nes_panelLayout.setVerticalGroup(
            gr�nes_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 35, Short.MAX_VALUE)
        );
        
        try {
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
        	String Gr�n = ("SELECT Gr�n FROM `gleitzeitgrenze` WHERE MitarbeiterID = '"+Login.username+"'");
        	String Gelb = ("SELECT Gelb FROM `gleitzeitgrenze` WHERE MitarbeiterID = '"+Login.username+"'");
        	String Rot = ("SELECT Rot FROM `gleitzeitgrenze` WHERE MitarbeiterID = '"+Login.username+"'");
        	java.sql.PreparedStatement pst = con.prepareStatement(Gr�n);
        	java.sql.PreparedStatement pst1 = con.prepareStatement(Gelb);
        	java.sql.PreparedStatement pst2 = con.prepareStatement(Rot);
        	ResultSet rs = pst.executeQuery();
        	ResultSet rs1 = pst1.executeQuery();
        	ResultSet rs2 = pst2.executeQuery();
        	rs.next();
        	rs1.next();
        	rs2.next();
        	 gr�n = String.valueOf(rs.getString(1));
        	 gelb = String.valueOf(rs1.getString(1));
        	 rot = String.valueOf(rs2.getString(1));
		} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Geht nicht");
					
		}

        rot_grenzwert_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        rot_grenzwert_textfeld.setBorder(null);
        rot_grenzwert_textfeld.setText(rot);

        gelb_grenzwert_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        gelb_grenzwert_textfeld.setBorder(null);
        gelb_grenzwert_textfeld.setText(gelb);
        
        gr�n_grenzwert_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        gr�n_grenzwert_textfeld.setBorder(null);
        gr�n_grenzwert_textfeld.setText(gr�n);
        

        speichern_button.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        speichern_button.setText("Speichern");
        speichern_button.setBorder(null);
        speichern_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speichern_buttonActionPerformed(evt);
            }
        });

        l�schen_button.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        l�schen_button.setText("L�schen");
        l�schen_button.setBorder(null);
        l�schen_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                l�schen_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hintergrund_panelLayout = new javax.swing.GroupLayout(hintergrund_panel);
        hintergrund_panel.setLayout(hintergrund_panelLayout);
        hintergrund_panelLayout.setHorizontalGroup(
            hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hintergrund_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(�berschrift_label)
                    .addGroup(hintergrund_panelLayout.createSequentialGroup()
                        .addComponent(sprache_label)
                        .addGap(18, 18, 18)
                        .addComponent(sprache_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hintergrund_panelLayout.createSequentialGroup()
                        .addComponent(passwort�ndern_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwort�ndern_button))
                    .addGroup(hintergrund_panelLayout.createSequentialGroup()
                        .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(hintergrund_panelLayout.createSequentialGroup()
                                .addComponent(grenzwerte_label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rotes_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(gelbes_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gr�nes_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(gelb_grenzwert_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(hintergrund_panelLayout.createSequentialGroup()
                                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rot_grenzwert_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(gr�n_grenzwert_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(116, 116, 116)
                                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l�schen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(speichern_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        hintergrund_panelLayout.setVerticalGroup(
            hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hintergrund_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(�berschrift_label)
                .addGap(18, 18, 18)
                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sprache_label)
                    .addComponent(sprache_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwort�ndern_label)
                    .addComponent(passwort�ndern_button))
                .addGap(29, 29, 29)
                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(hintergrund_panelLayout.createSequentialGroup()
                        .addComponent(grenzwerte_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gr�n_grenzwert_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(hintergrund_panelLayout.createSequentialGroup()
                        .addComponent(rotes_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gelbes_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hintergrund_panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rot_grenzwert_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speichern_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(l�schen_button, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(gr�nes_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gelb_grenzwert_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(154, 195, Short.MAX_VALUE))
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

    private void passwort�ndern_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwort�ndern_buttonActionPerformed
        new Passwort().setVisible(true);
    }//GEN-LAST:event_passwort�ndern_buttonActionPerformed

    private void speichern_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speichern_buttonActionPerformed
  	
    
    }//GEN-LAST:event_speichern_buttonActionPerformed

    private void l�schen_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_l�schen_buttonActionPerformed
        rot_grenzwert_textfeld.setText("");
        gelb_grenzwert_textfeld.setText(""); 
        gr�n_grenzwert_textfeld.setText("");
    }//GEN-LAST:event_l�schen_buttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField gelb_grenzwert_textfeld;
    private Komponenten.RundesPanel gelbes_panel;
    private javax.swing.JLabel grenzwerte_label;
    private javax.swing.JTextField gr�n_grenzwert_textfeld;
    private Komponenten.RundesPanel gr�nes_panel;
    private Komponenten.RundesPanel hintergrund_panel;
    private javax.swing.JButton l�schen_button;
    private javax.swing.JButton passwort�ndern_button;
    private javax.swing.JLabel passwort�ndern_label;
    private javax.swing.JTextField rot_grenzwert_textfeld;
    private Komponenten.RundesPanel rotes_panel;
    private javax.swing.JButton speichern_button;
    private javax.swing.JComboBox<String> sprache_combobox;
    private javax.swing.JLabel sprache_label;
    private javax.swing.JLabel �berschrift_label;
    // End of variables declaration//GEN-END:variables
}
