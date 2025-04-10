/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.forms;

/**
 *
 * @author Lenovo
 */
public class HanhTrinhControlForm1 extends javax.swing.JPanel {

    /**
     * Creates new form HanhTrinhControlForm1
     */
    public HanhTrinhControlForm1() {
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

        jLabel1 = new javax.swing.JLabel();
        ComboMaHanhTrinh = new javax.swing.JPanel();
        ComboGiaCoBan = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtGiaCoBan = new javax.swing.JTextField();
        ComboSanBayDi = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtSanBayDi = new javax.swing.JTextField();
        btnSanBayDi = new GUI.panel.swing.MyButton();
        ComboSanBayDen = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtSanBayDen = new javax.swing.JTextField();
        btnSanBayDen = new GUI.panel.swing.MyButton();
        btnThem = new GUI.panel.swing.MyButton();
        btnSua = new GUI.panel.swing.MyButton();
        btnAn = new GUI.panel.swing.MyButton();
        ComboTimKiemCoBan = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        lbTimKiem = new javax.swing.JLabel();
        cmbSapXep = new GUI.panel.swing.MyCombobox();
        cmbLuaChon = new GUI.panel.swing.MyCombobox();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Danh Sách Hành Trình");

        ComboMaHanhTrinh.setBackground(new java.awt.Color(255, 255, 255));
        ComboMaHanhTrinh.setLayout(new javax.swing.BoxLayout(ComboMaHanhTrinh, javax.swing.BoxLayout.LINE_AXIS));

        ComboGiaCoBan.setBackground(new java.awt.Color(255, 255, 255));
        ComboGiaCoBan.setPreferredSize(new java.awt.Dimension(230, 31));
        ComboGiaCoBan.setLayout(new javax.swing.BoxLayout(ComboGiaCoBan, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Giá cơ bản: ");
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 31));
        ComboGiaCoBan.add(jLabel3);

        txtGiaCoBan.setPreferredSize(new java.awt.Dimension(200, 31));
        ComboGiaCoBan.add(txtGiaCoBan);

        ComboMaHanhTrinh.add(ComboGiaCoBan);

        ComboSanBayDi.setBackground(new java.awt.Color(255, 255, 255));
        ComboSanBayDi.setLayout(new javax.swing.BoxLayout(ComboSanBayDi, javax.swing.BoxLayout.LINE_AXIS));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Sân bay đi:");
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(80, 31));
        ComboSanBayDi.add(jLabel4);

        txtSanBayDi.setPreferredSize(new java.awt.Dimension(200, 31));
        ComboSanBayDi.add(txtSanBayDi);

        btnSanBayDi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnSanBayDi.setBorderColor(new java.awt.Color(204, 204, 204));
        btnSanBayDi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSanBayDi.setPreferredSize(new java.awt.Dimension(31, 31));
        ComboSanBayDi.add(btnSanBayDi);

        ComboSanBayDen.setBackground(new java.awt.Color(255, 255, 255));
        ComboSanBayDen.setLayout(new javax.swing.BoxLayout(ComboSanBayDen, javax.swing.BoxLayout.LINE_AXIS));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Sân bay đến:");
        jLabel5.setPreferredSize(new java.awt.Dimension(80, 31));
        ComboSanBayDen.add(jLabel5);

        txtSanBayDen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSanBayDen.setPreferredSize(new java.awt.Dimension(200, 31));
        ComboSanBayDen.add(txtSanBayDen);

        btnSanBayDen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/3dots.png"))); // NOI18N
        btnSanBayDen.setBorderColor(new java.awt.Color(204, 204, 204));
        btnSanBayDen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSanBayDen.setPreferredSize(new java.awt.Dimension(31, 31));
        btnSanBayDen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanBayDenActionPerformed(evt);
            }
        });
        ComboSanBayDen.add(btnSanBayDen);

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/plus.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setBorderColor(new java.awt.Color(204, 204, 204));
        btnThem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThem.setPreferredSize(new java.awt.Dimension(100, 31));

        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setBorderColor(new java.awt.Color(204, 204, 204));
        btnSua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSua.setPreferredSize(new java.awt.Dimension(100, 31));

        btnAn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/Xoa.png"))); // NOI18N
        btnAn.setText("Xóa");
        btnAn.setBorderColor(new java.awt.Color(204, 204, 204));
        btnAn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAn.setPreferredSize(new java.awt.Dimension(100, 31));
        btnAn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnActionPerformed(evt);
            }
        });

        ComboTimKiemCoBan.setBackground(new java.awt.Color(255, 255, 255));
        ComboTimKiemCoBan.setPreferredSize(new java.awt.Dimension(300, 31));
        ComboTimKiemCoBan.setLayout(new javax.swing.BoxLayout(ComboTimKiemCoBan, javax.swing.BoxLayout.LINE_AXIS));

        txtTimKiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimKiem.setPreferredSize(new java.awt.Dimension(250, 29));
        ComboTimKiemCoBan.add(txtTimKiem);

        lbTimKiem.setBackground(new java.awt.Color(0, 204, 255));
        lbTimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icon/search.png"))); // NOI18N
        lbTimKiem.setOpaque(true);
        ComboTimKiemCoBan.add(lbTimKiem);

        cmbSapXep.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sắp xếp theo: Mã hành trình", "Sắp xếp theo: Giá cơ bản" }));
        cmbSapXep.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbSapXep.setPreferredSize(new java.awt.Dimension(240, 31));

        cmbLuaChon.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tăng dần", "Giảm dần" }));
        cmbLuaChon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cmbLuaChon.setPreferredSize(new java.awt.Dimension(120, 31));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ComboSanBayDen, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(ComboSanBayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ComboMaHanhTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ComboTimKiemCoBan, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboMaHanhTrinh, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboTimKiemCoBan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cmbLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cmbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ComboSanBayDi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addComponent(ComboSanBayDen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSanBayDenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanBayDenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSanBayDenActionPerformed

    private void btnAnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ComboGiaCoBan;
    private javax.swing.JPanel ComboMaHanhTrinh;
    private javax.swing.JPanel ComboSanBayDen;
    private javax.swing.JPanel ComboSanBayDi;
    private javax.swing.JPanel ComboTimKiemCoBan;
    private GUI.panel.swing.MyButton btnAn;
    private GUI.panel.swing.MyButton btnSanBayDen;
    private GUI.panel.swing.MyButton btnSanBayDi;
    private GUI.panel.swing.MyButton btnSua;
    private GUI.panel.swing.MyButton btnThem;
    private GUI.panel.swing.MyCombobox cmbLuaChon;
    private GUI.panel.swing.MyCombobox cmbSapXep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lbTimKiem;
    private javax.swing.JTextField txtGiaCoBan;
    private javax.swing.JTextField txtSanBayDen;
    private javax.swing.JTextField txtSanBayDi;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
