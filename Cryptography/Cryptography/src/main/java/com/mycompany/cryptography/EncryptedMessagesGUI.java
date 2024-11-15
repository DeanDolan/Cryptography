/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cryptography;

import javax.crypto.SecretKey;
import java.awt.Color;
import java.sql.*;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

/**
 *
 * @author Viaceslav Mamizev
 */
public class EncryptedMessagesGUI extends javax.swing.JFrame {

    private static final String databaseURL = "jdbc:mysql://localhost:3306/cryptography";
    private static final String databaseUSER = "dean_dolan";
    private static final String databasePASS = "temppassword";
    private SecretKey secretKey;

    /**
     * Creates new form EncryptedMessagesGUI
     */
    public EncryptedMessagesGUI() {
        initComponents();
        generateKey();
        Color col = new Color(51, 51, 51);
        getContentPane().setBackground(col);
        messagesArea.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        messageEncrypterPan = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        messageField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        sendButton = new javax.swing.JButton();
        viewMessagesButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        messagesArea = new java.awt.TextArea();
        backBtn = new javax.swing.JButton();
        messagesSectionLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        messageEncrypterPan.setBackground(new java.awt.Color(255, 255, 255));

        Title.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        Title.setText("Message Encrypter");

        usernameField.setBackground(new java.awt.Color(0, 0, 0));
        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));

        messageField.setBackground(new java.awt.Color(0, 0, 0));
        messageField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        messageField.setForeground(new java.awt.Color(255, 255, 255));
        messageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageFieldActionPerformed(evt);
            }
        });

        usernameLabel.setBackground(new java.awt.Color(255, 255, 255));
        usernameLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        usernameLabel.setText("Username:");

        messageLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        messageLabel.setText("Message:");

        sendButton.setBackground(new java.awt.Color(51, 153, 0));
        sendButton.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        sendButton.setForeground(new java.awt.Color(255, 255, 255));
        sendButton.setText("Send Message");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        viewMessagesButton.setBackground(new java.awt.Color(0, 153, 153));
        viewMessagesButton.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        viewMessagesButton.setForeground(new java.awt.Color(255, 255, 255));
        viewMessagesButton.setText("View Messages");
        viewMessagesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMessagesButtonActionPerformed(evt);
            }
        });

        statusLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N

        messagesArea.setBackground(new java.awt.Color(0, 0, 0));
        messagesArea.setForeground(new java.awt.Color(255, 255, 255));

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backBtn.setText("<- Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        messagesSectionLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        messagesSectionLabel.setText("Messages:");

        javax.swing.GroupLayout messageEncrypterPanLayout = new javax.swing.GroupLayout(messageEncrypterPan);
        messageEncrypterPan.setLayout(messageEncrypterPanLayout);
        messageEncrypterPanLayout.setHorizontalGroup(
            messageEncrypterPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messageEncrypterPanLayout.createSequentialGroup()
                .addGroup(messageEncrypterPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(messageEncrypterPanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)
                        .addGap(43, 43, 43)
                        .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, messageEncrypterPanLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(messageEncrypterPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(messageEncrypterPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(messageEncrypterPanLayout.createSequentialGroup()
                                    .addGroup(messageEncrypterPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernameLabel)
                                        .addComponent(messageLabel))
                                    .addGap(18, 18, 18)
                                    .addGroup(messageEncrypterPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                        .addComponent(messageField)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messageEncrypterPanLayout.createSequentialGroup()
                                    .addComponent(messagesSectionLabel)
                                    .addGap(21, 21, 21)
                                    .addComponent(messagesArea, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(messageEncrypterPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(viewMessagesButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                .addComponent(sendButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, messageEncrypterPanLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        messageEncrypterPanLayout.setVerticalGroup(
            messageEncrypterPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(messageEncrypterPanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(messageEncrypterPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(usernameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(messageEncrypterPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(viewMessagesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(messageEncrypterPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(messageEncrypterPanLayout.createSequentialGroup()
                        .addComponent(messagesSectionLabel)
                        .addGap(0, 125, Short.MAX_VALUE))
                    .addComponent(messagesArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(messageEncrypterPanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(messageEncrypterPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(messageEncrypterPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        sendMessage();
        messageField.setText("");
    }//GEN-LAST:event_sendButtonActionPerformed

    private void viewMessagesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMessagesButtonActionPerformed
        viewMessages();
    }//GEN-LAST:event_viewMessagesButtonActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
        SoftwareAppsGUI obj = new SoftwareAppsGUI();
        obj.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void messageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messageFieldActionPerformed

    private void generateKey() {
        try {
            KeyGenerator keyGen = KeyGenerator.getInstance("AES");
            keyGen.init(128);
            secretKey = keyGen.generateKey();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendMessage() {
        // getting the information from the input fields
        String receivingUser = usernameField.getText();
        String message = messageField.getText();

        if (!receivingUser.isEmpty() && !message.isEmpty()) {
            try {
                // encrypting
                String encryptedMessage = encryptMessage(message);

                // storing message in DB
                storeEncryptedMessage(receivingUser, encryptedMessage);
                statusLabel.setText("Message sent successfully!");
            } catch (Exception e) {
                statusLabel.setText("Error while trying to send the message.");
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            statusLabel.setText("Please fill in all fields.");
        }
    }

    private void viewMessages() {
        String username = usernameField.getText();
        if (!username.isEmpty()) {
            try {
                // get and decrypt message sent
                String decryptedMessages = retrieveAndDecryptMessages(username);
                // displaying decrypted messages
                messagesArea.setText(decryptedMessages);
            } catch (Exception e) {
                statusLabel.setText("Error while trying to view the messages.");
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            statusLabel.setText("Please enter your username.");
        }
    }

    private String encryptMessage(String message) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        // encrypt the message
        byte[] encryptedBytes = cipher.doFinal(message.getBytes());
        return Base64.getEncoder().encodeToString(encryptedBytes);
    }

    private void storeEncryptedMessage(String username, String encryptedMessage) throws SQLException {
        Connection connection = DriverManager.getConnection(databaseURL, databaseUSER, databasePASS);
        String query = "INSERT INTO messages (Username, EncryptedMessage) VALUES (?, ?)";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, username); //set username
        stmt.setString(2, encryptedMessage); //set encrypted message
        stmt.executeUpdate();
        connection.close();
    }

    private String retrieveAndDecryptMessages(String username) throws Exception {
        Connection connection = DriverManager.getConnection(databaseURL, databaseUSER, databasePASS);
        String query = "SELECT EncryptedMessage FROM messages WHERE Username = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, username);
        ResultSet rs = stmt.executeQuery();

        StringBuilder messages = new StringBuilder();
        while (rs.next()) {
            String encryptedMessage = rs.getString("EncryptedMessage");
            String decryptedMessage = decryptMessage(encryptedMessage); //decrypt
            messages.append(decryptedMessage).append("\n");
        }

        connection.close();
        return messages.toString();
    }

    private String decryptMessage(String encryptedMessage) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decodedBytes = Base64.getDecoder().decode(encryptedMessage);
        byte[] decryptedBytes = cipher.doFinal(decodedBytes);
        return new String(decryptedBytes);
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
            java.util.logging.Logger.getLogger(EncryptedMessagesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncryptedMessagesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncryptedMessagesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncryptedMessagesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncryptedMessagesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton backBtn;
    private javax.swing.JPanel messageEncrypterPan;
    private javax.swing.JTextField messageField;
    private javax.swing.JLabel messageLabel;
    private java.awt.TextArea messagesArea;
    private javax.swing.JLabel messagesSectionLabel;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JButton viewMessagesButton;
    // End of variables declaration//GEN-END:variables
}
