/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.useraccount;

import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import com.mycompany.useraccount.LogIn;
import java.util.regex.Pattern;

/**
 *
 * @author pwick
 */
public class SignUp extends javax.swing.JPanel {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
        initComponents();
    }

    public void SignUp(){
txtEmailReg.grabFocus();
}
    public void addEventBackLogin(ActionListener event) {
        cmdBackLogin.addActionListener(event);
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
        jLabel2 = new javax.swing.JLabel();
        txtEmailReg = new SwingElements.TextField();
        jLabel3 = new javax.swing.JLabel();
        txtPasswordReg = new SwingElements.PasswordField();
        cmdBackLogin11 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cmdBackLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtUserNameReg = new SwingElements.TextField();
        lblEmailReg = new javax.swing.JLabel();
        lblUserNameReg = new javax.swing.JLabel();
        lblPasswordReg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(214, 246, 230));
        setForeground(new java.awt.Color(214, 246, 230));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(84, 240, 178));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create an Account");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Email");

        txtEmailReg.setBackground(new java.awt.Color(255, 255, 255));
        txtEmailReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailRegActionPerformed(evt);
            }
        });
        txtEmailReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailRegKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Password");

        txtPasswordReg.setBackground(new java.awt.Color(255, 255, 255));
        txtPasswordReg.setForeground(new java.awt.Color(0, 0, 0));
        txtPasswordReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordRegActionPerformed(evt);
            }
        });
        txtPasswordReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPasswordRegKeyReleased(evt);
            }
        });

        cmdBackLogin11.setBackground(new java.awt.Color(84, 240, 178));
        cmdBackLogin11.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 32)); // NOI18N
        cmdBackLogin11.setForeground(new java.awt.Color(255, 255, 255));
        cmdBackLogin11.setText("Sign Up");
        cmdBackLogin11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdBackLogin11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackLogin11ActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Already have an account?");

        cmdBackLogin.setBackground(new java.awt.Color(214, 246, 230));
        cmdBackLogin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        cmdBackLogin.setForeground(new java.awt.Color(84, 240, 178));
        cmdBackLogin.setText("Log In");
        cmdBackLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cmdBackLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBackLoginActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("User Name");

        txtUserNameReg.setBackground(new java.awt.Color(255, 255, 255));
        txtUserNameReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameRegActionPerformed(evt);
            }
        });
        txtUserNameReg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUserNameRegKeyReleased(evt);
            }
        });

        lblEmailReg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEmailReg.setForeground(new java.awt.Color(255, 0, 0));

        lblUserNameReg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUserNameReg.setForeground(new java.awt.Color(255, 0, 0));

        lblPasswordReg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPasswordReg.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmdBackLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtUserNameReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdBackLogin11, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPasswordReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEmailReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUserNameReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPasswordReg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUserNameReg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblUserNameReg)
                .addGap(4, 4, 4)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmailReg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblEmailReg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(txtPasswordReg, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lblPasswordReg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(cmdBackLogin11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdBackLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailRegActionPerformed

    private void txtPasswordRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordRegActionPerformed

    private void cmdBackLogin11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackLogin11ActionPerformed
        if(txtUserNameReg.getText().trim().isEmpty() && txtEmailReg.getText().trim().isEmpty() && txtPasswordReg.getText().trim().isEmpty()){
            lblUserNameReg.setText("Please enter your user name");              
            lblEmailReg.setText("Please enter your email address");
            lblPasswordReg.setText("Please enter your password");  
            }
        else if(txtEmailReg.getText().trim().isEmpty() && txtPasswordReg.getText().trim().isEmpty()){             
            lblEmailReg.setText("Please enter your email address");
            lblPasswordReg.setText("Please enter your password");  
            }
        else if(txtUserNameReg.getText().trim().isEmpty() &&txtPasswordReg.getText().trim().isEmpty()){
            lblUserNameReg.setText("Please enter your user name");              
            lblPasswordReg.setText("Please enter your password");  
            }
        else if(txtUserNameReg.getText().trim().isEmpty() && txtEmailReg.getText().trim().isEmpty()){
            lblUserNameReg.setText("Please enter your user name");              
            lblEmailReg.setText("Please enter your email address");
            }
        else if(txtEmailReg.getText().trim().isEmpty()){
            lblEmailReg.setText("Please enter your email address"); 
            }   
        else if(txtPasswordReg.getText().trim().isEmpty()){
            lblPasswordReg.setText("Please enter your password"); 
            }
        else if(txtUserNameReg.getText().trim().isEmpty()){
            lblUserNameReg.setText("Please enter your user name");
            }
        else if(!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", txtEmailReg.getText()))){
            lblEmailReg.setText("Please enter a valid email address");
            }             
        else{
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/team 08", "root", "");
String sql = "INSERT INTO users (username, email, password)" + " VALUES(?,?,?)";
PreparedStatement preparedStatement =con.prepareStatement(sql);
preparedStatement.setString(1, txtUserNameReg.getText());
preparedStatement.setString(2, txtEmailReg.getText());
preparedStatement.setString(3, txtPasswordReg.getText());
preparedStatement.executeUpdate();
//if(resultSet.next()){
    JOptionPane.showMessageDialog(null, "Registration Successfull. Please LogIn!");
    LogIn login = new LogIn();
    login.setVisible(true);
    setVisible(false);
//    }
//else{
//    JOptionPane.showMessageDialog(null, "Registration Failed.");
//    txtPasswordReg.setText("");
//      
//}
con.close();

}       catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    }//GEN-LAST:event_cmdBackLogin11ActionPerformed

    private void txtUserNameRegKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserNameRegKeyReleased
        lblUserNameReg.setText("");
    }//GEN-LAST:event_txtUserNameRegKeyReleased

    private void txtEmailRegKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailRegKeyReleased
        lblEmailReg.setText("");
    }//GEN-LAST:event_txtEmailRegKeyReleased

    private void txtPasswordRegKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordRegKeyReleased
        lblPasswordReg.setText("");
    }//GEN-LAST:event_txtPasswordRegKeyReleased

    private void cmdBackLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBackLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmdBackLoginActionPerformed

    private void txtUserNameRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameRegActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdBackLogin;
    private javax.swing.JButton cmdBackLogin11;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblEmailReg;
    private javax.swing.JLabel lblPasswordReg;
    private javax.swing.JLabel lblUserNameReg;
    private SwingElements.TextField txtEmailReg;
    private SwingElements.PasswordField txtPasswordReg;
    private SwingElements.TextField txtUserNameReg;
    // End of variables declaration//GEN-END:variables
}