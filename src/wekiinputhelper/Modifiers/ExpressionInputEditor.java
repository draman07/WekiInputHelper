/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wekiinputhelper.Modifiers;

import expr.Expr;
import expr.Parser;
import expr.SyntaxException;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import wekiinputhelper.util.Util;
import wekiinputhelper.WekiInputHelper;
import wekiinputhelper.gui.InputModifierBuilderPanel;

/**
 *
 * @author rebecca
 */
public class ExpressionInputEditor extends InputModifierBuilderPanel {

    private final WekiInputHelper w;
    //private static final HashSet<String> usedNames = new HashSet<String>();

    /**
     * Creates new form FirstOrderDifferenceEditor
     */
    public ExpressionInputEditor() {
        initComponents();
        w = null;
    }

    @Override
    public int getDimensionality() {
        return 1;
    }

    public ExpressionInputEditor(WekiInputHelper w) {
        initComponents();
        this.w = w;
        initForWeki(w);
    }

    public ExpressionInputEditor(WekiInputHelper w, ExpressionInput in) {
        initComponents();
        this.w = w;
        initForWeki(w);
        initForExisting(in);
    }

    private void initForExisting(ExpressionInput in) {
        textExpression.setText(in.getOriginalString());
        textName.setText(in.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        infoFrame = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        frameNames = new javax.swing.JFrame();
        scrollNames = new javax.swing.JScrollPane();
        namesParent = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textExpression = new javax.swing.JTextArea();
        buttonCheck = new javax.swing.JButton();
        buttonCheck1 = new javax.swing.JButton();

        infoFrame.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        infoFrame.setTitle("Example expressions");
        infoFrame.setMaximumSize(new java.awt.Dimension(473, 340));
        infoFrame.setMinimumSize(new java.awt.Dimension(473, 340));
        infoFrame.setPreferredSize(new java.awt.Dimension(473, 340));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(473, 340));
        jPanel1.setMinimumSize(new java.awt.Dimension(473, 340));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("<html>Assuming input1, input2, and input3 are already inputs, the following are examples of valid expressions:</html>");

        jLabel6.setText("Arithmetic: ");

        jLabel7.setText("Trigonometric functions: ");

        jLabel8.setText("Exponentiation:");

        jLabel9.setText("Boolean logic: ");

        jLabel10.setText("Mathematical functions:");

        jLabel11.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
        jLabel11.setText("abs(input1)    exp(input1)    max(input1, input2)  ");

        jLabel12.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
        jLabel12.setText("floor(input1)  sqrt(input1)   log(input1)");

        jLabel13.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
        jLabel13.setText("input1 + input2 * input3 / input1 ");

        jLabel14.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
        jLabel14.setText("input1^2");

        jLabel15.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
        jLabel15.setText("sin(pi/4 * input1)");

        jLabel16.setText("For more documentation about available functions, see");

        jLabel17.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
        jLabel17.setText("(input1 >= 2) and (input1 = input2)");

        jLabel31.setText("Delayed values:");

        jLabel32.setFont(new java.awt.Font("Courier", 0, 13)); // NOI18N
        jLabel32.setText("input1[n-3]");

        jLabel33.setText("is the value of input1 3 samples ago");

        jLabel34.setText("<html><a href=\"www.doc.gold.ac.uk/~mas01rf/WekinatorDownloads/user-doc.html\">www.doc.gold.ac.uk/~mas01rf/WekinatorDownloads/user-doc.html</a></html>");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel13))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel15))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17))
                                    .addComponent(jLabel10)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel33))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout infoFrameLayout = new javax.swing.GroupLayout(infoFrame.getContentPane());
        infoFrame.getContentPane().setLayout(infoFrameLayout);
        infoFrameLayout.setHorizontalGroup(
            infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        infoFrameLayout.setVerticalGroup(
            infoFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        frameNames.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        frameNames.setTitle("Input names");
        frameNames.setSize(new java.awt.Dimension(228, 145));

        namesParent.setBackground(new java.awt.Color(255, 255, 255));
        namesParent.setLayout(new javax.swing.BoxLayout(namesParent, javax.swing.BoxLayout.Y_AXIS));

        jLabel18.setText("jLabel18");
        namesParent.add(jLabel18);

        jLabel19.setText("jLabel19");
        namesParent.add(jLabel19);

        jLabel20.setText("jLabel20");
        namesParent.add(jLabel20);

        jLabel21.setText("jLabel18");
        namesParent.add(jLabel21);

        jLabel22.setText("jLabel18");
        namesParent.add(jLabel22);

        jLabel23.setText("jLabel18");
        namesParent.add(jLabel23);

        jLabel24.setText("jLabel18");
        namesParent.add(jLabel24);

        jLabel25.setText("jLabel18");
        namesParent.add(jLabel25);

        jLabel26.setText("jLabel18");
        namesParent.add(jLabel26);

        jLabel27.setText("jLabel18");
        namesParent.add(jLabel27);

        jLabel28.setText("jLabel18");
        namesParent.add(jLabel28);

        jLabel29.setText("jLabel18");
        namesParent.add(jLabel29);

        jLabel30.setText("jLabel18");
        namesParent.add(jLabel30);

        scrollNames.setViewportView(namesParent);

        javax.swing.GroupLayout frameNamesLayout = new javax.swing.GroupLayout(frameNames.getContentPane());
        frameNames.getContentPane().setLayout(frameNamesLayout);
        frameNamesLayout.setHorizontalGroup(
            frameNamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollNames, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        frameNamesLayout.setVerticalGroup(
            frameNamesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollNames, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel3.setText("Enter an expression using any input names:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jLabel5.setText("e.g., inputs_1 + inputs_2 * inputs_3");

        jButton1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        jButton1.setText("See more examples");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        jLabel1.setText("Unique name for this new value:");

        textName.setText("expression1");
        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });
        textName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textNameKeyTyped(evt);
            }
        });

        textExpression.setColumns(20);
        textExpression.setRows(5);
        jScrollPane1.setViewportView(textExpression);

        buttonCheck.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        buttonCheck.setText("Check expression");
        buttonCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCheckActionPerformed(evt);
            }
        });

        buttonCheck1.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        buttonCheck1.setText("View input names");
        buttonCheck1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCheck1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonCheck))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonCheck1)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(buttonCheck1))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jButton1))
                    .addComponent(buttonCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        infoFrame.setVisible(true);
        infoFrame.toFront();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCheckActionPerformed
        checkExpression(true);
    }//GEN-LAST:event_buttonCheckActionPerformed

    private boolean checkExpression(boolean showConfirm) {
        String e = textExpression.getText();
        try {
            Expr exp = Parser.parse(e);

            boolean check = (ExpressionInput.isValid(exp, w)); //shows error pane
            if (check) {
                if (showConfirm) {
                    Util.showPrettyInfoPane(this, "Expression has no errors", "Success");
                }
                return true;
            } else {
                return false;
            }
        } catch (SyntaxException ex) {
            Util.showPrettyErrorPane(this, "Error in expression: " + ex.explain());
            return false;
        } catch (Error er) {
            Util.showPrettyErrorPane(this, "Error in expression: " + er.getMessage());
            return false;
        }
    }


    private void textNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textNameKeyTyped
        char enter = evt.getKeyChar();
        if (!(Character.isDigit(enter)) && !(Character.isAlphabetic(enter))
                && !(enter == '_')) {
            evt.consume();
        }
    }//GEN-LAST:event_textNameKeyTyped

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameActionPerformed

    private void buttonCheck1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCheck1ActionPerformed
        frameNames.setVisible(true);
        frameNames.toFront();
    }//GEN-LAST:event_buttonCheck1ActionPerformed

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
        try {
            URI u = new URI("http://www.doc.gold.ac.uk/~mas01rf/WekinatorDownloads/user-doc.html");
            open(u);
        } catch (URISyntaxException ex) {
        }
    }//GEN-LAST:event_jLabel34MouseClicked

    private static void open(URI uri) {
    if (Desktop.isDesktopSupported()) {
      try {
        Desktop.getDesktop().browse(uri);
      } catch (IOException e) { /* TODO: error handling */ }
    } else { /* TODO: error handling */ }
  }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCheck;
    private javax.swing.JButton buttonCheck1;
    private javax.swing.JFrame frameNames;
    private javax.swing.JFrame infoFrame;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel namesParent;
    private javax.swing.JScrollPane scrollNames;
    private javax.swing.JTextArea textExpression;
    private javax.swing.JTextField textName;
    // End of variables declaration//GEN-END:variables

    @Override
    public boolean validateForm() {
        if (!Util.checkNotBlank(textName, "Expression name", this)) {
            return false;
        }
        if (!Util.checkNotBlank(textExpression, "Expression equation", this)) {
            return false;
        }
        return checkExpression(false);
    }

    @Override
    public ModifiedInput getModifiedInput() {
        try {
            String name = textName.getText();
            String e = textExpression.getText();
            Expr exp = Parser.parse(e);
            return new ExpressionInput(exp, name, e, w, increment);
        } catch (SyntaxException ex) {
            Logger.getLogger(ExpressionInputEditor.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private void initForWeki(WekiInputHelper w) {
        namesParent.removeAll();
        String[] names = w.getInputManager().getInputNames();
        for (int i = 0; i < names.length; i++) {
            JLabel l = new JLabel(names[i]);
            namesParent.add(l);
        }

        scrollNames.revalidate();
        frameNames.repaint();;
    }

    @Override
    //TODO: Pop up message in GUI to encourage user re-naming of expression
    public String[] getNames() {
        try {
            String name = textName.getText();
            String e = textExpression.getText();
            Expr exp = Parser.parse(e);
            ExpressionInput expr = new ExpressionInput(exp, name, e, w, increment);
            String[] ss = new String[1];
            ss[0] = expr.getName();
            return ss;
        } catch (SyntaxException ex) {
            Logger.getLogger(ExpressionInputEditor.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
