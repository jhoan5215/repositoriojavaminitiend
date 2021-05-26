
/*
 * @joaopktr.
 * To change this template file, choose Tools | Templates
 * @joaopktr
 * http://mysql.conclase.net/
 */

package mysqlcun;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import javax.swing.AbstractButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dacarth
 */
public class mysqlform extends javax.swing.JFrame {
        String tit[]={"Id","Código","producto","precio","Cantidad"};
        //Title of windows
     DefaultTableModel ptabla2=new DefaultTableModel();
    private AbstractButton jRadioButton1;
    private AbstractButton jRadioButton2;
    /**
     * Creates new form mysqlform
     */
    public mysqlform() {
        initComponents();
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
         ptabla2.setColumnIdentifiers(tit);
         jtable1.setModel(ptabla2);
        this.jid1.setVisible(false);
    }
    
    Connection cn;
    PreparedStatement pst;
    ResultSet rs;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcod1 = new javax.swing.JTextField();
        jnom1 = new javax.swing.JTextField();
        jid1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtable1 = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jpree1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jcann1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Taller base de datos mysql con usbwebservice");

        jLabel2.setText("Código P");

        jLabel3.setText("Nombre P");

        jcod1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcod1ActionPerformed(evt);
            }
        });

        jnom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnom1ActionPerformed(evt);
            }
        });

        jid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jid1ActionPerformed(evt);
            }
        });

        jButton1.setText("agregar Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Modifica");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Elimina");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Busca");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Borrar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtable1);

        jButton6.setText("Refresca");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Papeleria", "Supermercado", "Drogueria" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo de producto");

        jLabel4.setText("Precio P");

        jpree1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpree1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Cantidad P");

        jcann1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcann1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcod1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jid1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jnom1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jcann1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jpree1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton2)))
                        .addGap(135, 135, 135)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton6))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jButton3)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcod1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jnom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jpree1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcann1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton1))
                .addGap(27, 27, 27)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        blancos();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            cn = conecta.abrebase();
            //System.out.println("probando");
            pst = cn.prepareStatement("INSERT INTO productos (codigo, nombre, precio, cantidad) VALUES (?,?,?,?)");
            pst.setString(1, jcod1.getText());
            pst.setString(2, jnom1.getText());
            pst.setString(3, jpree1.getText());
            pst.setString(4,jcann1.getText());
            int res = pst.executeUpdate();
            if (res > 0) {
                mensaje( "Producto ingresado");
                blancos();
            } else {
               mensaje("Error");
                blancos();
            }
            cn.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         try {
            cn = conecta.abrebase();
            pst = cn.prepareStatement("SELECT id, nombre,precio FROM productos WHERE codigo=?");
            pst.setString(1, jcod1.getText());
            rs = pst.executeQuery();
            if (rs.next()) {
                jid1.setText(rs.getString("id"));
                jnom1.setText(rs.getString("nombre"));
                jpree1.setText(rs.getString("precio"));
                jcann1.setText(rs.getString("cantidad"));
                jcod1.setEditable(false);

            } else {
                mensaje("No existe estudiante");
                jcod1.setEditable(true);
            }

            cn.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Shop
        try {
            cn = conecta.abrebase();
            pst = cn.prepareStatement("UPDATE productos SET codigo=?, nombre=?,precio=?,cantidad=? WHERE id=?");
            pst.setString(1, jcod1.getText());
            pst.setString(2, jnom1.getText());
           // pst.setString(3, jpree1.getText());
            pst.setString(4, jcann1.getText());
           // pst.setString(3,jcann1.getText());
            pst.setInt(3, Integer.parseInt(jpree1.getText()));
           // pst.setInt(4, Integer.parseInt(jcann1.getText()));
            pst.setInt(5, Integer.parseInt(jid1.getText()));
            int res = pst.executeUpdate();
            if (res > 0) {
                mensaje("Estudiante Modificado");
                blancos();
            } else {
                mensaje("Error");
                blancos();
            }

            cn.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try {
            cn = conecta.abrebase();
            pst = cn.prepareStatement("DELETE FROM productos WHERE id=?");
            pst.setInt(1, Integer.parseInt(jid1.getText()));
            int res = pst.executeUpdate();
            if (res > 0) {
                mensaje( "Producto Eliminado");
                blancos();
            } else {
                mensaje("Error el producto");
                blancos();
            }

            cn.close();

        } catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel ptabla2 =new DefaultTableModel();
        jtable1.setModel(ptabla2);
        try
         {
          cn = conecta.abrebase();
          Statement s= cn.createStatement();
           //consulta a mostrar
           String query = "select * from productos";
           rs = s.executeQuery(query);
           System.out.println(rs);
           ResultSetMetaData rsmd=rs.getMetaData();
           //obtenemos numero de columnas 
           int CanColumns = rsmd.getColumnCount();
           //comprobamos 
               //System.out.println(CanColumns);
           for(int i=1;i<=CanColumns;i++)
           {
           //cargamos columnas en modelo
           //modelo.addColumn(rsmd.getColumnLabel(i));
              ptabla2.addColumn(rsmd.getColumnLabel(i));
           }
          while (rs.next())
          {
             //creamos array 
             Object[] fila=new Object[CanColumns];
             //cargamos datos a modelo
             for(int i=0;i<CanColumns;i++)
             {
               fila[i] = rs.getObject(i+1);
               //System.out.print ln(fila[i]);
             }
               //adiciona fila
               ptabla2.addRow(fila);
           }
          cn.close();
         }
        catch(Exception e)
          {JOptionPane.showMessageDialog(null, e);}
       
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jid1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
     String opcion=(String)jComboBox1.getSelectedItem();
       int i = 19;
       int iv = 12;
       int iva = 4;
       

     switch (opcion)
        {
                 
      
            case "Papeleria":
                   
                break;
            case "Supermercado":
                  
                break;
            case "Drogueria":
                 
                break;
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jcod1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcod1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcod1ActionPerformed

    private void jpree1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpree1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpree1ActionPerformed

    private void jnom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jnom1ActionPerformed

    private void jcann1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcann1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcann1ActionPerformed
    public void blancos()
    {
        jid1.setText(null);
        jcod1.setText(null);
        jnom1.setText(null);
        jpree1.setText(null);
        jcann1.setText(null);
        jcod1.setEditable(true);
        jcod1.requestFocus();
     }
    public void mensaje(String cad)
    {
     JOptionPane.showMessageDialog(null, cad);   
    }
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
            java.util.logging.Logger.getLogger(mysqlform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mysqlform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mysqlform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mysqlform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mysqlform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jcann1;
    private javax.swing.JTextField jcod1;
    private javax.swing.JTextField jid1;
    private javax.swing.JTextField jnom1;
    private javax.swing.JTextField jpree1;
    private javax.swing.JTable jtable1;
    // End of variables declaration//GEN-END:variables
}