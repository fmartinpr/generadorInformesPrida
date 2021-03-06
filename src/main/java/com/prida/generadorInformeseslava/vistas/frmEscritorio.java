/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prida.generadorInformeseslava.vistas;

import com.prida.generadorInformeseslava.service.IAccionService;
import com.prida.generadorInformeseslava.configuracion.AppConfig;
import com.prida.generadorInformeseslava.configuracion.Propiedades;
import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.bind.JAXBException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 *
 * @author Programacion
 */
public class frmEscritorio extends javax.swing.JFrame {

    private final AbstractApplicationContext context;
    private Properties p;

    /**
     * Creates new form Escritorio
     */
    public frmEscritorio() {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
        try {
            p = new Propiedades().cargarPropiedades();
            initComponents();
        } catch (IOException ex) {
            Logger.getLogger(frmEscritorio.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtbMenu = new javax.swing.JToolBar();
        btnImportar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();
        jmbMenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtbMenu.setRollover(true);

        btnImportar.setText("IMPORTAR");
        btnImportar.setFocusable(false);
        btnImportar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnImportar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportarActionPerformed(evt);
            }
        });
        jtbMenu.add(btnImportar);

        btnExportar.setText("EXPORTAR");
        btnExportar.setActionCommand("exportar");
        btnExportar.setFocusable(false);
        btnExportar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExportar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportarActionPerformed(evt);
            }
        });
        jtbMenu.add(btnExportar);

        jMenu1.setText("File");
        jmbMenu.add(jMenu1);

        jMenu2.setText("Edit");
        jmbMenu.add(jMenu2);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jtbMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtbMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 254, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnImportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportarActionPerformed
        IAccionService servicio = (IAccionService) context.getBean("accionService");
        if (Boolean.parseBoolean(p.getProperty("aplicacion.master")) == true) {
            try {
                servicio.importar();
                JOptionPane.showMessageDialog(null, "Se ha realizado la importación con existo");
            } catch (HeadlessException ex){
                 Logger.getLogger(frmEscritorio.class.getName()).log(Level.SEVERE, null, ex);
                mostrarError(ex.getMessage());
            } catch (IOException ex) {
                Logger.getLogger(frmEscritorio.class.getName()).log(Level.SEVERE, null, ex);
                mostrarError(ex.getMessage());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(frmEscritorio.class.getName()).log(Level.SEVERE, null, ex);
                mostrarError(ex.getMessage());
            } catch (SQLException ex) {
                Logger.getLogger(frmEscritorio.class.getName()).log(Level.SEVERE, null, ex);
                mostrarError(ex.getMessage());
            }
        } else {
            try {
                servicio.importarXml();
                JOptionPane.showMessageDialog(null, "Se ha realizado la importación con existo");
            } catch (JAXBException ex) {
                Logger.getLogger(frmEscritorio.class.getName()).log(Level.SEVERE, null, ex);
                mostrarError(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnImportarActionPerformed

    private void btnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportarActionPerformed

        IAccionService servicio = (IAccionService) context.getBean("accionService");
        try {
            servicio.exportar();
            JOptionPane.showMessageDialog(null, "Se ha realizado la exportación con existo");
        } catch (JAXBException ex) {
            Logger.getLogger(frmEscritorio.class.getName()).log(Level.SEVERE, null, ex);
            mostrarError(ex.getMessage());
        } catch (IOException ex) {
            Logger.getLogger(frmEscritorio.class.getName()).log(Level.SEVERE, null, ex);
            mostrarError(ex.getMessage());
        }
    }//GEN-LAST:event_btnExportarActionPerformed

    private void mostrarError(String error) {
        JOptionPane.showMessageDialog(null, error);
    }

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
            java.util.logging.Logger.getLogger(frmEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmEscritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmEscritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnImportar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JToolBar jtbMenu;
    // End of variables declaration//GEN-END:variables
}
