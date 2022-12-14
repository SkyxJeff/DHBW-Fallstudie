package Seiten;

import LoginLogout.LoginEng;
import Menue.MenueEng;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//Genauso wie in Übersichtseite, nur für die Englische Seite
public class Uebersicht_SeiteEng extends javax.swing.JPanel {

    /**
	 *
	 */
	int gruen;
	int gelb;
	int rot;

	public Uebersicht_SeiteEng() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ampel_panel = new Komponenten.RundesPanel();
        ampel = new Ampel.AmpelEng();
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
        	String Gruen = ("SELECT Gruen FROM `gleitzeitgrenze` WHERE MitarbeiterID = '"+LoginEng.username+"'");
        	String Gelb = ("SELECT Gelb FROM `gleitzeitgrenze` WHERE MitarbeiterID = '"+LoginEng.username+"'");
        	String Rot = ("SELECT Rot FROM `gleitzeitgrenze` WHERE MitarbeiterID = '"+LoginEng.username+"'");
        	String saldo = ("SELECT SUM(Saldo) FROM eintraege WHERE Mitarbeiter_ID = '"+LoginEng.username+"'");
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
        	 if(Saldo <= gruen)
        	 {
        		 grenzwert_gelb_label.setVisible(false);
        		 grenzwert_rot_label.setVisible(false);
        		 grenzwert_gruen_label.setVisible(true);
        		 grenzwert_gruen_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        	     grenzwert_gruen_label.setForeground(new java.awt.Color(255, 255, 255));
        	     grenzwert_gruen_label.setText("Everything's fine.");
        	     
        	 }
        	 else
        	 {
        		 if(Saldo >gruen && Saldo <=rot)
        		 {
        			 grenzwert_gelb_label.setVisible(true);
        			 grenzwert_gelb_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        		     grenzwert_gelb_label.setForeground(new java.awt.Color(255, 255, 255));
        		     grenzwert_gelb_label.setText("Reminder: You are getting close to your overtime limit.");
            		 grenzwert_rot_label.setVisible(false);
            		 grenzwert_gruen_label.setVisible(false); 
        		 }
        		 else
        		 {
        			 grenzwert_gelb_label.setVisible(false);
            		 grenzwert_rot_label.setVisible(true);
            		 grenzwert_rot_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
            	     grenzwert_rot_label.setForeground(new java.awt.Color(255, 255, 255));
            	     grenzwert_rot_label.setText("Your overtime limit was reached.");
            		 grenzwert_gruen_label.setVisible(false);
        		 }
        	 }
        	
		} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Database connection failed");
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
        heute_ist_label.setText("Today is");

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
        saldo_label.setText("Summary");

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
        woche_label.setText("Month");

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
        quartal_label.setText("Quarter");

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
        jahr_label.setText("Year");

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
        heute_soll_label.setText("Today should");

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
        willkommen_label.setText("Welcome in the Time Management Tool of the BBQ GmbH, \n");

        nachname_vorname_label.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        nachname_vorname_label.setForeground(new java.awt.Color(255, 255, 255));
        nachname_vorname_label.setText(MenueEng.Nachname+ ", " + MenueEng.Vorname );

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
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
            String Beginn = ("Select Beginn,Pause,Ende from eintraege Where Datum = (SELECT MAX(Datum) FROM eintraege WHERE Mitarbeiter_ID = '"+LoginEng.username+"') AND Mitarbeiter_ID = '"+LoginEng.username+"';");
            String maxDatum = ("Select max(Datum) from `Eintraege` where `Mitarbeiter_ID` = '"+LoginEng.username+"';");
            String age  = "Select Age from mitarbeiter where Mitarbeiter_ID = '"+LoginEng.username+"';";
            java.sql.PreparedStatement pst1 = con.prepareStatement(Beginn);
            java.sql.PreparedStatement pst2 = con.prepareStatement(maxDatum);
            java.sql.PreparedStatement pstage = con.prepareStatement(age);
            ResultSet rs = pst1.executeQuery();
            ResultSet rs1 = pst2.executeQuery();
            ResultSet rsAge = pstage.executeQuery();
            rs.next();
            rs1.next();
            rsAge.next();
            String beginn = rs.getString(1);
            String pause = rs.getString(2);
            String ende = rs.getString(3);
            int Age = rsAge.getInt(1);
            int beginnhh = Integer.parseInt(beginn.substring(0,2));
            int beginnmin = Integer.parseInt(beginn.substring(3,5));
            int endehh = Integer.parseInt(ende.substring(0,2));
            String Date = rs1.getString(1);
            Calendar Cal = Calendar.getInstance();
            String Uhrzeit = ""+Cal.getTime();
            String uhrzeitnow = Uhrzeit.substring(11,16);
            String sechsuhr = "06:00";
            String zzwanziguhr = "22:00";
            SimpleDateFormat format = new SimpleDateFormat("HH:mm");
            Date date1 = format.parse(beginn);
            Date date2 = format.parse(uhrzeitnow);
            Date date3 = format.parse(sechsuhr);
            Date date4 = format.parse(ende);
            Date date22 = format.parse(zzwanziguhr);
            String heuteIst;
            LocalDate aktuellesDate = LocalDate.now();
            String aktuellesDatum = ""+aktuellesDate;
            if(Date.equals(aktuellesDatum)) {
                if(beginnhh == 0) {heuteIst = "0";}
                else if(beginnhh<6 && endehh<22) {
                    if((date2.getTime()-date4.getTime())>0) {
                        heuteIst = ""+(date4.getTime()-date3.getTime())/36000;
                    }else {heuteIst = ""+(date2.getTime() - date3.getTime())/36000;}
                }else if((date2.getTime()-date4.getTime())>0 && date4.getTime()!= (-3600000) ){
                    heuteIst = ""+(date4.getTime() - date1.getTime())/36000;
                } else if(endehh > 22 && beginnhh > 6){
                    heuteIst = ""+(date22.getTime()-date1.getTime())/36000;
                } else if(endehh >22 && beginnhh < 6){heuteIst = ""+(date22.getTime()-date3.getTime())/36000;}
                else {heuteIst = ""+(date2.getTime() - date1.getTime())/36000;System.out.println("Hallo");}
                float heuteIst1 = Float.parseFloat(heuteIst);
                heuteIst1 = heuteIst1/100;
                if(pause.equals("0,0")) {
                    float heuteIst1NK = heuteIst1 - (int)heuteIst1;
                    String pausezeit = "0,0";
                    if((int)heuteIst1 > 9) {
                        if(Age >18) {pausezeit = "0,75";JOptionPane.showMessageDialog(null,"The tool automatically added 0,75 hrs of break time to your working hours, please take a break.");}
                        JOptionPane.showMessageDialog(null,"You have worked too much.");
                    } else if((int)heuteIst1 >6) {
                        if(Age >18 ) {pausezeit = "0,5";JOptionPane.showMessageDialog(null,"The tool automatically added 0,5 hrs of break time to your working hours, please take a break.");} else {pausezeit = "1,0";JOptionPane.showMessageDialog(null,"The tool automatically added 1 hrs of break time to your working hours, please take a break.");} }
                    else if((int)heuteIst1 <6 && heuteIst1 > 4.5 && Age < 18) {pausezeit = "0,5";JOptionPane.showMessageDialog(null,"The tool automatically added 0,5 hrs of break time to your working hours, please take a break.");} else {System.out.println("Waddup");}
                    String pauseEintragen6h = "Update eintraege set Pause = '"+pausezeit+"' where Datum = '"+aktuellesDatum+"' and Mitarbeiter_ID = '"+LoginEng.username+"';";
                    java.sql.PreparedStatement pstPauseEintrag6h = con.prepareStatement(pauseEintragen6h);
                    pstPauseEintrag6h.executeUpdate();
                    String heuteIst1NK1 = ""+heuteIst1NK;
                    heuteIst1NK1 = heuteIst1NK1.substring(0,3);
                    Float heuteIst1NK1float = Float.parseFloat(heuteIst1NK1);
                    heuteIst1NK1float = heuteIst1NK1float*60;
                    String heuteIstdone = ""+(int)heuteIst1+":"+heuteIst1NK1float;
                    Date heuteIstfertig = format.parse(heuteIstdone);
                    heuteIstdone = ""+heuteIstfertig;
                    heuteIstdone = heuteIstdone.substring(11,16)+" Std.";
                    return heuteIstdone;
                } else {
                    pause = pause.replace(",", ".");
                    float pausefloat = Float.parseFloat(pause);
                    String pausezeit = ""+pausefloat;
                    if((int)heuteIst1 > 9) {
                        if(Age >18 && pausefloat <0.75) {pausezeit = "0,75";JOptionPane.showMessageDialog(null,"The tool automatically added 0,75 hrs of break time to your working hours, please take a break.");}
                        JOptionPane.showMessageDialog(null,"You are working too much.");
                    } else if((int)heuteIst1 >6) {
                        if(Age <18 && pausefloat<0.5 ) {pausezeit = "0,5"; JOptionPane.showMessageDialog(null,"The tool automatically added 0,5 hrs of break time to your working hours, please take a break.");} else if (Age<18 && pausefloat <1.0) {JOptionPane.showMessageDialog(null,"The tool automatically added 1 hrs of break time to your working hours, please take a break.");} }
                    else if((int)heuteIst1 <6 && heuteIst1 > 4.5 && Age < 18 && pausefloat < 0.5) {pausezeit = "0,5"; JOptionPane.showMessageDialog(null,"The tool automatically added 0,5 hrs of break time to your working hours, please take a break.");} else {System.out.println("Waddup");}
                    String pauseEintragen6h = "Update eintraege set Pause = '"+pausezeit+"' where Datum = '"+aktuellesDatum+"' and Mitarbeiter_ID = '"+LoginEng.username+"';";
                    java.sql.PreparedStatement pstPauseEintrag6h = con.prepareStatement(pauseEintragen6h);
                    pstPauseEintrag6h.executeUpdate();
                    float heuteIst1NK = (heuteIst1-pausefloat) - ((int)(heuteIst1-pausefloat));
                    String heuteIst1NK1 = ""+heuteIst1NK;
                    heuteIst1NK1 = heuteIst1NK1.substring(0,3); //nackommas abschneiden
                    Float heuteIst1NK1float = Float.parseFloat(heuteIst1NK1); //nackomma wieder zu float
                    heuteIst1NK1float = heuteIst1NK1float*60; //nachkomma zu min
                    String heuteIstdone = ""+((int)(heuteIst1-pausefloat))+":"+heuteIst1NK1float;//ausgabe
                    Date heuteIstfertig = format.parse(heuteIstdone);
                    heuteIstdone = ""+heuteIstfertig;
                    heuteIstdone = heuteIstdone.substring(11,16)+" Std.";
                    return heuteIstdone;
                }
            }else {return leer1;}
        }  catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "You have logged in for the first time, please save an entry in 'My working hours'.");
            try {
                //Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
                LocalDate Datumaktuell = LocalDate.now();
                String DateAktuell = ""+Datumaktuell;
                String sql6 = ("Insert into eintraege (`Mitarbeiter_ID`, `Datum`, `Beginn`, `Pause`, `Ende`, `Art`,`KW`,`Quartal`, `Jahr`, `Saldo`) values ('"+LoginEng.username+"','"+DateAktuell+"','00:00','0,0','00:00','-',0,0,0,0);");
                java.sql.PreparedStatement pst6 = con.prepareStatement(sql6);
                pst6.executeUpdate();
            } catch (SQLException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(null, "Entry failed. Error: 5");
            e.printStackTrace();
        }
        return leer;
    }
    public String StundenUebersichtSoll() {
    	try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
			String maxArbeitszeit = "Select maxArbeitszeitproTag from taetigkeit_bez where Bezeichnung = (Select Taetigkeit from Mitarbeiter where Mitarbeiter_ID = '"+LoginEng.username+"');";
			java.sql.PreparedStatement pst1 = con.prepareStatement(maxArbeitszeit);
			ResultSet rs = pst1.executeQuery();
			rs.next();
			maxArbeitszeit = rs.getString(1);
			return maxArbeitszeit;
    	}  catch (SQLException e) {
			e.printStackTrace();
		}
    	return "00:00 Std.";
    }
    public String StundenUebersichtSaldo() {
        String Saldo;
        String Heuteist = StundenUebersichtHeuteIst();
        String Soll = StundenUebersichtSoll();
        Heuteist = Heuteist.substring(0,5);
        SimpleDateFormat format = new SimpleDateFormat("HH:mm");
        try {
            Date heuteist = format.parse(Heuteist);
            Date soll = format.parse(Soll);
            Saldo = ""+(soll.getTime()-heuteist.getTime())/36000;
            float Saldofloat = Float.parseFloat(Saldo);
            Saldofloat = (Saldofloat/100) * (-1);
            insertSaldo(Saldofloat);
            float SaldofloatNK = Saldofloat - (int)Saldofloat;
            String SaldofloatNK1 = ""+SaldofloatNK;
            Float SaldofloatNK1float = Float.parseFloat(SaldofloatNK1);
            SaldofloatNK1float = (SaldofloatNK1float*60);
            if(Saldofloat == 0) {
                return "00:00 Std.";
            }
            else {
                String Saldodone = ""+(int)Saldofloat+":"+SaldofloatNK1float;
                if((int)Saldofloat<0) {
                    Saldodone = ""+((int)Saldofloat * (-1))+":"+SaldofloatNK1float*(-1);
                    Date saldo = format.parse(Saldodone);
                    Saldodone = ""+saldo;
                    Saldodone = "-"+Saldodone.substring(11,16)+" Std.";
                    return Saldodone;
                }else if((int)Saldofloat==0){
                    if(SaldofloatNK1float <0) {
                        Saldodone = "" + ((int) Saldofloat) + ":" + SaldofloatNK1float*(-1);
                        Date saldo = format.parse(Saldodone);
                        Saldodone = "" + saldo;
                        Saldodone = "-" + Saldodone.substring(11, 16) + " Std.";
                        return Saldodone;}
                    else {
                        Saldodone = "" + ((int) Saldofloat) + ":" + SaldofloatNK1float;
                        Date saldo = format.parse(Saldodone);
                        Saldodone = "" + saldo;
                        Saldodone = "-" + Saldodone.substring(11, 16) + " Std.";
                        return Saldodone;
                    }

                } else{
                    Date saldo = format.parse(Saldodone);
                    Saldodone = ""+saldo;
                    Saldodone = Saldodone.substring(11,16)+" Std.";
                    return Saldodone;
                }
            }
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "00:00 Std.";
    }
	public void insertSaldo(float Saldo) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
			String maxDatum = ("Select max(Datum) from `Eintraege` where `Mitarbeiter_ID` = '"+LoginEng.username+"';");
			java.sql.PreparedStatement pst2 = con.prepareStatement(maxDatum);
			ResultSet rs1 = pst2.executeQuery();
			rs1.next();
			String maxDate = rs1.getString(1);
			LocalDate Datumaktuell = LocalDate.now(); 
		    String DateAktuell = ""+Datumaktuell;
			if(!maxDate.equals(DateAktuell)) {System.out.println("Wie Sie sehen, sehen Sie nichts.");}
			else {
			String updateSaldo = "Update eintraege set Saldo = '"+Saldo+"'Where Datum = '"+maxDate+"' AND Mitarbeiter_ID = '"+LoginEng.username+"';";
			java.sql.PreparedStatement pst3 = con.prepareStatement(updateSaldo);
			pst3.executeUpdate();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public String GleitzeitproQuartal() {
        try {
            LocalDate Datumaktuell = LocalDate.now();
            Calendar calendar = new GregorianCalendar();
            calendar.set(Datumaktuell.getYear(), Datumaktuell.getMonthValue(),Datumaktuell.getDayOfMonth());
            int Quart = (calendar.get(Calendar.MONTH)/3) +1;
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
            String SaldoSummeQuartal = "Select sum(Saldo) from eintraege where Quartal = '"+Quart+"' AND Mitarbeiter_ID = '"+LoginEng.username+"' AND Datum Like '"+calendar.get(Calendar.YEAR)+"-__-__' ;";
            java.sql.PreparedStatement pstQuartalSumme = con.prepareStatement(SaldoSummeQuartal);
            ResultSet rsQuartalSumme = pstQuartalSumme.executeQuery();
            rsQuartalSumme.next();
            Float SaldoSummeFloat = rsQuartalSumme.getFloat(1);
            DecimalFormat df = new DecimalFormat("0.00");
            String SaldoFlaotSumme = ""+SaldoSummeFloat;
            SaldoFlaotSumme = df.format(SaldoSummeFloat);
            SaldoFlaotSumme = SaldoFlaotSumme.replace(".", ",");
            String GleitzeitproQuartal = ""+SaldoFlaotSumme+" Std.";
            return GleitzeitproQuartal;

        }  catch (SQLException e) {
            e.printStackTrace();
            return "0,0 Std.";
        }
	}
	public String GleitzeitproWoche() {
        try {
            LocalDate Datumaktuell = LocalDate.now();
            Calendar calendar = new GregorianCalendar();
            calendar.set(Datumaktuell.getYear(), Datumaktuell.getMonthValue(),Datumaktuell.getDayOfMonth());
            int kw = calendar.get(Calendar.WEEK_OF_YEAR);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
            String DateAktuell = ""+Datumaktuell;
            String SaldoSummeKW = "Select sum(Saldo) from eintraege where Datum LIKE '"+calendar.get(Calendar.YEAR)+"-"+calendar.get(Calendar.MONTH)+"-__' AND Mitarbeiter_ID = '"+LoginEng.username+"';";
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
        }  catch (SQLException e) {
            e.printStackTrace();
            return "0,0 Std.";
        }
	}

	public String GleitzeitproJahr() {
        try {
            LocalDate Datumaktuell = LocalDate.now();
            Calendar calendar = new GregorianCalendar();
            calendar.set(Datumaktuell.getYear(), Datumaktuell.getMonthValue(),Datumaktuell.getDayOfMonth());
            int Year = calendar.get(Calendar.YEAR);
           // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
            String DateAktuell = ""+Datumaktuell;
            String SaldoSummeJahr = "Select sum(Saldo) from eintraege where Jahr = '"+Year+"' AND Mitarbeiter_ID = '"+LoginEng.username+"';";
            java.sql.PreparedStatement pstJahrSumme = con.prepareStatement(SaldoSummeJahr);
            ResultSet rsJahrSumme = pstJahrSumme.executeQuery();
            rsJahrSumme.next();
            Float SaldoSummeFloat = rsJahrSumme.getFloat(1);
            String SaldoFlaotSumme = ""+SaldoSummeFloat;
            DecimalFormat df = new DecimalFormat("0.00");
            SaldoFlaotSumme = df.format(SaldoSummeFloat);
            SaldoFlaotSumme = SaldoFlaotSumme.replace(".", ",");
            String GleitzeitproJahr = ""+SaldoFlaotSumme+" Std.";
            return GleitzeitproJahr;
        }  catch (SQLException e) {
            e.printStackTrace();
            return "0,0 Std.";
        }
	}
	public void PopUp() {
        try {
            //Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
            String Beginn = ("Select Beginn,Pause from eintraege Where Datum = (SELECT MAX(Datum) FROM eintraege WHERE Mitarbeiter_ID = '"+LoginEng.username+"') AND Mitarbeiter_ID = '"+LoginEng.username+"';");
            java.sql.PreparedStatement pst1 = con.prepareStatement(Beginn);
            ResultSet rs = pst1.executeQuery();
            rs.next();
            String ArbZGmax = "Select ArbZGmax,Age from mitarbeiter where Mitarbeiter_ID = '"+LoginEng.username+"';";
            java.sql.PreparedStatement pst2 = con.prepareStatement(ArbZGmax);
            ResultSet rs1 = pst2.executeQuery();
            rs1.next();
            String beginn = rs.getString(1);
            int maxArbZG = rs1.getInt(1);
            int Age = rs1.getInt(2);
            String pause = rs.getString(2);
            pause = pause.replace(",", ".");
            float pausefloat = Float.parseFloat(pause);
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
                String heuteIstvor6 = ""+(heute.getTime() + datesechs.getTime()-datebeginn.getTime())/36000;
                float heuteistvor6float = Float.parseFloat(heuteIstvor6);
                heuteistvor6float = heuteistvor6float/100;
                heuteistvor6float = heuteistvor6float+1; // gibt immer ne Stunde zu wenig aus, warum auch immer
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
                String aktuelleUhrzeit =""+dtf.format(LocalDateTime.now());
                aktuelleUhrzeit = aktuelleUhrzeit.substring(11,13);
                int aktuelleUhrzeitInt = Integer.parseInt(aktuelleUhrzeit);
                if( heuteistvor6float >maxArbZG ||(aktuelleUhrzeitInt>=20 && Age <18)) {
                    JOptionPane.showMessageDialog(null, "You have exceeded your daily work limit, talk to your supervisor.");
                }
            }else if(HeuteistStundenfloat >= maxArbZG) {
                JOptionPane.showMessageDialog(null, "You have exceeded your daily work limit, talk to your supervisor.");
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Ampel.AmpelEng ampel;
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
