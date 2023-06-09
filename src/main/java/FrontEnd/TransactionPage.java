/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FrontEnd;

import BackEnd.BankAccount;
import BackEnd.SavingAccount;

import javax.swing.*;

/**
 *
 * @author syeda
 */
public class TransactionPage extends javax.swing.JFrame {

    /**
     * Creates new form TransactionPage
     */
    public TransactionPage() {
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
        jButton7 = new javax.swing.JButton();
        acc = new javax.swing.JTextField();
        amount = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 450));
        setMinimumSize(new java.awt.Dimension(750, 450));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Transaction Page");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(316, 22, 277, 43);

        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(6, 6, 72, 23);
        getContentPane().add(acc);
        acc.setBounds(316, 151, 259, 22);
        getContentPane().add(amount);
        amount.setBounds(316, 198, 259, 22);

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Send");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(405, 255, 72, 23);

        jLabel2.setText("Account No");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(316, 129, 73, 16);

        jLabel3.setText("Amount");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(316, 179, 72, 16);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Back.jpg"))); // NOI18N
        jLabel5.setText("jLabel2");
        jLabel5.setMaximumSize(new java.awt.Dimension(650, 400));
        jLabel5.setMinimumSize(new java.awt.Dimension(650, 400));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 750, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
this.dispose();
new CustomerHomePage().setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private boolean flag=true;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(acc.getText().isEmpty()||amount.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please Enter All Fields");
        }

        else
        {
            SavingAccount account=new SavingAccount();
            for(BankAccount account1:account.getAllAccounts())
            {
                if(account1.Id==Integer.parseInt(acc.getText().toString()))
                {
                    flag=false;

                    if(account.transfer(CustomerLogin.getACC(),account1.Id,
                            Integer.parseInt(amount.getText().toString())))
                        JOptionPane.showMessageDialog(null,"Amount Transferred");

                    else
                        JOptionPane.showMessageDialog(null,"Insufficient Balance");

                }
            }

            if(flag)
            {
                JOptionPane.showMessageDialog(null,"Account not found");
                this.dispose();
                new TransactionPage().setVisible(true);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TransactionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acc;
    private javax.swing.JTextField amount;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
