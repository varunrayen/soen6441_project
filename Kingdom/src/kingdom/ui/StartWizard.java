/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kingdom.ui;

import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import kingdom.config.StartWizardConfig;
import kingdom.gameitems.Const.UserColor;
import kingdom.gameitems.Game;

/**
 *
 * @author andriy
 */
public class StartWizard extends javax.swing.JDialog {
    
    private final StartWizardConfig wizConfig = new StartWizardConfig();
    private final Game theGame = Game.getInstance();
    private DefaultComboBoxModel comboModel0 = new DefaultComboBoxModel(UserColor.values());
    private DefaultComboBoxModel comboModel1 = new DefaultComboBoxModel(UserColor.values());
    private DefaultComboBoxModel comboModel2 = new DefaultComboBoxModel(UserColor.values());
    private DefaultComboBoxModel comboModel3 = new DefaultComboBoxModel(UserColor.values());

    /**
     * Creates new form StartWizard
     */
    public StartWizard(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        updatePage1(wizConfig);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnFinish = new javax.swing.JToggleButton();
        jPanel3 = new javax.swing.JPanel();
        lblTopInfo = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        cardPanel = new javax.swing.JPanel();
        wizPage1 = new javax.swing.JPanel();
        cmbUsers = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        chkLoadGame = new javax.swing.JCheckBox();
        chkUserNum = new javax.swing.JCheckBox();
        wizPage2 = new javax.swing.JPanel();
        lblUser1 = new javax.swing.JLabel();
        lblUser2 = new javax.swing.JLabel();
        lblUser3 = new javax.swing.JLabel();
        lblUser4 = new javax.swing.JLabel();
        edtUser1 = new javax.swing.JTextField();
        edtUser2 = new javax.swing.JTextField();
        edtUser3 = new javax.swing.JTextField();
        edtUser4 = new javax.swing.JTextField();
        cmbColorU1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cmbColorU2 = new javax.swing.JComboBox();
        cmbColorU3 = new javax.swing.JComboBox();
        cmbColorU4 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Start configuration");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setModal(true);
        setPreferredSize(new java.awt.Dimension(700, 500));
        setResizable(false);

        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancel);

