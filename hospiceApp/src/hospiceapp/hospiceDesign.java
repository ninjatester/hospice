/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospiceapp;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author workstation
 */
public class hospiceDesign extends javax.swing.JFrame {

    /**
     * Creates new form hospiceDesign
     */
    public hospiceDesign() {
        initComponents();
        initTable();
    }
    
    private void initTable() {
        
        studentDAO = new StudentDAO();
        
       
        
        model = new DefaultTableModel() {
            @Override
                    public boolean isCellEditable(int rowIndex, int mColIndex) {
                            return false;
                    }
        };
                
        model.addColumn("id");
        model.addColumn("Name");
        model.addColumn("EGN");
        model.addColumn("Course");
        model.addColumn("Specialty");
        model.addColumn("Address");
        model.addColumn("isOrphan");
        model.addColumn("isMarried");
        model.addColumn("isLonelyParent");
        model.addColumn("hasRelatives");
        model.addColumn("achievement");
        model.addColumn("status");
        
         studentsListTable.getTableHeader().setReorderingAllowed(false);
         studentsListTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
       List<String[]> studentResult = studentDAO.findAll();
        for (int i = 0; i < studentResult.size(); i++) {
		model.addRow(studentResult.get(i));
	}
        
        studentsListTable.setModel(model);
    }
    
