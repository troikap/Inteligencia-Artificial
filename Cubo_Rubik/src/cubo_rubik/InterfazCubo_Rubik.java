
package cubo_rubik;

public class InterfazCubo_Rubik extends javax.swing.JFrame {
    Cubo cubito;        
    
    public InterfazCubo_Rubik(Cubo cubito) {
        this.cubito = cubito;
        initComponents();
    }
    public InterfazCubo_Rubik() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ABMTipoImpuesto = new javax.swing.JInternalFrame();
        SuperiorAIzquierda = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        SuperiorADerecha = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TraseroAIzquierda = new javax.swing.JButton();
        TraseroADerecha = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        DerechaHaciaArriba = new javax.swing.JButton();
        DerechaHaciaAbajo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        FrontalAIzquierda = new javax.swing.JButton();
        FrontalADerecha = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        InferiorAIzquierda = new javax.swing.JButton();
        InferiorADerecha = new javax.swing.JButton();
        IzquierdaHaciaArriba = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        IzquierdaHaciaAbajo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("frames0"); // NOI18N

        ABMTipoImpuesto.setResizable(true);
        ABMTipoImpuesto.setTitle("ABMTipoImpuesto");
        ABMTipoImpuesto.setVisible(true);

        SuperiorAIzquierda.setText("A la Izquierda");
        SuperiorAIzquierda.setToolTipText("");
        SuperiorAIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuperiorAIzquierdaActionPerformed(evt);
            }
        });

        jLabel4.setText("Girar Superior");

        SuperiorADerecha.setText("A la Derecha");
        SuperiorADerecha.setToolTipText("");
        SuperiorADerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SuperiorADerechaActionPerformed(evt);
            }
        });

        jLabel6.setText("Girar Trasero");

        TraseroAIzquierda.setText("A la Izquierda");
        TraseroAIzquierda.setToolTipText("");
        TraseroAIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraseroAIzquierdaActionPerformed(evt);
            }
        });

        TraseroADerecha.setText("A la Derecha");
        TraseroADerecha.setToolTipText("");
        TraseroADerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TraseroADerechaActionPerformed(evt);
            }
        });

        jLabel7.setText("Girar Derecho");

        DerechaHaciaArriba.setText("Hacia Arriba");
        DerechaHaciaArriba.setToolTipText("");
        DerechaHaciaArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DerechaHaciaArribaActionPerformed(evt);
            }
        });

        DerechaHaciaAbajo.setText("Hacia Abajo");
        DerechaHaciaAbajo.setToolTipText("");
        DerechaHaciaAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DerechaHaciaAbajoActionPerformed(evt);
            }
        });

        jLabel8.setText("Girar Frontal");

        FrontalAIzquierda.setText("A la Izquierda");
        FrontalAIzquierda.setToolTipText("");
        FrontalAIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrontalAIzquierdaActionPerformed(evt);
            }
        });

        FrontalADerecha.setText("A la Derecha");
        FrontalADerecha.setToolTipText("");
        FrontalADerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FrontalADerechaActionPerformed(evt);
            }
        });

        jLabel9.setText("Girar Inferior");

        InferiorAIzquierda.setText("A la Izquierda");
        InferiorAIzquierda.setToolTipText("");
        InferiorAIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InferiorAIzquierdaActionPerformed(evt);
            }
        });

        InferiorADerecha.setText("A la Derecha");
        InferiorADerecha.setToolTipText("");
        InferiorADerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InferiorADerechaActionPerformed(evt);
            }
        });

        IzquierdaHaciaArriba.setText("Hacia Arriba");
        IzquierdaHaciaArriba.setToolTipText("");
        IzquierdaHaciaArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IzquierdaHaciaArribaActionPerformed(evt);
            }
        });

        jLabel10.setText("Girar Izquierdo");

        IzquierdaHaciaAbajo.setText("Hacia Abajo");
        IzquierdaHaciaAbajo.setToolTipText("");
        IzquierdaHaciaAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IzquierdaHaciaAbajoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ABMTipoImpuestoLayout = new javax.swing.GroupLayout(ABMTipoImpuesto.getContentPane());
        ABMTipoImpuesto.getContentPane().setLayout(ABMTipoImpuestoLayout);
        ABMTipoImpuestoLayout.setHorizontalGroup(
            ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                        .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(IzquierdaHaciaArriba)
                            .addComponent(IzquierdaHaciaAbajo)
                            .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel10)))
                        .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                                        .addComponent(FrontalAIzquierda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(FrontalADerecha))
                                    .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                                        .addComponent(TraseroAIzquierda)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TraseroADerecha))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ABMTipoImpuestoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(70, 70, 70))))
                    .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                            .addComponent(InferiorAIzquierda)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(InferiorADerecha))
                        .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                            .addGap(70, 70, 70)
                            .addComponent(jLabel9)))
                    .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                        .addComponent(SuperiorAIzquierda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SuperiorADerecha)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DerechaHaciaArriba)
                    .addComponent(DerechaHaciaAbajo)
                    .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7)))
                .addGap(114, 114, 114))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ABMTipoImpuestoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ABMTipoImpuestoLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(321, 321, 321))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ABMTipoImpuestoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(323, 323, 323))))
        );
        ABMTipoImpuestoLayout.setVerticalGroup(
            ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SuperiorAIzquierda)
                    .addComponent(SuperiorADerecha))
                .addGap(43, 43, 43)
                .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                        .addComponent(DerechaHaciaArriba)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7)
                        .addGap(32, 32, 32)
                        .addComponent(DerechaHaciaAbajo))
                    .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                        .addComponent(IzquierdaHaciaArriba)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel10)
                        .addGap(32, 32, 32)
                        .addComponent(IzquierdaHaciaAbajo))
                    .addGroup(ABMTipoImpuestoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FrontalAIzquierda)
                            .addComponent(FrontalADerecha))
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TraseroAIzquierda)
                            .addComponent(TraseroADerecha))))
                .addGap(60, 60, 60)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(ABMTipoImpuestoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InferiorAIzquierda)
                    .addComponent(InferiorADerecha))
                .addContainerGap(112, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ABMTipoImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ABMTipoImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SuperiorAIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuperiorAIzquierdaActionPerformed
        cubito.MoverSuperiorAIzquierda(cubito.Posiciones);
    }//GEN-LAST:event_SuperiorAIzquierdaActionPerformed

    private void SuperiorADerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SuperiorADerechaActionPerformed
        cubito.MoverSuperiorADerecha(cubito.Posiciones);
    }//GEN-LAST:event_SuperiorADerechaActionPerformed

    private void TraseroAIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraseroAIzquierdaActionPerformed
        cubito.MoverTraseroAIzquierda(cubito.Posiciones);
    }//GEN-LAST:event_TraseroAIzquierdaActionPerformed

    private void TraseroADerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TraseroADerechaActionPerformed
        cubito.MoverTraseroADerecha(cubito.Posiciones);
    }//GEN-LAST:event_TraseroADerechaActionPerformed

    private void DerechaHaciaArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DerechaHaciaArribaActionPerformed
        cubito.MoverDerechaAArriba(cubito.Posiciones);
    }//GEN-LAST:event_DerechaHaciaArribaActionPerformed

    private void DerechaHaciaAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DerechaHaciaAbajoActionPerformed
        cubito.MoverDerechaAAbajo(cubito.Posiciones);
    }//GEN-LAST:event_DerechaHaciaAbajoActionPerformed

    private void FrontalAIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrontalAIzquierdaActionPerformed
        cubito.MoverFrontalAIzquierda(cubito.Posiciones);
    }//GEN-LAST:event_FrontalAIzquierdaActionPerformed

    private void FrontalADerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FrontalADerechaActionPerformed
        cubito.MoverFrontalADerecha(cubito.Posiciones);
    }//GEN-LAST:event_FrontalADerechaActionPerformed

    private void InferiorAIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InferiorAIzquierdaActionPerformed
        cubito.MoverInferiorAIzquierda(cubito.Posiciones);
    }//GEN-LAST:event_InferiorAIzquierdaActionPerformed

    private void InferiorADerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InferiorADerechaActionPerformed
        cubito.MoverInferiorADerecha(cubito.Posiciones);
    }//GEN-LAST:event_InferiorADerechaActionPerformed

    private void IzquierdaHaciaArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IzquierdaHaciaArribaActionPerformed
        cubito.MoverIzquierdaAArriba(cubito.Posiciones);
    }//GEN-LAST:event_IzquierdaHaciaArribaActionPerformed

    private void IzquierdaHaciaAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IzquierdaHaciaAbajoActionPerformed
        cubito.MoverIzquierdaAAbajo(cubito.Posiciones);
    }//GEN-LAST:event_IzquierdaHaciaAbajoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                new InterfazCubo_Rubik().setVisible(true);
            }
        });
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame ABMTipoImpuesto;
    private javax.swing.JButton DerechaHaciaAbajo;
    private javax.swing.JButton DerechaHaciaArriba;
    private javax.swing.JButton FrontalADerecha;
    private javax.swing.JButton FrontalAIzquierda;
    private javax.swing.JButton InferiorADerecha;
    private javax.swing.JButton InferiorAIzquierda;
    private javax.swing.JButton IzquierdaHaciaAbajo;
    private javax.swing.JButton IzquierdaHaciaArriba;
    private javax.swing.JButton SuperiorADerecha;
    private javax.swing.JButton SuperiorAIzquierda;
    private javax.swing.JButton TraseroADerecha;
    private javax.swing.JButton TraseroAIzquierda;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

}