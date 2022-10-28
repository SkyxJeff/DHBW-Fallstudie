package Seiten;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.*;

import LoginLogout.Login;

public class MeineZeiten_Seite extends javax.swing.JPanel {
	int Urlaubsanspruch1;
	int Urlaub_aktuelles_Jahr1;
	int Urlaub_vorjahr1;
	int Urlaub_genommen1;
	int Urlaub_verfuegbar1;
	public int kalenderWoche;
	public int quartal;
	public int Jahrpublic;
    public MeineZeiten_Seite() {
        initComponents();
        setOpaque(false);
        urlaubs_tabelle.addTableStyle(jScrollPane1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arbeits_panel = new Komponenten.RundesPanel();
        ueberschrift_label = new javax.swing.JLabel();
        datum_label = new javax.swing.JLabel();
        beginn_label = new javax.swing.JLabel();
        ende_label = new javax.swing.JLabel();
        art_label = new javax.swing.JLabel();
        datum_textfeld = new javax.swing.JTextField();
        beginn_textfeld = new javax.swing.JTextField();
        ende_textfeld = new javax.swing.JTextField();
        art_combobox = new javax.swing.JComboBox<>();
        speichern_button1 = new javax.swing.JButton();
        loeschen_button1 = new javax.swing.JButton();
        pause_label = new javax.swing.JLabel();
        pause_textfeld = new javax.swing.JTextField();
        abwesenheits_panel = new Komponenten.RundesPanel();
        abwesenheitsgrund_label = new javax.swing.JLabel();
        abwesenheitsbeginn_label = new javax.swing.JLabel();
        abwesenheitsende_label = new javax.swing.JLabel();
        abwesenheitsgrund_combobox = new javax.swing.JComboBox<>();
        abwesenheitsbeginn_textfeld = new javax.swing.JTextField();
        abwesenheitsende_textfeld = new javax.swing.JTextField();
        speichern_button2 = new javax.swing.JButton();
        loeschen_button2 = new javax.swing.JButton();
        notiz_label = new javax.swing.JLabel();
        notiz_textfeld = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        urlaubs_tabelle = new Tabelle.Table();

        arbeits_panel.setBackground(new java.awt.Color(50, 50, 50));

        ueberschrift_label.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        ueberschrift_label.setForeground(new java.awt.Color(255, 255, 255));
        ueberschrift_label.setText("Meine Zeiten");

        datum_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        datum_label.setForeground(new java.awt.Color(255, 255, 255));
        datum_label.setText("Datum:");

        beginn_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        beginn_label.setForeground(new java.awt.Color(255, 255, 255));
        beginn_label.setText("Beginn:");

        ende_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ende_label.setForeground(new java.awt.Color(255, 255, 255));
        ende_label.setText("Ende:");

        art_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        art_label.setForeground(new java.awt.Color(255, 255, 255));
        art_label.setText("Art:");
        
        datum_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        datum_textfeld.setBorder(null);
        datum_textfeld.setPreferredSize(new java.awt.Dimension(64, 25));
        LocalDate Datumaktuell = LocalDate.now(); 
        String DateAktuell = ""+Datumaktuell;
        Date deutschesAktuellDate = new Date();
        System.out.println("Deutsch: "+deutschesAktuellDate);
        SimpleDateFormat formatdeutsch = new SimpleDateFormat("dd.MM.yyyy");
        DateAktuell = ""+formatdeutsch.format(deutschesAktuellDate);
        datum_textfeld.setText(DateAktuell);
       

        beginn_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        beginn_textfeld.setBorder(null);
        beginn_textfeld.setPreferredSize(new java.awt.Dimension(64, 25));
        beginn_textfeld.setText("00:00");

        ende_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ende_textfeld.setBorder(null);
        ende_textfeld.setPreferredSize(new java.awt.Dimension(64, 25));
        ende_textfeld.setText("00:00");

        art_combobox.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        art_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Büro", "Home Office" }));
        art_combobox.setBorder(null);

        speichern_button1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        speichern_button1.setText("Speichern");
        speichern_button1.setBorder(null);
        speichern_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speichern_button1ActionPerformed(evt);
            }
        });

        loeschen_button1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        loeschen_button1.setText("Löschen");
        loeschen_button1.setBorder(null);
        loeschen_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loeschen_button1ActionPerformed(evt);
            }
        });

        pause_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pause_label.setForeground(new java.awt.Color(255, 255, 255));
        pause_label.setText("Pause(Eingabe in h):");

        pause_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pause_textfeld.setBorder(null);
        pause_textfeld.setPreferredSize(new java.awt.Dimension(64, 25));
        pause_textfeld.setText("0,0");

        javax.swing.GroupLayout arbeits_panelLayout = new javax.swing.GroupLayout(arbeits_panel);
        arbeits_panel.setLayout(arbeits_panelLayout);
        arbeits_panelLayout.setHorizontalGroup(
            arbeits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arbeits_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(arbeits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ueberschrift_label)
                    .addGroup(arbeits_panelLayout.createSequentialGroup()
                        .addGroup(arbeits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datum_label)
                            .addComponent(art_label))
                        .addGap(18, 18, 18)
                        .addGroup(arbeits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datum_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(art_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34)
                .addGroup(arbeits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(arbeits_panelLayout.createSequentialGroup()
                        .addComponent(beginn_label)
                        .addGap(18, 18, 18)
                        .addComponent(beginn_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, arbeits_panelLayout.createSequentialGroup()
                        .addComponent(ende_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ende_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(arbeits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(arbeits_panelLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(pause_label)
                        .addGap(18, 18, 18)
                        .addComponent(pause_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                        .addComponent(speichern_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(arbeits_panelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loeschen_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        arbeits_panelLayout.setVerticalGroup(
            arbeits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arbeits_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ueberschrift_label)
                .addGap(18, 18, 18)
                .addGroup(arbeits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datum_label)
                    .addComponent(datum_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beginn_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beginn_label)
                    .addComponent(speichern_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pause_label)
                    .addComponent(pause_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(arbeits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loeschen_button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(arbeits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ende_label)
                        .addComponent(ende_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(art_label)
                        .addComponent(art_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        abwesenheits_panel.setBackground(new java.awt.Color(50, 50, 50));

        abwesenheitsgrund_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        abwesenheitsgrund_label.setForeground(new java.awt.Color(255, 255, 255));
        abwesenheitsgrund_label.setText("Abwesenheitgrund:");

        abwesenheitsbeginn_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        abwesenheitsbeginn_label.setForeground(new java.awt.Color(255, 255, 255));
        abwesenheitsbeginn_label.setText("Abwesenheitsbeginn:");

        abwesenheitsende_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        abwesenheitsende_label.setForeground(new java.awt.Color(255, 255, 255));
        abwesenheitsende_label.setText("Abwesenheitsende:");

        abwesenheitsgrund_combobox.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        abwesenheitsgrund_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Krank", "Urlaub", "Dienstreise","Berufsschule","Hochschule", "sonstige Abwesenheit" }));
        abwesenheitsgrund_combobox.setBorder(null);

        abwesenheitsbeginn_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        abwesenheitsbeginn_textfeld.setBorder(null);
        abwesenheitsbeginn_textfeld.setPreferredSize(new java.awt.Dimension(64, 25));
        abwesenheitsbeginn_textfeld.setText(DateAktuell);

        abwesenheitsende_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        abwesenheitsende_textfeld.setBorder(null);
        abwesenheitsende_textfeld.setPreferredSize(new java.awt.Dimension(64, 25));
        abwesenheitsende_textfeld.setText(DateAktuell);

        speichern_button2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        speichern_button2.setText("Speichern");
        speichern_button2.setBorder(null);
        speichern_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speichern_button2ActionPerformed(evt);
            }
        });

        loeschen_button2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        loeschen_button2.setText("Loeschen");
        loeschen_button2.setBorder(null);
        loeschen_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loeschen_button2ActionPerformed(evt);
            }
        });

        notiz_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        notiz_label.setForeground(new java.awt.Color(255, 255, 255));
        notiz_label.setText("Notiz:");

        notiz_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        notiz_textfeld.setBorder(null);
        notiz_textfeld.setText("Bitte hier den Text eingeben");

        jScrollPane1.setBackground(new java.awt.Color(50, 50, 50));
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);
        try {
        	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
        	String Urlaubsanspruch = ("SELECT Urlaubsanspruch FROM `urlaub` WHERE MitarbeiterID = '"+Login.username+"'");
        	String Urlaub_aktuelles_Jahr = ("SELECT UrlaubaktuellesJahr FROM `urlaub` WHERE MitarbeiterID = '"+Login.username+"'");
        	String Urlaub_vorjahr = ("SELECT Urlaubvorjahr FROM `urlaub` WHERE MitarbeiterID = '"+Login.username+"'");
        	String Urlaub_genommen = ("SELECT Urlaubgenommen FROM `urlaub` WHERE MitarbeiterID = '"+Login.username+"'");
        	String Urlaub_verfuegbar = ("SELECT Urlaubverfuegbar FROM `urlaub` WHERE MitarbeiterID = '"+Login.username+"'");
        	java.sql.PreparedStatement pst = con.prepareStatement(Urlaubsanspruch);
        	java.sql.PreparedStatement pst1 = con.prepareStatement(Urlaub_aktuelles_Jahr);
        	java.sql.PreparedStatement pst2= con.prepareStatement(Urlaub_vorjahr);
        	java.sql.PreparedStatement pst3 = con.prepareStatement(Urlaub_genommen);
        	java.sql.PreparedStatement pst4 = con.prepareStatement(Urlaub_verfuegbar);
        	ResultSet r = pst.executeQuery();
        	ResultSet r2 = pst1.executeQuery();
        	ResultSet r3 = pst2.executeQuery();
        	ResultSet r4 = pst3.executeQuery();
        	ResultSet r5 = pst4.executeQuery();
        	r.next();
        	r2.next();
        	r3.next();
        	r4.next();
        	r5.next();
        	Urlaubsanspruch1 = Integer.parseInt(r.getString(1));
        	Urlaub_aktuelles_Jahr1 = Integer.parseInt(r2.getString(1));
        	Urlaub_vorjahr1 = Integer.parseInt(r3.getString(1));
        	Urlaub_genommen1 = Integer.parseInt(r4.getString(1));
        	Urlaub_verfuegbar1 = Integer.parseInt(r5.getString(1));
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Datenbankverbindung geht nicht");
		}

        urlaubs_tabelle.setBackground(new java.awt.Color(50, 50, 50));
        urlaubs_tabelle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {Urlaubsanspruch1, Urlaub_aktuelles_Jahr1, Urlaub_vorjahr1, Urlaub_genommen1, Urlaub_verfuegbar1}
            },
            new String [] {
                "Urlaubsanspruch", "Urlaub akt. Jahr", "Urlaub Vorjahr", "Urlaub genommen", "Urlaub verfügbar"
            }
        ) {
        	private static final long serialVersionUID = 1L;
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        urlaubs_tabelle.setShowGrid(true);
        jScrollPane1.setViewportView(urlaubs_tabelle);

        javax.swing.GroupLayout abwesenheits_panelLayout = new javax.swing.GroupLayout(abwesenheits_panel);
        abwesenheits_panel.setLayout(abwesenheits_panelLayout);
        abwesenheits_panelLayout.setHorizontalGroup(
            abwesenheits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abwesenheits_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(abwesenheits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abwesenheits_panelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(abwesenheits_panelLayout.createSequentialGroup()
                        .addGroup(abwesenheits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(abwesenheits_panelLayout.createSequentialGroup()
                                .addComponent(abwesenheitsgrund_label)
                                .addGap(26, 26, 26)
                                .addComponent(abwesenheitsgrund_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(notiz_label))
                            .addGroup(abwesenheits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, abwesenheits_panelLayout.createSequentialGroup()
                                    .addComponent(abwesenheitsende_label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(abwesenheitsende_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, abwesenheits_panelLayout.createSequentialGroup()
                                    .addComponent(abwesenheitsbeginn_label)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(abwesenheitsbeginn_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notiz_textfeld)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(abwesenheits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(speichern_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loeschen_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35))))
        );
        abwesenheits_panelLayout.setVerticalGroup(
            abwesenheits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(abwesenheits_panelLayout.createSequentialGroup()
                .addGroup(abwesenheits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(abwesenheits_panelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(abwesenheits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(notiz_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(speichern_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loeschen_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(abwesenheits_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(abwesenheits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(abwesenheitsgrund_label)
                            .addComponent(abwesenheitsgrund_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(notiz_label))
                        .addGap(18, 18, 18)
                        .addGroup(abwesenheits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(abwesenheitsbeginn_label)
                            .addComponent(abwesenheitsbeginn_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(abwesenheits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(abwesenheitsende_label, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(abwesenheitsende_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(arbeits_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(abwesenheits_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(arbeits_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abwesenheits_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void speichern_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speichern_button1ActionPerformed
       
    	try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
			String Ende = ("Select `Ende` from eintraege where Datum = (SELECT MAX(Datum) FROM eintraege WHERE Mitarbeiter_ID = '"+Login.username+"') AND Mitarbeiter_ID = '"+Login.username+"';");
			String maxDatum = ("SELECT MAX(Datum),count(EintraegeNr) FROM eintraege WHERE Mitarbeiter_ID = '"+Login.username+"';");
			java.sql.PreparedStatement pst1 = con.prepareStatement(Ende);
			java.sql.PreparedStatement pst2 = con.prepareStatement(maxDatum);
			ResultSet rs = pst1.executeQuery();
			ResultSet rs1 = pst2.executeQuery();
			rs.next();
			rs1.next();
			String end = rs.getString(1); //Nochmal ran
			String Date = rs1.getString(1);
			int countEintraege = rs1.getInt(2);
			String EndeUhrzeit = ""+end;
			System.out.println(Date);
			System.out.println(EndeUhrzeit);
			LocalDate Datumaktuell = LocalDate.now(); 
		    String DateAktuell = ""+Datumaktuell;
		   
		    String eingegebenesDate = ""+datum_textfeld.getText();
		    String Jahr = eingegebenesDate.substring(6,10);
		    int jahr = Integer.parseInt(Jahr);
		    System.out.println("Jahr: "+jahr);
		    Jahrpublic = jahr;
		    int Quartal = (Integer.parseInt(eingegebenesDate.substring(3, 5))/3)+1;
		    System.out.println(Integer.parseInt(eingegebenesDate.substring(3, 5)));
		    quartal = Quartal;
		    int day = Integer.parseInt(eingegebenesDate.substring(0, 2));
		    System.out.println(Quartal);
		    System.out.println(day);
		   
		    Calendar calendar = new GregorianCalendar();
		    calendar.set(jahr, Integer.parseInt(eingegebenesDate.substring(3, 5)),day);
		    System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		    System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		    System.out.println("DAY: " + calendar.get(Calendar.DATE));
		    String eingDatumEngl = calendar.get(Calendar.YEAR)+"-"+calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DATE);
		    
		    int kw = calendar.get(Calendar.WEEK_OF_YEAR);
		    kalenderWoche = kw;
		    System.out.println(kalenderWoche);
		    System.out.println(kw);
		    System.out.println(EndeUhrzeit);
		    
		    //irgendwo beim Insert noch checken, ob Arbeitszeit unterhalb 8h oder so liegt, wies halt im ArbZG steht
		    
			
			if(/*EndeUhrzeit.equals("00:00") && */ Date.equals(DateAktuell)) {
				
							
				String sql7 = ("Update eintraege set Beginn = '"+beginn_textfeld.getText()+"'where Datum = '"+Date+"'AND Mitarbeiter_ID = '"+Login.username+"';");
				String sql3 = ("Update eintraege set Pause = '"+pause_textfeld.getText()+"'where Datum = '"+Date+"'AND Mitarbeiter_ID = '"+Login.username+"';");
				String sql4 = ("Update eintraege set Ende = '"+ende_textfeld.getText()+"'where Datum = '"+Date+"'AND Mitarbeiter_ID = '"+Login.username+"';");
				String sql8 = ("Update eintraege set KW = '"+kalenderWoche+"'where Datum = '"+Date+"'AND Mitarbeiter_ID = '"+Login.username+"';");
				String sql9 = ("Update eintraege set Quartal = '"+quartal+"'where Datum = '"+Date+"'AND Mitarbeiter_ID = '"+Login.username+"';");
				String sql10 = ("Update eintraege set Jahr = '"+Jahrpublic+"'where Datum = '"+Date+"'AND Mitarbeiter_ID = '"+Login.username+"';");
				String sql11 = ("Update eintraege set Art = '"+art_combobox.getSelectedItem()+"'where Datum = '"+Date+"'AND Mitarbeiter_ID = '"+Login.username+"';");
				java.sql.PreparedStatement pst3 = con.prepareStatement(sql3);
				java.sql.PreparedStatement pst4 = con.prepareStatement(sql4);
				java.sql.PreparedStatement pst7 = con.prepareStatement(sql7);
				java.sql.PreparedStatement pst8 = con.prepareStatement(sql8);
				java.sql.PreparedStatement pst9 = con.prepareStatement(sql9);
				java.sql.PreparedStatement pst10 = con.prepareStatement(sql10);
				java.sql.PreparedStatement pst11 = con.prepareStatement(sql11);
				pst3.executeUpdate();
				pst4.executeUpdate();
				pst7.executeUpdate();
				pst8.executeUpdate();
				pst9.executeUpdate();
				pst10.executeUpdate();
				pst11.executeUpdate();
				JOptionPane.showMessageDialog(null, "Eintrag gespeichert!");
				
			}else if(!DateAktuell.equals(eingDatumEngl)&&(beginn_textfeld.getText().equals("00:00") || pause_textfeld.getText().equals("0,0")||ende_textfeld.getText().equals("00:00"))){
				JOptionPane.showMessageDialog(null, "Unvollständige Nachträge sind nicht gestattet.");
				}
			else if(!DateAktuell.equals(eingDatumEngl) && !beginn_textfeld.getText().equals("00:00") && !pause_textfeld.getText().equals("0,0")&&!ende_textfeld.getText().equals("00:00")){
				System.out.println("Bin hier");
				boolean EintragAktualisiert = false;
				//if(){}
				
				String Datum = ("Select Datum from eintraege where Mitarbeiter_ID = '"+Login.username+"';");
			    java.sql.PreparedStatement pstDatumEingabe = con.prepareStatement(Datum);
			    ResultSet rsDatum = pstDatumEingabe.executeQuery();
			    int i = 0;
			     String [] DatumArr = new String[countEintraege];
				while(rsDatum.next() ) {	
			    	
			    	 String DatumDB = rsDatum.getString(1);
			    		 DatumArr [i] = DatumDB;
			    		 i++;	 
			    }
			   for(int y = 0; y<=i ; y++) {
				   String DatumausCount = DatumArr [y];
				   if(DatumausCount.equals(eingDatumEngl)) {
					   String sql7 = ("Update eintraege set Beginn = '"+beginn_textfeld.getText()+"'where Datum = '"+eingDatumEngl+"'AND Mitarbeiter_ID = '"+Login.username+"';");
						String sql3 = ("Update eintraege set Pause = '"+pause_textfeld.getText()+"'where Datum = '"+eingDatumEngl+"'AND Mitarbeiter_ID = '"+Login.username+"';");
						String sql4 = ("Update eintraege set Ende = '"+ende_textfeld.getText()+"'where Datum = '"+eingDatumEngl+"'AND Mitarbeiter_ID = '"+Login.username+"';");
						//String sql8 = ("Update eintraege set KW = '"+kalenderWoche+"'where Datum = '"+eingDatumEngl+"'AND Mitarbeiter_ID = '"+Login.username+"';");
						//String sql9 = ("Update eintraege set Quartal = '"+quartal+"'where Datum = '"+eingDatumEngl+"'AND Mitarbeiter_ID = '"+Login.username+"';");
						//String sql10 = ("Update eintraege set Jahr = '"+Jahrpublic+"'where Datum = '"+eingDatumEngl+"'AND Mitarbeiter_ID = '"+Login.username+"';");
						String sql11 = ("Update eintraege set Art = '"+art_combobox.getSelectedItem()+"'where Datum = '"+eingDatumEngl+"'AND Mitarbeiter_ID = '"+Login.username+"';");
						java.sql.PreparedStatement pst3 = con.prepareStatement(sql3);
						java.sql.PreparedStatement pst4 = con.prepareStatement(sql4);
						java.sql.PreparedStatement pst7 = con.prepareStatement(sql7);
//						java.sql.PreparedStatement pst8 = con.prepareStatement(sql8);
//						java.sql.PreparedStatement pst9 = con.prepareStatement(sql9);
//						java.sql.PreparedStatement pst10 = con.prepareStatement(sql10);
						java.sql.PreparedStatement pst11 = con.prepareStatement(sql11);
						pst3.executeUpdate();
						pst4.executeUpdate();
						pst7.executeUpdate();
//						pst8.executeUpdate();
//						pst9.executeUpdate();
//						pst10.executeUpdate();
						pst11.executeUpdate();
						EintragAktualisiert = true;
				   }
				   
			   }
			   if(EintragAktualisiert = false) {
				   
				   String sql5 = ("Insert into eintraege (`Mitarbeiter_ID`, `Datum`, `Beginn`, `Pause`, `Ende`, `Art`,`KW`,`Quartal`, `Jahr`, `Saldo`) values ('"+Login.username+"','"+eingDatumEngl+"','"+beginn_textfeld.getText()+"','"+pause_textfeld.getText()+"','"+ende_textfeld.getText()+"','"+art_combobox.getSelectedItem()+"',"
						+ "'"+kw+"','"+Quartal+"','"+jahr+"','0');");
				java.sql.PreparedStatement pst5 = con.prepareStatement(sql5);
				pst5.executeUpdate();
				String NachtragBeginnEnde = "Select Beginn, Ende, Pause from eintraege where Datum = '"+eingDatumEngl+"'AND Mitarbeiter_ID = '"+Login.username+"';";
				java.sql.PreparedStatement pstNachtragSaldo = con.prepareStatement(NachtragBeginnEnde);
				ResultSet rsNachtragSaldo = pstNachtragSaldo.executeQuery();
				rsNachtragSaldo.next();
				String beginn = rsNachtragSaldo.getString(1);
				String ende = rsNachtragSaldo.getString(2);
				String pause = rsNachtragSaldo.getString(3);
				String maxArbeitszeit = "Select maxArbeitszeitproTag from taetigkeit_bez where Bezeichnung = (Select Taetigkeit from Mitarbeiter where Mitarbeiter_ID = '"+Login.username+"');";
				java.sql.PreparedStatement pstmaxWorktime = con.prepareStatement(maxArbeitszeit);
				ResultSet rsmaxWork = pstmaxWorktime.executeQuery();
				rsmaxWork.next();
				maxArbeitszeit = rsmaxWork.getString(1);
				maxArbeitszeit = maxArbeitszeit.substring(0,5);
				
				SimpleDateFormat format = new SimpleDateFormat("HH:mm");
				Date beginnDate = format.parse(beginn);
				Date endeDate = format.parse(ende);
				pause = pause.replace(",", ".");
				float pauseFloat = Float.parseFloat(pause);
				maxArbeitszeit = maxArbeitszeit.substring(0,5);
				maxArbeitszeit = maxArbeitszeit.replace(":", ".");
				float maxArbeitszeitFloat = Float.parseFloat(maxArbeitszeit);
				String SaldoNachtrag = ""+(endeDate.getTime() - beginnDate.getTime())/36000;
				System.out.println("Ende" + endeDate);
				System.out.println("Beginn" + beginnDate);
				System.out.println("maxWork" +maxArbeitszeitFloat);
				Float SaldoNachtragFloat = Float.parseFloat(SaldoNachtrag);
				SaldoNachtragFloat = SaldoNachtragFloat/100;
				System.out.println("SaldoNachtrag ohne Pause: "+ SaldoNachtragFloat);
				SaldoNachtragFloat = SaldoNachtragFloat - maxArbeitszeitFloat  - pauseFloat;
				System.out.println("Mit Pause:" +SaldoNachtragFloat);
				String updateSaldo = "Update eintraege set Saldo = '"+SaldoNachtragFloat+"'Where Datum = '"+eingDatumEngl+"' AND Mitarbeiter_ID = '"+Login.username+"';";
				java.sql.PreparedStatement pst3 = con.prepareStatement(updateSaldo);
				pst3.executeUpdate();
				loeschen_button1ActionPerformed(evt);
				JOptionPane.showMessageDialog(null, "Eingabe gespeichert");	
			   }
				
				
			}else {

//					String sql = ("Insert into eintraege (`Mitarbeiter_ID`, `Datum`, `Beginn`, `Pause`, `Ende`, `Art`) values ('"+Login.username+"','"+datum_textfeld.getText()+"','"+beginn_textfeld.getText()+"','"+pause_textfeld.getText()+"','"+ende_textfeld.getText()+"','"+art_combobox.getSelectedItem()+"');");
					String sql = ("Insert into eintraege (`Mitarbeiter_ID`, `Datum`, `Beginn`, `Pause`, `Ende`, `Art`,`KW`,`Quartal`, `Jahr`, `Saldo`) values ('"+Login.username+"','"+eingDatumEngl+"','"+beginn_textfeld.getText()+"','"+pause_textfeld.getText()+"','"+ende_textfeld.getText()+"','"+art_combobox.getSelectedItem()+"',"
							+ "'"+kw+"','"+Quartal+"','"+jahr+"','0');");
					
					java.sql.PreparedStatement pst = con.prepareStatement(sql);
					pst.executeUpdate();
					loeschen_button1ActionPerformed(evt);
					JOptionPane.showMessageDialog(null, "Eingabe gespeichert");		
				}	
			
			
			//Oder man speichert die Beginn, Ende, Pause seperat zwischen, dann aber mit update --> Heute-Ist dann ebenfalls verwendbar Man könnte den max(EintrageNr) der aktuell eingeloggten Person selecten, um die richitge Zeile dann auszuwählen und zu updaten		
			//Er guckt sich den neuesten Eintrag an, überprüft ob der Mitarbeiter bereits eine End-Zeit festgelegt hat, ist das nicht der Fall, speichert er zwischen und updatet dann wenn der Mitarb zb die Pause einträgt, die Pause und macht keine neue Zeile. 
			//Ist hat Ende ein Wert, wird geprüft, ob es noch der heutige Eintrag ist, und dann dementsprechen dort reinschreiben muss, oder ob man einen komplett neuen Eintrag machen soll
			
			
				
			
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Eingabe fehlgeschlagen1");
			loeschen_button1ActionPerformed(evt);
			e.printStackTrace();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Eingabe fehlgeschlagen2");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	
    }//GEN-LAST:event_speichern_button1ActionPerformed

    private void loeschen_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_löschen_button1ActionPerformed
       beginn_textfeld.setText("");
       ende_textfeld.setText("");
       pause_textfeld.setText("");
       datum_textfeld.setText("");
       
    }//GEN-LAST:event_löschen_button1ActionPerformed

    private void speichern_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speichern_button2ActionPerformed
    	try {
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
			LocalDate Datumaktuell = LocalDate.now(); 
	    	String DateAktuell = ""+Datumaktuell;
	    	String Abwesendheitsbeginn = abwesenheitsbeginn_textfeld.getText();
	    	String Abwesendheitsende = abwesenheitsende_textfeld.getText();
	    	long tage;

	    	if(Abwesendheitsbeginn.equals(Abwesendheitsende))
	    	{
	    		tage = 1;
	    	}
	    	else
	    	{
		    	SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		    	Date Beginn = sdf.parse(Abwesendheitsbeginn);
		    	Date Ende = sdf.parse(Abwesendheitsende);
		    	long diff = Ende.getTime() - Beginn.getTime();
		    	TimeUnit time = TimeUnit.DAYS;
		    	tage = time.convert(diff, TimeUnit.MILLISECONDS);
		    	tage++;
	    	}
	    	String Notiz = notiz_textfeld.getText();
	    	System.out.println(DateAktuell);
	    	System.out.println(Abwesendheitsbeginn);
	    	System.out.println(Abwesendheitsende);
	    	System.out.println(tage);
	    	System.out.println(Notiz);
	    	System.out.println(abwesenheitsgrund_combobox.getSelectedItem());
	    	
	    	//INSERT INTO `abwesendheit`(`MitarbeiterID`, `Datum`, `Beginn`, `Ende`, `Grund`, `Notiz`) VALUES ('[value-1]','[value-2]','[value-3]','[value-4]','[value-5]','[value-6]')
	    	String eingabe = ("INSERT INTO `abwesendheit`(`MitarbeiterID`, `Datum`, `Beginn`, `Ende`, `Tage`, `Grund`, `Notiz`) VALUES ('"+Login.username+"','"+DateAktuell+"','"+Abwesendheitsbeginn+"','"+Abwesendheitsende+"','"+tage+"','"+abwesenheitsgrund_combobox.getSelectedItem()+"','"+Notiz+"')");
	    	java.sql.PreparedStatement pst1 = con1.prepareStatement(eingabe);
	    	pst1.executeUpdate();
	    	if(abwesenheitsgrund_combobox.getSelectedItem() == "Urlaub")
	    	{
	    		long Urlaub_aktuelles_Jahr2 = Urlaub_aktuelles_Jahr1 - tage;
	    		long Urlaub_genommen2 = Urlaub_genommen1 + tage;
	    		long Urlaub_verfuegbar2 = Urlaub_verfuegbar1 - tage;
	    		String update = ("UPDATE `urlaub` SET `UrlaubaktuellesJahr` = '"+Urlaub_aktuelles_Jahr2+"', `Urlaubgenommen` = '"+Urlaub_genommen2+"', `Urlaubverfuegbar` = '"+Urlaub_verfuegbar2+"'");
	    		java.sql.PreparedStatement pst2 = con1.prepareStatement(update);
	    		pst2.executeUpdate();
	    		
	    	}
	    	loeschen_button2ActionPerformed(evt);
	    	
		} catch (SQLException e1) {
			JOptionPane.showMessageDialog(null, "Keine Verbindung zur Datenbank möglich");
		}
    	catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Tage gehen nicht");
		}
    }//GEN-LAST:event_speichern_button2ActionPerformed

    private void loeschen_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_löschen_button2ActionPerformed
        abwesenheitsbeginn_textfeld.setText("");
        abwesenheitsende_textfeld.setText("");
        notiz_textfeld.setText("");
    }//GEN-LAST:event_löschen_button2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Komponenten.RundesPanel abwesenheits_panel;
    private javax.swing.JLabel abwesenheitsbeginn_label;
    private javax.swing.JTextField abwesenheitsbeginn_textfeld;
    private javax.swing.JLabel abwesenheitsende_label;
    private javax.swing.JTextField abwesenheitsende_textfeld;
    private javax.swing.JComboBox<String> abwesenheitsgrund_combobox;
    private javax.swing.JLabel abwesenheitsgrund_label;
    private Komponenten.RundesPanel arbeits_panel;
    private javax.swing.JComboBox<String> art_combobox;
    private javax.swing.JLabel art_label;
    private javax.swing.JLabel beginn_label;
    private javax.swing.JTextField beginn_textfeld;
    private javax.swing.JLabel datum_label;
    private javax.swing.JTextField datum_textfeld;
    private javax.swing.JLabel ende_label;
    private javax.swing.JTextField ende_textfeld;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loeschen_button1;
    private javax.swing.JButton loeschen_button2;
    private javax.swing.JLabel notiz_label;
    private javax.swing.JTextField notiz_textfeld;
    private javax.swing.JLabel pause_label;
    private javax.swing.JTextField pause_textfeld;
    private javax.swing.JButton speichern_button1;
    private javax.swing.JButton speichern_button2;
    private Tabelle.Table urlaubs_tabelle;
    private javax.swing.JLabel ueberschrift_label;
    // End of variables declaration//GEN-END:variables
}
