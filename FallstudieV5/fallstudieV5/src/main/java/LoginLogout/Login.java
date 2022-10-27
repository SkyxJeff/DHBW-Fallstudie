package LoginLogout;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

//import com.mysql.jdbc.PreparedStatement;
//import com.mysql.jdbc.*;

import dashboard.Home;

public class Login extends javax.swing.JFrame {

	public static String username;


    public Login() {
        initComponents();
        setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hintergrund = new javax.swing.JPanel();
        loginfenster = new Komponenten.RundesPanel();
        Ueberschrift = new javax.swing.JLabel();
        benutzernametextfeld = new javax.swing.JTextField();
        passworttextfeld = new javax.swing.JPasswordField();
        loginbutton = new javax.swing.JButton();
        Resetbutton = new javax.swing.JButton();
        benutzernamelabel = new javax.swing.JLabel();
        passwortlabel = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hintergrund.setBackground(new java.awt.Color(153, 153, 153));

        loginfenster.setBackground(new java.awt.Color(50, 50, 50));

        Ueberschrift.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        Ueberschrift.setForeground(new java.awt.Color(255, 255, 255));
        Ueberschrift.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ueberschrift.setText("Login");

        benutzernametextfeld.setBorder(null);
        benutzernametextfeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benutzernametextfeldActionPerformed(evt);
            }
        });

        passworttextfeld.setBorder(null);
        passworttextfeld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passworttextfeldActionPerformed(evt);
            }
        });

        loginbutton.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        loginbutton.setText("Login");
        loginbutton.setBorder(null);
        loginbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbuttonActionPerformed(evt);
            }
        });

        Resetbutton.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Resetbutton.setText("Reset");
        Resetbutton.setBorder(null);
        Resetbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbuttonActionPerformed(evt);
            }
        });

        benutzernamelabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        benutzernamelabel.setForeground(new java.awt.Color(255, 255, 255));
        benutzernamelabel.setText("Benutzername:");

        passwortlabel.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        passwortlabel.setForeground(new java.awt.Color(255, 255, 255));
        passwortlabel.setText("Passwort:");

        jComboBox1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deutsch", "English" }));
        jComboBox1.setBorder(null);

        javax.swing.GroupLayout loginfensterLayout = new javax.swing.GroupLayout(loginfenster);
        loginfenster.setLayout(loginfensterLayout);
        loginfensterLayout.setHorizontalGroup(
            loginfensterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginfensterLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(loginfensterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(benutzernamelabel)
                    .addComponent(passworttextfeld, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(loginbutton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(benutzernametextfeld)
                    .addComponent(passwortlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(loginfensterLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Resetbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(64, Short.MAX_VALUE))
            .addGroup(loginfensterLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginfensterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ueberschrift, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginfensterLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        loginfensterLayout.setVerticalGroup(
            loginfensterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginfensterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ueberschrift)
                .addGap(23, 23, 23)
                .addComponent(benutzernamelabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(benutzernametextfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwortlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passworttextfeld, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(loginbutton)
                .addGap(18, 18, 18)
                .addComponent(Resetbutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout hintergrundLayout = new javax.swing.GroupLayout(hintergrund);
        hintergrund.setLayout(hintergrundLayout);
        hintergrundLayout.setHorizontalGroup(
            hintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hintergrundLayout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(loginfenster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
        );
        hintergrundLayout.setVerticalGroup(
            hintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hintergrundLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(loginfenster, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
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

    private void benutzernametextfeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benutzernametextfeldActionPerformed
        
    }//GEN-LAST:event_benutzernametextfeldActionPerformed

    private void passworttextfeldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passworttextfeldActionPerformed
        
    }//GEN-LAST:event_passworttextfeldActionPerformed

    private void loginbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbuttonActionPerformed
    	String StandardPW = "start";
    	
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fallstudie", "root", "");
    		username = benutzernametextfeld.getText();
    		String sql = "Select * from login_daten_mitarbeiter where Mitarbeiter_ID=? and Passwort=?";
    		java.sql.PreparedStatement pst = con.prepareStatement(sql);
    		pst.setString(1, benutzernametextfeld.getText());
    		pst.setString(2, passworttextfeld.getText());
    		ResultSet rs = pst.executeQuery();
    		
    		String sql1PW = "Select Passwort from login_daten_mitarbeiter where Mitarbeiter_ID='"+Login.username+"';";
    		java.sql.PreparedStatement pst1 = con.prepareStatement(sql1PW);
    		ResultSet rs1 = pst1.executeQuery();
    		rs1.next();
    		String pw = rs1.getString(1);
    		System.out.println(pw);
    		
    		if(pw.equals("")&&passworttextfeld.getText().equals(StandardPW)) {
    			String sql3 = "Update login_daten_mitarbeiter set Passwort = 'start'where Mitarbeiter_ID= '"+Login.username+"';";
    			java.sql.PreparedStatement pst3 = con.prepareStatement(sql3);
    			pst3.executeUpdate(sql3);
    			 JOptionPane.showMessageDialog(null, "Standardpasswort zur�ckgesetzt, geben Sie nun Ihr eigenes Passwort ein.");
    			 passworttextfeld.setText("");	
    			 System.out.println("Ich bin hier");
    			 
    		}else if(pw.equals("start") && !passworttextfeld.getText().equals(StandardPW)) {
    			
    			String sql2 = "Update login_daten_mitarbeiter set Passwort = '"+passworttextfeld.getText()+"'where Mitarbeiter_ID= '"+Login.username+"';";
				java.sql.PreparedStatement pst2 = con.prepareStatement(sql2);
				pst2.executeUpdate(sql2);
				JOptionPane.showMessageDialog(null, "Login erfolgreich");
				new Home().setVisible(true);
                dispose();
				System.out.println("Ich bin jz hier");
			
    		}else if (!pw.equals(StandardPW) && pw.equals(passworttextfeld.getText())) {
	    			JOptionPane.showMessageDialog(null, "Login erfolgreich");
	    			new Home().setVisible(true);
	                dispose();
	    		}
	    		else {
	    			JOptionPane.showMessageDialog(null, "Login fehlgeschlagen");
	    			benutzernametextfeld.setText("");        
	                passworttextfeld.setText("");
	    		}
    		con.close();
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		JOptionPane.showMessageDialog(null, "Login fehlgeschlagen1");
    	}

    		
    }//GEN-LAST:event_loginbuttonActionPerformed

    private void ResetbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbuttonActionPerformed
            benutzernametextfeld.setText("");        
            passworttextfeld.setText("");
    }//GEN-LAST:event_ResetbuttonActionPerformed
    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Resetbutton;
    private javax.swing.JLabel benutzernamelabel;
    private javax.swing.JTextField benutzernametextfeld;
    private javax.swing.JPanel hintergrund;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JButton loginbutton;
    private Komponenten.RundesPanel loginfenster;
    private javax.swing.JLabel passwortlabel;
    private javax.swing.JPasswordField passworttextfeld;
    private javax.swing.JLabel Ueberschrift;
    // End of variables declaration//GEN-END:variables
}
