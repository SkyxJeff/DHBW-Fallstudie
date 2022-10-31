package Kalendar;

import java.awt.*;
import java.util.Calendar;
import java.util.Date;

public class PanelTagE extends javax.swing.JPanel {

    private int month;
    private int year;

    public PanelTagE(int month, int year) {
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

        sonntag = new Zelle();
        montag = new Zelle();
        dienstag = new Zelle();
        mittwoch = new Zelle();
        donnerstag = new Zelle();
        freitag = new Zelle();
        samstag = new Zelle();
        cell8 = new Zelle();
        cell9 = new Zelle();
        cell10 = new Zelle();
        cell11 = new Zelle();
        cell12 = new Zelle();
        cell13 = new Zelle();
        cell14 = new Zelle();
        cell15 = new Zelle();
        cell16 = new Zelle();
        cell17 = new Zelle();
        cell18 = new Zelle();
        cell19 = new Zelle();
        cell20 = new Zelle();
        cell21 = new Zelle();
        cell22 = new Zelle();
        cell23 = new Zelle();
        cell24 = new Zelle();
        cell25 = new Zelle();
        cell26 = new Zelle();
        cell27 = new Zelle();
        cell28 = new Zelle();
        cell29 = new Zelle();
        cell30 = new Zelle();
        cell31 = new Zelle();
        cell32 = new Zelle();
        cell33 = new Zelle();
        cell34 = new Zelle();
        cell35 = new Zelle();
        cell36 = new Zelle();
        cell37 = new Zelle();
        cell38 = new Zelle();
        cell39 = new Zelle();
        cell40 = new Zelle();
        cell41 = new Zelle();
        cell42 = new Zelle();
        cell43 = new Zelle();
        cell44 = new Zelle();
        cell45 = new Zelle();
        cell46 = new Zelle();
        cell47 = new Zelle();
        cell48 = new Zelle();
        cell49 = new Zelle();

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
    private Zelle cell10;
    private Zelle cell11;
    private Zelle cell12;
    private Zelle cell13;
    private Zelle cell14;
    private Zelle cell15;
    private Zelle cell16;
    private Zelle cell17;
    private Zelle cell18;
    private Zelle cell19;
    private Zelle cell20;
    private Zelle cell21;
    private Zelle cell22;
    private Zelle cell23;
    private Zelle cell24;
    private Zelle cell25;
    private Zelle cell26;
    private Zelle cell27;
    private Zelle cell28;
    private Zelle cell29;
    private Zelle cell30;
    private Zelle cell31;
    private Zelle cell32;
    private Zelle cell33;
    private Zelle cell34;
    private Zelle cell35;
    private Zelle cell36;
    private Zelle cell37;
    private Zelle cell38;
    private Zelle cell39;
    private Zelle cell40;
    private Zelle cell41;
    private Zelle cell42;
    private Zelle cell43;
    private Zelle cell44;
    private Zelle cell45;
    private Zelle cell46;
    private Zelle cell47;
    private Zelle cell48;
    private Zelle cell49;
    private Zelle cell8;
    private Zelle cell9;
    private Zelle dienstag;
    private Zelle donnerstag;
    private Zelle freitag;
    private Zelle mittwoch;
    private Zelle montag;
    private Zelle samstag;
    private Zelle sonntag;
    // End of variables declaration//GEN-END:variables
}
