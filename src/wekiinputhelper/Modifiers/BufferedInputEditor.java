/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekiinputhelper.Modifiers;

import wekiinputhelper.util.Util;
import javax.swing.DefaultComboBoxModel;
import wekiinputhelper.WekiInputHelper;
import wekiinputhelper.gui.InputModifierBuilderPanel;

/**
 *
 * @author rebecca
 */
public class BufferedInputEditor extends InputModifierBuilderPanel {
    private final WekiInputHelper w;
    
    /**
     * Creates new form FirstOrderDifferenceEditor
     */
    public BufferedInputEditor() {
        initComponents();
        w = null;
        setDimensionality(10);
    }
    
    public BufferedInputEditor(WekiInputHelper w) {
        initComponents();
        this.w = w;
        initForWeki(w);
        setDimensionality(10);
        updateNames();
    }
    
    public BufferedInputEditor(WekiInputHelper w, BufferedInput in) {
        initComponents();
        this.w = w;
        initForWeki(w);
        initForExisting(in);
    }

    private void initForExisting(BufferedInput in) {
        comboFeatureNames.setSelectedIndex(in.getIndex());
        textWinSize.setText(Integer.toString(in.getSize()));
        setDimensionality(in.getSize());
        updateNames();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        comboFeatureNames = new javax.swing.JComboBox();
        labelName = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        textWinSize = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
        labelName.setText("Names: feature1[n]...feature1[n-10]");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel2.setText("buffer size:");

        textWinSize.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        textWinSize.setText("10");
        textWinSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textWinSizeActionPerformed(evt);
            }
        });
        textWinSize.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textWinSizeKeyTyped(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textWinSizeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelName, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addComponent(comboFeatureNames, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, 0)
                        .addComponent(textWinSize, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboFeatureNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textWinSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(labelName)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboFeatureNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFeatureNamesActionPerformed
       // labelName.setText("Name: " + FirstOrderDifference.makeName(w.getInputManager().getInputNames()[comboFeatureNames.getSelectedIndex()]));
        updateNames();
    }//GEN-LAST:event_comboFeatureNamesActionPerformed

    private void textWinSizeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textWinSizeKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter))) {
            evt.consume();
        } else {
            updateNames();
        }
    }//GEN-LAST:event_textWinSizeKeyTyped

    private void textWinSizeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textWinSizeKeyReleased
        updateDimensionality();
        updateNames();
    }//GEN-LAST:event_textWinSizeKeyReleased

    private void textWinSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textWinSizeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textWinSizeActionPerformed

    private void updateDimensionality() {
        try { 
            int i = Integer.parseInt(textWinSize.getText());
            setDimensionality(i);
        } catch (NumberFormatException ex) {
            setDimensionality(0);
        }
    }
    
    private void updateNames() {
        try {
            String baseName = w.getInputManager().getInputNames()[comboFeatureNames.getSelectedIndex()];
        
            int i = getDimensionality();
            if (i > 0) {
                StringBuilder sb = new StringBuilder("Names: ");
                sb.append(baseName).append("[n]");
                if (i > 1) {
                    sb.append(", ").append(baseName).append("[n-1]");
                } 
                if (i > 2) {
                    if (i ==3) {
                        sb.append(", ").append(baseName).append("[n-2]");
                    } else {
                        sb.append("...").append(baseName).append("[n-").append(i-1).append("]");
                    }
                }
                labelName.setText(sb.toString());
            } else {
                labelName.setText("Names: ");
            }
        
        } catch (NumberFormatException ex) {
            labelName.setText("Names: ");    
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox comboFeatureNames;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelName;
    private javax.swing.JTextField textWinSize;
    // End of variables declaration//GEN-END:variables

    @Override
    public boolean validateForm() {
        try {
            int i = Integer.parseInt(textWinSize.getText());
            if (i > 1) {
                return true;
            } else {
              Util.showPrettyErrorPane(this, "Buffer size must be greater than 1");
                return false;  
            }
        } catch (NumberFormatException ex) {
            Util.showPrettyErrorPane(this, "Buffer size must be greater than 1");
            return false;
        }
    }

    @Override
    public ModifiedInput getModifiedInput() {
        int i = comboFeatureNames.getSelectedIndex();
        int s = Integer.parseInt(textWinSize.getText());
        return new BufferedInput(w.getInputManager().getInputNames()[i],i, s, increment);
    }

    @Override
    public String[] getNames() {
        int i = comboFeatureNames.getSelectedIndex();
        int s = Integer.parseInt(textWinSize.getText());
        BufferedInput bi = new BufferedInput(w.getInputManager().getInputNames()[i],i, s, increment);
        return bi.getNames();
    }
}
