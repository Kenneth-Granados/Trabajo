/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conrtoller;

import Models.DatosExamen;
import Views.ResolverExamen;
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
public class ResolverController implements ActionListener{
    ResolverExamen re;
    DatosExamen datosexamen;
    JFileChooser jfc;

    public ResolverController(ResolverExamen re) {
        this.re = re;
        jfc = new JFileChooser();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
         switch(ae.getActionCommand()){
         case "Guardar":
            jfc.showSaveDialog(re);
             File file = jfc.getSelectedFile();
             datosexamen = re.getData();
             saveExamen(file);
             break;
         case "load":
             jfc.showOpenDialog(re);
             datosexamen = open(jfc.getSelectedFile());
             re.setData(datosexamen);
             break;
         case "views":
             jfc.showOpenDialog(re);
             datosexamen = open(jfc.getSelectedFile());
             re.setExameResuelto(datosexamen);
             break;
         case "Limpiar":
             re.clean();
             break;
  
          }
    }

     public void saveExamen(File file){
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
