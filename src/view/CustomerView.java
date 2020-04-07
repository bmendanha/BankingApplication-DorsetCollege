/*
 * Author: Bruno H. M. Mendanha
 * Id: 20325
 */
package view;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;

/**
 *
 * @author bmend
 */
public class CustomerView extends javax.swing.JFrame {
   WithdrawByCustomer enviatexto;
   CustomerActions enviaConta;
    /**
     * Creates new form CustomerView
     */
    public CustomerView() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFname = new javax.swing.JTextField();
        txtAccounting = new javax.swing.JTextField();
        btnWithdraw = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        btnTransactions = new javax.swing.JButton();
        txtPinNumber = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer View");
        setName("frm_customerView"); // NOI18N
        setResizable(false);

        jLabel1.setText("First Name");

        jLabel3.setText("Account");

        jLabel4.setText("PIN");

        btnWithdraw.setText("WITHDRAW");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        btnExit.setText("EXIT");
        btnExit.setName("btn_exit"); // NOI18N
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Accessed by Customer");

        jLabel2.setText("Last name");

        btnTransactions.setText("TRANSACTIONS");
        btnTransactions.setMaximumSize(new java.awt.Dimension(91, 23));
        btnTransactions.setMinimumSize(new java.awt.Dimension(91, 23));
        btnTransactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransactionsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(btnTransactions, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtSurname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                                            .addComponent(txtAccounting, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtFname)
                                            .addComponent(txtPinNumber))
                                        .addGap(4, 4, 4))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAccounting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(txtPinNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTransactions, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        InitialScreen frm_initialScreen = new InitialScreen();
            frm_initialScreen.setVisible(true);  
            dispose();
 
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        txtFname.getText();
        txtSurname.getText();
        String nameCustomer = txtFname.getText().toUpperCase();
        String surnameCustomer = txtSurname.getText().toUpperCase();
                                 
        String iniciaisName;
        iniciaisName = txtFname.getText().replaceAll("[^A-Z]+", "");
        iniciaisName =iniciaisName.toLowerCase();
        
        String iniciaisSurname;
        iniciaisSurname = txtSurname.getText().replaceAll("[^A-Z]+", "");
        iniciaisSurname =iniciaisSurname.toLowerCase();
        
        int tamanhoName = nameCustomer.length();
        int tamanhoSurname = surnameCustomer.length();
        int totalLetters= tamanhoName+tamanhoSurname; // The sum of the total of letters in Name and Surname typed
        LocalDateTime agora = LocalDateTime.now(); 
        // Array to get the correspondent index number to name and surname
        String[] arrayName = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","z"};
        int letterName=0;
        for(int i = 0; i < arrayName.length; i++){
            if(arrayName[i].equals(iniciaisName)){
                letterName=i;
            }
        } // end for loop to get the correspondent number to the name
        letterName++;
        
        String[] arraySurname = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","z"};
        int letterSurname=0;
        for(int j = 0; j < arraySurname.length; j++){
            if(arraySurname[j].equals(iniciaisSurname)){
                letterSurname=j;
            }
        } // end for loop to get the correspondent number to the surname
        letterSurname++;
        
        // CODE OF THE ACCOUNTING
        String accounting;
        accounting=iniciaisName+iniciaisSurname+"-"+totalLetters+"-"+letterName+"-"+letterSurname;
        
      //Check Accounting Number
       String digitado=txtAccounting.getText();
       String gerado=accounting;
       
       //Check Pin Number
       String pinTyped=txtPinNumber.getText();
       String pinNumber=Integer.toString(letterName)+Integer.toString(letterSurname);
             
        if (gerado.contains(digitado) && pinNumber.contains(pinTyped)){
        //Goes to Customers actions screen
         if (enviatexto == null){
              enviatexto = new WithdrawByCustomer();
              enviatexto.setVisible(true);
              enviatexto.recebendo(txtAccounting.getText());
              dispose();
              } else {
            enviatexto.setVisible(true);
            enviatexto.setState(WithdrawByCustomer.NORMAL);
            enviatexto.recebendo(txtAccounting.getText());
            dispose();
            }
         
        } 
        else {
            JOptionPane.showMessageDialog(null,"INCORRECT DATA\nUnauthorized access allowed \nViolators will be prosecuted to the full extent of the law!!!");
            txtFname.setText(null); //clean the field txtName
            txtSurname.setText(null); //clean the field txtSurname
            txtAccounting.setText(null); //clean the field txtAccounting
            txtPinNumber.setText(null); //clean the field txtPinNumber
        }
        
        
    }//GEN-LAST:event_btnWithdrawActionPerformed

    private void btnTransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransactionsActionPerformed
        txtFname.getText();
        txtSurname.getText();
        String nameCustomer = txtFname.getText().toUpperCase();
        String surnameCustomer = txtSurname.getText().toUpperCase();
                                 
        String iniciaisName;
        iniciaisName = txtFname.getText().replaceAll("[^A-Z]+", "");
        iniciaisName =iniciaisName.toLowerCase();
        
        String iniciaisSurname;
        iniciaisSurname = txtSurname.getText().replaceAll("[^A-Z]+", "");
        iniciaisSurname =iniciaisSurname.toLowerCase();
        
        int tamanhoName = nameCustomer.length();
        int tamanhoSurname = surnameCustomer.length();
        int totalLetters= tamanhoName+tamanhoSurname; // The sum of the total of letters in Name and Surname typed
        LocalDateTime agora = LocalDateTime.now(); 
        // Array to get the correspondent index number to name and surname
        String[] arrayName = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","z"};
        int letterName=0;
        for(int i = 0; i < arrayName.length; i++){
            if(arrayName[i].equals(iniciaisName)){
                letterName=i;
            }
        } // end for loop to get the correspondent number to the name
        letterName++;
        
        String[] arraySurname = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","z"};
        int letterSurname=0;
        for(int j = 0; j < arraySurname.length; j++){
            if(arraySurname[j].equals(iniciaisSurname)){
                letterSurname=j;
            }
        } // end for loop to get the correspondent number to the surname
        letterSurname++;
        
        // CODE OF THE ACCOUNTING
        String accounting;
        accounting=iniciaisName+iniciaisSurname+"-"+totalLetters+"-"+letterName+"-"+letterSurname;
        
      //Check Accounting Number
       String digitado=txtAccounting.getText();
       String gerado=accounting;
       
       //Check Pin Number
       String pinTyped=txtPinNumber.getText();
       String pinNumber=Integer.toString(letterName)+Integer.toString(letterSurname);
      
       if (gerado.contains(digitado) && pinNumber.contains(pinTyped)){
        //Goes to Customers actions screen
         if (enviaConta == null){
              enviaConta = new CustomerActions();
              enviaConta.setVisible(true);
              enviaConta.recebendo(txtAccounting.getText());
              dispose();
              } else {
            enviaConta.setVisible(true);
            enviaConta.setState(CustomerActions.NORMAL);
            enviaConta.recebendo(txtAccounting.getText());
            dispose();
            }
        } 
        else {
            JOptionPane.showMessageDialog(null,"INCORRECT DATA\nUnauthorized access allowed \nViolators will be prosecuted to the full extent of the law!!!");
            txtFname.setText(null); //clean the field txtName
            txtSurname.setText(null); //clean the field txtSurname
            txtAccounting.setText(null); //clean the field txtAccounting
            txtPinNumber.setText(null); //clean the field txtPinNumber
        }
        
               
    }//GEN-LAST:event_btnTransactionsActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnTransactions;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtAccounting;
    private javax.swing.JTextField txtFname;
    private javax.swing.JPasswordField txtPinNumber;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
