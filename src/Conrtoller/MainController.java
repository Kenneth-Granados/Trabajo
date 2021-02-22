/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conrtoller;

import Views.Examen2Frame;
import Views.ExamenFrame;
import Views.FuncionesFrame;
import Views.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 *
 * @author Kenneth Granados
 */
public class MainController implements ActionListener{
    Principal p;

    public MainController(Principal p) {
        this.p = p;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
         switch(ae.getActionCommand()){
         case "Cargar":
            invokecreate();
             break;
         case "Crear":
           invokeresolver();
             break;
         case "Funcion":
             invokeFuncion();
             break;
     }
    }
    
    public void invokecreate (){
      ExamenFrame ef = new ExamenFrame();
       p.showChild(ef,false) ; 
       ef.InicioTiempo();     
   }
    
     public void invokeresolver(){
       Examen2Frame ef = new Examen2Frame();
       p.showChild(ef,false) ; 
       ef.InicioTiempo();       
   }
     
     public void invokeFuncion(){
       FuncionesFrame ff = new FuncionesFrame();
       p.showChild(ff,false) ;   
   }
}
