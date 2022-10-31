package Tabelle;

import javax.swing.*;
import java.awt.*;

public class ScrollBarCustomE extends JScrollBar {

    public ScrollBarCustomE() {
        setUI(new ModernScrollBarUI());
        setPreferredSize(new Dimension(5, 5));
        setForeground(new Color(50,50,50));
        setOpaque(false);
        setBackground(new Color (100,100,100));
    }
}