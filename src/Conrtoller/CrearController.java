/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conrtoller;

import Models.DatosExamen;
import Views.CrearExamen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Kenneth Granados
 */
public class CrearController implements ActionListener{
   CrearExamen ee;
   DatosExamen datosexamen;
   JFileChooser jfc;
    public CrearController(CrearExamen ee) {
        this.ee = ee;
        jfc = new JFileChooser();
    }
   

    @Override
    public void actionPerformed(ActionEvent ae) {
      switch(ae.getActionCommand()){
         case "Guardar":
            jfc.showSaveDialog(ee);
             File file = jfc.getSelectedFile();
             datosexamen = ee.getData();
             save(file);
             break;
         case "Editar":
             jfc.showOpenDialog(ee);
             datosexamen = open(jfc.getSelectedFile());
             ee.setData(datosexamen);
             break;
         case "Limpiar":
             ee.clean();
             break;
          }
    }
    
    public void save(File file){
    try {
        ObjectOutputStream w = new ObjectOutputStream (new FileOutputStream(file));
        w.writeObject(datosexamen);
        w.flush();
    } catch (IOException e) {
       JOptionPane.showMessageDialog(null, e.getMessage());
    }
}
public DatosExamen open(File file){
   try {
        ObjectInputStream ois = new ObjectInputStream (new FileInputStream(file));
        return (DatosExamen)ois.readObject();
    } catch (IOException | ClassNotFoundException e) {
       JOptionPane.showMessageDialog(null, e.getMessage());
    } 
   return null;
}
}
