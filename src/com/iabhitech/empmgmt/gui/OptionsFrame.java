/*
 * Employee Management System
 * Designed By Abhineet Verma  * 
 */
package com.iabhitech.empmgmt.gui;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhineet Verma
 */
public class OptionsFrame extends javax.swing.JFrame {

    public OptionsFrame() {
        initComponents();
        super.setLocationRelativeTo(null);
        toggleTheme.setValue(Theme.CURRENT_THEME);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrpChoice = new javax.swing.ButtonGroup();
        rootPane = new javax.swing.JPanel();
        panelMain = new javax.swing.JPanel();
        labelHeading = new javax.swing.JLabel();
        radioBtnAddEmp = new javax.swing.JRadioButton();
        radioBtnShowAllEmp = new javax.swing.JRadioButton();
        radioBtnSearchEmp = new javax.swing.JRadioButton();
        radioBtnQuit = new javax.swing.JRadioButton();
        btnProceed = new javax.swing.JButton();
        labelToggleTheme = new javax.swing.JLabel();
        toggleTheme = new javax.swing.JSlider();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Management");
        setResizable(false);

        rootPane.setBackground(new java.awt.Color(255, 255, 255));

        panelMain.setOpaque(false);

        labelHeading.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelHeading.setText("Select Your Choice");

        btnGrpChoice.add(radioBtnAddEmp);
        radioBtnAddEmp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        radioBtnAddEmp.setText("Add Employee");
        radioBtnAddEmp.setOpaque(false);

        btnGrpChoice.add(radioBtnShowAllEmp);
        radioBtnShowAllEmp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        radioBtnShowAllEmp.setText("Show All Employee");
        radioBtnShowAllEmp.setOpaque(false);

        btnGrpChoice.add(radioBtnSearchEmp);
        radioBtnSearchEmp.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        radioBtnSearchEmp.setText("Search Employee");
        radioBtnSearchEmp.setOpaque(false);

        btnGrpChoice.add(radioBtnQuit);
        radioBtnQuit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        radioBtnQuit.setText("Quit");
        radioBtnQuit.setOpaque(false);

        btnProceed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnProceed.setText("Proceed >>");
        btnProceed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProceedActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(labelHeading))
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(radioBtnAddEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnProceed, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelMainLayout.createSequentialGroup()
                                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioBtnSearchEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(radioBtnShowAllEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radioBtnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(labelHeading)
                .addGap(31, 31, 31)
                .addComponent(radioBtnAddEmp)
                .addGap(18, 18, 18)
                .addComponent(radioBtnSearchEmp)
                .addGap(18, 18, 18)
                .addComponent(radioBtnShowAllEmp)
                .addGap(18, 18, 18)
                .addComponent(radioBtnQuit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnProceed, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        labelToggleTheme.setText("Toggle Theme");
        labelToggleTheme.setToolTipText("Toogle Dark/Light Theme");

        toggleTheme.setMaximum(1);
        toggleTheme.setToolTipText("Toogle Dark/Light Theme");
        toggleTheme.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                toggleThemeStateChanged(evt);
            }
        });

        javax.swing.GroupLayout rootPaneLayout = new javax.swing.GroupLayout(rootPane);
        rootPane.setLayout(rootPaneLayout);
        rootPaneLayout.setHorizontalGroup(
            rootPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rootPaneLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelToggleTheme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toggleTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        rootPaneLayout.setVerticalGroup(
            rootPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rootPaneLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(rootPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(toggleTheme, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(labelToggleTheme))
                .addGap(18, 18, 18)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rootPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProceedActionPerformed
        // Take User Choice and PROCEED next

        if (radioBtnAddEmp.isSelected()) {

            AddEmployeeFrame addEmpFrame = new AddEmployeeFrame();
            addEmpFrame.setVisible(true);
            this.dispose();

        } else if (radioBtnSearchEmp.isSelected()) {

            SearchEmployeeFrame searchEmpFrame = new SearchEmployeeFrame();
            searchEmpFrame.setVisible(true);
            this.dispose();

        } else if (radioBtnShowAllEmp.isSelected()) {
            
            ViewAllEmployeeFrame viewAllEmpFrame = new ViewAllEmployeeFrame();
            viewAllEmpFrame.setVisible(true);
            this.dispose();
            
        } else if (radioBtnQuit.isSelected()) {
            if (JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(null, "Are you want to Exit?")) {
                System.exit(0);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Select a Choice the Proceed!");
        }
    }//GEN-LAST:event_btnProceedActionPerformed

    private void toggleThemeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_toggleThemeStateChanged
        // Handle Toogle Theme: DARK and LIGHT

        Theme.setTheme(toggleTheme.getValue());
        Theme.setForeground(new Component[]{
            labelToggleTheme,
            labelHeading,
            radioBtnAddEmp,
            radioBtnSearchEmp,
            radioBtnShowAllEmp,
            radioBtnQuit,
            btnProceed
        }, Theme.textPrimary);

        Theme.setBackground(new Component[]{rootPane, btnProceed}, Theme.bgPrimary);

    }//GEN-LAST:event_toggleThemeStateChanged

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
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OptionsFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OptionsFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGrpChoice;
    private javax.swing.JButton btnProceed;
    private javax.swing.JLabel labelHeading;
    private javax.swing.JLabel labelToggleTheme;
    private javax.swing.JPanel panelMain;
    private javax.swing.JRadioButton radioBtnAddEmp;
    private javax.swing.JRadioButton radioBtnQuit;
    private javax.swing.JRadioButton radioBtnSearchEmp;
    private javax.swing.JRadioButton radioBtnShowAllEmp;
    private javax.swing.JPanel rootPane;
    private javax.swing.JSlider toggleTheme;
    // End of variables declaration//GEN-END:variables
}
