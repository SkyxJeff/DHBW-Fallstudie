package Tabelle;

import Tabelle.ScrollBarCustom;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

public class Table extends JTable {

    public Table() {
    }

    public void addTableStyle(JScrollPane scroll) {
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        setBorder(null);
        scroll.setBorder(null);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        JPanel panel = new JPanel();
        panel.setBackground(new Color(60, 60, 60));
        setForeground(new Color(255, 255, 255));
        setSelectionForeground(new Color(255, 255, 255));
        setSelectionBackground(new Color(50, 50, 50));
        setFont(new Font("Sanserif",Font.PLAIN,18));
        getTableHeader().setDefaultRenderer(new TableHeaderCustom());
        setRowHeight(25);
        setShowHorizontalLines(true);
        setGridColor(new Color(50, 50, 50));
        scroll.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panel);
    }

    @Override
    public Component prepareRenderer(TableCellRenderer tcr, int i, int i1) {
        Component com = super.prepareRenderer(tcr, i, i1);
        if (!isCellSelected(i, i1)) {
            com.setBackground(new Color(60, 60, 60));
        }
        return com;
    }

}