package Ampel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import LoginLogout.Login;
import Seiten.�bersicht_Seite;

public class Ampel extends javax.swing.JPanel {

    public Ampel() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ampelPanel = new Komponenten.RundesPanel();
        rotesPanel = new Komponenten.RundesPanel();
        gelbesPanel = new Komponenten.RundesPanel();
        gr�nesPanel = new Komponenten.RundesPanel();
        
        try {
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
        	String Gr�n = ("SELECT Gr�n FROM `gleitzeitgrenze` WHERE MitarbeiterID = '"+Login.username+"'");
        	String Gelb = ("SELECT Gelb FROM `gleitzeitgrenze` WHERE MitarbeiterID = '"+Login.username+"'");
        	String Rot = ("SELECT Rot FROM `gleitzeitgrenze` WHERE MitarbeiterID = '"+Login.username+"'");
        	String saldo = ("SELECT SUM(Saldo) FROM eintraege WHERE Mitarbeiter_ID = '"+Login.username+"'");
        	java.sql.PreparedStatement pst = con.prepareStatement(Gr�n);
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
        	int gr�n = Integer.parseInt(rs.getString(1));
        	 int gelb = Integer.parseInt(rs1.getString(1));
        	 int rot = Integer.parseInt(rs2.getString(1));
        	 String Saldo = rs3.getString(1);
        	 System.out.println(gr�n);
        	 System.out.println(gelb);
        	 System.out.println(rot);
        	 System.out.println(Saldo);
        	 float gleitzeit = Float.parseFloat(Saldo);
        	 int Gleitzeit = (int) gleitzeit;
        	 
        	 if(Gleitzeit <= gr�n)
        	 {
        		  gr�nesPanel.setBackground(new java.awt.Color(0, 255, 0));
        	      gr�nesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
        	      gelbesPanel.setBackground(new java.awt.Color(102, 102, 102));
     		      gelbesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
     		      rotesPanel.setBackground(new java.awt.Color(102, 102, 102));
     		      rotesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
        	 }
        	 else
        	 {
        		 if(Gleitzeit >gr�n && Gleitzeit <=rot)
        		 {
        			 gelbesPanel.setBackground(new java.awt.Color(255, 255, 0));
        		     gelbesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
        		     rotesPanel.setBackground(new java.awt.Color(102, 102, 102));
        		     rotesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
        		     gr�nesPanel.setBackground(new java.awt.Color(102, 102, 102));
           	      	 gr�nesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
        		     
        		 }
        		 else
        		 {
        			 rotesPanel.setBackground(new java.awt.Color(255, 0, 0));
        		     rotesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
        		     gelbesPanel.setBackground(new java.awt.Color(102, 102, 102));
        		     gelbesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
        		     gr�nesPanel.setBackground(new java.awt.Color(102, 102, 102));
        		     gr�nesPanel.setPreferredSize(new java.awt.Dimension(38, 38));
        		     
        		 }
        	 }
        	
		} catch (SQLException e) {
					JOptionPane.showMessageDialog(null, "Fehler!!!!!!!!!!!!!!");
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

      

        javax.swing.GroupLayout gr�nesPanelLayout = new javax.swing.GroupLayout(gr�nesPanel);
        gr�nesPanel.setLayout(gr�nesPanelLayout);
        gr�nesPanelLayout.setHorizontalGroup(
            gr�nesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );
        gr�nesPanelLayout.setVerticalGroup(
            gr�nesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ampelPanelLayout = new javax.swing.GroupLayout(ampelPanel);
        ampelPanel.setLayout(ampelPanelLayout);
        ampelPanelLayout.setHorizontalGroup(
            ampelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ampelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ampelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gr�nesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
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
                .addComponent(gr�nesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private Komponenten.RundesPanel gr�nesPanel;
    private Komponenten.RundesPanel rotesPanel;
    // End of variables declaration//GEN-END:variables
}
