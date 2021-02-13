/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conrtoller;

import Views.FuncionesFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Kenneth Granados
 */
public class FuncionController implements ActionListener{
    FuncionesFrame ff;

    public FuncionController(FuncionesFrame ff) {
        this.ff = ff;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
      switch(ae.getActionCommand()){
         case "Graficar":
              ff.getgrafica();
             break;
         case "Agregar":
             ff.addgrafica();
             break;
         case "Limpiar":
             ff.clean();
             break;
     }
    }
    
}
