
package Models;

import Views.Examen2Frame;
import Views.ExamenFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Cronometro2 extends Thread{
    JLabel etiq;
    
    public Cronometro2(JLabel cronometro) {
      this.etiq=cronometro;
      
    }

    
    @Override
    public void run(){
        try {
            int x=0;
            while (ExamenFrame.inicio==true) {                
               Thread.sleep(1000);
               ejecutarCronometro(x);
               x++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Exception: " +e.getMessage());
        }
    }

    private void ejecutarCronometro(int x) {
       
      Examen2Frame.segundos--;
        if (Examen2Frame.segundos==0) {
            Examen2Frame.segundos=59;
            Examen2Frame.minutos--;
        }
//        while (ExamenFrame.minutos==0 && ExamenFrame.segundos==0) {
//            JOptionPane.showMessageDialog(null, "No se puede regresar");
//            System.exit(0);
//     
//        }
        String textseg="",textmin="",texthora="";
        textseg+=Examen2Frame.segundos;
        textmin+=Examen2Frame.minutos;
        texthora+=Examen2Frame.hora;
        String reloj= texthora+":"+textmin+":"+textseg;
        etiq.setText(reloj);
    }
}
