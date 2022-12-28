/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib.klasser;

import static java.lang.Integer.parseInt;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Grupp4
 */
public class NewTechnologyPage extends javax.swing.JFrame {
    private InfDB idb;
    private int agentId;
    /**
     * Creates new form NewTechnologyPage.
     */
    public NewTechnologyPage(InfDB idb,int agentId) {
        initComponents();
        this.idb = idb;
        this.agentId = agentId;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        lblAddNewCommunicationHeader = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblPowerSource = new javax.swing.JLabel();
        lblEquipmentId = new javax.swing.JLabel();
        txtEquipmentId = new javax.swing.JTextField();
        txtPowerSource = new javax.swing.JTextField();
        txtDescription = new javax.swing.JTextField();
        btnAddTechnology = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblText = new javax.swing.JLabel();
        lblErrorText = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAddNewCommunicationHeader.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAddNewCommunicationHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddNewCommunicationHeader.setText("Add New Technology");

        lblDescription.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDescription.setText("Description:");

        lblPowerSource.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPowerSource.setText("Power source:");

        lblEquipmentId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEquipmentId.setText("Equipment-ID:");

        btnAddTechnology.setText("Add");
        btnAddTechnology.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTechnologyActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        lblText.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblText.setForeground(new java.awt.Color(0, 255, 0));
        lblText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblErrorText.setFont(new java.awt.Font("Helvetica Neue", 0, 10)); // NOI18N
        lblErrorText.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblErrorText, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(lblText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddTechnology, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(lblAddNewCommunicationHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEquipmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblPowerSource, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblEquipmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(txtPowerSource, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddNewCommunicationHeader)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEquipmentId)
                    .addComponent(txtEquipmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescription))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPowerSource, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPowerSource))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblText, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAddTechnology)
                            .addComponent(btnCancel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblErrorText, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * 
     * @param evt 
     */
    private void btnAddTechnologyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTechnologyActionPerformed
        if(Validation.checkEmptyTxtFields(txtEquipmentId, txtDescription, txtPowerSource)) {
            lblErrorText.setText("Every field with (*) symbol has to be filled!");
            lblEquipmentId.setText("*Equipment-ID:");
            lblPowerSource.setText("*Transfer Technology:");
            lblDescription.setText("*Description:");
        }
        else {    
            try {
                int equipmentId = parseInt(txtEquipmentId.getText());
                String description = txtDescription.getText();
                String powerSource = txtPowerSource.getText();
                String sqlQuestion = "insert into Teknik values (" + equipmentId + ", '" + powerSource + "');";
                idb.insert(sqlQuestion);
                String sqlSecondQuestion = "insert into Utrustning values (" + equipmentId + ", '" + description + "');";
                idb.insert(sqlSecondQuestion);
                lblText.setText("Successful register!");
                lblErrorText.setText("");
            }
            catch(InfException e) {
                lblErrorText.setText("Wrong values inserted!");
            }
        }
    }//GEN-LAST:event_btnAddTechnologyActionPerformed

    /**
     * 
     * @param evt 
     */
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        NewTechnologyPage.this.dispose();
        new EquipmentMenu(idb, agentId).setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTechnology;
    private javax.swing.JButton btnCancel;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblAddNewCommunicationHeader;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblEquipmentId;
    private javax.swing.JLabel lblErrorText;
    private javax.swing.JLabel lblPowerSource;
    private javax.swing.JLabel lblText;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtEquipmentId;
    private javax.swing.JTextField txtPowerSource;
    // End of variables declaration//GEN-END:variables
}