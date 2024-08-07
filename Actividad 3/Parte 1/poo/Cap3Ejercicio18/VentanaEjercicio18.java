package poo.cap3ejercicio18;

/**
 *
 * @author juanh
 */
public class VentanaEjercicio18 extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEjercicio18
     */
    public VentanaEjercicio18() {
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
        CodigoField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NombreField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        HorasField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ValorField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        PorcientoField = new javax.swing.JTextField();
        CalcularButton = new javax.swing.JButton();
        BorrarButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        CodigoDisplay = new javax.swing.JTextField();
        NombreDisplay = new javax.swing.JTextField();
        SalarioBDisplay = new javax.swing.JTextField();
        SalarioNDisplay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Código del Empleado");

        CodigoField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CodigoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoFieldActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombres del Empleado");

        NombreField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        NombreField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ejercicio 18 - Salario");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Horas Trabajadas");

        HorasField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        HorasField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorasFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("Valor por Hora");

        ValorField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorFieldActionPerformed(evt);
            }
        });

        jLabel6.setText("Porcentaje de Retención");

        PorcientoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PorcientoFieldActionPerformed(evt);
            }
        });

        CalcularButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        CalcularButton.setText("Calcular Salario");
        CalcularButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularButtonActionPerformed(evt);
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
        jLabel7.setText("Información del Empleado");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Código");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Nombres");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setText("Salario Bruto");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Salario Neto");

        CodigoDisplay.setEditable(false);
        CodigoDisplay.setBackground(new java.awt.Color(204, 204, 204));

        NombreDisplay.setEditable(false);
        NombreDisplay.setBackground(new java.awt.Color(204, 204, 204));
        NombreDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreDisplayActionPerformed(evt);
            }
        });

        SalarioBDisplay.setEditable(false);
        SalarioBDisplay.setBackground(new java.awt.Color(204, 204, 204));
        SalarioBDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalarioBDisplayActionPerformed(evt);
            }
        });

        SalarioNDisplay.setEditable(false);
        SalarioNDisplay.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(CalcularButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(PorcientoField, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                .addComponent(HorasField)
                                .addComponent(ValorField)
                                .addComponent(CodigoField)
                                .addComponent(NombreField))
                            .addComponent(BorrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(SalarioBDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CodigoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(NombreDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SalarioNDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(CodigoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(CodigoDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HorasField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ValorField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PorcientoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CalcularButton)
                            .addComponent(BorrarButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(NombreDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(SalarioBDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(SalarioNDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreFieldActionPerformed

    private void HorasFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorasFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HorasFieldActionPerformed

    private void ValorFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorFieldActionPerformed

    private void PorcientoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PorcientoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PorcientoFieldActionPerformed

    private void CalcularButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularButtonActionPerformed
        // TODO add your handling code here:
        
        Empleado empleado1 = new Empleado();
        
        empleado1.codigo = Integer.parseInt(CodigoField.getText());
        CodigoDisplay.setText(String.valueOf(empleado1.codigo));
                
        empleado1.nombres = (NombreField.getText());
        NombreDisplay.setText(empleado1.nombres);
        
        empleado1.porcentaje_retencion = Double.parseDouble(PorcientoField.getText());
        empleado1.numero_horas = Integer.parseInt(HorasField.getText());
        empleado1.valor_hora = Double.parseDouble(ValorField.getText());
        
        empleado1.calcular_salario();
        
        SalarioBDisplay.setText(String.valueOf(empleado1.salario_bruto));
        SalarioNDisplay.setText(String.valueOf(empleado1.salario_neto));
        
    }//GEN-LAST:event_CalcularButtonActionPerformed

    private void BorrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarButtonActionPerformed
        // TODO add your handling code here:
        CodigoField.setText("");
        NombreField.setText("");
        HorasField.setText("");
        ValorField.setText("");
        PorcientoField.setText("");
        CodigoDisplay.setText("");
        NombreDisplay.setText("");
        SalarioBDisplay.setText("");
        SalarioNDisplay.setText("");
    }//GEN-LAST:event_BorrarButtonActionPerformed

    private void NombreDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreDisplayActionPerformed

    private void SalarioBDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalarioBDisplayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalarioBDisplayActionPerformed

    private void CodigoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodigoFieldActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaEjercicio18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicio18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicio18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEjercicio18.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEjercicio18().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BorrarButton;
    private javax.swing.JButton CalcularButton;
    private javax.swing.JTextField CodigoDisplay;
    private javax.swing.JTextField CodigoField;
    private javax.swing.JTextField HorasField;
    private javax.swing.JTextField NombreDisplay;
    private javax.swing.JTextField NombreField;
    private javax.swing.JTextField PorcientoField;
    private javax.swing.JTextField SalarioBDisplay;
    private javax.swing.JTextField SalarioNDisplay;
    private javax.swing.JTextField ValorField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
