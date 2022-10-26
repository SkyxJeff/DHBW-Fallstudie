package Seiten;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import LoginLogout.Login;
import Menü.Menü;

public class MeineDaten_Seite extends javax.swing.JPanel {
	 
	
	
    public MeineDaten_Seite() {
        initComponents();
        setOpaque(false);
        

       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	
    	 

        hintergrund_panel = new Komponenten.RundesPanel();
        überschrift_panel = new javax.swing.JLabel();
        vorname_label = new javax.swing.JLabel();
        nachname_label = new javax.swing.JLabel();
        personalnummer_label = new javax.swing.JLabel();
        anschrift_label = new javax.swing.JLabel();
        telefonnr_label = new javax.swing.JLabel();
        bürozimmernr_label = new javax.swing.JLabel();
        vorname_label_ausgabe = new javax.swing.JLabel();
        nachname_label_ausgabe = new javax.swing.JLabel();
        personalnummer_label_ausgabe = new javax.swing.JLabel();
        anschrift_label_ausgabe = new javax.swing.JLabel();
        telefonnr_label_ausgabe = new javax.swing.JLabel();
        bürozimmernr_label_ausgabe = new javax.swing.JLabel();
        tätigkeit_label = new javax.swing.JLabel();
        tätigkeit_label_ausgabe = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(785, 390));

        hintergrund_panel.setBackground(new java.awt.Color(50, 50, 50));

        überschrift_panel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        überschrift_panel.setForeground(new java.awt.Color(255, 255, 255));
        überschrift_panel.setText("Meine Daten");

        vorname_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        vorname_label.setForeground(new java.awt.Color(255, 255, 255));
        vorname_label.setText("Vorname:");

        nachname_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nachname_label.setForeground(new java.awt.Color(255, 255, 255));
        nachname_label.setText("Nachname:");

        personalnummer_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        personalnummer_label.setForeground(new java.awt.Color(255, 255, 255));
        personalnummer_label.setText("Personalnummer:");

        anschrift_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        anschrift_label.setForeground(new java.awt.Color(255, 255, 255));
        anschrift_label.setText("Anschrift:");

        telefonnr_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        telefonnr_label.setForeground(new java.awt.Color(255, 255, 255));
        telefonnr_label.setText("Telefon-Nr.:");

        bürozimmernr_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        bürozimmernr_label.setForeground(new java.awt.Color(255, 255, 255));
        bürozimmernr_label.setText("Bürozimmer-Nr.:");

        
        
        
        vorname_label_ausgabe.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        vorname_label_ausgabe.setForeground(new java.awt.Color(255, 255, 255));
        vorname_label_ausgabe.setText(Menü.Vorname);

        nachname_label_ausgabe.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nachname_label_ausgabe.setForeground(new java.awt.Color(255, 255, 255));
        nachname_label_ausgabe.setText(Menü.Nachname);

        personalnummer_label_ausgabe.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        personalnummer_label_ausgabe.setForeground(new java.awt.Color(255, 255, 255));
        personalnummer_label_ausgabe.setText(Login.username);

        anschrift_label_ausgabe.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        anschrift_label_ausgabe.setForeground(new java.awt.Color(255, 255, 255));
        anschrift_label_ausgabe.setText(Menü.Anschrift);

        telefonnr_label_ausgabe.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        telefonnr_label_ausgabe.setForeground(new java.awt.Color(255, 255, 255));
        telefonnr_label_ausgabe.setText(Menü.TelefonNr);

        bürozimmernr_label_ausgabe.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        bürozimmernr_label_ausgabe.setForeground(new java.awt.Color(255, 255, 255));
        bürozimmernr_label_ausgabe.setText(Menü.OfficeNr);

        tätigkeit_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tätigkeit_label.setForeground(new java.awt.Color(255, 255, 255));
        tätigkeit_label.setText("Tätigkeit:");

        tätigkeit_label_ausgabe.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        tätigkeit_label_ausgabe.setForeground(new java.awt.Color(255, 255, 255));
        tätigkeit_label_ausgabe.setText(Menü.Taetigkeit);

        javax.swing.GroupLayout hintergrund_panelLayout = new javax.swing.GroupLayout(hintergrund_panel);
        hintergrund_panel.setLayout(hintergrund_panelLayout);
        hintergrund_panelLayout.setHorizontalGroup(
            hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hintergrund_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(überschrift_panel)
                    .addGroup(hintergrund_panelLayout.createSequentialGroup()
                        .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vorname_label)
                            .addComponent(nachname_label)
                            .addComponent(personalnummer_label)
                            .addComponent(anschrift_label)
                            .addComponent(bürozimmernr_label)
                            .addComponent(tätigkeit_label)
                            .addComponent(telefonnr_label))
                        .addGap(59, 59, 59)
                        .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefonnr_label_ausgabe)
                            .addComponent(tätigkeit_label_ausgabe)
                            .addComponent(bürozimmernr_label_ausgabe)
                            .addComponent(anschrift_label_ausgabe)
                            .addComponent(personalnummer_label_ausgabe)
                            .addComponent(nachname_label_ausgabe)
                            .addComponent(vorname_label_ausgabe))))
                .addContainerGap(492, Short.MAX_VALUE))
        );
        hintergrund_panelLayout.setVerticalGroup(
            hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hintergrund_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(überschrift_panel)
                .addGap(18, 18, 18)
                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vorname_label)
                    .addComponent(vorname_label_ausgabe))
                .addGap(18, 18, 18)
                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nachname_label)
                    .addComponent(nachname_label_ausgabe))
                .addGap(18, 18, 18)
                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(personalnummer_label)
                    .addComponent(personalnummer_label_ausgabe))
                .addGap(18, 18, 18)
                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tätigkeit_label)
                    .addComponent(tätigkeit_label_ausgabe))
                .addGap(18, 18, 18)
                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anschrift_label)
                    .addComponent(anschrift_label_ausgabe))
                .addGap(18, 18, 18)
                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonnr_label)
                    .addComponent(telefonnr_label_ausgabe))
                .addGap(18, 18, 18)
                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bürozimmernr_label)
                    .addComponent(bürozimmernr_label_ausgabe))
                .addContainerGap(64, Short.MAX_VALUE))
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
    private javax.swing.JLabel anschrift_label;
    private javax.swing.JLabel anschrift_label_ausgabe;
    private javax.swing.JLabel bürozimmernr_label;
    private javax.swing.JLabel bürozimmernr_label_ausgabe;
    private Komponenten.RundesPanel hintergrund_panel;
    private javax.swing.JLabel nachname_label;
    private javax.swing.JLabel nachname_label_ausgabe;
    private javax.swing.JLabel personalnummer_label;
    private javax.swing.JLabel personalnummer_label_ausgabe;
    private javax.swing.JLabel telefonnr_label;
    private javax.swing.JLabel telefonnr_label_ausgabe;
    private javax.swing.JLabel tätigkeit_label;
    private javax.swing.JLabel tätigkeit_label_ausgabe;
    private javax.swing.JLabel vorname_label;
    private javax.swing.JLabel vorname_label_ausgabe;
    private javax.swing.JLabel überschrift_panel;
    // End of variables declaration//GEN-END:variables
}
