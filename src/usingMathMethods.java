/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author antho6229
 */
public class usingMathMethods extends javax.swing.JFrame {

    /**
     * Creates new form usingMathMethods
     */
    public usingMathMethods() {
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

        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        maxPromptLabel = new javax.swing.JLabel();
        maxNum1 = new javax.swing.JTextField();
        maxNum2 = new javax.swing.JTextField();
        maxButton = new javax.swing.JButton();
        maxOutputLabel = new javax.swing.JLabel();
        minPromptLabel = new javax.swing.JLabel();
        minNum1 = new javax.swing.JTextField();
        minNum2 = new javax.swing.JTextField();
        minButton = new javax.swing.JButton();
        minOutputLabel = new javax.swing.JLabel();
        powPromptLabel = new javax.swing.JLabel();
        powNum1 = new javax.swing.JTextField();
        powNum2 = new javax.swing.JTextField();
        powButton = new javax.swing.JButton();
        powOutputLabel = new javax.swing.JLabel();
        hypoPromptLabel = new javax.swing.JLabel();
        hypoNum1 = new javax.swing.JTextField();
        hypoNum2 = new javax.swing.JTextField();
        hypoButton = new javax.swing.JButton();
        hypoOutputLabel = new javax.swing.JLabel();
        floorPromptLabel = new javax.swing.JLabel();
        floorNum1 = new javax.swing.JTextField();
        floorButton = new javax.swing.JButton();
        floorOutputLabel = new javax.swing.JLabel();
        ceilPromptLabel = new javax.swing.JLabel();
        ceilNum1 = new javax.swing.JTextField();
        ceilButton = new javax.swing.JButton();
        ceilOutputLabel = new javax.swing.JLabel();
        ceilPromptLabel1 = new javax.swing.JLabel();
        sqrtNum1 = new javax.swing.JTextField();
        sqrtButton = new javax.swing.JButton();
        sqrtOutputLabel = new javax.swing.JLabel();
        radiansPromptLabel = new javax.swing.JLabel();
        radiansNum1 = new javax.swing.JTextField();
        radiansButton = new javax.swing.JButton();
        radiansOutputLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setBackground(new java.awt.Color(51, 0, 51));

        titleLabel.setFont(new java.awt.Font("Tekton Pro", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 255, 0));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Using Math Methods");

        maxPromptLabel.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        maxPromptLabel.setForeground(new java.awt.Color(0, 255, 0));
        maxPromptLabel.setText("Enter two numbers and click the button, The program will display the larger number:");

        maxNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxNum1ActionPerformed(evt);
            }
        });

        maxNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxNum2ActionPerformed(evt);
            }
        });

        maxButton.setText("Largest");
        maxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maxButtonActionPerformed(evt);
            }
        });

        maxOutputLabel.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        maxOutputLabel.setForeground(new java.awt.Color(0, 255, 0));
        maxOutputLabel.setText("...");

        minPromptLabel.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        minPromptLabel.setForeground(new java.awt.Color(0, 255, 0));
        minPromptLabel.setText("Enter two numbers and click the button, The program will display the smaller number:");

        minNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minNum1ActionPerformed(evt);
            }
        });

        minNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minNum2ActionPerformed(evt);
            }
        });

        minButton.setText("Smallest");
        minButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minButtonActionPerformed(evt);
            }
        });

        minOutputLabel.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        minOutputLabel.setForeground(new java.awt.Color(0, 255, 0));
        minOutputLabel.setText("...");

        powPromptLabel.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        powPromptLabel.setForeground(new java.awt.Color(0, 255, 0));
        powPromptLabel.setText("Enter two numbers and click the button, The program will display the first number to the power of the second:");

        powNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powNum1ActionPerformed(evt);
            }
        });

        powNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powNum2ActionPerformed(evt);
            }
        });

        powButton.setText("To the power of");
        powButton.setPreferredSize(new java.awt.Dimension(110, 23));
        powButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powButtonActionPerformed(evt);
            }
        });

        powOutputLabel.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        powOutputLabel.setForeground(new java.awt.Color(0, 255, 0));
        powOutputLabel.setText("...");

        hypoPromptLabel.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        hypoPromptLabel.setForeground(new java.awt.Color(0, 255, 0));
        hypoPromptLabel.setText("Enter the length of two sides of a right angled triangle. Thr program will display the hypotenuse:");

        hypoNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hypoNum1ActionPerformed(evt);
            }
        });

        hypoNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hypoNum2ActionPerformed(evt);
            }
        });

        hypoButton.setText("Hypotenuse");
        hypoButton.setPreferredSize(new java.awt.Dimension(110, 23));
        hypoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hypoButtonActionPerformed(evt);
            }
        });

        hypoOutputLabel.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        hypoOutputLabel.setForeground(new java.awt.Color(0, 255, 0));
        hypoOutputLabel.setText("...");

        floorPromptLabel.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        floorPromptLabel.setForeground(new java.awt.Color(0, 255, 0));
        floorPromptLabel.setText("Enter a decimal value. The program will diplay he numbe rounded down to the nearst integer:");

        floorNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorNum1ActionPerformed(evt);
            }
        });

        floorButton.setText("Rounded down");
        floorButton.setPreferredSize(new java.awt.Dimension(110, 23));
        floorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                floorButtonActionPerformed(evt);
            }
        });

        floorOutputLabel.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        floorOutputLabel.setForeground(new java.awt.Color(0, 255, 0));
        floorOutputLabel.setText("...");

        ceilPromptLabel.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        ceilPromptLabel.setForeground(new java.awt.Color(0, 255, 0));
        ceilPromptLabel.setText("Enter a decimal value. The program will diplay he numbe rounded up to the nearst integer:");

        ceilNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceilNum1ActionPerformed(evt);
            }
        });

        ceilButton.setText("Rounded up");
        ceilButton.setPreferredSize(new java.awt.Dimension(110, 23));
        ceilButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ceilButtonActionPerformed(evt);
            }
        });

        ceilOutputLabel.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        ceilOutputLabel.setForeground(new java.awt.Color(0, 255, 0));
        ceilOutputLabel.setText("...");

        ceilPromptLabel1.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        ceilPromptLabel1.setForeground(new java.awt.Color(0, 255, 0));
        ceilPromptLabel1.setText("Enter an integer. The program will display the square root of the number:");

        sqrtNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtNum1ActionPerformed(evt);
            }
        });

        sqrtButton.setText("Square root");
        sqrtButton.setPreferredSize(new java.awt.Dimension(110, 23));
        sqrtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sqrtButtonActionPerformed(evt);
            }
        });

        sqrtOutputLabel.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        sqrtOutputLabel.setForeground(new java.awt.Color(0, 255, 0));
        sqrtOutputLabel.setText("...");

        radiansPromptLabel.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        radiansPromptLabel.setForeground(new java.awt.Color(0, 255, 0));
        radiansPromptLabel.setText("Enter an angle in degrees. The program will display the angle in radians:");

        radiansNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiansNum1ActionPerformed(evt);
            }
        });

        radiansButton.setText("In radians");
        radiansButton.setPreferredSize(new java.awt.Dimension(110, 23));
        radiansButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiansButtonActionPerformed(evt);
            }
        });

        radiansOutputLabel.setFont(new java.awt.Font("Tekton Pro", 0, 12)); // NOI18N
        radiansOutputLabel.setForeground(new java.awt.Color(0, 255, 0));
        radiansOutputLabel.setText("...");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(maxNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(maxNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(maxButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maxOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(minNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(minNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(minButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(powNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(powNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(powButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(powOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(226, 226, 226))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(maxPromptLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minPromptLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(powPromptLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(floorNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hypoPromptLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(floorPromptLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ceilPromptLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ceilPromptLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radiansPromptLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(hypoNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(hypoNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(hypoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(hypoOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addGap(144, 144, 144)
                                        .addComponent(floorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(floorOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(ceilNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94)
                                        .addComponent(ceilButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ceilOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(sqrtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94)
                                        .addComponent(sqrtButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sqrtOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(mainPanelLayout.createSequentialGroup()
                                        .addComponent(radiansNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94)
                                        .addComponent(radiansButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(radiansOutputLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(216, 216, 216)))
                        .addContainerGap())))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(maxPromptLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maxNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxButton)
                    .addComponent(maxOutputLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minPromptLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minButton)
                    .addComponent(minOutputLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(powPromptLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(powNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(powNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(powButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(powOutputLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hypoPromptLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hypoNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hypoNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hypoButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hypoOutputLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(floorPromptLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(floorNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(floorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(floorOutputLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ceilPromptLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ceilNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceilButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ceilOutputLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ceilPromptLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sqrtNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sqrtButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sqrtOutputLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(radiansPromptLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiansNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radiansButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radiansOutputLabel))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void maxNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxNum1ActionPerformed

    private void maxNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maxNum2ActionPerformed

    private void maxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maxButtonActionPerformed
        double a = Double.parseDouble(maxNum1.getText());
        double b = Double.parseDouble(maxNum2.getText());
        
        double q = Math.max(a, b);
        
        maxOutputLabel.setText("" + q);
    }//GEN-LAST:event_maxButtonActionPerformed

    private void minNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minNum1ActionPerformed

    private void minNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minNum2ActionPerformed

    private void minButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minButtonActionPerformed
        double a = Double.parseDouble(minNum1.getText());
        double b = Double.parseDouble(minNum2.getText());
        
        double q = Math.min(a, b);
        
        minOutputLabel.setText("" + q);
    }//GEN-LAST:event_minButtonActionPerformed

    private void powButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powButtonActionPerformed
        double a = Double.parseDouble(powNum1.getText());
        double b = Double.parseDouble(powNum2.getText());
        
        double q = Math.pow(a, b);
        
        powOutputLabel.setText("" + q);
    }//GEN-LAST:event_powButtonActionPerformed

    private void powNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_powNum2ActionPerformed

    private void powNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_powNum1ActionPerformed

    private void hypoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hypoButtonActionPerformed
        double a = Double.parseDouble(hypoNum1.getText());
        double b = Double.parseDouble(hypoNum2.getText());
        
        double q = Math.hypot(a, b);
        
        hypoOutputLabel.setText("" + q);
    }//GEN-LAST:event_hypoButtonActionPerformed

    private void hypoNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hypoNum2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hypoNum2ActionPerformed

    private void hypoNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hypoNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hypoNum1ActionPerformed

    private void floorNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_floorNum1ActionPerformed

    private void floorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_floorButtonActionPerformed
        double a = Double.parseDouble(floorNum1.getText());
        
        double q = Math.floor(a);
        
        floorOutputLabel.setText("" + q);
    }//GEN-LAST:event_floorButtonActionPerformed

    private void ceilNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceilNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ceilNum1ActionPerformed

    private void ceilButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ceilButtonActionPerformed
        double a = Double.parseDouble(ceilNum1.getText());
        
        double q = Math.ceil(a);
        
        ceilOutputLabel.setText("" + q);
    }//GEN-LAST:event_ceilButtonActionPerformed

    private void sqrtNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sqrtNum1ActionPerformed

    private void sqrtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sqrtButtonActionPerformed
        double a = Integer.parseInt(sqrtNum1.getText());
        
        double q = Math.sqrt(a);
        
        sqrtOutputLabel.setText("" + q);
    }//GEN-LAST:event_sqrtButtonActionPerformed

    private void radiansNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiansNum1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiansNum1ActionPerformed

    private void radiansButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiansButtonActionPerformed
        double a = Double.parseDouble(radiansNum1.getText());
        
        double q = Math.toRadians(a);
        
        radiansOutputLabel.setText("" + q);
    }//GEN-LAST:event_radiansButtonActionPerformed

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
            java.util.logging.Logger.getLogger(usingMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(usingMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(usingMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(usingMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new usingMathMethods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ceilButton;
    private javax.swing.JTextField ceilNum1;
    private javax.swing.JLabel ceilOutputLabel;
    private javax.swing.JLabel ceilPromptLabel;
    private javax.swing.JLabel ceilPromptLabel1;
    private javax.swing.JButton floorButton;
    private javax.swing.JTextField floorNum1;
    private javax.swing.JLabel floorOutputLabel;
    private javax.swing.JLabel floorPromptLabel;
    private javax.swing.JButton hypoButton;
    private javax.swing.JTextField hypoNum1;
    private javax.swing.JTextField hypoNum2;
    private javax.swing.JLabel hypoOutputLabel;
    private javax.swing.JLabel hypoPromptLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton maxButton;
    private javax.swing.JTextField maxNum1;
    private javax.swing.JTextField maxNum2;
    private javax.swing.JLabel maxOutputLabel;
    private javax.swing.JLabel maxPromptLabel;
    private javax.swing.JButton minButton;
    private javax.swing.JTextField minNum1;
    private javax.swing.JTextField minNum2;
    private javax.swing.JLabel minOutputLabel;
    private javax.swing.JLabel minPromptLabel;
    private javax.swing.JButton powButton;
    private javax.swing.JTextField powNum1;
    private javax.swing.JTextField powNum2;
    private javax.swing.JLabel powOutputLabel;
    private javax.swing.JLabel powPromptLabel;
    private javax.swing.JButton radiansButton;
    private javax.swing.JTextField radiansNum1;
    private javax.swing.JLabel radiansOutputLabel;
    private javax.swing.JLabel radiansPromptLabel;
    private javax.swing.JButton sqrtButton;
    private javax.swing.JTextField sqrtNum1;
    private javax.swing.JLabel sqrtOutputLabel;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
