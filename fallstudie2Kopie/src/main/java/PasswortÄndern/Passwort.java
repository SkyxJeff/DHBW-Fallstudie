package PasswortÄndern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import com.mysql.jdbc.Statement;

import LoginLogout.Login;

public class Passwort extends javax.swing.JFrame {

    public Passwort() {
        initComponents();
        setLocationRelativeTo(null);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hintergrund = new javax.swing.JPanel();
        überschrift_label = new javax.swing.JLabel();
        altesPasswort_label = new javax.swing.JLabel();
        neuesPasswort_label = new javax.swing.JLabel();
        altesPasswort_textfeld = new javax.swing.JTextField();
        neuesPasswort_textfeld = new javax.swing.JTextField();
        speichern_button = new javax.swing.JButton();
        abbrechen_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        hintergrund.setBackground(new java.awt.Color(50, 50, 50));

        überschrift_label.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        überschrift_label.setForeground(new java.awt.Color(255, 255, 255));
        überschrift_label.setText("Passwort ändern");

        altesPasswort_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        altesPasswort_label.setForeground(new java.awt.Color(255, 255, 255));
        altesPasswort_label.setText("altes Passwort:");

        neuesPasswort_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        neuesPasswort_label.setForeground(new java.awt.Color(255, 255, 255));
        neuesPasswort_label.setText("neues Passwort:");

        altesPasswort_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        altesPasswort_textfeld.setBorder(null);

        neuesPasswort_textfeld.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        neuesPasswort_textfeld.setBorder(null);

        speichern_button.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        speichern_button.setText("Speichern");
        speichern_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speichern_buttonActionPerformed(evt);
            }
        });

        abbrechen_button.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        abbrechen_button.setText("Abbrechen");
        abbrechen_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abbrechen_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hintergrundLayout = new javax.swing.GroupLayout(hintergrund);
        hintergrund.setLayout(hintergrundLayout);
        hintergrundLayout.setHorizontalGroup(
            hintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hintergrundLayout.createSequentialGroup()
                        .addComponent(überschrift_label)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(hintergrundLayout.createSequentialGroup()
                        .addGroup(hintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hintergrundLayout.createSequentialGroup()
                                .addGroup(hintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(neuesPasswort_label)
                                    .addComponent(altesPasswort_label, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(hintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(altesPasswort_textfeld, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(neuesPasswort_textfeld)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hintergrundLayout.createSequentialGroup()
                                .addComponent(speichern_button)
                                .addGap(18, 18, 18)
                                .addComponent(abbrechen_button)))
                        .addGap(0, 26, Short.MAX_VALUE))))
        );
        hintergrundLayout.setVerticalGroup(
            hintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(überschrift_label)
                .addGap(18, 18, 18)
                .addGroup(hintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altesPasswort_label)
                    .addComponent(altesPasswort_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(hintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(neuesPasswort_label)
                    .addComponent(neuesPasswort_textfeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(hintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(speichern_button)
                    .addComponent(abbrechen_button))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hintergrund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hintergrund, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void speichern_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speichern_buttonActionPerformed
    	
    	String altesPW = altesPasswort_textfeld.getText();
    	System.out.println(Login.username);
    	String sql1 = "Select Passwort from login_daten_mitarbeiter where Mitarbeiter_ID='"+Login.username+"';";
    	
    	
    		try {
    			
    			Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
				java.sql.PreparedStatement pst1 = con.prepareStatement(sql1);
				ResultSet rs = pst1.executeQuery();
				
				
				if (rs.next()) {
					String altPWDB = rs.getString(1);
					
					if (altesPW.equals(altPWDB)) {
						String sql2 = "Update login_daten_mitarbeiter set Passwort = '"+neuesPasswort_textfeld.getText()+"'where Mitarbeiter_ID= '"+Login.username+"';";
						java.sql.PreparedStatement pst = con.prepareStatement(sql2);
						pst.executeUpdate(sql2);
						new PasswortAkzeptanz().setVisible(true);
						dispose();
						
						
	    				} else {JOptionPane.showMessageDialog(null, "Altes Passwort ist falsch.");}
				}
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		
    	
    	
    }//GEN-LAST:event_speichern_buttonActionPerformed

    private void abbrechen_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abbrechen_buttonActionPerformed
        dispose();
    }//GEN-LAST:event_abbrechen_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Passwort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Passwort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Passwort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Passwort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Passwort().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abbrechen_button;
    private javax.swing.JLabel altesPasswort_label;
    private javax.swing.JTextField altesPasswort_textfeld;
    private javax.swing.JPanel hintergrund;
    private javax.swing.JLabel neuesPasswort_label;
    private javax.swing.JTextField neuesPasswort_textfeld;
    private javax.swing.JButton speichern_button;
    private javax.swing.JLabel überschrift_label;
    // End of variables declaration//GEN-END:variables
}
