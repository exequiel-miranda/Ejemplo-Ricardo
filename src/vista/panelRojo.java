/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.ctrlMenuPrincipal;

/**
 *
 * @author Bryan
 */
public class panelRojo extends javax.swing.JPanel {

    /**
     * Creates new form panelRojo
     */
    public panelRojo() {
        initComponents();
    }
    
       public static void initRojo(){
            
        panelRojo panel = new panelRojo();
        frmMenuPrincipal vista = new frmMenuPrincipal();
        panelAmarillo panel2 = new panelAmarillo();
        
        ctrlMenuPrincipal controlador = new ctrlMenuPrincipal(vista,panel, panel2);
        
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMensaje = new javax.swing.JButton();
        jpContenedorDos = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 0, 0));

        btnMensaje.setText("jButton1");

        jpContenedorDos.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(btnMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpContenedorDos, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(291, Short.MAX_VALUE)
                .addComponent(btnMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
            .addComponent(jpContenedorDos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnMensaje;
    public javax.swing.JPanel jpContenedorDos;
    // End of variables declaration//GEN-END:variables
}
