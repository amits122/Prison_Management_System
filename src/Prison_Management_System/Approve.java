/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prison_Management_System;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author amits
 */
public class Approve extends javax.swing.JFrame {

    ResultSet mainRs = null;
    
    public void fetch(){
        Visitor_Name.setText("");
        Contact_Number.setText("");
        Inmate_ID_Visitor.setText("");
        Relationship.setText("");
        Purpose.setText("");
        Entry_Time.setText("");
        Exit_Time.setText("");
        try{
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/pms", "root", "26111996");
            Statement mainStmt = (Statement)con.createStatement();
            String mainQuery = "SELECT * FROM VISITOR WHERE Accept = 3;";
            mainRs = mainStmt.executeQuery(mainQuery);
            if(mainRs.next() == false)
                throw new ArithmeticException("No pending requests"); 
            mainRs.first();
            Visitor_Name.setText(mainRs.getString("Name"));
            Contact_Number.setText(mainRs.getString("Contact_Number"));
            Inmate_ID_Visitor.setText(mainRs.getString("Inmate_ID"));
            Relationship.setText(mainRs.getString("Relationship"));
            Purpose.setText(mainRs.getString("Purpose"));
            Entry_Time.setText(mainRs.getString("Entry_Time"));
            Exit_Time.setText(mainRs.getString("Exit_Time"));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    /**
     * Creates new form Approve
     */
    public Approve() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        Visitor_Name = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        Contact_Number = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        Inmate_ID_Visitor = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        Relationship = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        Purpose = new javax.swing.JTextField();
        jLabel40 = new javax.swing.JLabel();
        Entry_Time = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        Exit_Time = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Comment = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel12.setBackground(new java.awt.Color(51, 51, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(370, 236));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Approve Visitor");

        jButton8.setBackground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Prison_Management_System/Images/logout.png"))); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Prison_Management_System/Images/back.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(18, 18, 18))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addComponent(jLabel28)
                    .addComponent(jButton8))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(255, 51, 51));
        jPanel13.setPreferredSize(new java.awt.Dimension(370, 236));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("© Copyright 2017");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel47)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addGap(37, 37, 37))
        );

        jLabel35.setText("Name");

        Visitor_Name.setEditable(false);
        Visitor_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Visitor_NameActionPerformed(evt);
            }
        });

        jLabel36.setText("Contact_Number");

        Contact_Number.setEditable(false);
        Contact_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Contact_NumberActionPerformed(evt);
            }
        });

        jLabel37.setText("Inmate_ID");

        Inmate_ID_Visitor.setEditable(false);
        Inmate_ID_Visitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Inmate_ID_VisitorActionPerformed(evt);
            }
        });

        jLabel38.setText("Relationship");

        Relationship.setEditable(false);
        Relationship.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RelationshipActionPerformed(evt);
            }
        });

        jLabel39.setText("Purpose");

        Purpose.setEditable(false);
        Purpose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurposeActionPerformed(evt);
            }
        });

        jLabel40.setText("Entry_time");

        Entry_Time.setEditable(false);
        Entry_Time.setToolTipText("YYYY-MM-DD HH:MM:SS");
        Entry_Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Entry_TimeActionPerformed(evt);
            }
        });

        jLabel46.setText("Exit_time");

        Exit_Time.setEditable(false);
        Exit_Time.setToolTipText("YYYY-MM-DD HH:MM:SS");
        Exit_Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit_TimeActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Prison_Management_System/Images/done.png"))); // NOI18N
        jButton3.setText("Approve");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Prison_Management_System/Images/clear.png"))); // NOI18N
        jButton4.setText("Disapprove");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Prison_Management_System/Images/refresh.png"))); // NOI18N
        jButton5.setText("Refresh");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setText("Comment");

        Comment.setColumns(20);
        Comment.setRows(5);
        jScrollPane1.setViewportView(Comment);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel46))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(69, 69, 69)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Exit_Time, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(Entry_Time)
                            .addComponent(Purpose)
                            .addComponent(Relationship)
                            .addComponent(Inmate_ID_Visitor)
                            .addComponent(Contact_Number)
                            .addComponent(Visitor_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(Visitor_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(Contact_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(Inmate_ID_Visitor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(Relationship, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(Purpose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(Entry_Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(Exit_Time, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new Login().setVisible(true);
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new PrisonManagerHome().setVisible(true);        
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Visitor_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Visitor_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Visitor_NameActionPerformed

    private void Contact_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Contact_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Contact_NumberActionPerformed

    private void Inmate_ID_VisitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Inmate_ID_VisitorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Inmate_ID_VisitorActionPerformed

    private void RelationshipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RelationshipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RelationshipActionPerformed

    private void PurposeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurposeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PurposeActionPerformed

    private void Entry_TimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Entry_TimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Entry_TimeActionPerformed

    private void Exit_TimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit_TimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Exit_TimeActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        fetch();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try{
        Class.forName("java.sql.DriverManager");
        Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/pms", "root", "26111996");
        Statement stmt = (Statement)con.createStatement();
        String query = "UPDATE VISITOR SET Accept = 1 , Comment = '"+Comment.getText()+"'WHERE Name = '"+Visitor_Name.getText() + "'AND Contact_Number = '" + Contact_Number.getText() + "';";
        stmt.executeUpdate(query);
        String line1 = "Approved Visitor " + Visitor_Name.getText() + ", " + Contact_Number.getText() + ", " + Inmate_ID_Visitor.getText() + ", " + Relationship.getText() + ", " + Purpose.getText() + ", " + Entry_Time.getText() + ", " + Exit_Time.getText(); 
        String logger = "INSERT INTO LOG(User, Operation) VALUES('"+Login.username+"','"+line1+"');";
        stmt.executeUpdate(logger);
        fetch();
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e.getMessage());
    }    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    try{
        Class.forName("java.sql.DriverManager");
        Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/pms", "root", "26111996");
        Statement stmt = (Statement)con.createStatement();
        String query = "UPDATE VISITOR SET Accept = 0 , Comment = '"+Comment.getText()+"'WHERE Name = '"+Visitor_Name.getText() + "'AND Contact_Number = '" + Contact_Number.getText() + "';";
        stmt.executeUpdate(query);
        String line1 = "Rejected Visitor " + Visitor_Name.getText() + ", " + Contact_Number.getText() + ", " + Inmate_ID_Visitor.getText() + ", " + Relationship.getText() + ", " + Purpose.getText() + ", " + Entry_Time.getText() + ", " + Exit_Time.getText(); 
        String logger = "INSERT INTO LOG(User, Operation) VALUES('"+Login.username+"','"+line1+"');";
        stmt.executeUpdate(logger);
        fetch();
    }
    catch(Exception e){
        JOptionPane.showMessageDialog(this, e.getMessage());
    }      
    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Approve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Approve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Approve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Approve.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Approve().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Comment;
    private javax.swing.JTextField Contact_Number;
    private javax.swing.JTextField Entry_Time;
    private javax.swing.JTextField Exit_Time;
    private javax.swing.JTextField Inmate_ID_Visitor;
    private javax.swing.JTextField Purpose;
    private javax.swing.JTextField Relationship;
    private javax.swing.JTextField Visitor_Name;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
