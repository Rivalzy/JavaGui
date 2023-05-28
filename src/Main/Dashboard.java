package Main;

import Form.Form1;
import Form.Form2;
import SidebarMenu.EventSBar;
import java.awt.Component;
import javax.swing.*;
import net.miginfocom.swing.MigLayout;

public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        // Menambahkan component ke layer
        layer1.setLayout(new MigLayout("fill, inset 0", "[fill]", "[fill]"));
        layer1.setLayer(header, JLayeredPane.POPUP_LAYER);
        layer1.setLayer(Exit, JLayeredPane.POPUP_LAYER);
        layer1.setLayer(sBar1, JLayeredPane.POPUP_LAYER);
        layer1.setLayer(LsItem, JLayeredPane.POPUP_LAYER);
        layer1.setLayer(footer, JLayeredPane.POPUP_LAYER);

        
        layer1.add(header, "pos 0 0 71% 12%", 0);
        layer1.add(Exit, "pos 0 74,w 40, h 40", 0);
        layer1.add(sBar1, "pos 0 0.5al 60 n",0);
        layer1.add(LsItem, "pos 750 0 100% 100%", 0);
        layer1.add(footer, "pos 0 450 71% 100%", 0);
   
        
        sBar1.addEvent(new EventSBar() {
            @Override
            public void menuSelected(int index) {
                if(index==1) {
                    showForm(new Form1());
                } else if (index==2){
                    showForm(new Form2());
                }
            }
        });
    }

    private void showForm(Component com) {
        panel1.removeAll();
        panel1.add(com);
        panel1.repaint();
        panel1.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new Swing.Header();
        Exit = new javax.swing.JLabel();
        sBar1 = new SidebarMenu.SBar();
        LsItem = new Swing.ListItems();
        footer = new Swing.Footer();
        layer1 = new javax.swing.JLayeredPane();
        panel1 = new javax.swing.JPanel();

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/exit.png"))); // NOI18N
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel1.setBackground(new java.awt.Color(255, 247, 232));
        panel1.setLayout(new java.awt.BorderLayout());

        layer1.setLayer(panel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layer1Layout = new javax.swing.GroupLayout(layer1);
        layer1.setLayout(layer1Layout);
        layer1Layout.setHorizontalGroup(
            layer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
        );
        layer1Layout.setVerticalGroup(
            layer1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 532, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layer1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layer1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        // TODO add your handling code here:
        int tutup;
        tutup = JOptionPane.showConfirmDialog(null, "Yakin tutup porgram?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        if (tutup==JOptionPane.YES_OPTION) {
            System.exit(0);
        } 
    }//GEN-LAST:event_ExitMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private Swing.ListItems LsItem;
    private Swing.Footer footer;
    private Swing.Header header;
    private javax.swing.JLayeredPane layer1;
    private javax.swing.JPanel panel1;
    private SidebarMenu.SBar sBar1;
    // End of variables declaration//GEN-END:variables
}
