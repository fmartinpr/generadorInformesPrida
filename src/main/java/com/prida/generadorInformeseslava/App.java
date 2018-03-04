package com.prida.generadorInformeseslava;

import com.prida.generadorInformeseslava.vistas.frmEscritorio;
import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App 
{
    static frmEscritorio es;
    public static void main( String[] args )
    {
        Inicializar();
    }

    private static void Inicializar() {
        JOptionPane.showMessageDialog(null, "Actualizame");
        es = new frmEscritorio();
        es.setExtendedState(frmEscritorio.MAXIMIZED_BOTH);
        es.setVisible(true);
    }
}
