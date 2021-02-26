/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conrtoller;

import Views.FuncionesFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kenneth Granados
 */
public class FuncionController implements ActionListener, KeyListener {

    FuncionesFrame ff;

    public FuncionController(FuncionesFrame ff) {
        this.ff = ff;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {//no se xq me presenta error
        switch (ae.getActionCommand()) {
            case "Graficar":
            {
                try {
                    ff.getgrafica();
                } catch (Exception ex) {
                    Logger.getLogger(FuncionController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                break;

            case "Agregar":
            {
                try {
                    ff.addgrafica();
                } catch (Exception ex) {
                    Logger.getLogger(FuncionController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            case "Limpiar":
                ff.clean();
                break;
        }
    }

  
    
    @Override
    public void keyTyped(KeyEvent ke) {//recive evento del teclado y q anule espacio
        if (ke.getSource() == ff.getFuncTextField() || ke.getSource() == ff.getIntervaloTextField() || ke.getSource() == ff.getX0TextField() || ke.getSource() == ff.getXnTextField()) {
            if (ke.getKeyChar() == ' ') {
                ke.consume();
            }

        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
    }

    @Override
    public void keyReleased(KeyEvent ke) {
    }

}
