
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ctans
 */
public class Screen_Apply extends javax.swing.JFrame {

    /**
     * Creates new form Screen_Apply
     */
    public Screen_Apply() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox_disciplinary = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox_grade = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comboBox_englishLevel = new javax.swing.JComboBox<>();
        button_apply = new javax.swing.JButton();
        button_close = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Do you have  disciplinary punhisment ? ");

        jComboBox_disciplinary.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("what grade are you in ? ");

        jComboBox_grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jComboBox_grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_gradeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("What is your english level? ");

        comboBox_englishLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "beginner", "intermediate", "advance" }));

        button_apply.setText("APPLY");
        button_apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_applyActionPerformed(evt);
            }
        });

        button_close.setText("CLOSE");
        button_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jComboBox_disciplinary, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox_grade, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(comboBox_englishLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(button_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(button_apply, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox_englishLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_grade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_disciplinary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_apply)
                    .addComponent(button_close))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_gradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_gradeActionPerformed

    private void button_applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_applyActionPerformed
        try (Scanner input = new Scanner(new FileReader("employees.txt"))) {
            while (input.hasNextLine()) {
                String employeeInfo = input.nextLine();
                String[] employee_array = employeeInfo.split(",");

                if (Integer.parseInt(employee_array[0]) == Screen_Login.getLoginID()) {
                    Employee employee = new Employee();
                    employee.setGpa(Double.parseDouble(employee_array[7]));
                    Application application = new Application(Screen_searchJob.jobID, employee);

                    if (application.diciplinary_query(jComboBox_disciplinary.getSelectedItem().toString())) {
                        if (application.gpa_query() == true) {
                            if (application.grade_query(jComboBox_grade.getSelectedItem().toString())) {
                                if (application.english_query(comboBox_englishLevel.getSelectedItem().toString())) {

                                    FileWriter writerApplication = null;
                                    try {

                                        writerApplication = new FileWriter("applications.txt", true);
                                        writerApplication.write(Screen_searchJob.jobID + "," + employee_array[0] + "," + employee_array[1] + "," + employee_array[2] + "," + employee_array[3] + "," + employee_array[4] + "," + employee_array[5] + "," + employee_array[6] + "," + employee_array[7] + "\n");

                                    } catch (IOException ex) {
                                        System.out.println("error file opening");
                                    } finally {

                                        if (writerApplication != null) {
                                            try {
                                                writerApplication.close();
                                            } catch (IOException e) {
                                                System.out.println("error file closing");
                                            }
                                        }
                                    }
                                    JOptionPane.showMessageDialog(this, "Your application is successfully "
                                            + "\ncompany will return you in a few day with Your EMAIL addreess"
                                            + "\nPlease check your EMAIL");
                                    
                                    setVisible(false);
                                    Screen_searchJob screen_searchJob = new Screen_searchJob();
                                    screen_searchJob.setVisible(true);
                                }else{
                                    JOptionPane.showMessageDialog(this, "Your english level is not enough for apply any job");
                                }
                            } else {
                                JOptionPane.showMessageDialog(this, "Your Grade is not enough for apply any job");
                            }
                        } else {
                            JOptionPane.showMessageDialog(this, "Your GPA is not enough for apply any job");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "you have disipline you can not apply any job ");
                    }

                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("file not founded");
        }
    }//GEN-LAST:event_button_applyActionPerformed

    private void button_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_closeActionPerformed
        setVisible(false);
        Screen_searchJob screen_searchJob = new Screen_searchJob();
        screen_searchJob.setVisible(true);
    }//GEN-LAST:event_button_closeActionPerformed

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
            java.util.logging.Logger.getLogger(Screen_Apply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Screen_Apply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Screen_Apply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Screen_Apply.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen_Apply().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_apply;
    private javax.swing.JButton button_close;
    private javax.swing.JComboBox<String> comboBox_englishLevel;
    private javax.swing.JComboBox<String> jComboBox_disciplinary;
    private javax.swing.JComboBox<String> jComboBox_grade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