    private void resetTableModel() {
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged(); // notifies the JTable that the model has changed
        
        List<String[]> studentResult = studentDAO.findAll();
        for (int i = 0; i < studentResult.size(); i++) {
		model.addRow(studentResult.get(i));
	}
        
        studentsListTable.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        studentsListTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        nameTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        EGNTextField = new javax.swing.JTextField();
        EGNLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        achievementLabel = new javax.swing.JLabel();
        achievementTextField = new javax.swing.JTextField();
        courseLabel = new javax.swing.JLabel();
        courseTextField = new javax.swing.JTextField();
        isMarried = new javax.swing.JCheckBox();
        isLonelyParent = new javax.swing.JCheckBox();
        hasRelatives = new javax.swing.JCheckBox();
        status = new javax.swing.JCheckBox();
        isOrphan = new javax.swing.JCheckBox();
        specialtyLabel = new javax.swing.JLabel();
        specialtyTextField = new javax.swing.JTextField();
        clearBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        studentsListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        studentsListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentsListTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(studentsListTable);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        nameLabel.setText("Name");

        EGNLabel.setText("EGN");

        addressLabel.setText("Address");

        achievementLabel.setText("Achievement");

        courseLabel.setText("Course");

        courseTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseTextFieldActionPerformed(evt);
            }
        });

        isMarried.setText("Married");
        isMarried.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isMarriedActionPerformed(evt);
            }
        });

        isLonelyParent.setText("Lonely parent");

        hasRelatives.setText("Relatives in");
        hasRelatives.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasRelativesActionPerformed(evt);
            }
        });

        status.setText("Approved");

        isOrphan.setText("Orphan");

        specialtyLabel.setText("Specialty");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EGNLabel)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EGNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(addressLabel)
                        .addGap(18, 18, 18)
                        .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(isOrphan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(isLonelyParent))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(achievementLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(achievementTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(courseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(courseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(specialtyLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(specialtyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(isMarried)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(status)
                    .addComponent(hasRelatives))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel)
                    .addComponent(addressLabel)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isLonelyParent)
                    .addComponent(status)
                    .addComponent(isOrphan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EGNTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(EGNLabel)
                        .addComponent(achievementLabel)
                        .addComponent(courseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(courseLabel)
                        .addComponent(achievementTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(specialtyLabel)
                        .addComponent(specialtyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(isMarried)
                        .addComponent(hasRelatives)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(clearBtn)
                        .addGap(18, 18, 18)
                        .addComponent(saveBtn)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clearBtn)
                    .addComponent(deleteBtn)
                    .addComponent(saveBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void courseTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_courseTextFieldActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        resetFields();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO ADD CHECKS FOR DATA TYPES
        //check data
        if (nameTextField.getText().equals("") || EGNTextField.getText().equals("")
                || addressTextField.getText().equals("") || achievementTextField.getText().equals("") || courseTextField.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "There are empty fields");
        } else {
            Student addNew = new Student();
            addNew.setName(nameTextField.getText());
            addNew.setAchievement(Double.parseDouble(achievementTextField.getText()));
            addNew.setAddress(addressTextField.getText());
            addNew.setCourse(Integer.parseInt(courseTextField.getText()));
            addNew.setEGN(Integer.parseInt(EGNTextField.getText()));
            addNew.setHasRelatives(((hasRelatives.isSelected()) ?1:0));
            addNew.setIsLonelyParent((isLonelyParent.isSelected()) ?1:0);
            addNew.setIsMarried((isLonelyParent.isSelected()) ?1:0);
            addNew.setIsOrphan((isOrphan.isSelected()) ?1:0);
            addNew.setSpecialty(specialtyTextField.getText());
            addNew.setStatus((status.isSelected()) ?1:0);
            
            
            if (selectStudentNumber != 0) {
                addNew.setIdNumber(selectStudentNumber);
                studentDAO.update(addNew);
                selectStudentNumber =0;
                resetFields();
                resetTableModel();
                JOptionPane.showMessageDialog(this, "Student has been updated successfully");
            } else {
                studentDAO.add(addNew);
                selectStudentNumber =0;
                resetFields();
                resetTableModel();
                JOptionPane.showMessageDialog(this, "Student has been added successfully");
            }
            
            
          
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void studentsListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentsListTableMouseClicked
        // TODO add your handling code here:
        int row=studentsListTable.rowAtPoint(evt.getPoint());
        int col= studentsListTable.columnAtPoint(evt.getPoint());
        selectStudentNumber = Integer.parseInt(studentsListTable.getValueAt(row,0).toString());
        
        nameTextField.setText(studentsListTable.getValueAt(row,1).toString());
        EGNTextField.setText(studentsListTable.getValueAt(row,2).toString());
        addressTextField.setText(studentsListTable.getValueAt(row,5).toString());
        achievementTextField.setText(studentsListTable.getValueAt(row,10).toString());
        courseTextField.setText(studentsListTable.getValueAt(row,3).toString());
        specialtyTextField.setText(studentsListTable.getValueAt(row,4).toString());
        isOrphan.setSelected((Integer.parseInt(studentsListTable.getValueAt(row,6).toString()) != 0) ?true:false);
        isMarried.setSelected((Integer.parseInt(studentsListTable.getValueAt(row,7).toString())!= 0) ?true:false);
        isLonelyParent.setSelected((Integer.parseInt(studentsListTable.getValueAt(row,8).toString())!= 0) ?true:false);
        hasRelatives.setSelected((Integer.parseInt(studentsListTable.getValueAt(row,9).toString())!= 0) ?true:false);
        status.setSelected((Integer.parseInt(studentsListTable.getValueAt(row,11).toString())!= 0) ?true:false);
        
        
       /* 
        studentsListTable.convertRowIndexToModel(row);
        JOptionPane.showMessageDialog(null," Value in the cell clicked :"+ " " +studentsListTable.getValueAt(row,col).toString());
        System.out.println(" Value in the cell clicked :"+ " "  +studentsListTable.getValueAt(row,col).toString());
        */
    }//GEN-LAST:event_studentsListTableMouseClicked

    private void hasRelativesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasRelativesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hasRelativesActionPerformed

    private void isMarriedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isMarriedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isMarriedActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        if (selectStudentNumber == 0) {
            JOptionPane.showMessageDialog(this, "You have to select a row which you would like to delete");
        } else {
            studentDAO.delete(selectStudentNumber);
            selectStudentNumber =0;
            resetFields();
            resetTableModel();
            JOptionPane.showMessageDialog(this, "Row has been removed successfully");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    
    private void resetFields() {
        nameTextField.setText("");
        EGNTextField.setText("");
        addressTextField.setText("");
        achievementTextField.setText("");
        courseTextField.setText("");
        specialtyTextField.setText("");
        isOrphan.setSelected(false);
        isMarried.setSelected(false);
        isLonelyParent.setSelected(false);
        hasRelatives.setSelected(false);
        status.setSelected(false);
        
        selectStudentNumber = 0;
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
            java.util.logging.Logger.getLogger(hospiceDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hospiceDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hospiceDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hospiceDesign.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hospiceDesign().setVisible(true);
            }
        });
    }
    private DefaultTableModel model;
    private StudentDAO studentDAO;
    private int selectStudentNumber;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel EGNLabel;
    private javax.swing.JTextField EGNTextField;
    private javax.swing.JLabel achievementLabel;
    private javax.swing.JTextField achievementTextField;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JTextField courseTextField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JCheckBox hasRelatives;
    private javax.swing.JCheckBox isLonelyParent;
    private javax.swing.JCheckBox isMarried;
    private javax.swing.JCheckBox isOrphan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel specialtyLabel;
    private javax.swing.JTextField specialtyTextField;
    private javax.swing.JCheckBox status;
    private javax.swing.JTable studentsListTable;
    // End of variables declaration//GEN-END:variables
}
