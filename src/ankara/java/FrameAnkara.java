
package ankara.java;

public class FrameAnkara extends javax.swing.JFrame {

    FrameCategories frameCategories;
    FrameProducts frameProducts;
    
    public FrameAnkara() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCategories = new javax.swing.JMenu();
        jMenuItemCategories = new javax.swing.JMenuItem();
        jMenuProducts = new javax.swing.JMenu();
        jMenuItemProducts = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(139, 173, 207));

        jMenuCategories.setText("Categories");

        jMenuItemCategories.setText("Categories");
        jMenuItemCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCategoriesActionPerformed(evt);
            }
        });
        jMenuCategories.add(jMenuItemCategories);

        jMenuBar1.add(jMenuCategories);

        jMenuProducts.setText("Products");

        jMenuItemProducts.setText("Products");
        jMenuItemProducts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductsActionPerformed(evt);
            }
        });
        jMenuProducts.add(jMenuItemProducts);

        jMenuBar1.add(jMenuProducts);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCategoriesActionPerformed
        // TODO add your handling code here:
        if(frameCategories == null || frameCategories.isClosed()){
           frameCategories= new FrameCategories();
           jDesktopPane1.add(frameCategories);
           frameCategories.setVisible(true);
        }
        else{
            frameCategories.setLocation(this.getWidth()/2 -frameCategories.getWidth()/2,this.getHeight()/2 -frameCategories.getHeight()/2);
            frameCategories.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemCategoriesActionPerformed

    private void jMenuItemProductsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductsActionPerformed
        // TODO add your handling code here:
        if(frameProducts == null || frameProducts.isClosed()){
           frameProducts= new FrameProducts();
           jDesktopPane1.add(frameProducts);
           frameProducts.setVisible(true);
        }
        else{
            frameProducts.setLocation(this.getWidth()/2 -frameProducts.getWidth()/2,this.getHeight()/2 -frameProducts.getHeight()/2);
            frameProducts.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItemProductsActionPerformed

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
            java.util.logging.Logger.getLogger(FrameAnkara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameAnkara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameAnkara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameAnkara.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameAnkara().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCategories;
    private javax.swing.JMenuItem jMenuItemCategories;
    private javax.swing.JMenuItem jMenuItemProducts;
    private javax.swing.JMenu jMenuProducts;
    // End of variables declaration//GEN-END:variables

  }
