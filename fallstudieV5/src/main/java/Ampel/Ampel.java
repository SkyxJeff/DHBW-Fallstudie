package Ampel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import LoginLogout.Login;
import Seiten.Uebersicht_Seite;

public class Ampel extends javax.swing.JPanel {
//Konstruktor für die Ampel
	//Aufruf der Komponenten
    public Ampel() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
//Initialisierung der Komponenten
        ampelPanel = new Komponenten.RundesPanel();
        rotesPanel = new Komponenten.RundesPanel();
        gelbesPanel = new Komponenten.RundesPanel();
        gruenesPanel = new Komponenten.RundesPanel();
        //Hier werden die Ampelwerte aus der DB gezogen und festgelegt, welcher Wert welche Farbe hat
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
        	int gruen = Integer.parseInt(rs.getString(1));
        	 int gelb = Integer.parseInt(rs1.getString(1));
        	 int rot = Integer.parseInt(rs2.getString(1));
        	 float Saldo = rs3.getFloat(1);
        	 System.out.println(gruen);
        	 System.out.println(gelb);
        	 System.out.println(rot);
        	 System.out.println(Saldo);
        	 

        	 
        	 if(Saldo <= gruen)
        	 {
        		  gruenesPanel.setBackground(new java.awt.Color(0, 255, 0));
        	      gruenesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
        	      gelbesPanel.setBackground(new java.awt.Color(102, 102, 102));
     		      gelbesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
     		      rotesPanel.setBackground(new java.awt.Color(102, 102, 102));
     		      rotesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
        	 }
        	 else
        	 {
        		 if(Saldo >gruen && Saldo <=rot)
        		 {
        			 gelbesPanel.setBackground(new java.awt.Color(255, 255, 0));
        		     gelbesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
        		     rotesPanel.setBackground(new java.awt.Color(102, 102, 102));
        		     rotesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
        		     gruenesPanel.setBackground(new java.awt.Color(102, 102, 102));
           	      	 gruenesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
        		     
        		 }
        		 else
        		 {
        			 rotesPanel.setBackground(new java.awt.Color(255, 0, 0));
        		     rotesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
        		     gelbesPanel.setBackground(new java.awt.Color(102, 102, 102));
        		     gelbesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
        		     gruenesPanel.setBackground(new java.awt.Color(102, 102, 102));
        		     gruenesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
        		     
        		 }
        	 }
        	
		} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Es gab ein Fehler mit der Ampel");
					System.out.println(e);
		}

        ampelPanel.setBackground(new java.awt.Color(102, 102, 102));
        javax.swing.GroupLayout rotesPanelLayout = new javax.swing.GroupLayout(rotesPanel);
        rotesPanel.setLayout(rotesPanelLayout);
        rotesPanelLayout.setHorizontalGroup(
            rotesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        rotesPanelLayout.setVerticalGroup(
            rotesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        

        javax.swing.GroupLayout gelbesPanelLayout = new javax.swing.GroupLayout(gelbesPanel);
        gelbesPanel.setLayout(gelbesPanelLayout);
        gelbesPanelLayout.setHorizontalGroup(
            gelbesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        gelbesPanelLayout.setVerticalGroup(
            gelbesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

      

        javax.swing.GroupLayout gruenesPanelLayout = new javax.swing.GroupLayout(gruenesPanel);
        gruenesPanel.setLayout(gruenesPanelLayout);
        gruenesPanelLayout.setHorizontalGroup(
            gruenesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );
        gruenesPanelLayout.setVerticalGroup(
            gruenesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ampelPanelLayout = new javax.swing.GroupLayout(ampelPanel);
        ampelPanel.setLayout(ampelPanelLayout);
        ampelPanelLayout.setHorizontalGroup(
            ampelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ampelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ampelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gruenesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(gelbesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(rotesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addContainerGap())
        );
        ampelPanelLayout.setVerticalGroup(
            ampelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ampelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rotesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gelbesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gruenesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ampelPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ampelPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Komponenten.RundesPanel ampelPanel;
    private Komponenten.RundesPanel gelbesPanel;
    private Komponenten.RundesPanel gruenesPanel;
    private Komponenten.RundesPanel rotesPanel;
    // End of variables declaration//GEN-END:variables
}
