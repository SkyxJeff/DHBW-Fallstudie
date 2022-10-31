package Tabelle;

import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class TableHeaderCustomE extends DefaultTableCellRenderer {

    public TableHeaderCustomE() {
        setPreferredSize(new Dimension(0, 35));
        setBackground(new Color(60, 60, 60));
        setForeground(new Color(255, 255, 255));
    }

    @Override
    public void paint(Graphics grphcs) {
        super.paint(grphcs);
        grphcs.setColor(new Color(100, 100, 100));
        grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
    }
}