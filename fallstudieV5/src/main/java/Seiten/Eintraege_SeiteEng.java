package Seiten;

import javax.swing.*;
//Genauso wie in Eintraege_Seite, nur für die Englische Version
public class Eintraege_SeiteEng extends JPanel {

    public Eintraege_SeiteEng() {
        initComponents();
        setOpaque(false);
        eintraege_tabelle.addTableStyle(jScrollPane1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hintergrund_panel = new Komponenten.RundesPanel();
        Ueberschrift_label = new JLabel();
        jScrollPane1 = new JScrollPane();
        eintraege_tabelle = new Tabelle.Table();

        hintergrund_panel.setBackground(new java.awt.Color(50, 50, 50));

        Ueberschrift_label.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Ueberschrift_label.setForeground(new java.awt.Color(255, 255, 255));
        Ueberschrift_label.setText("Entries");

        jScrollPane1.setBackground(new java.awt.Color(50, 50, 50));
        jScrollPane1.setBorder(null);





        GroupLayout hintergrund_panelLayout = new GroupLayout(hintergrund_panel);
        hintergrund_panel.setLayout(hintergrund_panelLayout);
        hintergrund_panelLayout.setHorizontalGroup(
            hintergrund_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(hintergrund_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hintergrund_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(hintergrund_panelLayout.createSequentialGroup()
                        .addComponent(Ueberschrift_label)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE))
                .addContainerGap())
        );
        hintergrund_panelLayout.setVerticalGroup(
            hintergrund_panelLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(hintergrund_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ueberschrift_label)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(hintergrund_panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(hintergrund_panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Tabelle.Table eintraege_tabelle;
    private Komponenten.RundesPanel hintergrund_panel;
    private JScrollPane jScrollPane1;
    private JLabel Ueberschrift_label;
    // End of variables declaration//GEN-END:variables
}
