/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Conrtoller.ResolverController;
import Models.DatosExamen;

/**
 *
 * @author Kenneth Granados
 */
public final class ResolverExamen extends javax.swing.JInternalFrame {
   ResolverController rc;
    /**
     * Creates new form ResolverExamen
     */
    public ResolverExamen() {
        initComponents();
        setupController();
    }
    
public void setupController(){
    rc = new ResolverController(this);
    loadButton.addActionListener(rc);
    saveButton.addActionListener(rc);
    cleanButton.addActionListener(rc);
    viewsButton.addActionListener(rc);
                  
}

public DatosExamen getData(){
    DatosExamen de = new DatosExamen();
    de.setPreg1(pre1Label.getText());
    de.setPreg2(pre2Label.getText());
    de.setPreg3(pre3Label.getText());
    de.setPreg4(pre4Label.getText());
    de.setPreg5(pre5Label.getText());
    de.setRes1pre1(p1Resp1RadioButton.getLabel());
    de.setRes2pre1(p1Resp2RadioButton.getLabel());
    de.setRes3pre1(p1Resp3RadioButton.getLabel());
    de.setRes4pre1(p1Resp4RadioButton.getLabel());
    de.setRes1pre2(p2Resp1RadioButton.getLabel());
    de.setRes2pre2(p2Resp2RadioButton.getLabel());
    de.setRes3pre2(p2Resp3RadioButton.getLabel());
    de.setRes4pre2(p2Resp4RadioButton.getLabel());
    de.setRes1pre3(p3Resp1RadioButton.getLabel());
    de.setRes2pre3(p3Resp2RadioButton.getLabel());
    de.setRes3pre3(p3Resp3RadioButton.getLabel());
    de.setRes4pre3(p3Resp4RadioButton.getLabel()); 
    de.setRes1pre4(p4Resp1RadioButton.getLabel());
    de.setRes2pre4(p4Resp2RadioButton.getLabel());
    de.setRes3pre4(p4Resp3RadioButton.getLabel());
    de.setRes4pre5(p4Resp4RadioButton.getLabel());
    de.setRes1pre5(p5Resp1RadioButton.getLabel());
    de.setRes2pre5(p5Resp2RadioButton.getLabel());
    de.setRes3pre5(p5Resp3RadioButton.getLabel());
    de.setRes4pre5(p5Resp4RadioButton.getLabel());
    return de;
}

public void setData(DatosExamen de){
    pre1Label.setText(de.getPreg1());
    pre2Label.setText(de.getPreg2());
    pre3Label.setText(de.getPreg3());
    pre4Label.setText(de.getPreg4());
    pre5Label.setText(de.getPreg5());
    p1Resp1RadioButton.setText(de.getResp1p1());
    p1Resp2RadioButton.setText(de.getResp2p1());
    p1Resp3RadioButton.setText(de.getResp3p1());
    p1Resp4RadioButton.setText(de.getResp4p1());
    p2Resp1RadioButton.setText(de.getResp1p2());
    p2Resp2RadioButton.setText(de.getResp2p2());
    p2Resp3RadioButton.setText(de.getResp3p2());
    p2Resp4RadioButton.setText(de.getResp4p2());
    p3Resp1RadioButton.setText(de.getResp1p3());
    p3Resp2RadioButton.setText(de.getResp2p3());
    p3Resp3RadioButton.setText(de.getResp3p3());
    p3Resp4RadioButton.setText(de.getResp4p3());
    p4Resp1RadioButton.setText(de.getResp1p4());
    p4Resp2RadioButton.setText(de.getResp2p4());
    p4Resp3RadioButton.setText(de.getResp3p4());
    p4Resp4RadioButton.setText(de.getResp4p4());
    p5Resp1RadioButton.setText(de.getResp1p5());
    p5Resp2RadioButton.setText(de.getResp2p5());
    p5Resp3RadioButton.setText(de.getResp3p5());
    p5Resp4RadioButton.setText(de.getResp4p5());
}

public void setExameResuelto(DatosExamen de){
    pre1Label.setText(de.getPreg1());
    pre2Label.setText(de.getPreg2());
    pre3Label.setText(de.getPreg3());
    pre4Label.setText(de.getPreg4());
    pre5Label.setText(de.getPreg5());
    p1Resp1RadioButton.setText(de.getRes1pre1()); 
    p1Resp2RadioButton.setText(de.getRes2pre1());
    p1Resp3RadioButton.setText(de.getRes3pre1());
    p1Resp4RadioButton.setText(de.getRes4pre1());
    p2Resp1RadioButton.setText(de.getRes1pre2());
    p2Resp2RadioButton.setText(de.getRes2pre2());
    p2Resp3RadioButton.setText(de.getRes3pre2());
    p2Resp4RadioButton.setText(de.getRes4pre2());
    p3Resp1RadioButton.setText(de.getRes1pre3());
    p3Resp2RadioButton.setText(de.getRes2pre3());
    p3Resp3RadioButton.setText(de.getRes3pre3());
    p3Resp4RadioButton.setText(de.getRes4pre3());
    p4Resp1RadioButton.setText(de.getRes1pre4());
    p4Resp2RadioButton.setText(de.getRes2pre4());
    p4Resp3RadioButton.setText(de.getRes3pre4());
    p4Resp4RadioButton.setText(de.getRes4pre4());
    p5Resp1RadioButton.setText(de.getRes1pre5());
    p5Resp2RadioButton.setText(de.getRes2pre5());
    p5Resp3RadioButton.setText(de.getRes3pre5());
    p5Resp4RadioButton.setText(de.getRes4pre5());

}

