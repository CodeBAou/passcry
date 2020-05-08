package passcry;


public class interfaz extends javax.swing.JFrame {

    public interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEn = new javax.swing.JButton();
        btnDes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextReq = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        textRes = new javax.swing.JTextArea();
        labelPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("passcrypt");

        btnEn.setBackground(new java.awt.Color(51, 51, 51));
        btnEn.setForeground(new java.awt.Color(255, 255, 255));
        btnEn.setText("Encriptar");
        btnEn.setBorderPainted(false);

        btnDes.setBackground(new java.awt.Color(51, 51, 51));
        btnDes.setForeground(new java.awt.Color(255, 255, 255));
        btnDes.setText("Desencriptar");
        btnDes.setBorderPainted(false);

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setOpaque(false);

        TextReq.setBackground(new java.awt.Color(0, 0, 0));
        TextReq.setColumns(20);
        TextReq.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        TextReq.setForeground(new java.awt.Color(255, 255, 255));
        TextReq.setRows(5);
        TextReq.setCaretColor(new java.awt.Color(255, 102, 0));
        jScrollPane1.setViewportView(TextReq);

        textRes.setEditable(false);
        textRes.setBackground(new java.awt.Color(0, 0, 0));
        textRes.setColumns(20);
        textRes.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        textRes.setForeground(new java.awt.Color(255, 255, 255));
        textRes.setRows(5);
        textRes.setCaretColor(new java.awt.Color(255, 102, 0));
        jScrollPane3.setViewportView(textRes);

        labelPass.setBackground(new java.awt.Color(0, 0, 0));
        labelPass.setForeground(new java.awt.Color(255, 255, 255));
        labelPass.setCaretColor(new java.awt.Color(255, 51, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(labelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDes)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane3)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(labelPass, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(btnEn)
                    .addComponent(btnDes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea TextReq;
    public javax.swing.JButton btnDes;
    public javax.swing.JButton btnEn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JPasswordField labelPass;
    public javax.swing.JTextArea textRes;
    // End of variables declaration//GEN-END:variables
    

}
