package Seiten;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.*;

import LoginLogout.Login;

public class MeineZeiten_Seite extends javax.swing.JPanel {

    public MeineZeiten_Seite() {
        initComponents();
        setOpaque(false);
        urlaubs_tabelle.addTableStyle(jScrollPane1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arbeits_panel = new Komponenten.RundesPanel();
        überschrift_label = new javax.swing.JLabel();
        datum_label = new javax.swing.JLabel();
        beginn_label = new javax.swing.JLabel();
        ende_label = new javax.swing.JLabel();
        art_label = new javax.swing.JLabel();
        datum_textfeld = new javax.swing.JTextField();
        beginn_textfeld = new javax.swing.JTextField();
        ende_textfeld = new javax.swing.JTextField();
        art_combobox = new javax.swing.JComboBox<>();
        speichern_button1 = new javax.swing.JButton();
        löschen_button1 = new javax.swing.JButton();
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
        löschen_button2 = new javax.swing.JButton();
        notiz_label = new javax.swing.JLabel();
        notiz_textfeld = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        urlaubs_tabelle = new Tabelle.Table();

        arbeits_panel.setBackground(new java.awt.Color(50, 50, 50));

        überschrift_label.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        überschrift_label.setForeground(new java.awt.Color(255, 255, 255));
        überschrift_label.setText("Meine Zeiten");

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
        datum_textfeld.setText("YYYY-MM-DD");

        beginn_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        beginn_textfeld.setBorder(null);
        beginn_textfeld.setPreferredSize(new java.awt.Dimension(64, 25));
        beginn_textfeld.setText("hh:mm");

        ende_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        ende_textfeld.setBorder(null);
        ende_textfeld.setPreferredSize(new java.awt.Dimension(64, 25));

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

        löschen_button1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        löschen_button1.setText("Löschen");
        löschen_button1.setBorder(null);
        löschen_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                löschen_button1ActionPerformed(evt);
            }
        });

        pause_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pause_label.setForeground(new java.awt.Color(255, 255, 255));
        pause_label.setText("Pause:");

        pause_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        pause_textfeld.setBorder(null);
        pause_textfeld.setPreferredSize(new java.awt.Dimension(64, 25));

        javax.swing.GroupLayout arbeits_panelLayout = new javax.swing.GroupLayout(arbeits_panel);
        arbeits_panel.setLayout(arbeits_panelLayout);
        arbeits_panelLayout.setHorizontalGroup(
            arbeits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arbeits_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(arbeits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(überschrift_label)
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
                        .addComponent(löschen_button1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
        );
        arbeits_panelLayout.setVerticalGroup(
            arbeits_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(arbeits_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(überschrift_label)
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
                    .addComponent(löschen_button1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        abwesenheitsgrund_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Krank", "Urlaub", "Dienstreise", "sonstige Abwesenheit" }));
        abwesenheitsgrund_combobox.setBorder(null);

        abwesenheitsbeginn_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        abwesenheitsbeginn_textfeld.setBorder(null);
        abwesenheitsbeginn_textfeld.setPreferredSize(new java.awt.Dimension(64, 25));

        abwesenheitsende_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        abwesenheitsende_textfeld.setBorder(null);
        abwesenheitsende_textfeld.setPreferredSize(new java.awt.Dimension(64, 25));

        speichern_button2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        speichern_button2.setText("Speichern");
        speichern_button2.setBorder(null);
        speichern_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speichern_button2ActionPerformed(evt);
            }
        });

        löschen_button2.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        löschen_button2.setText("Löschen");
        löschen_button2.setBorder(null);
        löschen_button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                löschen_button2ActionPerformed(evt);
            }
        });

        notiz_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        notiz_label.setForeground(new java.awt.Color(255, 255, 255));
        notiz_label.setText("Notiz:");

        notiz_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        notiz_textfeld.setBorder(null);

        jScrollPane1.setBackground(new java.awt.Color(50, 50, 50));
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        urlaubs_tabelle.setBackground(new java.awt.Color(50, 50, 50));
        urlaubs_tabelle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "Urlaubsanspruch", "Urlaub akt. Jahr", "Urlaub Vorjahr", "Urlaub genommen", "Urlaub verfügbar"
            }
        ) {
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
                            .addComponent(löschen_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(löschen_button2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
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
			String sql = ("Insert into eintraege (`Mitarbeiter_ID`, `Datum`, `Beginn`, `Pause`, `Ende`, `Art`) values ('"+Login.username+"','"+datum_textfeld.getText()+"','"+beginn_textfeld.getText()+"','"+pause_textfeld.getText()+"','"+ende_textfeld.getText()+"','"+art_combobox.getSelectedItem()+"');");
					
			java.sql.PreparedStatement pst = con.prepareStatement(sql);
			pst.executeUpdate();
			löschen_button1ActionPerformed(evt);
			JOptionPane.showMessageDialog(null, "Eingabe gespeichert");		
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Eingabe fehlgeschlagen");
			löschen_button1ActionPerformed(evt);
			e.printStackTrace();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Eingabe fehlgeschlagen");
			löschen_button1ActionPerformed(evt);
			e.printStackTrace();
		}
		
    	
    }//GEN-LAST:event_speichern_button1ActionPerformed

    private void löschen_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_löschen_button1ActionPerformed
       beginn_textfeld.setText("");
       ende_textfeld.setText("");
       pause_textfeld.setText("");
       datum_textfeld.setText("");
       
    }//GEN-LAST:event_löschen_button1ActionPerformed

    private void speichern_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speichern_button2ActionPerformed
        
    }//GEN-LAST:event_speichern_button2ActionPerformed

    private void löschen_button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_löschen_button2ActionPerformed
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
    private javax.swing.JButton löschen_button1;
    private javax.swing.JButton löschen_button2;
    private javax.swing.JLabel notiz_label;
    private javax.swing.JTextField notiz_textfeld;
    private javax.swing.JLabel pause_label;
    private javax.swing.JTextField pause_textfeld;
    private javax.swing.JButton speichern_button1;
    private javax.swing.JButton speichern_button2;
    private Tabelle.Table urlaubs_tabelle;
    private javax.swing.JLabel überschrift_label;
    // End of variables declaration//GEN-END:variables
}
