/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginLogout;

public class Logout extends javax.swing.JFrame {

    public Logout() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hintergrund = new javax.swing.JPanel();
        fragelabel = new javax.swing.JLabel();
        ja_button = new javax.swing.JButton();
        nein_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        hintergrund.setBackground(new java.awt.Color(50, 50, 50));

        fragelabel.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        fragelabel.setForeground(new java.awt.Color(255, 255, 255));
        fragelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fragelabel.setText("Sind Sie sicher, dass Sie sich abmelden wollen?");

        ja_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        ja_button.setText("Ja");
        ja_button.setBorder(null);
        ja_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ja_buttonActionPerformed(evt);
            }
        });

        nein_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        nein_button.setText("Nein");
        nein_button.setBorder(null);
        nein_button.setPreferredSize(new java.awt.Dimension(16, 19));
        nein_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nein_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hintergrundLayout = new javax.swing.GroupLayout(hintergrund);
        hintergrund.setLayout(hintergrundLayout);
        hintergrundLayout.setHorizontalGroup(
            hintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hintergrundLayout.createSequentialGroup()
                .addGroup(hintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hintergrundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fragelabel))
                    .addGroup(hintergrundLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(ja_button, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(nein_button, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        hintergrundLayout.setVerticalGroup(
            hintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hintergrundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fragelabel)
                .addGap(25, 25, 25)
                .addGroup(hintergrundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ja_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nein_button, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
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

    private void ja_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ja_buttonActionPerformed
            System.exit(0);
    }//GEN-LAST:event_ja_buttonActionPerformed

    private void nein_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nein_buttonActionPerformed
            dispose();
    }//GEN-LAST:event_nein_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(Logout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Logout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Logout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Logout.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Logout().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fragelabel;
    private javax.swing.JPanel hintergrund;
    private javax.swing.JButton ja_button;
    private javax.swing.JButton nein_button;
    // End of variables declaration//GEN-END:variables
}
