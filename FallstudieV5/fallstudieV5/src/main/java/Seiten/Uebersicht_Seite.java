package Seiten;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import LoginLogout.Login;
import Menue.Menue;
public class Uebersicht_Seite extends javax.swing.JPanel {

    /**
	 * 
	 */
	int gruen;
	int gelb;
	int rot;
	
	public Uebersicht_Seite() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ampel_panel = new Komponenten.RundesPanel();
        ampel = new Ampel.Ampel();
        grenzwert_rot_label = new javax.swing.JLabel();
        grenzwert_gelb_label = new javax.swing.JLabel();
        grenzwert_gruen_label = new javax.swing.JLabel();
        daten_panel = new Komponenten.RundesPanel();
        heute_ist_panel = new Komponenten.RundesPanel();
        stunden_label1 = new javax.swing.JLabel();
        heute_ist_label = new javax.swing.JLabel();
        saldo_panel = new Komponenten.RundesPanel();
        stunden_label2 = new javax.swing.JLabel();
        saldo_label = new javax.swing.JLabel();
        woche_panel = new Komponenten.RundesPanel();
        stunden_label3 = new javax.swing.JLabel();
        woche_label = new javax.swing.JLabel();
        quartal_panel = new Komponenten.RundesPanel();
        stunden_label6 = new javax.swing.JLabel();
        quartal_label = new javax.swing.JLabel();
        jahr_panel = new Komponenten.RundesPanel();
        stunden_label5 = new javax.swing.JLabel();
        jahr_label = new javax.swing.JLabel();
        heute_soll_panel = new Komponenten.RundesPanel();
        stunden_label4 = new javax.swing.JLabel();
        heute_soll_label = new javax.swing.JLabel();
        willkommen_panel = new Komponenten.RundesPanel();
        willkommen_label = new javax.swing.JLabel();
        nachname_vorname_label = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(785, 390));

        ampel_panel.setBackground(new java.awt.Color(50, 50, 50));
        
        try {
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
        	String Gruen = ("SELECT Gruen FROM `gleitzeitgrenze` WHERE MitarbeiterID = '"+Login.username+"'");
        	String Gelb = ("SELECT Gelb FROM `gleitzeitgrenze` WHERE MitarbeiterID = '"+Login.username+"'");
        	String Rot = ("SELECT Rot FROM `gleitzeitgrenze` WHERE MitarbeiterID = '"+Login.username+"'");
        	String saldo = ("SELECT SUM(Saldo) FROM eintraege WHERE Mitarbeiter_ID = '"+Login.username+"'");
        	java.sql.PreparedStatement pst = con.prepareStatement(Gruen);
        	java.sql.PreparedStatement pst1 = con.prepareStatement(Gelb);
        	java.sql.PreparedStatement pst2 = con.prepareStatement(Rot);
        	java.sql.PreparedStatement pst3 = con.prepareStatement(saldo);
        	ResultSet rs = pst.executeQuery();
        	ResultSet rs1 = pst1.executeQuery();
        	ResultSet rs2 = pst2.executeQuery();
        	ResultSet rs3 = pst3.executeQuery();
        	rs.next();
        	rs1.next();
        	rs2.next();
        	rs3.next();
        	 gruen = Integer.parseInt(rs.getString(1));
        	 gelb = Integer.parseInt(rs1.getString(1));
        	 rot = Integer.parseInt(rs2.getString(1));
        	 float Saldo = rs3.getFloat(1);
        	 System.out.println(gruen);
        	 System.out.println(gelb);
        	 System.out.println(rot);
        	 System.out.println(Saldo);
        	 int Gleitzeit = (int) Saldo;
        	 
        	 if(Gleitzeit <= gruen)
        	 {
        		 grenzwert_gelb_label.setVisible(false);
        		 grenzwert_rot_label.setVisible(false);
        		 grenzwert_gruen_label.setVisible(true);
        		 grenzwert_gruen_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        	     grenzwert_gruen_label.setForeground(new java.awt.Color(255, 255, 255));
        	     grenzwert_gruen_label.setText("Perfekt");
        	     
        	 }
        	 else
        	 {
        		 if(Gleitzeit >gruen && Gleitzeit <=rot)
        		 {
        			 grenzwert_gelb_label.setVisible(true);
        			 grenzwert_gelb_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        		     grenzwert_gelb_label.setForeground(new java.awt.Color(255, 255, 255));
        		     grenzwert_gelb_label.setText("Achtung sie nähern sich der Gleitzeitgrenze");
            		 grenzwert_rot_label.setVisible(false);
            		 grenzwert_gruen_label.setVisible(false); 
        		 }
        		 else
        		 {
        			 grenzwert_gelb_label.setVisible(false);
            		 grenzwert_rot_label.setVisible(true);
            		 grenzwert_rot_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
            	     grenzwert_rot_label.setForeground(new java.awt.Color(255, 255, 255));
            	     grenzwert_rot_label.setText("Die Gleitzeit wird zu viel");
            		 grenzwert_gruen_label.setVisible(false);
        		 }
        	 }
        	
		} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Fehler!!!!!!!!!!!!!!");
					System.out.println(e);
		}

        javax.swing.GroupLayout ampel_panelLayout = new javax.swing.GroupLayout(ampel_panel);
        ampel_panel.setLayout(ampel_panelLayout);
        ampel_panelLayout.setHorizontalGroup(
            ampel_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ampel_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ampel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ampel_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grenzwert_rot_label)
                    .addComponent(grenzwert_gelb_label)
                    .addComponent(grenzwert_gruen_label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ampel_panelLayout.setVerticalGroup(
            ampel_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ampel_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ampel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ampel_panelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(grenzwert_rot_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(grenzwert_gelb_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(grenzwert_gruen_label)
                .addGap(15, 15, 15))
        );

        daten_panel.setBackground(new java.awt.Color(50, 50, 50));
        daten_panel.setPreferredSize(new java.awt.Dimension(500, 184));

        heute_ist_panel.setBackground(new java.awt.Color(102, 102, 102));
        heute_ist_panel.setPreferredSize(new java.awt.Dimension(109, 66));

        stunden_label1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        stunden_label1.setForeground(new java.awt.Color(255, 255, 255));
        stunden_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stunden_label1.setText(StundenUebersichtHeuteIst()); //Heute-Ist
        
        PopUp();
        
        heute_ist_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        heute_ist_label.setForeground(new java.awt.Color(255, 255, 255));
        heute_ist_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heute_ist_label.setText("Heute-Ist");

        javax.swing.GroupLayout heute_ist_panelLayout = new javax.swing.GroupLayout(heute_ist_panel);
        heute_ist_panel.setLayout(heute_ist_panelLayout);
        heute_ist_panelLayout.setHorizontalGroup(
            heute_ist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(heute_ist_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(heute_ist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stunden_label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(heute_ist_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        heute_ist_panelLayout.setVerticalGroup(
            heute_ist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(heute_ist_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stunden_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(heute_ist_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        saldo_panel.setBackground(new java.awt.Color(102, 102, 102));
        saldo_panel.setPreferredSize(new java.awt.Dimension(109, 66));

        stunden_label2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        stunden_label2.setForeground(new java.awt.Color(255, 255, 255));
        stunden_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stunden_label2.setText(StundenUebersichtSaldo());

        saldo_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        saldo_label.setForeground(new java.awt.Color(255, 255, 255));
        saldo_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saldo_label.setText("Saldo");

        javax.swing.GroupLayout saldo_panelLayout = new javax.swing.GroupLayout(saldo_panel);
        saldo_panel.setLayout(saldo_panelLayout);
        saldo_panelLayout.setHorizontalGroup(
            saldo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saldo_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(saldo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stunden_label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saldo_label, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addContainerGap())
        );
        saldo_panelLayout.setVerticalGroup(
            saldo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saldo_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stunden_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saldo_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        woche_panel.setBackground(new java.awt.Color(102, 102, 102));
        woche_panel.setPreferredSize(new java.awt.Dimension(109, 66));

        stunden_label3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        stunden_label3.setForeground(new java.awt.Color(255, 255, 255));
        stunden_label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stunden_label3.setText(GleitzeitproWoche());

        woche_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        woche_label.setForeground(new java.awt.Color(255, 255, 255));
        woche_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        woche_label.setText("Woche");

        javax.swing.GroupLayout woche_panelLayout = new javax.swing.GroupLayout(woche_panel);
        woche_panel.setLayout(woche_panelLayout);
        woche_panelLayout.setHorizontalGroup(
            woche_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(woche_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(woche_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stunden_label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(woche_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        woche_panelLayout.setVerticalGroup(
            woche_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(woche_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stunden_label3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(woche_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        quartal_panel.setBackground(new java.awt.Color(102, 102, 102));

        stunden_label6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        stunden_label6.setForeground(new java.awt.Color(255, 255, 255));
        stunden_label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stunden_label6.setText(GleitzeitproQuartal());

        quartal_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        quartal_label.setForeground(new java.awt.Color(255, 255, 255));
        quartal_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quartal_label.setText("Quartal");

        javax.swing.GroupLayout quartal_panelLayout = new javax.swing.GroupLayout(quartal_panel);
        quartal_panel.setLayout(quartal_panelLayout);
        quartal_panelLayout.setHorizontalGroup(
            quartal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quartal_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quartal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stunden_label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quartal_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        quartal_panelLayout.setVerticalGroup(
            quartal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quartal_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stunden_label6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quartal_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jahr_panel.setBackground(new java.awt.Color(102, 102, 102));
        jahr_panel.setPreferredSize(new java.awt.Dimension(109, 66));

        stunden_label5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        stunden_label5.setForeground(new java.awt.Color(255, 255, 255));
        stunden_label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stunden_label5.setText(GleitzeitproJahr());

        jahr_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jahr_label.setForeground(new java.awt.Color(255, 255, 255));
        jahr_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jahr_label.setText("Jahr");

        javax.swing.GroupLayout jahr_panelLayout = new javax.swing.GroupLayout(jahr_panel);
        jahr_panel.setLayout(jahr_panelLayout);
        jahr_panelLayout.setHorizontalGroup(
            jahr_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jahr_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jahr_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stunden_label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jahr_label, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
        );
        jahr_panelLayout.setVerticalGroup(
            jahr_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jahr_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stunden_label5)
                .addGap(6, 6, 6)
                .addComponent(jahr_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        heute_soll_panel.setBackground(new java.awt.Color(102, 102, 102));
        heute_soll_panel.setPreferredSize(new java.awt.Dimension(163, 66));

        stunden_label4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        stunden_label4.setForeground(new java.awt.Color(255, 255, 255));
        stunden_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stunden_label4.setText(StundenUebersichtSoll());

        heute_soll_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        heute_soll_label.setForeground(new java.awt.Color(255, 255, 255));
        heute_soll_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heute_soll_label.setText("Heute-Soll");

        javax.swing.GroupLayout heute_soll_panelLayout = new javax.swing.GroupLayout(heute_soll_panel);
        heute_soll_panel.setLayout(heute_soll_panelLayout);
        heute_soll_panelLayout.setHorizontalGroup(
            heute_soll_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(heute_soll_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(heute_soll_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stunden_label4, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(heute_soll_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        heute_soll_panelLayout.setVerticalGroup(
            heute_soll_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(heute_soll_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stunden_label4)
                .addGap(6, 6, 6)
                .addComponent(heute_soll_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout daten_panelLayout = new javax.swing.GroupLayout(daten_panel);
        daten_panel.setLayout(daten_panelLayout);
        daten_panelLayout.setHorizontalGroup(
            daten_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daten_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(daten_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saldo_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(heute_ist_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(daten_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(heute_soll_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(woche_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(daten_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quartal_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jahr_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                .addContainerGap())
        );
        daten_panelLayout.setVerticalGroup(
            daten_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daten_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(daten_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(heute_ist_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(heute_soll_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(quartal_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(daten_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saldo_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(woche_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jahr_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addContainerGap())
        );

        willkommen_panel.setBackground(new java.awt.Color(50, 50, 50));

        willkommen_label.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        willkommen_label.setForeground(new java.awt.Color(255, 255, 255));
        willkommen_label.setText("Willkommen im Zeiterfassungsportal der BBQ GmbH, \n");

        nachname_vorname_label.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        nachname_vorname_label.setForeground(new java.awt.Color(255, 255, 255));
        nachname_vorname_label.setText(Menue.Nachname+ ", " + Menue.Vorname );

        javax.swing.GroupLayout willkommen_panelLayout = new javax.swing.GroupLayout(willkommen_panel);
        willkommen_panel.setLayout(willkommen_panelLayout);
        willkommen_panelLayout.setHorizontalGroup(
            willkommen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(willkommen_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(willkommen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(willkommen_label)
                    .addComponent(nachname_vorname_label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        willkommen_panelLayout.setVerticalGroup(
            willkommen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(willkommen_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(willkommen_label)
                .addGap(18, 18, 18)
                .addComponent(nachname_vorname_label)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ampel_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(daten_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(willkommen_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(willkommen_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(daten_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(ampel_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
   
    public String StundenUebersichtHeuteIst() {
    	String leer = "00:00 Std.";
    	try {
    		String leer1 = "00:00 Std.";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
			String Beginn = ("Select Beginn,Pause,Ende from eintraege Where Datum = (SELECT MAX(Datum) FROM eintraege WHERE Mitarbeiter_ID = '"+Login.username+"') AND Mitarbeiter_ID = '"+Login.username+"';");
			String maxDatum = ("Select max(Datum) from `Eintraege` where `Mitarbeiter_ID` = '"+Login.username+"';");
			java.sql.PreparedStatement pst1 = con.prepareStatement(Beginn);
			java.sql.PreparedStatement pst2 = con.prepareStatement(maxDatum);
			ResultSet rs = pst1.executeQuery();
			ResultSet rs1 = pst2.executeQuery();
			rs.next();
			rs1.next();
			String beginn = rs.getString(1);
			String pause = rs.getString(2);
			String ende = rs.getString(3);
			int beginnhh = Integer.parseInt(beginn.substring(0,2));
			int beginnmin = Integer.parseInt(beginn.substring(3,5));
			String Date = rs1.getString(1);
			Calendar Cal = Calendar.getInstance();
			String Uhrzeit = ""+Cal.getTime();
			String uhrzeitnow = Uhrzeit.substring(11,16);
			String sechsuhr = "06:00";
			SimpleDateFormat format = new SimpleDateFormat("HH:mm");
			Date date1 = format.parse(beginn);
			Date date2 = format.parse(uhrzeitnow);
			Date date3 = format.parse(sechsuhr);
			Date date4 = format.parse(ende);
			String heuteIst;		
			LocalDate aktuellesDate = LocalDate.now(); 
			System.out.println(date4);
			System.out.println(date2);
			System.out.println(date1);
			
		    String aktuellesDatum = ""+aktuellesDate;
			if(Date.equals(aktuellesDatum)) {
				if(beginnhh<6) {
					heuteIst = ""+(date2.getTime() - date3.getTime())/36000;
				}else if((date2.getTime()-date4.getTime())>0 && !ende.equals("00:00") ){
					heuteIst = ""+(date4.getTime() - date1.getTime())/36000;
					System.out.println("Hier");
				} else {heuteIst = ""+(date2.getTime() - date1.getTime())/36000;System.out.println("Hallo");}	
				float heuteIst1 = Float.parseFloat(heuteIst);
				heuteIst1 = heuteIst1/100;
				System.out.println("Floatzahl heute ist: "+ heuteIst1);
	
				if(pause.equals("0,0")) {
					float heuteIst1NK = heuteIst1 - (int)heuteIst1;
					if((int)heuteIst1 > 6) {
						JOptionPane.showMessageDialog(null, "Bitte legen Sie eine Pause ein. Sind Sie Jugendlich, und Arbeiten zwischen 4,5 und 6 Stunden, haben Sie ein Anrecht auf 0,5h Pause. Bei mehr als 6 Stunden dürfen Sie 1h Pause machen."
								+ " Sind Sie Volljährig, haben Sie ein bei einer Arbeitszeit von 6-9h ein Anrecht auf 0,5h Pause. Arbeiten Sie mehr als 9 Stunden, erhöht sich die Pausenzeit auf 0,75h.");
					}
					String heuteIst1NK1 = ""+heuteIst1NK;
					System.out.println("keine Pause NK heuteISt:"+ heuteIst1NK1 );
					heuteIst1NK1 = heuteIst1NK1.substring(0,3);
					Float heuteIst1NK1float = Float.parseFloat(heuteIst1NK1);
					heuteIst1NK1float = heuteIst1NK1float*60;
					System.out.println("Keine Pause NK in Min: " + heuteIst1NK1float);
					String heuteIstdone = ""+(int)heuteIst1+":"+heuteIst1NK1float;
					Date heuteIstfertig = format.parse(heuteIstdone);
					heuteIstdone = ""+heuteIstfertig;
					heuteIstdone = heuteIstdone.substring(11,16)+" Std.";
					System.out.println("im format:" + heuteIstfertig);
					System.out.println("gesubbt:" + heuteIstdone);
					return heuteIstdone;
				} else {
					pause = pause.replace(",", ".");
					float pausefloat = Float.parseFloat(pause);
					if(pausefloat < 0.5) {JOptionPane.showMessageDialog(null,"Ihre Pause ist zu kurz, bitte machen Sie mind. 0,5h Pause.");}
					System.out.println("Pause: "+pausefloat);
					float heuteIst1NK = (heuteIst1-pausefloat) - ((int)(heuteIst1-pausefloat)); 
					String heuteIst1NK1 = ""+heuteIst1NK;
					heuteIst1NK1 = heuteIst1NK1.substring(0,3); //nackommas abschneiden
					Float heuteIst1NK1float = Float.parseFloat(heuteIst1NK1); //nackomma wieder zu float
					heuteIst1NK1float = heuteIst1NK1float*60; //nachkomma zu min
					String heuteIstdone = ""+((int)(heuteIst1-pausefloat))+":"+heuteIst1NK1float;//ausgabe
					Date heuteIstfertig = format.parse(heuteIstdone);
					heuteIstdone = ""+heuteIstfertig;
					heuteIstdone = heuteIstdone.substring(11,16)+" Std.";
					//heuteIstdone = heuteIstdone.replace(".", " ");
					System.out.println(heuteIstdone);
					//heuteIstdone = heuteIstdone.substring(0, 5);		
					//heuteIstdone = heuteIstdone+"  Std.";				
					return heuteIstdone;		
				}	
			}else {return leer1;}
				
			
    	} catch (ClassNotFoundException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Eingabe fehlgeschlagen4");
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Sie haben sich das erste Mal angemeldet, bitte speichern Sie sofort unter 'Meine Zeiten' einen Zeiteintrag.");
			try {
				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
				LocalDate Datumaktuell = LocalDate.now(); 
			    String DateAktuell = ""+Datumaktuell;
				String sql6 = ("Insert into eintraege (`Mitarbeiter_ID`, `Datum`, `Beginn`, `Pause`, `Ende`, `Art`,`KW`,`Quartal`, `Jahr`, `Saldo`) values ('"+Login.username+"','"+DateAktuell+"','00:00','0,0','00:00','-',0,0,0,0);");
				java.sql.PreparedStatement pst6 = con.prepareStatement(sql6);
				pst6.executeUpdate();
				
			} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}			
			e.printStackTrace();
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Eingabe fehlgeschlagen5");
			e.printStackTrace();
		}
		return leer;   	
    }
    
    public String StundenUebersichtSoll() {
    	
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
			String maxArbeitszeit = "Select maxArbeitszeitproTag from taetigkeit_bez where Bezeichnung = (Select Taetigkeit from Mitarbeiter where Mitarbeiter_ID = '"+Login.username+"');";
			java.sql.PreparedStatement pst1 = con.prepareStatement(maxArbeitszeit);
			ResultSet rs = pst1.executeQuery();
			rs.next();
			maxArbeitszeit = rs.getString(1);
			return maxArbeitszeit;
    		
    	} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {			
			e.printStackTrace();
		}	
    	return "00:00 Std.";
    }
    
    public String StundenUebersichtSaldo() {
    	String Saldo;
    	String Heuteist = StundenUebersichtHeuteIst();
    	String Soll = StundenUebersichtSoll();
    	System.out.println(Heuteist);
    	Heuteist = Heuteist.substring(0,5);
    	//float HeuteIst = Float.parseFloat(Heuteist);
    	System.out.println(Heuteist);
    	
    	SimpleDateFormat format = new SimpleDateFormat("HH:mm");
    	try {
			Date heuteist = format.parse(Heuteist);
			System.out.println(heuteist);
			Date soll = format.parse(Soll);
			System.out.println(soll);
			Saldo = ""+(soll.getTime()-heuteist.getTime())/36000;
			float Saldofloat = Float.parseFloat(Saldo);
			Saldofloat = (Saldofloat/100) * (-1);
			System.out.println(Saldofloat);
			insertSaldo(Saldofloat);
			float SaldofloatNK = Saldofloat - (int)Saldofloat;
			String SaldofloatNK1 = ""+SaldofloatNK;
			System.out.println(SaldofloatNK1);
			Float SaldofloatNK1float = Float.parseFloat(SaldofloatNK1);
			SaldofloatNK1float = (SaldofloatNK1float*60);
			System.out.println(SaldofloatNK1float);
			if(Saldofloat == 0) {
				return "00:00 Std.";	
			}	
			else {
			
			String Saldodone = ""+(int)Saldofloat+":"+SaldofloatNK1float;
			if((int)Saldofloat<=0) {
				Saldodone = ""+((int)Saldofloat * (-1))+":"+SaldofloatNK1float*(-1);
				Date saldo = format.parse(Saldodone);
				Saldodone = ""+saldo;
				Saldodone = "-"+Saldodone.substring(11,16)+" Std.";
				return Saldodone;
			}
			System.out.println(Saldodone);
			Date saldo = format.parse(Saldodone);
			System.out.println(saldo);
			Saldodone = ""+saldo;
			Saldodone = Saldodone.substring(11,16)+" Std.";
			System.out.println(Saldodone);
			return Saldodone;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
    	return "00:00 Std.";
    }
    
    public void insertSaldo(float Saldo) {
    	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
			String maxDatum = ("Select max(Datum) from `Eintraege` where `Mitarbeiter_ID` = '"+Login.username+"';");
			java.sql.PreparedStatement pst2 = con.prepareStatement(maxDatum);
			ResultSet rs1 = pst2.executeQuery();
			rs1.next();
			String maxDate = rs1.getString(1);
			LocalDate Datumaktuell = LocalDate.now(); 
		    String DateAktuell = ""+Datumaktuell;
			if(!maxDate.equals(DateAktuell)) {System.out.println("Wie Sie sehen, sehen Sie nichts.");}
			else {
			String updateSaldo = "Update eintraege set Saldo = '"+Saldo+"'Where Datum = '"+maxDate+"' AND Mitarbeiter_ID = '"+Login.username+"';";
			java.sql.PreparedStatement pst3 = con.prepareStatement(updateSaldo);
			pst3.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

    }
    
    public String GleitzeitproQuartal() {
		
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
			LocalDate Datumaktuell = LocalDate.now(); 
		    String DateAktuell = ""+Datumaktuell;
			String Quartal = "Select Quartal from eintraege Where Datum  = '"+DateAktuell+"' AND Mitarbeiter_ID = '"+Login.username+"';";
			java.sql.PreparedStatement pstQuartal = con.prepareStatement(Quartal);
			ResultSet rsQuartal = pstQuartal.executeQuery();
			rsQuartal.next();
			int QuartalInt = rsQuartal.getInt(1);
			String SaldoSummeQuartal = "Select sum(Saldo) from eintraege where Quartal = '"+QuartalInt+"' AND Mitarbeiter_ID = '"+Login.username+"';";
			java.sql.PreparedStatement pstQuartalSumme = con.prepareStatement(SaldoSummeQuartal);
			ResultSet rsQuartalSumme = pstQuartalSumme.executeQuery();
			rsQuartalSumme.next();
			Float SaldoSummeFloat = rsQuartalSumme.getFloat(1);
			System.out.println(SaldoSummeFloat+"Quartal");
			DecimalFormat df = new DecimalFormat("0.00");
			String SaldoFlaotSumme = ""+SaldoSummeFloat;
			SaldoFlaotSumme = df.format(SaldoSummeFloat);		
			SaldoFlaotSumme = SaldoFlaotSumme.replace(".", ",");
			String GleitzeitproQuartal = ""+SaldoFlaotSumme+" Std.";
			return GleitzeitproQuartal;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "0,0 Std.";
			
		} catch (SQLException e) {
			e.printStackTrace();
			return "0,0 Std.";
		}
	}
public String GleitzeitproWoche() {
		
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
			LocalDate Datumaktuell = LocalDate.now(); 
		    String DateAktuell = ""+Datumaktuell;
			String KW = "Select KW from eintraege Where Datum  = '"+DateAktuell+"' AND Mitarbeiter_ID = '"+Login.username+"';";
			java.sql.PreparedStatement pstKW = con.prepareStatement(KW);
			ResultSet rsKW = pstKW.executeQuery();
			rsKW.next();
			int KWInt = rsKW.getInt(1);
			String SaldoSummeKW = "Select sum(Saldo) from eintraege where KW = '"+KWInt+"' AND Mitarbeiter_ID = '"+Login.username+"';";
			java.sql.PreparedStatement pstKWSumme = con.prepareStatement(SaldoSummeKW);
			ResultSet rsKWSumme = pstKWSumme.executeQuery();
			rsKWSumme.next();
			Float SaldoSummeFloat = rsKWSumme.getFloat(1);
			String SaldoFlaotSumme = ""+SaldoSummeFloat;
			DecimalFormat df = new DecimalFormat("0.00");
			SaldoFlaotSumme = df.format(SaldoSummeFloat);		
			SaldoFlaotSumme = SaldoFlaotSumme.replace(".", ",");
			String GleitzeitproWoche = ""+SaldoFlaotSumme+" Std.";
			return GleitzeitproWoche;
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "0,0 Std.";
			
		} catch (SQLException e) {
			e.printStackTrace();
			return "0,0 Std.";
		}
	}

public String GleitzeitproJahr() {
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
		LocalDate Datumaktuell = LocalDate.now(); 
	    String DateAktuell = ""+Datumaktuell;
		String Jahr = "Select Jahr from eintraege Where Datum  = '"+DateAktuell+"' AND Mitarbeiter_ID = '"+Login.username+"';";
		java.sql.PreparedStatement pstJahr = con.prepareStatement(Jahr);
		ResultSet rsJahr = pstJahr.executeQuery();
		rsJahr.next();
		int JahrInt = rsJahr.getInt(1);
		String SaldoSummeJahr = "Select sum(Saldo) from eintraege where Jahr = '"+JahrInt+"' AND Mitarbeiter_ID = '"+Login.username+"';";
		java.sql.PreparedStatement pstJahrSumme = con.prepareStatement(SaldoSummeJahr);
		ResultSet rsJahrSumme = pstJahrSumme.executeQuery();
		rsJahrSumme.next();
		Float SaldoSummeFloat = rsJahrSumme.getFloat(1);
		System.out.println("Jahr: "+SaldoSummeFloat);
		String SaldoFlaotSumme = ""+SaldoSummeFloat;
		DecimalFormat df = new DecimalFormat("0.00");
		SaldoFlaotSumme = df.format(SaldoSummeFloat);		
		SaldoFlaotSumme = SaldoFlaotSumme.replace(".", ",");
		String GleitzeitproJahr = ""+SaldoFlaotSumme+" Std.";
		return GleitzeitproJahr;
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return "0,0 Std.";
		
	} catch (SQLException e) {
		e.printStackTrace();
		return "0,0 Std.";
	}
}
	public void PopUp() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
			String Beginn = ("Select Beginn from eintraege Where Datum = (SELECT MAX(Datum) FROM eintraege WHERE Mitarbeiter_ID = '"+Login.username+"') AND Mitarbeiter_ID = '"+Login.username+"';");
			java.sql.PreparedStatement pst1 = con.prepareStatement(Beginn);
			ResultSet rs = pst1.executeQuery();
			rs.next();
			String ArbZGmax = "Select ArbZGmax from mitarbeiter where Mitarbeiter_ID = '"+Login.username+"';";
			java.sql.PreparedStatement pst2 = con.prepareStatement(ArbZGmax);
			ResultSet rs1 = pst2.executeQuery();
			rs1.next();
			String beginn = rs.getString(1);
			int maxArbZG = rs1.getInt(1);
			String Heuteist = StundenUebersichtHeuteIst();
			String HeuteistStunden = Heuteist.substring(0,2);
			float HeuteistStundenfloat = Float.parseFloat(HeuteistStunden);
			int beginnhh = Integer.parseInt(beginn.substring(0,2));
			String sechsuhr = "06:00";
			SimpleDateFormat format = new SimpleDateFormat("HH:mm");
			Heuteist = Heuteist.substring(0,5);
			Date datebeginn = format.parse(beginn);
			Date datesechs = format.parse(sechsuhr);
			Date heute = format.parse(Heuteist);
			if(beginnhh < 6) {
			String heuteIstvor6 = ""+(heute.getTime() - (datesechs.getTime()-datebeginn.getTime())/36000);
			float heuteistvor6float = Float.parseFloat(heuteIstvor6);
			heuteistvor6float = heuteistvor6float/100;
			if( (int)heuteistvor6float >maxArbZG ) {
				
				JOptionPane.showMessageDialog(null, "Sie haben Ihre heutige Arbeitszeit lauft ArbZG überschritten, melden Sie dies bei Ihrem Vorgesetzen.");
			}
			
			}else if(HeuteistStundenfloat > maxArbZG) {
				JOptionPane.showMessageDialog(null, "Sie haben Ihre heutige Arbeitszeit lauft ArbZG überschritten, melden Sie dies bei Ihrem Vorgesetzen.");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Ampel.Ampel ampel;
    private Komponenten.RundesPanel ampel_panel;
    private Komponenten.RundesPanel daten_panel;
    private javax.swing.JLabel grenzwert_gelb_label;
    private javax.swing.JLabel grenzwert_gruen_label;
    private javax.swing.JLabel grenzwert_rot_label;
    private javax.swing.JLabel heute_ist_label;
    private Komponenten.RundesPanel heute_ist_panel;
    private javax.swing.JLabel heute_soll_label;
    private Komponenten.RundesPanel heute_soll_panel;
    private javax.swing.JLabel jahr_label;
    private Komponenten.RundesPanel jahr_panel;
    private javax.swing.JLabel nachname_vorname_label;
    private javax.swing.JLabel quartal_label;
    private Komponenten.RundesPanel quartal_panel;
    private javax.swing.JLabel saldo_label;
    private Komponenten.RundesPanel saldo_panel;
    private javax.swing.JLabel stunden_label1;
    private javax.swing.JLabel stunden_label2;
    private javax.swing.JLabel stunden_label3;
    private javax.swing.JLabel stunden_label4;
    private javax.swing.JLabel stunden_label5;
    private javax.swing.JLabel stunden_label6;
    private javax.swing.JLabel willkommen_label;
    private Komponenten.RundesPanel willkommen_panel;
    private javax.swing.JLabel woche_label;
    private Komponenten.RundesPanel woche_panel;
    // End of variables declaration//GEN-END:variables
}
