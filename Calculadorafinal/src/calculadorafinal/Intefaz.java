
package calculadorafinal;

public class Intefaz extends javax.swing.JFrame {

    private boolean punto = true;
    String valor1, valor2, signo, contenido;
    double resultado;
    public Intefaz() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JTextField();
        BOTON_DIVISION = new javax.swing.JButton();
        BOTONMULTIPLICACION = new javax.swing.JButton();
        BOTONRESTA = new javax.swing.JButton();
        BOTONSUMA = new javax.swing.JButton();
        SIETE = new javax.swing.JButton();
        OCHO = new javax.swing.JButton();
        NUEVE = new javax.swing.JButton();
        RAIZCUADRADA = new javax.swing.JButton();
        CUATRO = new javax.swing.JButton();
        CINCO = new javax.swing.JButton();
        SEIS = new javax.swing.JButton();
        EXPONENTE = new javax.swing.JButton();
        UNO = new javax.swing.JButton();
        DOS = new javax.swing.JButton();
        TRES = new javax.swing.JButton();
        PORCENTAJE = new javax.swing.JButton();
        CERO = new javax.swing.JButton();
        BOTONIGUAL = new javax.swing.JButton();
        BOTONPUNTO = new javax.swing.JButton();
        BOTONSEN = new javax.swing.JButton();
        BORRAR = new javax.swing.JButton();
        BOTONCOS = new javax.swing.JButton();
        BOTONTAN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pantallaActionPerformed(evt);
            }
        });

        BOTON_DIVISION.setBackground(new java.awt.Color(0, 102, 153));
        BOTON_DIVISION.setForeground(new java.awt.Color(255, 255, 255));
        BOTON_DIVISION.setText("/");
        BOTON_DIVISION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTON_DIVISIONActionPerformed(evt);
            }
        });

        BOTONMULTIPLICACION.setBackground(new java.awt.Color(0, 102, 153));
        BOTONMULTIPLICACION.setForeground(new java.awt.Color(255, 255, 255));
        BOTONMULTIPLICACION.setText("*");
        BOTONMULTIPLICACION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONMULTIPLICACIONActionPerformed(evt);
            }
        });

        BOTONRESTA.setBackground(new java.awt.Color(0, 102, 153));
        BOTONRESTA.setForeground(new java.awt.Color(255, 255, 255));
        BOTONRESTA.setText("-");
        BOTONRESTA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONRESTAActionPerformed(evt);
            }
        });

        BOTONSUMA.setBackground(new java.awt.Color(0, 102, 153));
        BOTONSUMA.setForeground(new java.awt.Color(255, 255, 255));
        BOTONSUMA.setText("+");
        BOTONSUMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONSUMAActionPerformed(evt);
            }
        });

        SIETE.setBackground(new java.awt.Color(0, 102, 153));
        SIETE.setForeground(new java.awt.Color(255, 255, 255));
        SIETE.setText("7");
        SIETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIETEActionPerformed(evt);
            }
        });

        OCHO.setBackground(new java.awt.Color(0, 102, 153));
        OCHO.setForeground(new java.awt.Color(255, 255, 255));
        OCHO.setText("8");
        OCHO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OCHOActionPerformed(evt);
            }
        });

        NUEVE.setBackground(new java.awt.Color(0, 102, 153));
        NUEVE.setForeground(new java.awt.Color(255, 255, 255));
        NUEVE.setText("9");
        NUEVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVEActionPerformed(evt);
            }
        });

        RAIZCUADRADA.setBackground(new java.awt.Color(0, 102, 153));
        RAIZCUADRADA.setForeground(new java.awt.Color(255, 255, 255));
        RAIZCUADRADA.setText("√");
        RAIZCUADRADA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAIZCUADRADAActionPerformed(evt);
            }
        });

        CUATRO.setBackground(new java.awt.Color(0, 102, 153));
        CUATRO.setForeground(new java.awt.Color(255, 255, 255));
        CUATRO.setText("4");
        CUATRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CUATROActionPerformed(evt);
            }
        });

        CINCO.setBackground(new java.awt.Color(0, 102, 153));
        CINCO.setForeground(new java.awt.Color(255, 255, 255));
        CINCO.setText("5");
        CINCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CINCOActionPerformed(evt);
            }
        });

        SEIS.setBackground(new java.awt.Color(0, 102, 153));
        SEIS.setForeground(new java.awt.Color(255, 255, 255));
        SEIS.setText("6");
        SEIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEISActionPerformed(evt);
            }
        });

        EXPONENTE.setBackground(new java.awt.Color(0, 102, 153));
        EXPONENTE.setForeground(new java.awt.Color(255, 255, 255));
        EXPONENTE.setText("Exp");
        EXPONENTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EXPONENTEActionPerformed(evt);
            }
        });

        UNO.setBackground(new java.awt.Color(0, 102, 153));
        UNO.setForeground(new java.awt.Color(255, 255, 255));
        UNO.setText("1");
        UNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UNOActionPerformed(evt);
            }
        });

        DOS.setBackground(new java.awt.Color(0, 102, 153));
        DOS.setForeground(new java.awt.Color(255, 255, 255));
        DOS.setText("2");
        DOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DOSActionPerformed(evt);
            }
        });

        TRES.setBackground(new java.awt.Color(0, 102, 153));
        TRES.setForeground(new java.awt.Color(255, 255, 255));
        TRES.setText("3");
        TRES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRESActionPerformed(evt);
            }
        });

        PORCENTAJE.setBackground(new java.awt.Color(0, 102, 153));
        PORCENTAJE.setForeground(new java.awt.Color(255, 255, 255));
        PORCENTAJE.setText("%");
        PORCENTAJE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PORCENTAJEActionPerformed(evt);
            }
        });

        CERO.setBackground(new java.awt.Color(0, 102, 153));
        CERO.setForeground(new java.awt.Color(255, 255, 255));
        CERO.setText("0");
        CERO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CEROActionPerformed(evt);
            }
        });

        BOTONIGUAL.setBackground(new java.awt.Color(0, 102, 153));
        BOTONIGUAL.setForeground(new java.awt.Color(255, 255, 255));
        BOTONIGUAL.setText("=");
        BOTONIGUAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONIGUALActionPerformed(evt);
            }
        });

        BOTONPUNTO.setBackground(new java.awt.Color(0, 102, 153));
        BOTONPUNTO.setForeground(new java.awt.Color(255, 255, 255));
        BOTONPUNTO.setText(".");
        BOTONPUNTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONPUNTOActionPerformed(evt);
            }
        });

        BOTONSEN.setBackground(new java.awt.Color(0, 102, 153));
        BOTONSEN.setForeground(new java.awt.Color(255, 255, 255));
        BOTONSEN.setText("Sen");
        BOTONSEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONSENActionPerformed(evt);
            }
        });

        BORRAR.setBackground(new java.awt.Color(0, 102, 153));
        BORRAR.setForeground(new java.awt.Color(255, 255, 255));
        BORRAR.setText("C");
        BORRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BORRARActionPerformed(evt);
            }
        });

        BOTONCOS.setBackground(new java.awt.Color(0, 102, 153));
        BOTONCOS.setForeground(new java.awt.Color(255, 255, 255));
        BOTONCOS.setText("Cos");
        BOTONCOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONCOSActionPerformed(evt);
            }
        });

        BOTONTAN.setBackground(new java.awt.Color(0, 102, 153));
        BOTONTAN.setForeground(new java.awt.Color(255, 255, 255));
        BOTONTAN.setText("Tan");
        BOTONTAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTONTANActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BOTONPUNTO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(PORCENTAJE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(BOTONTAN, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(BOTONIGUAL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)
                                    .addComponent(EXPONENTE)
                                    .addGap(8, 8, 8))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(OCHO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(NUEVE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(RAIZCUADRADA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(BOTON_DIVISION, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(BOTONMULTIPLICACION, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(10, 10, 10)
                                            .addComponent(BOTONRESTA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(BOTONSUMA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BOTONSEN, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BOTONCOS, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BOTON_DIVISION, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTONRESTA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTONSUMA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTONMULTIPLICACION, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BORRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SIETE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NUEVE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RAIZCUADRADA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OCHO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTONSEN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BOTONCOS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CUATRO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SEIS, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CINCO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(EXPONENTE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UNO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TRES, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PORCENTAJE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DOS, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTONTAN, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CERO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTONIGUAL, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BOTONPUNTO, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pantallaActionPerformed

    }//GEN-LAST:event_pantallaActionPerformed

    private void BOTON_DIVISIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTON_DIVISIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOTON_DIVISIONActionPerformed

    private void BOTONMULTIPLICACIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONMULTIPLICACIONActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_BOTONMULTIPLICACIONActionPerformed

    private void BOTONRESTAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONRESTAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOTONRESTAActionPerformed

    private void BOTONSUMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONSUMAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOTONSUMAActionPerformed

    private void SIETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIETEActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"7");
    }//GEN-LAST:event_SIETEActionPerformed

    private void OCHOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OCHOActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"8");
    }//GEN-LAST:event_OCHOActionPerformed

    private void NUEVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVEActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"9");
    }//GEN-LAST:event_NUEVEActionPerformed

    private void RAIZCUADRADAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAIZCUADRADAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RAIZCUADRADAActionPerformed

    private void CUATROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CUATROActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"4");
    }//GEN-LAST:event_CUATROActionPerformed

    private void CINCOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CINCOActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"5");
    }//GEN-LAST:event_CINCOActionPerformed

    private void SEISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEISActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"6");
    }//GEN-LAST:event_SEISActionPerformed

    private void EXPONENTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EXPONENTEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EXPONENTEActionPerformed

    private void UNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UNOActionPerformed
     
      
    }//GEN-LAST:event_UNOActionPerformed

    private void DOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DOSActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"2");
    }//GEN-LAST:event_DOSActionPerformed

    private void TRESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRESActionPerformed
        // TODO add your handling code here:
        pantalla.setText(pantalla.getText()+"3");
    }//GEN-LAST:event_TRESActionPerformed

    private void PORCENTAJEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PORCENTAJEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PORCENTAJEActionPerformed

    private void CEROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CEROActionPerformed
        // TODO add your handling code here:
        
                
    }//GEN-LAST:event_CEROActionPerformed

    private void BOTONIGUALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONIGUALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOTONIGUALActionPerformed

    private void BOTONPUNTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONPUNTOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOTONPUNTOActionPerformed

    private void BOTONSENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONSENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOTONSENActionPerformed

    private void BORRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BORRARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BORRARActionPerformed

    private void BOTONCOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONCOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOTONCOSActionPerformed

    private void BOTONTANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTONTANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BOTONTANActionPerformed

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
            java.util.logging.Logger.getLogger(Intefaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Intefaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Intefaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Intefaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Intefaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BORRAR;
    private javax.swing.JButton BOTONCOS;
    private javax.swing.JButton BOTONIGUAL;
    private javax.swing.JButton BOTONMULTIPLICACION;
    private javax.swing.JButton BOTONPUNTO;
    private javax.swing.JButton BOTONRESTA;
    private javax.swing.JButton BOTONSEN;
    private javax.swing.JButton BOTONSUMA;
    private javax.swing.JButton BOTONTAN;
    private javax.swing.JButton BOTON_DIVISION;
    private javax.swing.JButton CERO;
    private javax.swing.JButton CINCO;
    private javax.swing.JButton CUATRO;
    private javax.swing.JButton DOS;
    private javax.swing.JButton EXPONENTE;
    private javax.swing.JButton NUEVE;
    private javax.swing.JButton OCHO;
    private javax.swing.JButton PORCENTAJE;
    private javax.swing.JButton RAIZCUADRADA;
    private javax.swing.JButton SEIS;
    private javax.swing.JButton SIETE;
    private javax.swing.JButton TRES;
    private javax.swing.JButton UNO;
    private javax.swing.JTextField pantalla;
    // End of variables declaration//GEN-END:variables
}
