package poo.cap3ejercicio19;

/**
 *
 * @author juanh
 */
public class VentanaEjercicio19 extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEjercicio18
     */
    public VentanaEjercicio19() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LadoField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CalcularPButton = new javax.swing.JButton();
        BorrarButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PerimetroDisplay = new javax.swing.JTextField();
        AlturaDisplay = new javax.swing.JTextField();
        AreaDisplay = new javax.swing.JTextField();
        CalcularAlButton = new javax.swing.JButton();
        CalcularArButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Valor del Lado");

        LadoField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        LadoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LadoFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ejercicio 19 - Triangulo");

        CalcularPButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CalcularPButton.setText("Calcular Perímetro");
        CalcularPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularPButtonActionPerformed(evt);
            }
        });

        BorrarButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BorrarButton.setText("Borrar Campos");
        BorrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Valores del Triangulo");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Perímetro");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Área");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Altura");

        PerimetroDisplay.setEditable(false);
        PerimetroDisplay.setBackground(new java.awt.Color(204, 204, 204));

        AlturaDisplay.setEditable(false);
        AlturaDisplay.setBackground(new java.awt.Color(204, 204, 204));
        AlturaDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlturaDisplayActionPerformed(evt);
            }
        });

        AreaDisplay.setEditable(false);
        AreaDisplay.setBackground(new java.awt.Color(204, 204, 204));
        AreaDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AreaDisplayActionPerformed(evt);
            }
        });

        CalcularAlButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CalcularAlButton.setText("Calcular Altura");
        CalcularAlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularAlButtonActionPerformed(evt);
            }
        });

        CalcularArButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CalcularArButton.setText("Calcular Área");
        CalcularArButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularArButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BorrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(CalcularAlButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CalcularPButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                .addComponent(CalcularArButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(LadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(AreaDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PerimetroDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AlturaDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(LadoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(PerimetroDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AlturaDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AreaDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CalcularPButton)
                        .addGap(6, 6, 6)
                        .addComponent(CalcularAlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(CalcularArButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BorrarButton)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularPButtonActionPerformed
        // TODO add your handling code here:
        
        Triangulo triangulo = new Triangulo();
        
        triangulo.valor_lado = Double.parseDouble(LadoField.getText());
        
        triangulo.perimetro = triangulo.calcular_perimetro();
        
        PerimetroDisplay.setText(String.valueOf(triangulo.perimetro));
        
    }//GEN-LAST:event_CalcularPButtonActionPerformed

    private void BorrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarButtonActionPerformed
        // TODO add your handling code here:
        LadoField.setText("");
        PerimetroDisplay.setText("");
        AlturaDisplay.setText("");
        AreaDisplay.setText("");
    }//GEN-LAST:event_BorrarButtonActionPerformed

    private void AlturaDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlturaDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlturaDisplayActionPerformed

    private void AreaDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AreaDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AreaDisplayActionPerformed

    private void LadoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LadoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LadoFieldActionPerformed

    private void CalcularAlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularAlButtonActionPerformed
        // TODO add your handling code here:
        
        Triangulo triangulo = new Triangulo();
        
        triangulo.valor_lado = Double.parseDouble(LadoField.getText());
        
        triangulo.altura = triangulo.calcular_altura();
        
        AlturaDisplay.setText(String.format("%.7f", triangulo.altura));
    }//GEN-LAST:event_CalcularAlButtonActionPerformed

    private void CalcularArButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularArButtonActionPerformed
        // TODO add your handling code here:
        
        Triangulo triangulo = new Triangulo();
        
        triangulo.valor_lado = Double.parseDouble(LadoField.getText());
        triangulo.altura = triangulo.calcular_altura();
        triangulo.area = triangulo.calcular_area();
        
        AreaDisplay.setText(String.format("%.7f", triangulo.area));
    }//GEN-LAST:event_CalcularArButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicio19.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicio19.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicio19.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicio19.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEjercicio19().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlturaDisplay;
    private javax.swing.JTextField AreaDisplay;
    private javax.swing.JButton BorrarButton;
    private javax.swing.JButton CalcularAlButton;
    private javax.swing.JButton CalcularArButton;
    private javax.swing.JButton CalcularPButton;
    private javax.swing.JTextField LadoField;
    private javax.swing.JTextField PerimetroDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}