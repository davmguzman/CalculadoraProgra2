
package com.mycompany.proyectocalculadora;


public class principal extends javax.swing.JFrame {
    String operador = "";
    float valor1 = 0, valor2 = 0;
    boolean cambiodeEstado = false;
    public principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bce = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bigual = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jBotton1 = new javax.swing.JButton();
        jBotton2 = new javax.swing.JButton();
        jBotton3 = new javax.swing.JButton();
        jBotton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Lresultado = new javax.swing.JLabel();
        Lresultado2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(new java.awt.GridLayout(4, 3));

        b1.setBackground(new java.awt.Color(153, 255, 204));
        b1.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        b1.setForeground(new java.awt.Color(0, 0, 255));
        b1.setText("1");
        b1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jPanel1.add(b1);

        b2.setBackground(new java.awt.Color(153, 255, 204));
        b2.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        b2.setForeground(new java.awt.Color(0, 0, 255));
        b2.setText("2");
        b2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        jPanel1.add(b2);

        b3.setBackground(new java.awt.Color(153, 255, 204));
        b3.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        b3.setForeground(new java.awt.Color(0, 0, 255));
        b3.setText("3");
        b3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        jPanel1.add(b3);

        b4.setBackground(new java.awt.Color(153, 255, 204));
        b4.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        b4.setForeground(new java.awt.Color(0, 0, 255));
        b4.setText("4");
        b4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        jPanel1.add(b4);

        b5.setBackground(new java.awt.Color(153, 255, 204));
        b5.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        b5.setForeground(new java.awt.Color(0, 0, 255));
        b5.setText("5");
        b5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        jPanel1.add(b5);

        b6.setBackground(new java.awt.Color(153, 255, 204));
        b6.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        b6.setForeground(new java.awt.Color(0, 0, 255));
        b6.setText("6");
        b6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        jPanel1.add(b6);

        b7.setBackground(new java.awt.Color(153, 255, 204));
        b7.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        b7.setForeground(new java.awt.Color(0, 0, 255));
        b7.setText("7");
        b7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        jPanel1.add(b7);

        b8.setBackground(new java.awt.Color(153, 255, 204));
        b8.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        b8.setForeground(new java.awt.Color(0, 0, 255));
        b8.setText("8");
        b8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        jPanel1.add(b8);

        b9.setBackground(new java.awt.Color(153, 255, 204));
        b9.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        b9.setForeground(new java.awt.Color(0, 0, 255));
        b9.setText("9");
        b9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        jPanel1.add(b9);

