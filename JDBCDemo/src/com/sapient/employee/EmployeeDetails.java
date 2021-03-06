/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sapient.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import oracle.jdbc.driver.DBConversion;
import oracle.jdbc.driver.OracleDriver;

/**
 *
 * @author span42
 */
public class EmployeeDetails extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeDetails
     */
    public EmployeeDetails() {
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

        lblEmployeeID = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        btnFindID = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtEmployeeID = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEmployeeID.setText("Employee ID");

        lblFirstName.setText("First Name ");

        lblLastName.setText("Last Name");

        lblSalary.setText("Salary");

        btnFindID.setText("Find by ID");
        btnFindID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindIDActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtEmployeeID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmployeeIDActionPerformed(evt);
            }
        });

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmployeeID)
                            .addComponent(lblFirstName)
                            .addComponent(lblLastName)
                            .addComponent(lblSalary))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFirstName)
                            .addComponent(txtLastName)
                            .addComponent(txtSalary)
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnFindID)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(28, 28, 28)
                        .addComponent(btnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnExit)
                            .addComponent(btnUpdate))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployeeID)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalary)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindID)
                    .addComponent(btnDelete)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(btnExit)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindIDActionPerformed
        // TODO add your handling code here:
    	Connection dbConnection =null;
    	PreparedStatement pStatement = null;
    	
    	ResultSet result=null;
    	
    	try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			 dbConnection = DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE", "saurabh", "sauran");
			
			 pStatement = dbConnection.prepareStatement("SELECT FIRST_NAME,LAST_NAME,SALARY FROM EMPLOYEES WHERE EMPLOYEE_ID =?");
			pStatement.setInt(1,Integer.parseInt(txtEmployeeID.getText()));
			
			result = pStatement.executeQuery();
			
			if(result.next()){
				
				txtFirstName.setText(result.getString(1));
				txtLastName.setText(result.getString(2));
				txtSalary.setText(result.getString(3));
				
			}else{
				JOptionPane.showMessageDialog(this, "No Record Found");
			}
			
			
		}
    	
    	catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	finally{
    		try{
    			if(dbConnection!=null && !dbConnection.isClosed()){
    				dbConnection.close();
    			}
    			if(pStatement!=null){
    				pStatement.close();
    				
    			}
    			if(result!=null){
    				result.close();
    			}
    		}
    		catch(Exception e){
    			e.printStackTrace();
    		}
    	}
    	
    }//GEN-LAST:event_btnFindIDActionPerformed

    private void txtEmployeeIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmployeeIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmployeeIDActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    	
    	Connection dbConnection =null;
    	PreparedStatement pStatement = null;
    	
    	ResultSet result=null;
    	
    	try{
    		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			 dbConnection = DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE", "SAURABH", "sauran");
			 pStatement = dbConnection.prepareStatement("DELETE FROM EMPLOYEES WHERE EMPLOYEE_ID = ?");
			 
			 pStatement.setInt(1,Integer.parseInt(txtEmployeeID.getText()));
			 pStatement.executeUpdate();
				
				JOptionPane.showMessageDialog(this, "dELETED");
				
				
			 
				
    	}catch(Exception e){
    		e.printStackTrace();
    	}finally{
    		try{
    			if(dbConnection!=null && !dbConnection.isClosed()){
    				dbConnection.close();
    			}
    			if(pStatement!=null){
    				pStatement.close();
    				
    			}
    			if(result!=null){
    				result.close();
    			}
    		}
    		catch(Exception e){
    			e.printStackTrace();
    		}
    	}
    	
    	//Load /Register
    	
    	
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
    	Connection dbConnection =null;
    	PreparedStatement pStatement = null;
    	
    	ResultSet result=null;
    	
    	try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			 dbConnection = DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE", "SAURABH", "sauran");
			 
			
			pStatement = dbConnection.prepareStatement("INSERT INTO EMPLOYEES(EMPLOYEE_ID,FIRST_NAME,LAST_NAME,SALARY) VALUES(?,?,?,?)");
			pStatement.setInt(1,Integer.parseInt(txtEmployeeID.getText()));
			
			pStatement.setString(2,(txtFirstName.getText()));
			
			pStatement.setString(3,(txtLastName.getText()));
			
			pStatement.setDouble(4, Double.parseDouble(txtSalary.getText()));
			
			 pStatement.executeUpdate();
			
			JOptionPane.showMessageDialog(this, "Inserted");
			
			
			
			/*if(result.next()){
				
				txtFirstName.setText(result.getString(1));
				txtLastName.setText(result.getString(2));
				txtSalary.setText(result.getString(3));
				
			}else{
				JOptionPane.showMessageDialog(this, "No Record Found");
			}*/
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
    	finally{
    		try{
    			if(dbConnection!=null && !dbConnection.isClosed()){
    				dbConnection.close();
    			}
    			if(pStatement!=null){
    				pStatement.close();
    				
    			}
    			if(result!=null){
    				result.close();
    			}
    		}
    		catch(Exception e){
    			e.printStackTrace();
    		}
    	}
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    	System.exit(1);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFindID;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
