package Seiten;
import Menü.Menü;
public class Übersicht_Seite extends javax.swing.JPanel {

    /**
	 * 
	 */
	
	public Übersicht_Seite() {
        initComponents();
        setOpaque(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ampel_panel = new Komponenten.RundesPanel();
        ampel = new Ampel.Ampel();
        grenzwert_rot_label = new javax.swing.JLabel();
        grenzwert_gelb_label = new javax.swing.JLabel();
        grenzwert_grün_label = new javax.swing.JLabel();
        daten_panel = new Komponenten.RundesPanel();
        heute_ist_panel = new Komponenten.RundesPanel();
        stunden_label1 = new javax.swing.JLabel();
        heute_ist_label = new javax.swing.JLabel();
        saldo_panel = new Komponenten.RundesPanel();
        stunden_label2 = new javax.swing.JLabel();
        saldo_label = new javax.swing.JLabel();
        woche_panel = new Komponenten.RundesPanel();
        stunden_label3 = new javax.swing.JLabel();
        woche_label = new javax.swing.JLabel();
        quartal_panel = new Komponenten.RundesPanel();
        stunden_label6 = new javax.swing.JLabel();
        quartal_label = new javax.swing.JLabel();
        jahr_panel = new Komponenten.RundesPanel();
        stunden_label5 = new javax.swing.JLabel();
        jahr_label = new javax.swing.JLabel();
        heute_soll_panel = new Komponenten.RundesPanel();
        stunden_label4 = new javax.swing.JLabel();
        heute_soll_label = new javax.swing.JLabel();
        willkommen_panel = new Komponenten.RundesPanel();
        willkommen_label = new javax.swing.JLabel();
        nachname_vorname_label = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(785, 390));

        ampel_panel.setBackground(new java.awt.Color(50, 50, 50));

        grenzwert_rot_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        grenzwert_rot_label.setForeground(new java.awt.Color(255, 255, 255));
        grenzwert_rot_label.setText("jLabel2");

        grenzwert_gelb_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        grenzwert_gelb_label.setForeground(new java.awt.Color(255, 255, 255));
        grenzwert_gelb_label.setText("jLabel3");

        grenzwert_grün_label.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        grenzwert_grün_label.setForeground(new java.awt.Color(255, 255, 255));
        grenzwert_grün_label.setText("jLabel4");

        javax.swing.GroupLayout ampel_panelLayout = new javax.swing.GroupLayout(ampel_panel);
        ampel_panel.setLayout(ampel_panelLayout);
        ampel_panelLayout.setHorizontalGroup(
            ampel_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ampel_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ampel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ampel_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(grenzwert_rot_label)
                    .addComponent(grenzwert_gelb_label)
                    .addComponent(grenzwert_grün_label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ampel_panelLayout.setVerticalGroup(
            ampel_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ampel_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ampel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(ampel_panelLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(grenzwert_rot_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(grenzwert_gelb_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(grenzwert_grün_label)
                .addGap(15, 15, 15))
        );

        daten_panel.setBackground(new java.awt.Color(50, 50, 50));
        daten_panel.setPreferredSize(new java.awt.Dimension(500, 184));

        heute_ist_panel.setBackground(new java.awt.Color(102, 102, 102));
        heute_ist_panel.setPreferredSize(new java.awt.Dimension(109, 66));

        stunden_label1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        stunden_label1.setForeground(new java.awt.Color(255, 255, 255));
        stunden_label1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stunden_label1.setText("00:00 Std.");

        heute_ist_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        heute_ist_label.setForeground(new java.awt.Color(255, 255, 255));
        heute_ist_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heute_ist_label.setText("Heute-Ist");

        javax.swing.GroupLayout heute_ist_panelLayout = new javax.swing.GroupLayout(heute_ist_panel);
        heute_ist_panel.setLayout(heute_ist_panelLayout);
        heute_ist_panelLayout.setHorizontalGroup(
            heute_ist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(heute_ist_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(heute_ist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stunden_label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(heute_ist_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        heute_ist_panelLayout.setVerticalGroup(
            heute_ist_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(heute_ist_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stunden_label1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(heute_ist_label, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        saldo_panel.setBackground(new java.awt.Color(102, 102, 102));
        saldo_panel.setPreferredSize(new java.awt.Dimension(109, 66));

        stunden_label2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        stunden_label2.setForeground(new java.awt.Color(255, 255, 255));
        stunden_label2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stunden_label2.setText("00:00 Std.");

        saldo_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        saldo_label.setForeground(new java.awt.Color(255, 255, 255));
        saldo_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saldo_label.setText("Saldo");

        javax.swing.GroupLayout saldo_panelLayout = new javax.swing.GroupLayout(saldo_panel);
        saldo_panel.setLayout(saldo_panelLayout);
        saldo_panelLayout.setHorizontalGroup(
            saldo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saldo_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(saldo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stunden_label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(saldo_label, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addContainerGap())
        );
        saldo_panelLayout.setVerticalGroup(
            saldo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(saldo_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stunden_label2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saldo_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        woche_panel.setBackground(new java.awt.Color(102, 102, 102));
        woche_panel.setPreferredSize(new java.awt.Dimension(109, 66));

        stunden_label3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        stunden_label3.setForeground(new java.awt.Color(255, 255, 255));
        stunden_label3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stunden_label3.setText("00:00 Std.");

        woche_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        woche_label.setForeground(new java.awt.Color(255, 255, 255));
        woche_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        woche_label.setText("Woche");

        javax.swing.GroupLayout woche_panelLayout = new javax.swing.GroupLayout(woche_panel);
        woche_panel.setLayout(woche_panelLayout);
        woche_panelLayout.setHorizontalGroup(
            woche_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(woche_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(woche_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stunden_label3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(woche_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        woche_panelLayout.setVerticalGroup(
            woche_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(woche_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stunden_label3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(woche_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        quartal_panel.setBackground(new java.awt.Color(102, 102, 102));

        stunden_label6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        stunden_label6.setForeground(new java.awt.Color(255, 255, 255));
        stunden_label6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stunden_label6.setText("00:00 Std.");

        quartal_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        quartal_label.setForeground(new java.awt.Color(255, 255, 255));
        quartal_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        quartal_label.setText("Quartal");

        javax.swing.GroupLayout quartal_panelLayout = new javax.swing.GroupLayout(quartal_panel);
        quartal_panel.setLayout(quartal_panelLayout);
        quartal_panelLayout.setHorizontalGroup(
            quartal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quartal_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quartal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stunden_label6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quartal_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        quartal_panelLayout.setVerticalGroup(
            quartal_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quartal_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stunden_label6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quartal_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jahr_panel.setBackground(new java.awt.Color(102, 102, 102));
        jahr_panel.setPreferredSize(new java.awt.Dimension(109, 66));

        stunden_label5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        stunden_label5.setForeground(new java.awt.Color(255, 255, 255));
        stunden_label5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stunden_label5.setText("00:00 Std.");

        jahr_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jahr_label.setForeground(new java.awt.Color(255, 255, 255));
        jahr_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jahr_label.setText("Jahr");

        javax.swing.GroupLayout jahr_panelLayout = new javax.swing.GroupLayout(jahr_panel);
        jahr_panel.setLayout(jahr_panelLayout);
        jahr_panelLayout.setHorizontalGroup(
            jahr_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jahr_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jahr_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stunden_label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jahr_label, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)))
        );
        jahr_panelLayout.setVerticalGroup(
            jahr_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jahr_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stunden_label5)
                .addGap(6, 6, 6)
                .addComponent(jahr_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        heute_soll_panel.setBackground(new java.awt.Color(102, 102, 102));
        heute_soll_panel.setPreferredSize(new java.awt.Dimension(163, 66));

        stunden_label4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        stunden_label4.setForeground(new java.awt.Color(255, 255, 255));
        stunden_label4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stunden_label4.setText("00:00 Std.");

        heute_soll_label.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        heute_soll_label.setForeground(new java.awt.Color(255, 255, 255));
        heute_soll_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heute_soll_label.setText("Heute-Soll");

        javax.swing.GroupLayout heute_soll_panelLayout = new javax.swing.GroupLayout(heute_soll_panel);
        heute_soll_panel.setLayout(heute_soll_panelLayout);
        heute_soll_panelLayout.setHorizontalGroup(
            heute_soll_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(heute_soll_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(heute_soll_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stunden_label4, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(heute_soll_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        heute_soll_panelLayout.setVerticalGroup(
            heute_soll_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(heute_soll_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stunden_label4)
                .addGap(6, 6, 6)
                .addComponent(heute_soll_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout daten_panelLayout = new javax.swing.GroupLayout(daten_panel);
        daten_panel.setLayout(daten_panelLayout);
        daten_panelLayout.setHorizontalGroup(
            daten_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daten_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(daten_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(saldo_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(heute_ist_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(daten_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(heute_soll_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(woche_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(daten_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(quartal_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jahr_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE))
                .addContainerGap())
        );
        daten_panelLayout.setVerticalGroup(
            daten_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(daten_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(daten_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(heute_ist_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(heute_soll_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                    .addComponent(quartal_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(daten_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saldo_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(woche_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jahr_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addContainerGap())
        );

        willkommen_panel.setBackground(new java.awt.Color(50, 50, 50));

        willkommen_label.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        willkommen_label.setForeground(new java.awt.Color(255, 255, 255));
        willkommen_label.setText("Willkommen im Zeiterfassungsportal der BBQ GmbH, \n");

        nachname_vorname_label.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        nachname_vorname_label.setForeground(new java.awt.Color(255, 255, 255));
        nachname_vorname_label.setText(Menü.Nachname+ ", " + Menü.Vorname );

        javax.swing.GroupLayout willkommen_panelLayout = new javax.swing.GroupLayout(willkommen_panel);
        willkommen_panel.setLayout(willkommen_panelLayout);
        willkommen_panelLayout.setHorizontalGroup(
            willkommen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(willkommen_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(willkommen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(willkommen_label)
                    .addComponent(nachname_vorname_label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        willkommen_panelLayout.setVerticalGroup(
            willkommen_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(willkommen_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(willkommen_label)
                .addGap(18, 18, 18)
                .addComponent(nachname_vorname_label)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ampel_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(daten_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(willkommen_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(willkommen_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(daten_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                    .addComponent(ampel_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Ampel.Ampel ampel;
    private Komponenten.RundesPanel ampel_panel;
    private Komponenten.RundesPanel daten_panel;
    private javax.swing.JLabel grenzwert_gelb_label;
    private javax.swing.JLabel grenzwert_grün_label;
    private javax.swing.JLabel grenzwert_rot_label;
    private javax.swing.JLabel heute_ist_label;
    private Komponenten.RundesPanel heute_ist_panel;
    private javax.swing.JLabel heute_soll_label;
    private Komponenten.RundesPanel heute_soll_panel;
    private javax.swing.JLabel jahr_label;
    private Komponenten.RundesPanel jahr_panel;
    private javax.swing.JLabel nachname_vorname_label;
    private javax.swing.JLabel quartal_label;
    private Komponenten.RundesPanel quartal_panel;
    private javax.swing.JLabel saldo_label;
    private Komponenten.RundesPanel saldo_panel;
    private javax.swing.JLabel stunden_label1;
    private javax.swing.JLabel stunden_label2;
    private javax.swing.JLabel stunden_label3;
    private javax.swing.JLabel stunden_label4;
    private javax.swing.JLabel stunden_label5;
    private javax.swing.JLabel stunden_label6;
    private javax.swing.JLabel willkommen_label;
    private Komponenten.RundesPanel willkommen_panel;
    private javax.swing.JLabel woche_label;
    private Komponenten.RundesPanel woche_panel;
    // End of variables declaration//GEN-END:variables
}
