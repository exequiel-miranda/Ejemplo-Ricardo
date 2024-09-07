package controlador;

import java.awt.CardLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import vista.frmMenuPrincipal;
import vista.panelAmarillo;
import vista.panelRojo;
import vista.panelVerde;

//3- Heredar de la clase MouseListener
public class ctrlMenuPrincipal implements MouseListener {

    //1-Mandar a llamar a las demas capas
    frmMenuPrincipal vista;
    panelRojo PanelRojo;
    panelAmarillo PanelAmarillo;

    //2-Constructor
    public ctrlMenuPrincipal(frmMenuPrincipal Vista, panelRojo panelRojo, panelAmarillo panelAmarillo) {
        this.vista = Vista;
        this.PanelRojo = panelRojo;
        this.PanelAmarillo = panelAmarillo;

        vista.btnverde.addMouseListener(this);
        vista.btnAmarillo.addMouseListener(this);
        vista.btnRojo.addMouseListener(this);
        PanelRojo.btnMensaje.addMouseListener(this);
        PanelAmarillo.btnDespedirse.addMouseListener(this);

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.btnverde) {
            //1-Creo un objeto del panel que quiero mostrar
            panelVerde objVerde = new panelVerde();

            //2- Limpio el panel contendor (por si acaso)
            vista.jpContenedor.removeAll();
            //3- muestro el panel que quiero
            vista.jpContenedor.add(objVerde);

            //4- Refrescar todo
            vista.jpContenedor.revalidate();
            vista.jpContenedor.repaint();
        }

        if (e.getSource() == vista.btnAmarillo) {
            PanelAmarillo.initAmarillo();
            
            vista.jpContenedor.removeAll();
            vista.jpContenedor.add(PanelAmarillo);

            vista.jpContenedor.revalidate();
            vista.jpContenedor.repaint();

        }

        if (e.getSource() == vista.btnRojo) {
            PanelRojo.initRojo();

            vista.jpContenedor.removeAll();
            vista.jpContenedor.add(PanelRojo);

            vista.jpContenedor.revalidate();
            vista.jpContenedor.repaint();
        }

        if (e.getSource() == PanelRojo.btnMensaje) {
            JOptionPane.showMessageDialog(PanelRojo, "Hola");
            PanelRojo.jpContenedorDos.removeAll();
            PanelRojo.jpContenedorDos.add(PanelAmarillo);
            PanelAmarillo.initAmarillo();
            PanelRojo.revalidate();
            PanelRojo.repaint();

        }
        if (e.getSource() == PanelAmarillo.btnDespedirse) {
            JOptionPane.showMessageDialog(PanelAmarillo, "Hola");
        }

    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
