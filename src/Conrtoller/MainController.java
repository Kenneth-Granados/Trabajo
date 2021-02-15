/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conrtoller;


import Views.CrearExamen;
import Views.FuncionesFrame;
import Views.Principal;
import Views.ResolverExamen;
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
            invokeresolver();
             break;
         case "Crear":
             invokecreate();
             break;
         case "Funcion":
             invokeFuncion();
             break;
     }
    }
    
    public void invokecreate(){
       CrearExamen ce = new CrearExamen();
       p.showChild(ce,false) ;       
   }
    
     public void invokeresolver(){
       ResolverExamen re = new ResolverExamen();
       p.showChild(re,false) ;       
   }
     
     public void invokeFuncion(){
       FuncionesFrame ff = new FuncionesFrame();
       p.showChild(ff,false) ;   
   }
}
