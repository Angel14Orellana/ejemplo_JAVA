/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author rober
 */
public class frm_presentar extends javax.swing.JFrame {

    /**
     * Creates new form frm_presentar
     */
    public frm_presentar() {
        initComponents();
        model1=(DefaultTableModel) this.jTable1.getModel();
    }
public ArrayList<jugadores> lista;
DefaultTableModel model1;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Sueldo", "Pos", "Activo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("3 Mejores");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton1)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         presentar();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ordenar();
        presentar3();
    }//GEN-LAST:event_jButton1ActionPerformed
    void presentar(){
        
        for(int i=0;i<lista.size();i++){
                model1.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNombre(),
                    lista.get(i).getSueldo(),
                    lista.get(i).getPos(),
                    lista.get(i).isActivo()                
                });
        }
    
    }
    
    void presentar3(){
       model1.setNumRows(0);
            
   //    if(lista.size()>3){
        for(int i=0;i<3;i++){
                model1.addRow(new Object[]{
                    lista.get(i).getId(),
                    lista.get(i).getNombre(),
                    lista.get(i).getSueldo(),
                    lista.get(i).getPos(),
                    lista.get(i).isActivo()                
                });
        }
 /*      }
       else{
           presentar();
       }*/
    
    }
     void ordenar(){
        jugadores temp=new jugadores();
        for(int i=0;i<lista.size();i++){
            for(int x=1;x<lista.size();x++){
                if(lista.get(x-1).getSueldo()<lista.get(x).getSueldo()){
                    temp.setId(lista.get(x-1).getId());
                    temp.setNombre(lista.get(x-1).getNombre());
                    temp.setSueldo(lista.get(x-1).getSueldo());
                    temp.setPos(lista.get(x-1).getPos());
                    temp.setActivo(lista.get(x-1).isActivo());
                    
                    lista.get(x-1).setId(lista.get(x).getId());
                    lista.get(x-1).setNombre(lista.get(x).getNombre());
                    lista.get(x-1).setSueldo(lista.get(x).getSueldo());
                    lista.get(x-1).setPos(lista.get(x).getPos());
                    lista.get(x-1).setActivo(lista.get(x).isActivo());
                    
                    lista.get(x).setId(temp.getId());
                    lista.get(x).setNombre(temp.getNombre());
                    lista.get(x).setSueldo(temp.getSueldo());
                    lista.get(x).setPos(temp.getPos());
                    lista.get(x).setActivo(temp.isActivo());                                                                
                }             
            }
        }
    
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
            java.util.logging.Logger.getLogger(frm_presentar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_presentar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_presentar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_presentar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_presentar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}