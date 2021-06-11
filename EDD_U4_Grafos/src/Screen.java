
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author codeboy1028
 */
public class Screen extends javax.swing.JFrame {

    /**
     * Creates new form Screen
     */
    Grafos graph;
    public Screen() {
        initComponents();
        graph = new Grafos();
        jListABorrar.removeAllItems();
        jListIni.removeAllItems();
        jListFin.removeAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInsertarVertice = new javax.swing.JButton();
        txtDato = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaLista = new javax.swing.JTextArea();
        btnInsertarArista = new javax.swing.JButton();
        btnEliminarArista = new javax.swing.JButton();
        btnMatriz = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaMatrix = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnEliminarVertice = new javax.swing.JButton();
        jListABorrar = new javax.swing.JComboBox<>();
        jListFin = new javax.swing.JComboBox<>();
        jListIni = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInsertarVertice.setText("Insertar Vertice");
        btnInsertarVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarVerticeActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertarVertice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 140, -1));

        txtDato.setText("         Dato");
        txtDato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtDatoMouseClicked(evt);
            }
        });
        txtDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDatoActionPerformed(evt);
            }
        });
        getContentPane().add(txtDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 110, -1));

        jLabel1.setText("INICIO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel2.setText("FIN");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        txtAreaLista.setColumns(20);
        txtAreaLista.setRows(5);
        jScrollPane3.setViewportView(txtAreaLista);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 280, 180));

        btnInsertarArista.setText("Insertar Arista");
        btnInsertarArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarAristaActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsertarArista, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 140, 50));

        btnEliminarArista.setText("Eliminar Arista");
        btnEliminarArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAristaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarArista, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 140, 50));

        btnMatriz.setText("Generar Matriz de Adyacencia");
        btnMatriz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatrizActionPerformed(evt);
            }
        });
        getContentPane().add(btnMatriz, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 270, -1));

        txtAreaMatrix.setColumns(20);
        txtAreaMatrix.setRows(5);
        jScrollPane4.setViewportView(txtAreaMatrix);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 280, 180));

        jButton2.setText("Generar Lista de Adyacencia");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 270, 30));

        jLabel4.setText("Ingrese El vertice a eliminar");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, -1));

        btnEliminarVertice.setText("Eliminar Vértice");
        btnEliminarVertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVerticeActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarVertice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 570, 120, 30));

        jListABorrar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jListABorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, -1, -1));

        jListFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jListFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        jListIni.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jListIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDatoActionPerformed
        
    }//GEN-LAST:event_txtDatoActionPerformed
        String[] a = new String[100];
        int i = 0;
        char aux;
        
    private void btnInsertarVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarVerticeActionPerformed
        a[i] = txtDato.getText().substring(0,1);
        if (graph.insertarVertice(a[i].charAt(0))) {
            jListIni.addItem(a[i]);
            jListFin.addItem(a[i]);
            jListABorrar.addItem(a[i]);  
        }
        i++;
        
        
    }//GEN-LAST:event_btnInsertarVerticeActionPerformed

    private void btnInsertarAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarAristaActionPerformed
        graph.insertarAristas((char) jListIni.getSelectedIndex(), (char) jListFin.getSelectedIndex());
    }//GEN-LAST:event_btnInsertarAristaActionPerformed

    private void btnEliminarVerticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVerticeActionPerformed
        char aux = jListABorrar.getSelectedItem().toString().charAt(0);
        int index = jListABorrar.getSelectedIndex();
        
        if (graph.eliminarVertice(aux)) {
            jListABorrar.removeItemAt(index);
            jListIni.removeItemAt(index);
            jListFin.removeItemAt(index);
            }
    }//GEN-LAST:event_btnEliminarVerticeActionPerformed

    private void btnEliminarAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAristaActionPerformed
       graph.eliminarArista((char) jListIni.getSelectedItem(), (char) jListIni.getSelectedItem());
    }//GEN-LAST:event_btnEliminarAristaActionPerformed

    private void btnMatrizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatrizActionPerformed
        int aux = jListABorrar.getItemCount();
        boolean[][] matrix = graph.matrixDeAdyacencia();
        String auxS = "";
        
        for (int i = 0; i < aux; i++)
        {
            auxS += jListABorrar.getItemAt(i) + " ";
        }
        
        for (int i = 0; i < aux; i++)
        {
            auxS += "\n" + jListABorrar.getItemAt(i);;
           for (int j = 0; j < aux; j++)
           {
               auxS += matrix[i][j] ? "1 " : "0 ";
           } 
        }
        
        txtAreaMatrix.setText(auxS);
    }//GEN-LAST:event_btnMatrizActionPerformed

    private void txtDatoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDatoMouseClicked
        txtDato.setText("");
    }//GEN-LAST:event_txtDatoMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (jListABorrar.getItemCount() > 0){ 
            txtAreaLista.setText(graph.listaAdyacencia((char) jListABorrar.getSelectedItem()));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarArista;
    private javax.swing.JButton btnEliminarVertice;
    private javax.swing.JButton btnInsertarArista;
    private javax.swing.JButton btnInsertarVertice;
    private javax.swing.JButton btnMatriz;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<String> jListABorrar;
    private javax.swing.JComboBox<String> jListFin;
    private javax.swing.JComboBox<String> jListIni;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea txtAreaLista;
    private javax.swing.JTextArea txtAreaMatrix;
    private javax.swing.JTextField txtDato;
    // End of variables declaration//GEN-END:variables
}