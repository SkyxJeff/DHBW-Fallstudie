package Ampel;

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
        grünesPanel = new Komponenten.RundesPanel();

        ampelPanel.setBackground(new java.awt.Color(102, 102, 102));

        rotesPanel.setBackground(new java.awt.Color(255, 0, 0));
        rotesPanel.setPreferredSize(new java.awt.Dimension(38, 38));

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

        gelbesPanel.setBackground(new java.awt.Color(255, 255, 0));
        gelbesPanel.setPreferredSize(new java.awt.Dimension(38, 38));

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

        grünesPanel.setBackground(new java.awt.Color(0, 255, 0));
        grünesPanel.setPreferredSize(new java.awt.Dimension(38, 38));

        javax.swing.GroupLayout grünesPanelLayout = new javax.swing.GroupLayout(grünesPanel);
        grünesPanel.setLayout(grünesPanelLayout);
        grünesPanelLayout.setHorizontalGroup(
            grünesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );
        grünesPanelLayout.setVerticalGroup(
            grünesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ampelPanelLayout = new javax.swing.GroupLayout(ampelPanel);
        ampelPanel.setLayout(ampelPanelLayout);
        ampelPanelLayout.setHorizontalGroup(
            ampelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ampelPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ampelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grünesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
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
                .addComponent(grünesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private Komponenten.RundesPanel grünesPanel;
    private Komponenten.RundesPanel rotesPanel;
    // End of variables declaration//GEN-END:variables
}
