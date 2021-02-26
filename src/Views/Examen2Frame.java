
package Views;

import Conrtoller.Examen2Controller;
import Models.Cronometro2;
import Models.Datos2;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Kenneth Granados
 */
public class Examen2Frame extends javax.swing.JInternalFrame {

    Examen2Controller e2c;
    public static int hora=0,minutos=59,segundos=59;
    public static boolean inicio=true;
     boolean corriendo=false;
      Datos2 de= new Datos2();

    public Examen2Frame() {
        initComponents();
        setupController();
        String[] b = de.setSepRespuesta(pos);
           questionLabel.setText(de.getPregunta(0));
            buttonGroup1.clearSelection();
            resp1RadioButton.setText(b[0]);
            resp2RadioButton.setText(b[1]);
            resp3RadioButton.setText(b[2]);
            resp4RadioButton.setText(b[3]);
            resp1RadioButton.requestFocus();
    }
  
    public final void setupController(){

        e2c = new Examen2Controller(this);
        regresarButton.addActionListener(e2c);
        avanzarButton.addActionListener(e2c);
        terminarButton.addActionListener(e2c);
    }
    int pos=0;
   
    Object [] select ={"","","","","" };
    
    public void AvanceData(){
        
        if (pos <5 ) {
            pos++;
            questionLabel.setText(de.getPregunta(pos));
            String[] b = de.setSepRespuesta(pos);
            buttonGroup1.clearSelection();
            resp1RadioButton.setText(b[0]);
            resp2RadioButton.setText(b[1]);
            resp3RadioButton.setText(b[2]);
            resp4RadioButton.setText(b[3]);
            resp1RadioButton.requestFocus();
        } else {
            Toolkit.getDefaultToolkit().beep();
            JOptionPane.showMessageDialog(null, "Ya no hay mas preguntas");
        }
 
    }
    
    public void RegresarData(){

        if (pos >0) {
             pos--;
        } else {
          
        }
        
        if (pos > -1) {

            questionLabel.setText(de.getPregunta(pos));
            String[] b = de.setSepRespuesta(pos);
            buttonGroup1.clearSelection();
            resp1RadioButton.setText(b[0]);
            resp2RadioButton.setText(b[1]);
            resp3RadioButton.setText(b[2]);
            resp4RadioButton.setText(b[3]);
            resp1RadioButton.requestFocus();
        } else {
             Toolkit.getDefaultToolkit().beep();
             JOptionPane.showMessageDialog(null, "No se puede regresar");
        }
    }
    
    public void Resultado() {
        
        int calif=0;
        for (int i = 0; i < 5; i++) {
            if (select[i].equals(de.getRespuesta(i))) {
                calif= calif + 1;
            }
        }
        calif= calif * 2;
        JOptionPane.showMessageDialog(null, "La calificacion es: "+calif);
    }
    
    public void InicioTiempo(){
        if (corriendo==false) {
            inicio=true;
            corriendo=false;
            iniciarCronometro();
        }
    }
    
     public void FinTiempo(){
            inicio=false;
            corriendo=false;
             hora=0;
            minutos=59;
           segundos=59;
    }
  
     public void iniciarCronometro() {
         if (inicio==true) {
             Cronometro2 c = new Cronometro2(cronometroLabel);
             c.start();
         }
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        questionLabel = new javax.swing.JLabel();
        regresarButton = new javax.swing.JButton();
        terminarButton = new javax.swing.JButton();
        avanzarButton = new javax.swing.JButton();
        resp1RadioButton = new javax.swing.JRadioButton();
        resp2RadioButton = new javax.swing.JRadioButton();
        resp3RadioButton = new javax.swing.JRadioButton();
        resp4RadioButton = new javax.swing.JRadioButton();
        cronometroLabel = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Examen de ecuaciones");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Pregunta");

        questionLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        questionLabel.setText("Pregunta?");

        regresarButton.setText("<<Regresar");
        regresarButton.setActionCommand("Regresar");

        terminarButton.setText("Terminar");

        avanzarButton.setText("Avanzar>>");
        avanzarButton.setToolTipText("");
        avanzarButton.setActionCommand("Avanzar");

        buttonGroup1.add(resp1RadioButton);
        resp1RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resp1RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(resp2RadioButton);
        resp2RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resp2RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(resp3RadioButton);
        resp3RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resp3RadioButtonActionPerformed(evt);
            }
        });

        buttonGroup1.add(resp4RadioButton);
        resp4RadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resp4RadioButtonActionPerformed(evt);
            }
        });

        cronometroLabel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cronometroLabel.setText("00:00:00");
        cronometroLabel.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resp2RadioButton)
                            .addComponent(resp4RadioButton)
                            .addComponent(resp3RadioButton)
                            .addComponent(resp1RadioButton))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(questionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addComponent(cronometroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(regresarButton)
                .addGap(35, 35, 35)
                .addComponent(terminarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(avanzarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addComponent(cronometroLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(questionLabel)
                .addGap(18, 18, 18)
                .addComponent(resp1RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resp2RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resp3RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resp4RadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(avanzarButton)
                    .addComponent(regresarButton)
                    .addComponent(terminarButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resp1RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resp1RadioButtonActionPerformed
        select[pos] = resp1RadioButton.getLabel();
    }//GEN-LAST:event_resp1RadioButtonActionPerformed

    private void resp2RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resp2RadioButtonActionPerformed
        select[pos] = resp2RadioButton.getLabel();
    }//GEN-LAST:event_resp2RadioButtonActionPerformed

    private void resp3RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resp3RadioButtonActionPerformed
        select[pos] = resp3RadioButton.getLabel();
    }//GEN-LAST:event_resp3RadioButtonActionPerformed

    private void resp4RadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resp4RadioButtonActionPerformed
        select[pos] = resp4RadioButton.getLabel();
    }//GEN-LAST:event_resp4RadioButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton avanzarButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cronometroLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel questionLabel;
    private javax.swing.JButton regresarButton;
    private javax.swing.JRadioButton resp1RadioButton;
    private javax.swing.JRadioButton resp2RadioButton;
    private javax.swing.JRadioButton resp3RadioButton;
    private javax.swing.JRadioButton resp4RadioButton;
    private javax.swing.JButton terminarButton;
    // End of variables declaration//GEN-END:variables
}
