/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import BackEnd.BankAccount;
import BackEnd.SavingAccount;

/**
 *
 * @author syeda
 */
public class ProfilePage extends javax.swing.JFrame {

    /**
     * Creates new form ProfilePage
     */
    public ProfilePage() {
        initComponents();
        int account=CustomerLogin.getACC();
        SavingAccount acc=new SavingAccount();
        for(BankAccount account1:acc.getAllAccounts())
        {
            if(account1.Id==account)
            {
                jLabel13.setText(account1.customer.getName());
                jLabel14.setText(Integer.toString(account1.Id));
                jLabel15.setText(Integer.toString(account1.getBalance()));
                jLabel16.setText(account1.customer.getAddress());
                jLabel17.setText(account1.customer.getIncome());
                break;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back.jpg"))); // NOI18N
        jLabel10.setText("jLabel2");
        jLabel10.setMaximumSize(new java.awt.Dimension(650, 400));
        jLabel10.setMinimumSize(new java.awt.Dimension(650, 400));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 450));
        setMinimumSize(new java.awt.Dimension(750, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setText("Account");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 160, 90, 20);

        jLabel17.setText("Name");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(480, 250, 210, 20);

        jLabel3.setText("Balance");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 190, 80, 16);

        jLabel4.setText("Income");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 250, 70, 16);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(490, 220, 220, 0);
        jLabel5.getAccessibleContext().setAccessibleName("Pin");

        getContentPane().add(jLabel6);
        jLabel6.setBounds(490, 130, 220, 0);
        jLabel6.getAccessibleContext().setAccessibleName("Name");

        getContentPane().add(jLabel7);
        jLabel7.setBounds(490, 160, 220, 0);
        jLabel7.getAccessibleContext().setAccessibleName("Email");

        getContentPane().add(jLabel8);
        jLabel8.setBounds(490, 190, 220, 0);
        jLabel8.getAccessibleContext().setAccessibleName("Balance");

        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(6, 6, 72, 23);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 102, 204));
        jLabel9.setText("Profile");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(374, 24, 270, 43);

        jLabel11.setText("Address");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(380, 220, 70, 16);

        jLabel12.setText("Name");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(380, 130, 90, 20);

        jLabel13.setText("Name");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(480, 130, 190, 20);

        jLabel14.setText("Name");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(480, 160, 200, 20);

        jLabel15.setText("Name");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(480, 190, 190, 20);

        jLabel16.setText("Name");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(480, 220, 200, 20);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back.jpg"))); // NOI18N
        jLabel18.setText("jLabel2");
        jLabel18.setMaximumSize(new java.awt.Dimension(650, 400));
        jLabel18.setMinimumSize(new java.awt.Dimension(650, 400));
        getContentPane().add(jLabel18);
        jLabel18.setBounds(0, 0, 750, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
        new CustomerHomePage().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProfilePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProfilePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}