        btnBack.setText("Back");
        btnBack.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack);

        btnNext.setText("Next");
        btnNext.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel2.add(btnNext);

        btnFinish.setText("Finish");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });
        jPanel2.add(btnFinish);

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        jPanel3.setPreferredSize(new java.awt.Dimension(865, 50));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTopInfo.setText("Select optoin to start game");
        jPanel3.add(lblTopInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        lblError.setForeground(new java.awt.Color(245, 6, 6));
        jPanel3.add(lblError, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        getContentPane().add(jPanel3, java.awt.BorderLayout.NORTH);

        cardPanel.setBackground(new java.awt.Color(226, 192, 222));
        cardPanel.setLayout(new java.awt.CardLayout());

        wizPage1.setBackground(new java.awt.Color(161, 185, 223));
        wizPage1.setPreferredSize(new java.awt.Dimension(437, 437));
        wizPage1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                wizPage1ComponentShown(evt);
            }
        });

        cmbUsers.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2", "3", "4" }));
        cmbUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUsersActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(161, 185, 223));
        jLabel6.setText("players");

        chkLoadGame.setBackground(new java.awt.Color(161, 185, 223));
        chkLoadGame.setText("Load last saved Game");
        chkLoadGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLoadGameActionPerformed(evt);
            }
        });

        chkUserNum.setBackground(new java.awt.Color(161, 185, 223));
        chkUserNum.setSelected(true);
        chkUserNum.setText("Start new game with ");
        chkUserNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkUserNumActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout wizPage1Layout = new javax.swing.GroupLayout(wizPage1);
        wizPage1.setLayout(wizPage1Layout);
        wizPage1Layout.setHorizontalGroup(
            wizPage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wizPage1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addGroup(wizPage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkLoadGame)
                    .addGroup(wizPage1Layout.createSequentialGroup()
                        .addComponent(chkUserNum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        wizPage1Layout.setVerticalGroup(
            wizPage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wizPage1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(chkLoadGame)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 183, Short.MAX_VALUE)
                .addGroup(wizPage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(chkUserNum))
                .addGap(148, 148, 148))
        );

        cardPanel.add(wizPage1, "card2");

        wizPage2.setBackground(new java.awt.Color(210, 240, 169));
        wizPage2.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                wizPage2ComponentShown(evt);
            }
        });

        lblUser1.setText("User1 Name:");

        lblUser2.setText("User2 Name:");

        lblUser3.setText("User3 Name:");

        lblUser4.setText("User4 Name:");

        cmbColorU1.setModel(comboModel0);

        jLabel1.setText("Color: ");

        jLabel2.setText("Color: ");

        jLabel3.setText("Color: ");

        jLabel4.setText("Color: ");

        cmbColorU2.setModel(comboModel1);

        cmbColorU3.setModel(comboModel2);

        cmbColorU4.setModel(comboModel3);

        javax.swing.GroupLayout wizPage2Layout = new javax.swing.GroupLayout(wizPage2);
        wizPage2.setLayout(wizPage2Layout);
        wizPage2Layout.setHorizontalGroup(
            wizPage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wizPage2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(wizPage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUser1)
                    .addComponent(lblUser2)
                    .addComponent(lblUser3)
                    .addComponent(lblUser4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(wizPage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtUser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)
                    .addComponent(edtUser2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtUser3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(edtUser4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(wizPage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(wizPage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbColorU1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbColorU2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbColorU3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbColorU4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        wizPage2Layout.setVerticalGroup(
            wizPage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wizPage2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(wizPage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser1)
                    .addComponent(edtUser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbColorU1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 63, Short.MAX_VALUE)
                .addGroup(wizPage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser2)
                    .addComponent(edtUser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cmbColorU2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 63, Short.MAX_VALUE)
                .addGroup(wizPage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser3)
                    .addComponent(edtUser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cmbColorU3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 64, Short.MAX_VALUE)
                .addGroup(wizPage2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser4)
                    .addComponent(edtUser4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(cmbColorU4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );

        cardPanel.add(wizPage2, "card3");

        getContentPane().add(cardPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        showSecondPage();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed

        if (wizConfig.isLoadSelected()) {
            Game game = Game.getInstance();
            boolean result = game.loadAllConfigs(null);
            if (result) {
                this.dispose();
            } else {
                showFirstPage();
                lblError.setText("Cannot load configuration. Be sure it exists.");
            }
        } else {
            if (isValidUserInput()) {
                theGame.setStartInformation(wizConfig);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "All User information must be completed", null, JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnFinishActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        showFirstPage();
    }//GEN-LAST:event_btnBackActionPerformed

    private void wizPage1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_wizPage1ComponentShown
        // TODO add your handling code here:
        updatePage1(wizConfig);
    }//GEN-LAST:event_wizPage1ComponentShown

    private void wizPage2ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_wizPage2ComponentShown
        // TODO add your handling code here:
        updatePage2(wizConfig);
    }//GEN-LAST:event_wizPage2ComponentShown

    private void chkLoadGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLoadGameActionPerformed
        // TODO add your handling code here:
         wizConfig.setLoadSelected(chkLoadGame.isSelected());
         updatePage1(wizConfig);
    }//GEN-LAST:event_chkLoadGameActionPerformed

    private void chkUserNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkUserNumActionPerformed
        // TODO add your handling code here:
        wizConfig.setLoadSelected(false);
        updatePage1(wizConfig);
    }//GEN-LAST:event_chkUserNumActionPerformed

    private void cmbUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUsersActionPerformed
        // TODO add your handling code here:
        wizConfig.setSelectedNumberOfUser(cmbUsers.getSelectedIndex() + 2); // combobox selection starts with 2
        updatePage1(wizConfig);
    }//GEN-LAST:event_cmbUsersActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

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
            java.util.logging.Logger.getLogger(StartWizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartWizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartWizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartWizard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                StartWizard dialog = new StartWizard(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JToggleButton btnFinish;
    private javax.swing.JButton btnNext;
    private javax.swing.JPanel cardPanel;
    private javax.swing.JCheckBox chkLoadGame;
    private javax.swing.JCheckBox chkUserNum;
    private javax.swing.JComboBox cmbColorU1;
    private javax.swing.JComboBox cmbColorU2;
    private javax.swing.JComboBox cmbColorU3;
    private javax.swing.JComboBox cmbColorU4;
    private javax.swing.JComboBox cmbUsers;
    private javax.swing.JTextField edtUser1;
    private javax.swing.JTextField edtUser2;
    private javax.swing.JTextField edtUser3;
    private javax.swing.JTextField edtUser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblTopInfo;
    private javax.swing.JLabel lblUser1;
    private javax.swing.JLabel lblUser2;
    private javax.swing.JLabel lblUser3;
    private javax.swing.JLabel lblUser4;
    private javax.swing.JPanel wizPage1;
    private javax.swing.JPanel wizPage2;
    // End of variables declaration//GEN-END:variables

    /* called everytime when page 1 of wizard is shown */
    private void updatePage1(StartWizardConfig wizConfig) {
        
        chkUserNum.setSelected(!wizConfig.isLoadSelected());
        chkLoadGame.setSelected(wizConfig.isLoadSelected());
        cmbUsers.setEnabled(!wizConfig.isLoadSelected());

        int comboIndex = wizConfig.getSelectedNumberOfUser() - 2; // first option is 2 user

        if (cmbUsers.getSelectedIndex() != comboIndex) {
            cmbUsers.setSelectedIndex(comboIndex);
        }
        
        btnNext.setEnabled(!wizConfig.isLoadSelected());
        btnFinish.setEnabled(wizConfig.isLoadSelected());
    }

    /* called everytime when page 2 of wizard is shown */
    private void updatePage2(StartWizardConfig wizConfig) {
        lblError.setText(""); // reset error message on page enter
        lblTopInfo.setText("Provide name for all users");

        int numberOfUser = wizConfig.getSelectedNumberOfUser();
        lblUser3.setVisible(numberOfUser > 2);
        edtUser3.setVisible(numberOfUser > 2);
        jLabel3.setVisible(numberOfUser > 2);
        cmbColorU3.setVisible(numberOfUser > 2);
        
        lblUser4.setVisible(numberOfUser > 3);
        edtUser4.setVisible(numberOfUser > 3);
        jLabel4.setVisible(numberOfUser > 3);
        cmbColorU4.setVisible(numberOfUser > 3);
        
        btnFinish.setEnabled(true);
        btnNext.setEnabled(false);
    }

    private void showSecondPage() {
        CardLayout cardsLayout = (CardLayout)cardPanel.getLayout();
        cardsLayout.show(cardPanel, "card3");
    }

    private void showFirstPage() {
        CardLayout cardsLayout = (CardLayout)cardPanel.getLayout();
        cardsLayout.show(cardPanel, "card2");
    }

    private boolean isValidUserInput() {
        
        String userName0 = edtUser1.getText().trim();
        String userName1 = edtUser2.getText().trim();
        String userName2 = edtUser3.getText().trim();
        String userName3 = edtUser4.getText().trim();
        
        if(userName0.isEmpty() || userName1.isEmpty()){
            return false;
        }
        
        if(wizConfig.getSelectedNumberOfUser() > 2 && userName2.isEmpty()){
            return false;
        }
        
        if(wizConfig.getSelectedNumberOfUser() > 3 && userName3.isEmpty()){
            return false;
        }
        
        // all colors must be different for all users
        UserColor col0 = (UserColor)comboModel0.getSelectedItem();
        UserColor col1 = (UserColor)comboModel1.getSelectedItem();
        UserColor col2 = (UserColor)comboModel2.getSelectedItem();
        UserColor col3 = (UserColor)comboModel3.getSelectedItem();
        if(!isDifferentChoice(wizConfig.getSelectedNumberOfUser(), col0, col1, col2, col3)){
            return false;
        }
        
        // update wizardConfig usernames
        wizConfig.setUsename0(userName0);
        wizConfig.setUsename1(userName1);
        wizConfig.setUsename2(userName2);
        wizConfig.setUsename3(userName3);
        // update wizard user colors
        wizConfig.setUserColor0(col0);
        wizConfig.setUserColor1(col1);
        wizConfig.setUserColor2(col2);
        wizConfig.setUserColor3(col3);
        return true;
    }

    /* detect if some user has similar color selected */
    private boolean isDifferentChoice(int userNumbers, UserColor col0, UserColor col1, UserColor col2, UserColor col3) {

        List<UserColor> testList = new ArrayList<UserColor>();

        testList.add(col0);

        if (testList.contains(col1)) {
            return false;
        } else {
            testList.add(col1);
        }

        if ((userNumbers > 2) && (testList.contains(col2))) {
            return false;
        } else {
            testList.add(col2);
        }

        if ((userNumbers > 3) && (testList.contains(col3))) {
            return false;
        }

        return true;
    }
    
}
