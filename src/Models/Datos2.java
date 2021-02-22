/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Kenneth Granados
 */
public class Datos2 extends DatosExamen{

    String []pregunta2 = {
    "Pregunta 12?","Pregunta 22?","Pregunta 32?","Pregunta 42?","Pregunta 52?"
};
 
     String []respuesta2 = {
    "1","2","3","4","5"
};
   
     String[] posRespuesta2={
         "1,24,32,24",
         "2,42,25,26",
         "3,42,25,62",
         "4,25,26,27",
         "5,26,722,8",
     };

    @Override
    public String getPregunta(int pos) {
        return pregunta2[pos];
    }
      
    @Override
    public String getRespuesta(int pos) {
        return respuesta2[pos]; 
    }

    @Override
    public String[] setSepRespuesta(int pos) {
        String s1 = posRespuesta2[pos];
        String[] s2 = Separador(s1,",");
        return s2;
    }
  
}
