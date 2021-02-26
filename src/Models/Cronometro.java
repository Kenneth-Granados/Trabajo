
package Models;

import Views.ExamenFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Cronometro extends Thread{
    JLabel etiq;
    
    public Cronometro(JLabel cronometro) {
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
       
      ExamenFrame.segundos--;
        if ( ExamenFrame.segundos==0 && ExamenFrame.minutos==0) {
            System.out.println("Hola");
            System.exit(0);
        } else {  
           if (ExamenFrame.segundos==0) {
            ExamenFrame.segundos=59;
            ExamenFrame.minutos--;
        }
           
        }
        String textseg="",textmin="",texthora="";
        textseg+=ExamenFrame.segundos;
        textmin+=ExamenFrame.minutos;
        texthora+=ExamenFrame.hora;
        String reloj= texthora+":"+textmin+":"+textseg;
        etiq.setText(reloj);
        
    }
}
