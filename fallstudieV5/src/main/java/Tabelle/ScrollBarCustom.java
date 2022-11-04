package Tabelle;

import Tabelle.ModernScrollBarUI;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JScrollBar;

public class ScrollBarCustom extends JScrollBar {
//Konstruktor für die Custom Scrollbar
    public ScrollBarCustom() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(5, 5));
        setForeground(new Color(50,50,50));
        setOpaque(false);
        setBackground(new Color (100,100,100));
    }
}