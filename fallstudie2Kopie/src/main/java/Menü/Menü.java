package Menü;


import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BoxLayout;
import javax.swing.JLabel;

import Komponenten.RundesPanel;
import LoginLogout.Login;
import Seiten.MeineDaten_Seite;

public class Menü extends javax.swing.JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EventMenu event;
    public static String Vorname;
    public static String Nachname;
    public static String Taetigkeit;
    public static String TelefonNr;
    public static String OfficeNr;
    public static String Anschrift;

    public Menü() {
        initComponents();
        setOpaque(false);
        menüPanel.setLayout(new BoxLayout(menüPanel,BoxLayout.Y_AXIS));
    }
    
  


	public void initMenu(EventMenu event){
        this.event=event;
        addMenu("Übersicht", 0);
        addMenu("Meine Daten", 1);
        addMenu("Meine Zeiten", 2);
        addMenu("Einträge", 3);
        addMenu("Kalender", 4);
        addMenu("Einstellungen", 5);
        addMenu("Logout", 6);
    }
    
    
    private void addMenu(String text, int index){
        ButtonMenu menu=new ButtonMenu();
        menu.setText(" "+text);
        menüPanel.add(menu);
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                event.selected(index);
                setSelected(menu);
                if(ae.getSource()==menu)
                    setBackground(new Color(100,0,0));
                    
            }
        });
    }
    public void setSelected(ButtonMenu menu){
        for(Component com:menüPanel.getComponents()){
            if(com instanceof ButtonMenu)
            {
                ButtonMenu b=(ButtonMenu) com;
                b.setSelected(false);
            }
        }
        menu.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    
    	//nachher mit while Schleife machen
    	try {
 			Class.forName("com.mysql.jdbc.Driver");
 			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
 			String vorname = "Select Vorname from mitarbeiter where Mitarbeiter_ID='"+Login.username+"';"; 
 			String nachname = "Select Nachname from mitarbeiter where Mitarbeiter_ID ='"+Login.username+"';";
 			String taetigkeit = "Select Taetigkeit from mitarbeiter where Mitarbeiter_ID ='"+Login.username+"';";
 			String telefonNr = "Select `Telefon-Nr` from mitarbeiter where Mitarbeiter_ID ='"+Login.username+"';";
 			String officeNr = "Select `Office-Nr` from mitarbeiter where Mitarbeiter_ID ='"+Login.username+"';";
 			String anschrift = "Select Anschrift from mitarbeiter where Mitarbeiter_ID ='"+Login.username+"';";
 			java.sql.PreparedStatement pst1 = con.prepareStatement(vorname);
 			java.sql.PreparedStatement pst2 = con.prepareStatement(nachname);
 			java.sql.PreparedStatement pst3 = con.prepareStatement(taetigkeit);
 			java.sql.PreparedStatement pst4 = con.prepareStatement(telefonNr);
 			java.sql.PreparedStatement pst5 = con.prepareStatement(officeNr);
 			java.sql.PreparedStatement pst6 = con.prepareStatement(anschrift);
 			ResultSet rs = pst1.executeQuery();
 			ResultSet rs1 = pst2.executeQuery();
 			ResultSet rs2 = pst3.executeQuery();
 			ResultSet rs3 = pst4.executeQuery();
 			ResultSet rs4 = pst5.executeQuery();
 			ResultSet rs5 = pst6.executeQuery();
 			
 			if (rs.next() && rs1.next() && rs2.next() && rs3.next() && rs5.next() && rs4.next() ) {
 				Vorname = rs.getString(1);
 				Nachname = rs1.getString(1);
 				Taetigkeit = rs2.getString(1);
 				TelefonNr = rs3.getString(1);
 				OfficeNr = rs4.getString(1);
 				Anschrift = rs5.getString(1);	
 				
 				System.out.println(Vorname);
 				System.out.println(Nachname);
 				System.out.println(Taetigkeit);
 				System.out.println(TelefonNr);
 				System.out.println(OfficeNr);
 				System.out.println(Anschrift);
 			}
 			
 		} catch (ClassNotFoundException e) {
 			
 			e.printStackTrace();
 		} catch (SQLException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    	
    	
        accountPanel = new Komponenten.RundesPanel();
        vorname_label = new javax.swing.JLabel();
        nachname_label = new javax.swing.JLabel();
        menüPanel = new Komponenten.RundesPanel();

        setPreferredSize(new java.awt.Dimension(150, 464));

        accountPanel.setBackground(new java.awt.Color(50, 50, 50));

        vorname_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        vorname_label.setForeground(new java.awt.Color(255, 255, 255));
        vorname_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vorname_label.setText(Vorname);

        nachname_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        nachname_label.setForeground(new java.awt.Color(255, 255, 255));
        nachname_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nachname_label.setText(Nachname);

        javax.swing.GroupLayout accountPanelLayout = new javax.swing.GroupLayout(accountPanel);
        accountPanel.setLayout(accountPanelLayout);
        accountPanelLayout.setHorizontalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nachname_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(vorname_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        accountPanelLayout.setVerticalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(vorname_label)
                .addGap(18, 18, 18)
                .addComponent(nachname_label)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        menüPanel.setBackground(new java.awt.Color(50, 50, 50));

        javax.swing.GroupLayout menüPanelLayout = new javax.swing.GroupLayout(menüPanel);
        menüPanel.setLayout(menüPanelLayout);
        menüPanelLayout.setHorizontalGroup(
            menüPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        menüPanelLayout.setVerticalGroup(
            menüPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 348, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(accountPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menüPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(accountPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menüPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Komponenten.RundesPanel accountPanel;
    private Komponenten.RundesPanel menüPanel;
    private javax.swing.JLabel nachname_label;
    private javax.swing.JLabel vorname_label;
    // End of variables declaration//GEN-END:variables

}
