package Kalendar;

import java.awt.Component;
import java.util.Calendar;
import java.util.Date;

public class PanelTag extends javax.swing.JPanel {

    private int month;
    private int year;
    
    public PanelTag(int month, int year) {
        initComponents();
        setOpaque(false);
        this.month = month;
        this.year = year;
        init();
    }
    private void init() {
        montag.asTitle();
        dienstag.asTitle();
        mittwoch.asTitle();
        donnerstag.asTitle();
        freitag.asTitle();
        samstag.asTitle();
        sonntag.asTitle();
        setDate();
    }
    private void setDate() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) - 1; 
        calendar.add(Calendar.DATE, -startDay);
        HeutigerTag toDay = getToDay();
        for (Component com : getComponents()) {
            Zelle cell = (Zelle) com;
            if (!cell.isTitle()) {
                cell.setText(calendar.get(Calendar.DATE) + "");
                cell.setDate(calendar.getTime());
                cell.currentMonth(calendar.get(Calendar.MONTH) == month - 1);
                calendar.add(Calendar.DATE, 1);
            }
        }
    }
     private HeutigerTag getToDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return new HeutigerTag(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sonntag = new Kalendar.Zelle();
        montag = new Kalendar.Zelle();
        dienstag = new Kalendar.Zelle();
        mittwoch = new Kalendar.Zelle();
        donnerstag = new Kalendar.Zelle();
        freitag = new Kalendar.Zelle();
        samstag = new Kalendar.Zelle();
        cell8 = new Kalendar.Zelle();
        cell9 = new Kalendar.Zelle();
        cell10 = new Kalendar.Zelle();
        cell11 = new Kalendar.Zelle();
        cell12 = new Kalendar.Zelle();
        cell13 = new Kalendar.Zelle();
        cell14 = new Kalendar.Zelle();
        cell15 = new Kalendar.Zelle();
        cell16 = new Kalendar.Zelle();
        cell17 = new Kalendar.Zelle();
        cell18 = new Kalendar.Zelle();
        cell19 = new Kalendar.Zelle();
        cell20 = new Kalendar.Zelle();
        cell21 = new Kalendar.Zelle();
        cell22 = new Kalendar.Zelle();
        cell23 = new Kalendar.Zelle();
        cell24 = new Kalendar.Zelle();
        cell25 = new Kalendar.Zelle();
        cell26 = new Kalendar.Zelle();
        cell27 = new Kalendar.Zelle();
        cell28 = new Kalendar.Zelle();
        cell29 = new Kalendar.Zelle();
        cell30 = new Kalendar.Zelle();
        cell31 = new Kalendar.Zelle();
        cell32 = new Kalendar.Zelle();
        cell33 = new Kalendar.Zelle();
        cell34 = new Kalendar.Zelle();
        cell35 = new Kalendar.Zelle();
        cell36 = new Kalendar.Zelle();
        cell37 = new Kalendar.Zelle();
        cell38 = new Kalendar.Zelle();
        cell39 = new Kalendar.Zelle();
        cell40 = new Kalendar.Zelle();
        cell41 = new Kalendar.Zelle();
        cell42 = new Kalendar.Zelle();
        cell43 = new Kalendar.Zelle();
        cell44 = new Kalendar.Zelle();
        cell45 = new Kalendar.Zelle();
        cell46 = new Kalendar.Zelle();
        cell47 = new Kalendar.Zelle();
        cell48 = new Kalendar.Zelle();
        cell49 = new Kalendar.Zelle();

        setPreferredSize(new java.awt.Dimension(518, 500));
        setLayout(new java.awt.GridLayout(7, 7));

        sonntag.setForeground(new java.awt.Color(255, 0, 0));
        sonntag.setText("Sonntag");
        sonntag.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(sonntag);

        montag.setForeground(new java.awt.Color(255, 255, 255));
        montag.setText("Montag");
        montag.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(montag);

        dienstag.setForeground(new java.awt.Color(255, 255, 255));
        dienstag.setText("Dienstag");
        dienstag.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(dienstag);

        mittwoch.setForeground(new java.awt.Color(255, 255, 255));
        mittwoch.setText("Mittwoch");
        mittwoch.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(mittwoch);

        donnerstag.setForeground(new java.awt.Color(255, 255, 255));
        donnerstag.setText("Donnerstag");
        donnerstag.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(donnerstag);

        freitag.setForeground(new java.awt.Color(255, 255, 255));
        freitag.setText("Freitag");
        freitag.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(freitag);

        samstag.setForeground(new java.awt.Color(255, 255, 255));
        samstag.setText("Samstag");
        samstag.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(samstag);

        cell8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell8);

        cell9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell9);

        cell10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell10);

        cell11.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell11);

        cell12.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell12);

        cell13.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell13);

        cell14.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell14);

        cell15.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell15);

        cell16.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell16);

        cell17.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell17);

        cell18.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell18);

        cell19.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell19);

        cell20.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell20);

        cell21.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell21);

        cell22.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell22);

        cell23.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell23);

        cell24.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell24);

        cell25.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell25);

        cell26.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell26);

        cell27.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell27);

        cell28.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell28);

        cell29.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell29);

        cell30.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell30);

        cell31.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell31);

        cell32.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell32);

        cell33.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell33);

        cell34.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell34);

        cell35.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell35);

        cell36.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell36);

        cell37.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell37);

        cell38.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell38);

        cell39.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell39);

        cell40.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell40);

        cell41.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell41);

        cell42.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell42);

        cell43.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell43);

        cell44.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell44);

        cell45.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell45);

        cell46.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell46);

        cell47.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell47);

        cell48.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell48);

        cell49.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        add(cell49);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Kalendar.Zelle cell10;
    private Kalendar.Zelle cell11;
    private Kalendar.Zelle cell12;
    private Kalendar.Zelle cell13;
    private Kalendar.Zelle cell14;
    private Kalendar.Zelle cell15;
    private Kalendar.Zelle cell16;
    private Kalendar.Zelle cell17;
    private Kalendar.Zelle cell18;
    private Kalendar.Zelle cell19;
    private Kalendar.Zelle cell20;
    private Kalendar.Zelle cell21;
    private Kalendar.Zelle cell22;
    private Kalendar.Zelle cell23;
    private Kalendar.Zelle cell24;
    private Kalendar.Zelle cell25;
    private Kalendar.Zelle cell26;
    private Kalendar.Zelle cell27;
    private Kalendar.Zelle cell28;
    private Kalendar.Zelle cell29;
    private Kalendar.Zelle cell30;
    private Kalendar.Zelle cell31;
    private Kalendar.Zelle cell32;
    private Kalendar.Zelle cell33;
    private Kalendar.Zelle cell34;
    private Kalendar.Zelle cell35;
    private Kalendar.Zelle cell36;
    private Kalendar.Zelle cell37;
    private Kalendar.Zelle cell38;
    private Kalendar.Zelle cell39;
    private Kalendar.Zelle cell40;
    private Kalendar.Zelle cell41;
    private Kalendar.Zelle cell42;
    private Kalendar.Zelle cell43;
    private Kalendar.Zelle cell44;
    private Kalendar.Zelle cell45;
    private Kalendar.Zelle cell46;
    private Kalendar.Zelle cell47;
    private Kalendar.Zelle cell48;
    private Kalendar.Zelle cell49;
    private Kalendar.Zelle cell8;
    private Kalendar.Zelle cell9;
    private Kalendar.Zelle dienstag;
    private Kalendar.Zelle donnerstag;
    private Kalendar.Zelle freitag;
    private Kalendar.Zelle mittwoch;
    private Kalendar.Zelle montag;
    private Kalendar.Zelle samstag;
    private Kalendar.Zelle sonntag;
    // End of variables declaration//GEN-END:variables
}
