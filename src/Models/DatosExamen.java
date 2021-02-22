/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;
import java.util.StringTokenizer;

/**
 *
 * @author Kenneth Granados
 */
public class DatosExamen implements Serializable{
 String []pregunta = {
    "Pregunta 1?","Pregunta 2?","Pregunta 3?","Pregunta 4?","Pregunta 5?"
};
 
     String []respuesta = {
    "1","2","3","4","5"
};
   
     String[] posRespuesta={
         "1,2,3,4",
         "2,4,5,6",
         "3,4,5,6",
         "4,5,6,7",
         "5,6,7,8",
     };
     
    public String getPregunta(int pos) {
        return pregunta[pos];
    }

    public String getRespuesta(int pos) {
        return respuesta[pos];
    }
 
    public String[] Separador(String cad, String sep){
        StringTokenizer tok = new StringTokenizer(cad, sep);
        
        String[] a = new String[5];
        int i =0;
        
        while (tok.hasMoreTokens()) {            
            a[i]=tok.nextToken();
            i++;
        }
        return a;
}
    
    public String[] setSepRespuesta(int pos) {
        String s1 = posRespuesta[pos];
        String[] s2 = Separador(s1,",");
        return s2;
    }
 
}