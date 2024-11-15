/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package encryptedmessages;

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

        Title = new javax.swing.JLabel();
        sendButton = new javax.swing.JButton();
        viewMessagesButton = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        messageField = new javax.swing.JTextField();
        messageLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();
        messagesArea = new java.awt.TextArea();
        messagesSectionLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        Title.setFont(new java.awt.Font("Unispace", 1, 36)); // NOI18N
        Title.setForeground(new java.awt.Color(0, 255, 0));
        Title.setText("Send Encrypted Messages");

        sendButton.setBackground(new java.awt.Color(51, 153, 0));
        sendButton.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        sendButton.setForeground(new java.awt.Color(255, 255, 255));
        sendButton.setText("Send Message");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        viewMessagesButton.setBackground(new java.awt.Color(0, 153, 153));
        viewMessagesButton.setFont(new java.awt.Font("Unispace", 0, 18)); // NOI18N
        viewMessagesButton.setForeground(new java.awt.Color(255, 255, 255));
        viewMessagesButton.setText("View Messages");
        viewMessagesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewMessagesButtonActionPerformed(evt);
            }
        });

        usernameField.setBackground(new java.awt.Color(0, 0, 0));
        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));

        usernameLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setText("Username:");

        messageField.setBackground(new java.awt.Color(0, 0, 0));
        messageField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        messageField.setForeground(new java.awt.Color(255, 255, 255));

        messageLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        messageLabel.setForeground(new java.awt.Color(255, 255, 255));
        messageLabel.setText("Message:");

        statusLabel.setForeground(new java.awt.Color(255, 255, 255));

        messagesArea.setBackground(new java.awt.Color(0, 0, 0));
        messagesArea.setForeground(new java.awt.Color(255, 255, 255));

        messagesSectionLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        messagesSectionLabel.setForeground(new java.awt.Color(255, 255, 255));
        messagesSectionLabel.setText("Messages");

        backBtn.setBackground(new java.awt.Color(255, 102, 0));
        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(messagesSectionLabel)
                        .addGap(409, 409, 409))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                                .addComponent(messagesArea, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(messageLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(viewMessagesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Title)
                                            .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(197, 197, 197))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameLabel))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(messageLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(sendButton)
                        .addGap(5, 5, 5)
                        .addComponent(viewMessagesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(messagesSectionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(messagesArea, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(backBtn)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        sendMessage();
    }//GEN-LAST:event_sendButtonActionPerformed

    private void viewMessagesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewMessagesButtonActionPerformed
        viewMessages();
    }//GEN-LAST:event_viewMessagesButtonActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // this is to send it back to the encrypted file page
    }//GEN-LAST:event_backBtnActionPerformed

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
                statusLabel.setText("Error: " + e.getMessage());
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
                statusLabel.setText("Error: " + e.getMessage());
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
