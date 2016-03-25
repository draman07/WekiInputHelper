/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekiinputhelper.Modifiers;

import javax.swing.DefaultComboBoxModel;
import wekiinputhelper.WekiInputHelper;
import wekiinputhelper.gui.InputModifierBuilderPanel;

/**
 *
 * @author rebecca
 */
public class SecondOrderDifferenceEditor extends InputModifierBuilderPanel {

    private final WekiInputHelper w;

    /**
     * Creates new form FirstOrderDifferenceEditor
     */
    public SecondOrderDifferenceEditor() {
        initComponents();
        w = null;
                setDimensionality(1);

    }

    public SecondOrderDifferenceEditor(WekiInputHelper w) {
        initComponents();
        this.w = w;
        initForWeki(w);
        updateName();
        setDimensionality(1);

    }

    public SecondOrderDifferenceEditor(SecondOrderDifference in, WekiInputHelper w) {
        initComponents();
        this.w = w;
        setDimensionality(1);
        initForWeki(w);
        initForExisting(in);
    }
    
    private void initForExisting(SecondOrderDifference in) {
        comboFeatureNames.setSelectedIndex(in.getIndex());
        updateName();
    }
    
    private void initForWeki(WekiInputHelper w) {
        String[] inputNames = w.getInputManager().getInputNames();
        comboFeatureNames.setModel(new DefaultComboBoxModel(inputNames));
        
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
        comboFeatureNames = new javax.swing.JComboBox();
        labelName = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel1.setText("using input:");

        comboFeatureNames.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        comboFeatureNames.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboFeatureNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFeatureNamesActionPerformed(evt);
            }
        });

        labelName.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        labelName.setText("Name: feature1_1stDiff");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboFeatureNames, 0, 193, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboFeatureNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelName)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboFeatureNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFeatureNamesActionPerformed
        updateName();
    }//GEN-LAST:event_comboFeatureNamesActionPerformed

    private void updateName() {
        labelName.setText("Name: " + SecondOrderDifference.makeName(w.getInputManager().getInputNames()[comboFeatureNames.getSelectedIndex()], increment));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboFeatureNames;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelName;
    // End of variables declaration//GEN-END:variables

    @Override
    public boolean validateForm() {
        return true;
    }

    @Override
    public ModifiedInput getModifiedInput() {
        int i = comboFeatureNames.getSelectedIndex();
        return new SecondOrderDifference(w.getInputManager().getInputNames()[i], i, increment);
    }

    @Override
    public String[] getNames() {
        int i = comboFeatureNames.getSelectedIndex();
        SecondOrderDifference sod = new SecondOrderDifference(w.getInputManager().getInputNames()[i], i, increment);
        String[] ss = {sod.getName()};
        return ss;
    }
}
