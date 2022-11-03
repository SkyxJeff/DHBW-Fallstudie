package dashboard;

import LoginLogout.LogoutE;
import Menue.EventMenu;
import Menue.EventMenuE;

import Seiten.Einstellungen_SeiteE;
import Seiten.FormE;
import Seiten.MeineDaten_SeiteE;
import Seiten.MeineZeiten_SeiteE;
import Seiten.Uebersicht_SeiteE;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class HomeE extends JFrame {

    /**
     * Creates new form Fallstudie
     */
    public HomeE() {
        initComponents();
        setExtendedState(HomeE.MAXIMIZED_BOTH);
        setTitle("BBQ GmbH - Time Management Tool");
        EventMenuE event = new EventMenuE() {
            @Override
            public void selected(int index) {
                if (index == 0) {
                    showForm(new Uebersicht_SeiteE());
                } else if (index == 1) {
                    showForm(new MeineDaten_SeiteE());
                }
                else if (index==2){
                    showForm(new MeineZeiten_SeiteE());

                } 
                else if (index==3){
                    LoginE.txtDateierstellen();
                    try {
                        File file = new File("Eintraege.txt");
                        if (!Desktop.isDesktopSupported())
                        {
                            JOptionPane.showMessageDialog(null,"Filetype not supported.");
                            return;
                        }
                        Desktop desktop = Desktop.getDesktop();
                        if (file.exists())
                        {
                            desktop.open(file);
                        }
                    }catch (Exception e)
                    {
                       e.printStackTrace();
                    }
                }
                else if (index==4){

                }
                else if (index==5){
                    showForm(new Einstellungen_SeiteE());
                }
                else if (index==6){
                    new LogoutE().setVisible(true);

                }
                else {
                    showForm(new FormE(index));
                }
            }
        };
        menue1.initMenu((EventMenu) event);
        showForm(new Uebersicht_SeiteE());
    }
    private void showForm(Component com){
        body.removeAll();
        body.add(com);
        body.revalidate();
        body.repaint();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        roundPanel1 = new Komponenten.RundesPanel();
        jLabel1 = new JLabel();
        menue1 = new Menue.Menue();
        body = new JPanel();

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new Color(153, 153, 153));

        roundPanel1.setBackground(new Color(50, 50, 50));

        jLabel1.setFont(new Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("BBQ GmbH - Time Management Tool");

        GroupLayout roundPanel1Layout = new GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        body.setOpaque(false);
        body.setLayout(new BorderLayout());

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(roundPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(menue1, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(body, GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)))
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(roundPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(menue1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(body, GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomeE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JPanel body;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private Menue.Menue menue1;
    private Komponenten.RundesPanel roundPanel1;
    // End of variables declaration//GEN-END:variables
}
