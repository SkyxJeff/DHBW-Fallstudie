package Seiten;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import LoginLogout.Login;
import Menue.Menue;

public class MeineDaten_Seite extends javax.swing.JPanel {
	 
	
	
    public MeineDaten_Seite() {
        initComponents();
        setOpaque(false);
        

       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    	
    	 

        hintergrund_panel = new Komponenten.RundesPanel();
        ueberschrift_panel = new javax.swing.JLabel();
        vorname_label = new javax.swing.JLabel();
        nachname_label = new javax.swing.JLabel();
        personalnummer_label = new javax.swing.JLabel();
        anschrift_label = new javax.swing.JLabel();
        telefonnr_label = new javax.swing.JLabel();
        buerozimmernr_label = new javax.swing.JLabel();
        vorname_label_ausgabe = new javax.swing.JLabel();
        nachname_label_ausgabe = new javax.swing.JLabel();
        personalnummer_label_ausgabe = new javax.swing.JLabel();
        anschrift_label_ausgabe = new javax.swing.JLabel();
        telefonnr_label_ausgabe = new javax.swing.JLabel();
        buerozimmernr_label_ausgabe = new javax.swing.JLabel();
        taetigkeit_label = new javax.swing.JLabel();
        taetigkeit_label_ausgabe = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(785, 390));

        hintergrund_panel.setBackground(new java.awt.Color(50, 50, 50));

        ueberschrift_panel.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        ueberschrift_panel.setForeground(new java.awt.Color(255, 255, 255));
        ueberschrift_panel.setText("Meine Daten");

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

        buerozimmernr_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        buerozimmernr_label.setForeground(new java.awt.Color(255, 255, 255));
        buerozimmernr_label.setText("Buerozimmer-Nr.:");

        
        
        
        vorname_label_ausgabe.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        vorname_label_ausgabe.setForeground(new java.awt.Color(255, 255, 255));
        vorname_label_ausgabe.setText(Menue.Vorname);

        nachname_label_ausgabe.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nachname_label_ausgabe.setForeground(new java.awt.Color(255, 255, 255));
        nachname_label_ausgabe.setText(Menue.Nachname);

        personalnummer_label_ausgabe.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        personalnummer_label_ausgabe.setForeground(new java.awt.Color(255, 255, 255));
        personalnummer_label_ausgabe.setText(Login.username);

        anschrift_label_ausgabe.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        anschrift_label_ausgabe.setForeground(new java.awt.Color(255, 255, 255));
        anschrift_label_ausgabe.setText(Menue.Anschrift);

        telefonnr_label_ausgabe.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        telefonnr_label_ausgabe.setForeground(new java.awt.Color(255, 255, 255));
        telefonnr_label_ausgabe.setText(Menue.TelefonNr);

        buerozimmernr_label_ausgabe.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        buerozimmernr_label_ausgabe.setForeground(new java.awt.Color(255, 255, 255));
        buerozimmernr_label_ausgabe.setText(Menue.OfficeNr);

        taetigkeit_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        taetigkeit_label.setForeground(new java.awt.Color(255, 255, 255));
        taetigkeit_label.setText("Tätigkeit:");

        taetigkeit_label_ausgabe.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        taetigkeit_label_ausgabe.setForeground(new java.awt.Color(255, 255, 255));
        taetigkeit_label_ausgabe.setText(Menue.Taetigkeit);

        javax.swing.GroupLayout hintergrund_panelLayout = new javax.swing.GroupLayout(hintergrund_panel);
        hintergrund_panel.setLayout(hintergrund_panelLayout);
        hintergrund_panelLayout.setHorizontalGroup(
            hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hintergrund_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ueberschrift_panel)
                    .addGroup(hintergrund_panelLayout.createSequentialGroup()
                        .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vorname_label)
                            .addComponent(nachname_label)
                            .addComponent(personalnummer_label)
                            .addComponent(anschrift_label)
                            .addComponent(buerozimmernr_label)
                            .addComponent(taetigkeit_label)
                            .addComponent(telefonnr_label))
                        .addGap(59, 59, 59)
                        .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(telefonnr_label_ausgabe)
                            .addComponent(taetigkeit_label_ausgabe)
                            .addComponent(buerozimmernr_label_ausgabe)
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
                .addComponent(ueberschrift_panel)
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
                    .addComponent(taetigkeit_label)
                    .addComponent(taetigkeit_label_ausgabe))
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
                    .addComponent(buerozimmernr_label)
                    .addComponent(buerozimmernr_label_ausgabe))
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
    private javax.swing.JLabel buerozimmernr_label;
    private javax.swing.JLabel buerozimmernr_label_ausgabe;
    private Komponenten.RundesPanel hintergrund_panel;
    private javax.swing.JLabel nachname_label;
    private javax.swing.JLabel nachname_label_ausgabe;
    private javax.swing.JLabel personalnummer_label;
    private javax.swing.JLabel personalnummer_label_ausgabe;
    private javax.swing.JLabel telefonnr_label;
    private javax.swing.JLabel telefonnr_label_ausgabe;
    private javax.swing.JLabel taetigkeit_label;
    private javax.swing.JLabel taetigkeit_label_ausgabe;
    private javax.swing.JLabel vorname_label;
    private javax.swing.JLabel vorname_label_ausgabe;
    private javax.swing.JLabel ueberschrift_panel;
    // End of variables declaration//GEN-END:variables
}
