

/*
 * To change this template, choose Tools | Templates * and open the template in the editor. */

/*
 * menuform.java
 *
 * Created on Aug 12, 2015, 8:55:36 AM
 */

/**
 *
 * @author Student
 */
public class aboutus extends javax.swing.JFrame {

    /** Creates new form menuform */
    public aboutus() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.      * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblhead = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Lucky_Color = new javax.swing.JButton();
        About = new javax.swing.JButton();
        Talent_Num = new javax.swing.JButton();
        Destiny_Num = new javax.swing.JButton();
        Personality_Num = new javax.swing.JButton();
        First_Phase = new javax.swing.JButton();
        Second_Phase = new javax.swing.JButton();
        Third_Phase = new javax.swing.JButton();
        Fourth_Phase = new javax.swing.JButton();
        Life_Path = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descarea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setAutoscrolls(true);

        jPanel2.setBackground(new java.awt.Color(204, 0, 0));
        jPanel2.setForeground(new java.awt.Color(153, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lucky-numerology1-logo.jpg"))); // NOI18N

        lblhead.setBackground(new java.awt.Color(255, 51, 0));
        lblhead.setFont(new java.awt.Font("Comic Sans MS", 1, 24));
        lblhead.setForeground(new java.awt.Color(255, 204, 0));
        lblhead.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhead.setText("About Us");
        lblhead.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblhead, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(857, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblhead, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));

        Lucky_Color.setFont(new java.awt.Font("Tahoma", 1, 11));
        Lucky_Color.setText("LUCKY COLOUR");
        Lucky_Color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lucky_ColorActionPerformed(evt);
            }
        });

        About.setFont(new java.awt.Font("Tahoma", 1, 11));
        About.setText("ABOUT US");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });

        Talent_Num.setFont(new java.awt.Font("Tahoma", 1, 11));
        Talent_Num.setText("TALENT NUMBER");
        Talent_Num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Talent_NumActionPerformed(evt);
            }
        });

        Destiny_Num.setFont(new java.awt.Font("Tahoma", 1, 11));
        Destiny_Num.setText("DESTINY NUMBER");
        Destiny_Num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Destiny_NumActionPerformed(evt);
            }
        });

        Personality_Num.setFont(new java.awt.Font("Tahoma", 1, 11));
        Personality_Num.setText("PERSONALITY NUMBER");
        Personality_Num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Personality_NumActionPerformed(evt);
            }
        });

        First_Phase.setFont(new java.awt.Font("Tahoma", 1, 11));
        First_Phase.setText("FIRST PHASE  0 TO 35");
        First_Phase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                First_PhaseActionPerformed(evt);
            }
        });

        Second_Phase.setFont(new java.awt.Font("Tahoma", 1, 11));
        Second_Phase.setText("SECOND PHASE  35 TO 44");
        Second_Phase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Second_PhaseActionPerformed(evt);
            }
        });

        Third_Phase.setFont(new java.awt.Font("Tahoma", 1, 11));
        Third_Phase.setText("THIRD PHASE  44 TO 53");
        Third_Phase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Third_PhaseActionPerformed(evt);
            }
        });

        Fourth_Phase.setFont(new java.awt.Font("Tahoma", 1, 11));
        Fourth_Phase.setText("FOURTH  PHASE  53 PLUS");
        Fourth_Phase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Fourth_PhaseActionPerformed(evt);
            }
        });

        Life_Path.setFont(new java.awt.Font("Tahoma", 1, 11));
        Life_Path.setText("ULTIMATE NUMBER");
        Life_Path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Life_PathActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton2.setText("HEART NUMBER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jButton3.setText("CHECK YOUR FATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(Life_Path, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(About, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(Talent_Num, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(Destiny_Num, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(Personality_Num, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(Lucky_Color, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(First_Phase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(Second_Phase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(Third_Phase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(Fourth_Phase, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(About, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Life_Path, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Talent_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Destiny_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Personality_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lucky_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(First_Phase, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Second_Phase, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Third_Phase, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fourth_Phase, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        descarea.setColumns(20);
        descarea.setFont(new java.awt.Font("Albertus", 1, 18));
        descarea.setForeground(new java.awt.Color(153, 0, 0));
        descarea.setLineWrap(true);
        descarea.setRows(5);
        descarea.setText("So here in this project we have asked for the name and birth date\nof the user and then calculated the fate of that user by doing the\nfollowing calculations\n1. DESTINY NUMBER will be given by sum of all numbers corresponding\nto the alphabets in the name\n2.PERSONALITY NUMBER will be given by all the numbers corresponding\nto all the consonants in the name\n3. HEART NUMBER will be given by all the numbers corresponding\nto all the vowels in the name\n4.ULTIMATE NUMBER will be calculated by sum of destiny number & talent number where talent number is the sum of digits of date of birth. \n5. Talent Number is sum of date, month and year.\n\n\n");
        descarea.setWrapStyleWord(true);
        descarea.setAlignmentX(1.0F);
        descarea.setAlignmentY(1.0F);
        descarea.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane1.setViewportView(descarea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 928, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
this.setVisible(false);
        new aboutus().setVisible(true);

}//GEN-LAST:event_AboutActionPerformed
    
    private void Personality_NumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Personality_NumActionPerformed
       this.setVisible(false);
        new pers_num1().setVisible(true);
}//GEN-LAST:event_Personality_NumActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
 
    }//GEN-LAST:event_formWindowActivated

    private void Life_PathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Life_PathActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_Life_PathActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
this.setVisible(false);
new heart_num_1().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Talent_NumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Talent_NumActionPerformed
        this.setVisible(false);
        new talent_num1().setVisible(true);
    }//GEN-LAST:event_Talent_NumActionPerformed

    private void Destiny_NumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Destiny_NumActionPerformed
       this.setVisible(false);
        new destiny_num_1().setVisible(true);
    }//GEN-LAST:event_Destiny_NumActionPerformed

    private void Lucky_ColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lucky_ColorActionPerformed
       this.setVisible(false);
        new lucky_color().setVisible(true);
    }//GEN-LAST:event_Lucky_ColorActionPerformed

    private void First_PhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_First_PhaseActionPerformed
        this.setVisible(false);
        new path1_1().setVisible(true);
    }//GEN-LAST:event_First_PhaseActionPerformed

    private void Second_PhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Second_PhaseActionPerformed
       this.setVisible(false);
        new path2_1().setVisible(true);
    }//GEN-LAST:event_Second_PhaseActionPerformed

    private void Third_PhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Third_PhaseActionPerformed
        this.setVisible(false);
        new path3_1().setVisible(true);
    }//GEN-LAST:event_Third_PhaseActionPerformed

    private void Fourth_PhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fourth_PhaseActionPerformed
        this.setVisible(false);
        new path4_1().setVisible(true);
    }//GEN-LAST:event_Fourth_PhaseActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new mainpage().setVisible(true); 
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton About;
    private javax.swing.JButton Destiny_Num;
    private javax.swing.JButton First_Phase;
    private javax.swing.JButton Fourth_Phase;
    private javax.swing.JButton Life_Path;
    private javax.swing.JButton Lucky_Color;
    private javax.swing.JButton Personality_Num;
    private javax.swing.JButton Second_Phase;
    private javax.swing.JButton Talent_Num;
    private javax.swing.JButton Third_Phase;
    private javax.swing.JTextArea descarea;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblhead;
    // End of variables declaration//GEN-END:variables

}