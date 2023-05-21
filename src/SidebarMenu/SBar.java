package SidebarMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;

public class SBar extends javax.swing.JPanel {

    private List<EventSBar> events;
    
    public SBar() {
        initComponents();
        setOpaque(false);
        events = new ArrayList<>();
        panel.setLayout(new MigLayout("wrap, fill, inset 0, gap 20", "[center]", "[center]"));
        addSpace(20);
        addItem("drink",0);
        addItem("food",1);
        addItem("drink",2);
        addSpace(20);
        
        repaint();
        revalidate();
    }

    private void addSpace(int size) {
        panel.add(new JLabel(), "h " + size + "!");
    }
    
    private void addItem(String Icon, int index) {
        IconItems item = new IconItems();
        item.setImage(new ImageIcon(getClass().getResource("/Icon/" + Icon + ".png")).getImage());
        item.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae) {
                runEvent(index);
            }
        });
        panel.add(item, "w 55!, h 55!");
    }
    
    public void addEvent(EventSBar event) {
        events.add(event);
    }
    
    private void runEvent(int indext) {
        for(EventSBar event : events) {
            event.menuSelected(indext);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new Swing.PanelRound();

        panel.setBackground(new java.awt.Color(10, 10, 10));
        panel.setRoundBottomRight(50);
        panel.setRoundTopRight(50);

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 86, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 534, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Swing.PanelRound panel;
    // End of variables declaration//GEN-END:variables
}
