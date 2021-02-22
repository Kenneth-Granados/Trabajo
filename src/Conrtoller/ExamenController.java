/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conrtoller;

import Views.ExamenFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Kenneth Granados
 */
public class ExamenController implements ActionListener{
  private ExamenFrame ef;

    public ExamenController(ExamenFrame ef) {
        this.ef = ef;
    }
  
    
    @Override
    public void actionPerformed(ActionEvent ae) {
   switch(ae.getActionCommand()){
         case "Regresar":
             ef.RegresarData();
             break;
         case "Terminar":
             ef.Resultado();
             ef.FinTiempo();
             break;
         case "Avanzar":
             ef.AvanceData();
             break;
         
             
     } 
    }  
}
