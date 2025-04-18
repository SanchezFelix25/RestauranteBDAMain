/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package itson.sistemarestaurantepresentacion;

import itson.sistemarestaurantepresentacion.control.Control;

/**
 *
 * @author rauln
 */
public class Inicio extends javax.swing.JFrame {

    private final Control controlador;
    
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        controlador = new Control();
        initComponents();
        setTitle("Elige tu rol");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTexto = new javax.swing.JLabel();
        iconAdministrador = new javax.swing.JLabel();
        iconMesero = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTexto.setFont(new java.awt.Font("Montserrat Medium", 1, 24)); // NOI18N
        labelTexto.setText("ELIGE TU ROL");
        labelTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(labelTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 180, -1));

        iconAdministrador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconAdministrador.png"))); // NOI18N
        iconAdministrador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconAdministradorMouseClicked(evt);
            }
        });
        jPanel1.add(iconAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 150, 150));

        iconMesero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconMesero.png"))); // NOI18N
        iconMesero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconMeseroMouseClicked(evt);
            }
        });
        jPanel1.add(iconMesero, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 150, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void iconAdministradorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconAdministradorMouseClicked
        controlador.abrirPantallaAdministrador();
    }//GEN-LAST:event_iconAdministradorMouseClicked

    private void iconMeseroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_iconMeseroMouseClicked
        dispose();
        controlador.abrirPantallaMesero();
    }//GEN-LAST:event_iconMeseroMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconAdministrador;
    private javax.swing.JLabel iconMesero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelTexto;
    // End of variables declaration//GEN-END:variables
}
