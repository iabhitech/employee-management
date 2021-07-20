/*
 * Employee Management System
 * Designed By Abhineet Verma  * 
 */
package com.iabhitech.empmgmt.gui;

import com.iabhitech.empmgmt.dao.EmployeeDao;
import com.iabhitech.empmgmt.pojo.Employee;
import java.awt.Component;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ABHINEET VERMA
 */
public class UpdateEmployeeFrame extends javax.swing.JFrame {

    /**
     * Creates new form UpdateEmployeeFrame
     */
    private String searchEmpID = "";

    public UpdateEmployeeFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
        toggleTheme.setValue(Theme.CURRENT_THEME);
        toggleThemeStateChanged(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootPane = new javax.swing.JPanel();
        labelHeading = new javax.swing.JLabel();
        labelEmpID = new javax.swing.JLabel();
        labelEmpName = new javax.swing.JLabel();
        labelEmpSal = new javax.swing.JLabel();
        textFieldEmpID = new javax.swing.JTextField();
        textFieldEmpSalary = new javax.swing.JTextField();
        textFieldEmpName = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        toggleTheme = new javax.swing.JSlider();
        labelToggleTheme = new javax.swing.JLabel();
        labelInputHelp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rootPane.setBackground(new java.awt.Color(255, 255, 255));

        labelHeading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelHeading.setText("Update Employee");

        labelEmpID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelEmpID.setText("Employee ID:");

        labelEmpName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelEmpName.setText("Employee Name:");

        labelEmpSal.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelEmpSal.setText("Employee Salary:");

        textFieldEmpID.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        textFieldEmpID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldEmpIDActionPerformed(evt);
            }
        });

        textFieldEmpSalary.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        textFieldEmpName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setText("<< BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        toggleTheme.setMaximum(1);
        toggleTheme.setToolTipText("Toogle Dark/Light Theme");
        toggleTheme.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                toggleThemeStateChanged(evt);
            }
        });

        labelToggleTheme.setText("Toggle Theme");
        labelToggleTheme.setToolTipText("Toogle Dark/Light Theme");

        labelInputHelp.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        labelInputHelp.setText("Press Enter to Search");

        javax.swing.GroupLayout rootPaneLayout = new javax.swing.GroupLayout(rootPane);
        rootPane.setLayout(rootPaneLayout);
        rootPaneLayout.setHorizontalGroup(
            rootPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPaneLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(rootPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelEmpSal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelEmpName)
                    .addComponent(labelEmpID)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(rootPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rootPaneLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPaneLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(rootPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textFieldEmpName, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(textFieldEmpID, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                .addComponent(labelInputHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(textFieldEmpSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPaneLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(rootPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPaneLayout.createSequentialGroup()
                        .addComponent(labelToggleTheme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toggleTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPaneLayout.createSequentialGroup()
                        .addComponent(labelHeading)
                        .addGap(187, 187, 187))))
        );
        rootPaneLayout.setVerticalGroup(
            rootPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rootPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(toggleTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(labelToggleTheme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(labelHeading)
                .addGap(50, 50, 50)
                .addGroup(rootPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textFieldEmpID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmpID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelInputHelp)
                .addGap(29, 29, 29)
                .addGroup(rootPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmpName)
                    .addComponent(textFieldEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(rootPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEmpSal)
                    .addComponent(textFieldEmpSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(rootPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnUpdate))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // Going BACK to MAIN screen
        new OptionsFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String currentEmpID = textFieldEmpID.getText().trim();
        if (!searchEmpID.equals(currentEmpID)) {
            JOptionPane.showMessageDialog(null, "Please Don't Modify Employee ID while Updating", "Warning", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        try {
            int id = Integer.parseInt(currentEmpID);
            String name = textFieldEmpName.getText().trim();
            double sal = Double.parseDouble(textFieldEmpSalary.getText().trim());
            Employee emp = new Employee(id, name, sal);
            if (EmployeeDao.updateEmployee(emp)) {
                JOptionPane.showMessageDialog(null, "Data Updated Succesfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                //empty other fields
                textFieldEmpName.setText("");
                textFieldEmpSalary.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Unable to Update data!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please input numeric data", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in Database", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void toggleThemeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_toggleThemeStateChanged
        // Handle Toogle Theme: DARK and LIGHT

        Theme.setTheme(toggleTheme.getValue());

        Theme.setForeground(new Component[]{
            labelToggleTheme,
            labelHeading,
            labelEmpID,
            labelEmpName,
            labelEmpSal,
            btnUpdate,
            btnBack
        }, Theme.textPrimary);

        Theme.setForeground(new Component[]{
            labelInputHelp
        }, Theme.textSecondary);

        Theme.setBackground(new Component[]{rootPane, btnUpdate, btnBack}, Theme.bgPrimary);
    }//GEN-LAST:event_toggleThemeStateChanged

    private void textFieldEmpIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldEmpIDActionPerformed
        // Search the Employee Data
        //empty other fields
        textFieldEmpName.setText("");
        textFieldEmpSalary.setText("");

        searchEmpID = textFieldEmpID.getText().trim();
        if (searchEmpID.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please input Employee id", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            Employee e = EmployeeDao.findEmployeeById(Integer.parseInt(searchEmpID));
            if (e == null) {
                JOptionPane.showMessageDialog(null, "No record found for emp id= " + searchEmpID, "Employee Not Found", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            textFieldEmpName.setText(e.getName());
            textFieldEmpSalary.setText(String.valueOf(e.getSalary()));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Please input numeric employee id", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to fetch data", "DB Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }


    }//GEN-LAST:event_textFieldEmpIDActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployeeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployeeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel labelEmpID;
    private javax.swing.JLabel labelEmpName;
    private javax.swing.JLabel labelEmpSal;
    private javax.swing.JLabel labelHeading;
    private javax.swing.JLabel labelInputHelp;
    private javax.swing.JLabel labelToggleTheme;
    private javax.swing.JPanel rootPane;
    private javax.swing.JTextField textFieldEmpID;
    private javax.swing.JTextField textFieldEmpName;
    private javax.swing.JTextField textFieldEmpSalary;
    private javax.swing.JSlider toggleTheme;
    // End of variables declaration//GEN-END:variables

}
