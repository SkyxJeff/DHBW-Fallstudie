package PasswortÄndern;

public class PasswortAkzeptanz extends javax.swing.JFrame {

    public PasswortAkzeptanz() {
        initComponents();
        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hintergrund_panel = new javax.swing.JPanel();
        gespeichert_label = new javax.swing.JLabel();
        ok_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        hintergrund_panel.setBackground(new java.awt.Color(50, 50, 50));

        gespeichert_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        gespeichert_label.setForeground(new java.awt.Color(255, 255, 255));
        gespeichert_label.setText("Neues Passwort gespeichert!");

        ok_button.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        ok_button.setText("OK");
        ok_button.setBorder(null);
        ok_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ok_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hintergrund_panelLayout = new javax.swing.GroupLayout(hintergrund_panel);
        hintergrund_panel.setLayout(hintergrund_panelLayout);
        hintergrund_panelLayout.setHorizontalGroup(
            hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hintergrund_panelLayout.createSequentialGroup()
                .addGroup(hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hintergrund_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(gespeichert_label))
                    .addGroup(hintergrund_panelLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(ok_button, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        hintergrund_panelLayout.setVerticalGroup(
            hintergrund_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hintergrund_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gespeichert_label)
                .addGap(18, 18, 18)
                .addComponent(ok_button, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hintergrund_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hintergrund_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ok_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ok_buttonActionPerformed
            dispose(); 
    }//GEN-LAST:event_ok_buttonActionPerformed

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
            java.util.logging.Logger.getLogger(PasswortAkzeptanz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswortAkzeptanz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswortAkzeptanz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswortAkzeptanz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswortAkzeptanz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel gespeichert_label;
    private javax.swing.JPanel hintergrund_panel;
    private javax.swing.JButton ok_button;
    // End of variables declaration//GEN-END:variables
}