        bce.setBackground(new java.awt.Color(153, 255, 204));
        bce.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        bce.setForeground(new java.awt.Color(0, 0, 255));
        bce.setText("ce");
        bce.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        bce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bceActionPerformed(evt);
            }
        });
        jPanel1.add(bce);

        b0.setBackground(new java.awt.Color(153, 255, 204));
        b0.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        b0.setForeground(new java.awt.Color(0, 0, 255));
        b0.setText("0");
        b0.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        jPanel1.add(b0);

        bigual.setBackground(new java.awt.Color(153, 255, 204));
        bigual.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        bigual.setForeground(new java.awt.Color(0, 0, 255));
        bigual.setText("=");
        bigual.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red, java.awt.Color.red));
        bigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bigualActionPerformed(evt);
            }
        });
        jPanel1.add(bigual);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 210, 230, 250);

        jPanel3.setLayout(new java.awt.GridLayout(4, 2));

        jBotton1.setBackground(new java.awt.Color(255, 255, 204));
        jBotton1.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        jBotton1.setForeground(new java.awt.Color(102, 153, 255));
        jBotton1.setText("+");
        jBotton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jBotton1);

        jBotton2.setBackground(new java.awt.Color(255, 255, 204));
        jBotton2.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        jBotton2.setForeground(new java.awt.Color(102, 153, 255));
        jBotton2.setText("-");
        jBotton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jBotton2);

        jBotton3.setBackground(new java.awt.Color(255, 255, 204));
        jBotton3.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        jBotton3.setForeground(new java.awt.Color(102, 153, 255));
        jBotton3.setText("×");
        jBotton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jBotton3);

        jBotton4.setBackground(new java.awt.Color(255, 255, 204));
        jBotton4.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        jBotton4.setForeground(new java.awt.Color(102, 153, 255));
        jBotton4.setText("÷");
        jBotton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jBotton4);

        jButton6.setBackground(new java.awt.Color(255, 255, 204));
        jButton6.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(102, 153, 255));
        jButton6.setText("x²");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6);

        jButton7.setBackground(new java.awt.Color(255, 255, 204));
        jButton7.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        jButton7.setForeground(new java.awt.Color(102, 153, 255));
        jButton7.setText("%");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7);

        jButton8.setBackground(new java.awt.Color(255, 255, 204));
        jButton8.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(102, 153, 255));
        jButton8.setText("π");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8);

        jButton9.setBackground(new java.awt.Color(255, 255, 204));
        jButton9.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(102, 153, 255));
        jPanel3.add(jButton9);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(250, 210, 120, 250);

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));
        jPanel2.setLayout(null);

        Lresultado.setFont(new java.awt.Font("Forte", 1, 24)); // NOI18N
        Lresultado.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.add(Lresultado);
        Lresultado.setBounds(10, 30, 190, 20);

        Lresultado2.setBackground(new java.awt.Color(153, 255, 204));
        Lresultado2.setFont(new java.awt.Font("Forte", 1, 12)); // NOI18N
        Lresultado2.setForeground(new java.awt.Color(0, 0, 255));
        jPanel2.add(Lresultado2);
        Lresultado2.setBounds(20, 0, 180, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(90, 130, 200, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\monto\\OneDrive\\Escritorio\\warlock1.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-540, -10, 1080, 650);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        Lresultado.setText(Lresultado.getText() + "1");
        Almacenarvalores ();
            
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       Lresultado.setText(Lresultado.getText() + "2");
       Almacenarvalores ();
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        Lresultado.setText(Lresultado.getText() + "3");
        Almacenarvalores ();
    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        Lresultado.setText(Lresultado.getText() + "4");
        Almacenarvalores ();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        Lresultado.setText(Lresultado.getText() + "5");
        Almacenarvalores ();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        Lresultado.setText(Lresultado.getText() + "6");
        Almacenarvalores ();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        Lresultado.setText(Lresultado.getText() + "7");
        Almacenarvalores ();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        Lresultado.setText(Lresultado.getText() + "8");
        Almacenarvalores ();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        Lresultado.setText(Lresultado.getText() + "9");
        Almacenarvalores ();
    }//GEN-LAST:event_b9ActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        Lresultado.setText(Lresultado.getText() + "0");
        Almacenarvalores ();
    }//GEN-LAST:event_b0ActionPerformed

    private void bceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bceActionPerformed
       Lresultado.setText("");
    Lresultado2.setText("");
    valor1 = 0;
    valor2 = 0;
    cambiodeEstado = false;
        //Lresultado.setText("");
    //Lresultado2.setText("");
    //valor2 = 0;
    //if (operador.equals("")) {
       // cambiodeEstado = false;
      // valor1 = 0;
    //} else {
        //cambiodeEstado = true;
   // }
        
    }//GEN-LAST:event_bceActionPerformed

    private void jBotton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotton1ActionPerformed
        cambiodeEstado = true;
        operador = "+";
        
        
     Lresultado.setText(" ");
     
     Lresultado2.setText(valor1 + " " + operador);
    }//GEN-LAST:event_jBotton1ActionPerformed

    private void jBotton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotton2ActionPerformed
        cambiodeEstado = true;
        operador = "-";
        Lresultado.setText(" ");
        Lresultado2.setText(valor1 + " " +operador);
    }//GEN-LAST:event_jBotton2ActionPerformed

    private void jBotton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotton3ActionPerformed
        cambiodeEstado = true;
        operador = "x";
        Lresultado.setText(" ");
        Lresultado2.setText(valor1 + " " +operador);
    }//GEN-LAST:event_jBotton3ActionPerformed

    private void jBotton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotton4ActionPerformed
        cambiodeEstado = true;
        operador = "/";
        Lresultado.setText(" ");
        Lresultado2.setText(valor1 + " " +operador);
    }//GEN-LAST:event_jBotton4ActionPerformed

    private void bigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bigualActionPerformed
        float total = 0;
        valor2 = Float.parseFloat(Lresultado.getText());
        switch (operador) {
            case "+": total = valor1 + valor2;
                break;
            case "-": total = valor1 - valor2;
                break;
                case "x": total = valor1 * valor2;
                break;
                case "/": total = valor1 / valor2;
                break;
                case "%": total = valor2 * (valor1 / 100);
                break;
                case "x²":
                    total = valor1 * valor1;
                valor2 = valor1;
                    
                break;
            default:
                throw new AssertionError();
        }
        Lresultado2.setText(String.valueOf(valor1) + " " + operador + String.valueOf(valor2) + " =");
        Lresultado.setText(String.valueOf(total));
        valor1 = total;
        valor2 = 0;
        
    }//GEN-LAST:event_bigualActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        Lresultado.setText(Lresultado.getText() + "3.1415");
        Almacenarvalores ();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       cambiodeEstado = true;
        operador = "%";
        Lresultado.setText(" ");
        Lresultado2.setText(valor1 + " " +operador);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       cambiodeEstado = true;
        operador = "x²";
        
        //Lresultado.setText(" ");
        Lresultado2.setText(valor1 + " " +operador);
    }//GEN-LAST:event_jButton6ActionPerformed
    
    private void Almacenarvalores (){
    if (cambiodeEstado == false) {
        if (!Lresultado.getText().equals("")) {
            valor1 = Float.parseFloat(Lresultado.getText());
        }
    } else {
        if (!Lresultado.getText().equals("")) {
            valor2 = Float.parseFloat(Lresultado.getText());
        }
    }
}
    
    //if (cambiodeEstado == false) {
            
            //valor1 = Float.parseFloat(Lresultado.getText());
       // }else {
        
        //    valor2 = Float.parseFloat(Lresultado.getText());
        //}
    //if (cambiodeEstado == false) {
            
          //  valor1 = Float.parseFloat(Lresultado.getText());
       // }else {
        
          //  valor2 = Float.parseFloat(Lresultado.getText());
       // }
    //if (cambiodeEstado == false) {
            
          //  valor1 = Float.parseFloat(Lresultado.getText());
       // }else {
        
        //    valor2 = Float.parseFloat(Lresultado.getText());
        
    
    
    
    
    //}
    
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
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lresultado;
    private javax.swing.JLabel Lresultado2;
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bce;
    private javax.swing.JButton bigual;
    private javax.swing.JButton jBotton1;
    private javax.swing.JButton jBotton2;
    private javax.swing.JButton jBotton3;
    private javax.swing.JButton jBotton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
