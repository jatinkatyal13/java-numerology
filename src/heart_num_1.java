
import javax.swing.ImageIcon;

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
public class heart_num_1 extends javax.swing.JFrame {

    /** Creates new form menuform */
    public heart_num_1() {
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
        Life_Path = new javax.swing.JButton();
        Talent_Num = new javax.swing.JButton();
        Destiny_Num = new javax.swing.JButton();
        Personality_Num = new javax.swing.JButton();
        First_Phase = new javax.swing.JButton();
        Second_Phase = new javax.swing.JButton();
        Third_Phase = new javax.swing.JButton();
        Fourth_Phase = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        lblname = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descarea = new javax.swing.JTextArea();
        lblhead1 = new javax.swing.JLabel();

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
        lblhead.setText("Heart Number");
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
                .addContainerGap(871, Short.MAX_VALUE))
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

        Life_Path.setFont(new java.awt.Font("Tahoma", 1, 11));
        Life_Path.setText("ULTIMATE NUMBER");
        Life_Path.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Life_PathActionPerformed(evt);
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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(About, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(Life_Path, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(Talent_Num, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(Destiny_Num, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(Personality_Num, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(Lucky_Color, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(First_Phase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(Second_Phase, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(Third_Phase, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(Fourth_Phase, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(About, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Life_Path, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Talent_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Destiny_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Personality_Num, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lucky_Color, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(First_Phase, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Second_Phase, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Third_Phase, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Fourth_Phase, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        lblname.setFont(new java.awt.Font("Albertus", 1, 48));
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 51), 3, true));
        lblname.setOpaque(true);

        descarea.setColumns(20);
        descarea.setFont(new java.awt.Font("Albertus", 1, 18));
        descarea.setForeground(new java.awt.Color(153, 0, 0));
        descarea.setLineWrap(true);
        descarea.setRows(5);
        descarea.setWrapStyleWord(true);
        descarea.setAlignmentX(1.0F);
        descarea.setAlignmentY(1.0F);
        descarea.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jScrollPane1.setViewportView(descarea);

        lblhead1.setBackground(new java.awt.Color(255, 51, 0));
        lblhead1.setFont(new java.awt.Font("Comic Sans MS", 1, 24));
        lblhead1.setForeground(new java.awt.Color(255, 204, 0));
        lblhead1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhead1.setText("Heart Number");
        lblhead1.setOpaque(true);

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
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblhead1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblhead1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73))))))
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
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
         this.setVisible(false);
        new aboutus().setVisible(true);
}//GEN-LAST:event_AboutActionPerformed
    
    private void Personality_NumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Personality_NumActionPerformed
      this.setVisible(true);
        new pers_num1().setVisible(true); 
}//GEN-LAST:event_Personality_NumActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
 int num=person.heart_num;
 lblhead.setText(" Your Heart Number "+ num);
        String heart1="The person feels independent at heart and is honest, "+
                "determined and ambitious. He/She has executive ability and"+
                "initiative and likes to become the leader in the organisation. "+
                "He/She does not like a subordinate position either at home or outside.";
    String heart2="The person is cooperative, sincere, diplomatic, friendly, loving and likes"+
            "to be in company rather than alone. He /She prefers to be married then remaining single.:+" +
            " His inner desire is to have a harmony in everything. He/She can develop on lines of spirituality..";
    String heart3="The person is full of inspiration and imagination and is outgoing. He/She is talkative"+
            "and likes to expree himself through artistic talents such as singing, acting, writing etc."+
            "He/She can inspire others and is capable to develop of deep love.";
    String heart4= "The person desires to be result-oriented and practical in everything. He/She is responsible,"+
            "reliable and honest. He/She looks for stability and security in life. Through constructive "+
            "accomplishment he/she can help humenity in many ways. He/She should include fun and love to reduce tension.";
    String heart5="The person desires to be result-oriented and practical in everything. He/She is responsible,"+
            "reliable and honest. He/She looks for stability and security in life. Through constructive accomplishment"+
            "he/she can help humenity in many ways. He/She should include fun and love to reduce tension..";
    String heart6="	The person is harmonious, sympathetic and responsible. Deep down in his/her heart he/she"+
            "craves for beauty, companionship and love, without which he cannot progress. Marriage , home and"+
            "humanitarian service mean much to him/her. He/She can become too emotional and sacrificing.";
    String heart7="The person is very selective at heart with strong likes and dislikes.likes to be alone to think,"+
            "study or meditate. A perfectionist in everything. He/She is capable of big scientific, religious od underworld "+
            "achievements depending on other numbers.";
    String heart8="The person is materialistic at heart and loves power, position and wealth. With executive ability,"+
            "and businesslike approach he/she is capable of big accomplishments. He/She can be a good organiser, "+
            "psychologist or philosopher. He/She can be too exacting, dominating and stubborn.";
    String heart9="The person is impersonal by nature and desires to help everyone or anyone even at"+
            "personal cost. He/She is forgiving, compassionate, generous, intuitive and is capable of"+
            "achieving religious wisdom of a high order. At times he can be impressionable and moody..";
    switch(num)
    {
        case 1: lblname.setIcon(new ImageIcon("src/1.jpg"));
                descarea.setText(heart1);
                break;
        case 2: lblname.setIcon(new ImageIcon("src/2.jpg"));
                descarea.setText(heart2);
                break;
        case 3: lblname.setIcon(new ImageIcon("src/3.jpg"));
                descarea.setText(heart3);
                break;
        case 4: lblname.setIcon(new ImageIcon("src/4.jpg"));
                descarea.setText(heart4);
                break;
        case 5: lblname.setIcon(new ImageIcon("src/5.jpg"));
                descarea.setText(heart5);
                break;
        case 6: lblname.setIcon(new ImageIcon("src/6.jpg"));
                descarea.setText(heart6);
                break;
        case 7: lblname.setIcon(new ImageIcon("src/7.jpg"));
                descarea.setText(heart7);
                break;
        case 8: lblname.setIcon(new ImageIcon("src/8.jpg"));
                descarea.setText(heart8);
                break;
        case 9: lblname.setIcon(new ImageIcon("src/9.jpg"));
                descarea.setText(heart9);
                break;
       }

    }//GEN-LAST:event_formWindowActivated

    private void Life_PathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Life_PathActionPerformed
         this.setVisible(false);
        new ultimate_num1().setVisible(true);

    }//GEN-LAST:event_Life_PathActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.setVisible(false);
        new heart_num_1().setVisible(true);
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
        new path2_1().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_Second_PhaseActionPerformed

    private void Third_PhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Third_PhaseActionPerformed
this.setVisible(false);
        new path3_1().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_Third_PhaseActionPerformed

    private void Fourth_PhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Fourth_PhaseActionPerformed
this.setVisible(false);
        new path4_1().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_Fourth_PhaseActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
this.setVisible(false);
        new mainpage().setVisible(true);        // TODO add your handling code here:
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
    private javax.swing.JLabel lblhead1;
    private javax.swing.JLabel lblname;
    // End of variables declaration//GEN-END:variables

}