 public void clean() {
      pre1Label.setText("");
    pre2Label.setText("");
    pre3Label.setText("");
    pre4Label.setText("");
    pre5Label.setText("");
    p1Resp1RadioButton.setText("");
    p1Resp2RadioButton.setText("");
    p1Resp3RadioButton.setText("");
    p1Resp4RadioButton.setText("");
    p2Resp1RadioButton.setText("");
    p2Resp2RadioButton.setText("");
    p2Resp3RadioButton.setText("");
    p2Resp4RadioButton.setText("");
    p3Resp1RadioButton.setText("");
    p3Resp2RadioButton.setText("");
    p3Resp3RadioButton.setText("");
    p3Resp4RadioButton.setText("");
    p4Resp1RadioButton.setText("");
    p4Resp2RadioButton.setText("");
    p4Resp3RadioButton.setText("");
    p4Resp4RadioButton.setText("");
    p5Resp1RadioButton.setText("");
    p5Resp2RadioButton.setText("");
    p5Resp3RadioButton.setText("");
    p5Resp4RadioButton.setText("");
    p1Resp1RadioButton.setText("");
    p2Resp1RadioButton.setText("");
    p3Resp1RadioButton.setText("");
    p4Resp1RadioButton.setText("");
    p5Resp1RadioButton.requestFocus(); 
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pre1Label = new javax.swing.JLabel();
        p1Resp1RadioButton = new javax.swing.JRadioButton();
        p1Resp2RadioButton = new javax.swing.JRadioButton();
        p1Resp3RadioButton = new javax.swing.JRadioButton();
        p1Resp4RadioButton = new javax.swing.JRadioButton();
        pre2Label = new javax.swing.JLabel();
        p2Resp1RadioButton = new javax.swing.JRadioButton();
        p2Resp2RadioButton = new javax.swing.JRadioButton();
        p2Resp3RadioButton = new javax.swing.JRadioButton();
        p2Resp4RadioButton = new javax.swing.JRadioButton();
        pre3Label = new javax.swing.JLabel();
        p3Resp1RadioButton = new javax.swing.JRadioButton();
        p3Resp2RadioButton = new javax.swing.JRadioButton();
        p3Resp3RadioButton = new javax.swing.JRadioButton();
        p3Resp4RadioButton = new javax.swing.JRadioButton();
        pre4Label = new javax.swing.JLabel();
        p4Resp1RadioButton = new javax.swing.JRadioButton();
        p4Resp2RadioButton = new javax.swing.JRadioButton();
        p4Resp3RadioButton = new javax.swing.JRadioButton();
        p4Resp4RadioButton = new javax.swing.JRadioButton();
        pre5Label = new javax.swing.JLabel();
        p5Resp1RadioButton = new javax.swing.JRadioButton();
        p5Resp2RadioButton = new javax.swing.JRadioButton();
        p5Resp3RadioButton = new javax.swing.JRadioButton();
        p5Resp4RadioButton = new javax.swing.JRadioButton();
        loadButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        viewsButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        cleanButton = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel1.setText("Pregunta 1");
        jLabel1.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel2.setText("Pregunta 3");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel3.setText("Pregunta 4");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel4.setText("Pregunta 2");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        jLabel5.setText("Pregunta 5");
        jLabel5.setToolTipText("");

        pre1Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pre1Label.setText("Pregunta ");
        pre1Label.setToolTipText("");

        p1Resp1RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup1.add(p1Resp1RadioButton);
        p1Resp1RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p1Resp1RadioButton.setText("Option 1");

        p1Resp2RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup1.add(p1Resp2RadioButton);
        p1Resp2RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p1Resp2RadioButton.setText("Option 2");

        p1Resp3RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup1.add(p1Resp3RadioButton);
        p1Resp3RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p1Resp3RadioButton.setText("Option 3");

        p1Resp4RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup1.add(p1Resp4RadioButton);
        p1Resp4RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p1Resp4RadioButton.setText("Option 4");

        pre2Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pre2Label.setText("Pregunta ");
        pre2Label.setToolTipText("");

        p2Resp1RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup2.add(p2Resp1RadioButton);
        p2Resp1RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p2Resp1RadioButton.setText("Option 1");

        p2Resp2RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup2.add(p2Resp2RadioButton);
        p2Resp2RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p2Resp2RadioButton.setText("Option 2");

        p2Resp3RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup2.add(p2Resp3RadioButton);
        p2Resp3RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p2Resp3RadioButton.setText("Option 3");

        p2Resp4RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup2.add(p2Resp4RadioButton);
        p2Resp4RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p2Resp4RadioButton.setText("Option 4");

        pre3Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pre3Label.setText("Pregunta ");
        pre3Label.setToolTipText("");

        p3Resp1RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup3.add(p3Resp1RadioButton);
        p3Resp1RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p3Resp1RadioButton.setText("Option 1");

        p3Resp2RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup3.add(p3Resp2RadioButton);
        p3Resp2RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p3Resp2RadioButton.setText("Option 2");

        p3Resp3RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup3.add(p3Resp3RadioButton);
        p3Resp3RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p3Resp3RadioButton.setText("Option 3");

        p3Resp4RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup3.add(p3Resp4RadioButton);
        p3Resp4RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p3Resp4RadioButton.setText("Option 4");

        pre4Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pre4Label.setText("Pregunta ");
        pre4Label.setToolTipText("");

        p4Resp1RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup4.add(p4Resp1RadioButton);
        p4Resp1RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p4Resp1RadioButton.setText("Option 1");

        p4Resp2RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup4.add(p4Resp2RadioButton);
        p4Resp2RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p4Resp2RadioButton.setText("Option 2");

        p4Resp3RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup4.add(p4Resp3RadioButton);
        p4Resp3RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p4Resp3RadioButton.setText("Option 3");

        p4Resp4RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup4.add(p4Resp4RadioButton);
        p4Resp4RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p4Resp4RadioButton.setText("Option 4");

        pre5Label.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        pre5Label.setText("Pregunta ");
        pre5Label.setToolTipText("");

        p5Resp1RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup5.add(p5Resp1RadioButton);
        p5Resp1RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p5Resp1RadioButton.setText("Option 1");

        p5Resp2RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup5.add(p5Resp2RadioButton);
        p5Resp2RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p5Resp2RadioButton.setText("Option 2");

        p5Resp3RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup5.add(p5Resp3RadioButton);
        p5Resp3RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p5Resp3RadioButton.setText("Option 3");

        p5Resp4RadioButton.setBackground(new java.awt.Color(51, 255, 255));
        buttonGroup5.add(p5Resp4RadioButton);
        p5Resp4RadioButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        p5Resp4RadioButton.setText("Option 4");

        loadButton.setBackground(new java.awt.Color(51, 255, 255));
        loadButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        loadButton.setText("Cargar examen");
        loadButton.setToolTipText("");
        loadButton.setActionCommand("load");

        saveButton.setBackground(new java.awt.Color(51, 255, 255));
        saveButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        saveButton.setText("Guardar");

        viewsButton.setBackground(new java.awt.Color(51, 255, 255));
        viewsButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        viewsButton.setText("Ver examenes resueltos");
        viewsButton.setActionCommand("views");

        jLabel6.setFont(new java.awt.Font("Arial Black", 3, 16)); // NOI18N
        jLabel6.setText("SELLECIONE UNA OPCION SEGUN  CREA CONVENIENTE");

        cleanButton.setBackground(new java.awt.Color(51, 255, 255));
        cleanButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cleanButton.setText("Limpiar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p1Resp4RadioButton)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pre1Label, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p1Resp3RadioButton)
                                    .addComponent(p1Resp2RadioButton)
                                    .addComponent(p1Resp1RadioButton))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(p2Resp3RadioButton)
                                        .addComponent(p2Resp2RadioButton)
                                        .addComponent(p2Resp1RadioButton)
                                        .addComponent(p2Resp4RadioButton)
                                        .addComponent(pre2Label, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p4Resp3RadioButton)
                                    .addComponent(p4Resp2RadioButton)
                                    .addComponent(p4Resp1RadioButton)
                                    .addComponent(p4Resp4RadioButton)
                                    .addComponent(pre4Label, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p5Resp3RadioButton)
                                    .addComponent(p5Resp2RadioButton)
                                    .addComponent(p5Resp1RadioButton)
                                    .addComponent(p5Resp4RadioButton)
                                    .addComponent(pre5Label, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(p3Resp3RadioButton)
                                .addComponent(p3Resp2RadioButton)
                                .addComponent(p3Resp1RadioButton)
                                .addComponent(p3Resp4RadioButton)
                                .addComponent(pre3Label, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(viewsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loadButton)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton)
                        .addGap(18, 18, 18)
                        .addComponent(cleanButton)
                        .addContainerGap(28, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pre3Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p3Resp1RadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p3Resp2RadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p3Resp3RadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(p3Resp4RadioButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pre2Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(p2Resp1RadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p2Resp2RadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p2Resp3RadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p2Resp4RadioButton)
                                .addGap(24, 24, 24)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(pre4Label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p4Resp1RadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(p4Resp2RadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(p4Resp3RadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(p4Resp4RadioButton))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(pre5Label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(p5Resp1RadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(p5Resp2RadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(p5Resp3RadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(p5Resp4RadioButton))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pre1Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(p1Resp1RadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p1Resp2RadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p1Resp3RadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(p1Resp4RadioButton)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(viewsButton)
                            .addComponent(loadButton)
                            .addComponent(saveButton)
                            .addComponent(cleanButton))
                        .addGap(0, 54, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton cleanButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loadButton;
    private javax.swing.JRadioButton p1Resp1RadioButton;
    private javax.swing.JRadioButton p1Resp2RadioButton;
    private javax.swing.JRadioButton p1Resp3RadioButton;
    private javax.swing.JRadioButton p1Resp4RadioButton;
    private javax.swing.JRadioButton p2Resp1RadioButton;
    private javax.swing.JRadioButton p2Resp2RadioButton;
    private javax.swing.JRadioButton p2Resp3RadioButton;
    private javax.swing.JRadioButton p2Resp4RadioButton;
    private javax.swing.JRadioButton p3Resp1RadioButton;
    private javax.swing.JRadioButton p3Resp2RadioButton;
    private javax.swing.JRadioButton p3Resp3RadioButton;
    private javax.swing.JRadioButton p3Resp4RadioButton;
    private javax.swing.JRadioButton p4Resp1RadioButton;
    private javax.swing.JRadioButton p4Resp2RadioButton;
    private javax.swing.JRadioButton p4Resp3RadioButton;
    private javax.swing.JRadioButton p4Resp4RadioButton;
    private javax.swing.JRadioButton p5Resp1RadioButton;
    private javax.swing.JRadioButton p5Resp2RadioButton;
    private javax.swing.JRadioButton p5Resp3RadioButton;
    private javax.swing.JRadioButton p5Resp4RadioButton;
    private javax.swing.JLabel pre1Label;
    private javax.swing.JLabel pre2Label;
    private javax.swing.JLabel pre3Label;
    private javax.swing.JLabel pre4Label;
    private javax.swing.JLabel pre5Label;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton viewsButton;
    // End of variables declaration//GEN-END:variables
}
