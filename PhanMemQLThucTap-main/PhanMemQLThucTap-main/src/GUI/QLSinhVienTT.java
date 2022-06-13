/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.SinhVienTTDAO;
import Model.SinhVien;
import Model.TaiKhoan;
import java.util.ArrayList;
import DBEnginee.DBEngine;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class QLSinhVienTT extends javax.swing.JFrame {
    private ArrayList<SinhVien> dsSV = new ArrayList<>();
    private ArrayList<TaiKhoan> dsTK = new ArrayList<>();
    private SinhVien sinhVien = new SinhVien();
    private TaiKhoan taiKhoan = new TaiKhoan();
    private String fileSV = "sinhvien.txt";
    private String fileTK = "taikhoan.txt";
    private DBEngine dBEngine = new DBEngine();
    private String gioiTinh = "";
    private String khoa = "";
   
    int dongClick = -1;
    /**
     * Creates new form QLSinhVienTT
     */
    public QLSinhVienTT() {
        initComponents();
        loadFileSV();
        loadFileTK();
        loadBoxGT();
        loadBoxKhoa();
        loadTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSinhVien = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        txtHoTen = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jComboBoxGioiTinh = new javax.swing.JComboBox<>();
        txtHeDaoTao = new javax.swing.JTextField();
        jComboBoxKhoa = new javax.swing.JComboBox<>();
        btnQuayLai = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Quản Lý Sinh Viên Thực Tập");

        jTableSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableSinhVien);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSapXep.setText("Sắp xếp");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã sinh viên");

        jLabel3.setText("Họ tên");

        jLabel4.setText("Ngày sinh");

        jLabel5.setText("Địa chỉ");

        jLabel6.setText("Giới tính");

        jLabel8.setText("Hệ đào tạo");

        jLabel9.setText("Khóa");

        txtDiaChi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaChiActionPerformed(evt);
            }
        });

        jComboBoxGioiTinh.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxGioiTinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGioiTinhActionPerformed(evt);
            }
        });

        jComboBoxKhoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxKhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxKhoaActionPerformed(evt);
            }
        });

        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(108, 108, 108)))
                                        .addGap(14, 14, 14))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(55, 55, 55)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHeDaoTao, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel3)
                                    .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jComboBoxKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(149, 149, 149)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(45, 45, 45)
                                        .addComponent(jComboBoxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(650, 650, 650)
                                    .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 723, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jLabel1)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnXoa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSapXep))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBoxGioiTinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHeDaoTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQuayLai)
                    .addComponent(btnLamMoi))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDiaChiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaChiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaChiActionPerformed

    private void jComboBoxGioiTinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGioiTinhActionPerformed
       gioiTinh = (String) jComboBoxGioiTinh.getSelectedItem();
    }//GEN-LAST:event_jComboBoxGioiTinhActionPerformed

    private void jComboBoxKhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxKhoaActionPerformed
        khoa = (String) jComboBoxKhoa.getSelectedItem();
    }//GEN-LAST:event_jComboBoxKhoaActionPerformed
    
    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String maSV = txtMaSV.getText().toString().trim();
        String hoTen = txtHoTen.getText().toString().trim();
        String ngaySinh = txtNgaySinh.getText().toString().trim();
        String diaChi = txtDiaChi.getText().toString().trim();
        String heDaoTao = txtHeDaoTao.getText().toString().trim();
        if(maSV.isEmpty()||hoTen.isEmpty()||ngaySinh.isEmpty()||diaChi.isEmpty()||heDaoTao.isEmpty()){
            JOptionPane.showMessageDialog(this,"Chưa nhập đủ dữ liệu ! \n Vui lòng nhập lại !");
        }else{
            if(kiemTraSV(maSV)){
                sinhVien = new SinhVien(maSV,hoTen,ngaySinh,gioiTinh,diaChi,heDaoTao,khoa);
                taiKhoan = new TaiKhoan(maSV,"1234");
                dsSV.add(sinhVien);
                dsTK.add(taiKhoan);
                luuFileSV();
                luuFileTK();
                loadTable();
            }else{
                JOptionPane.showMessageDialog(this,"Sinh viên đã tồn tại !");
            }
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        String maSV = txtMaSV.getText().toString().trim();
        String hoTen = txtHoTen.getText().toString().trim();
        String ngaySinh = txtNgaySinh.getText().toString().trim();
        String diaChi = txtDiaChi.getText().toString().trim();
        String heDaoTao = txtHeDaoTao.getText().toString().trim();
        dongClick = jTableSinhVien.getSelectedRow();
        if(dongClick !=-1){
            if(maSV.isEmpty()||hoTen.isEmpty()||ngaySinh.isEmpty()||diaChi.isEmpty()||heDaoTao.isEmpty()){
                     JOptionPane.showMessageDialog(this,"Chưa nhập đủ thông tin !");
            }else{
                if(kiemTraSV(maSV)==false){
                    if(maSV.equals(dsSV.get(dongClick).getMaSinhVien().trim())){
                        sinhVien = new SinhVien(maSV.toUpperCase(),hoTen,ngaySinh,gioiTinh,diaChi,heDaoTao,khoa);
                        dsSV.set(dongClick,sinhVien);
                        luuFileSV();
                        loadTable();
                    }
                    else{
                        JOptionPane.showMessageDialog(this,"Mã sinh viên "+maSV+" đã tồn tại !");
                    }
                }
                else{
                    sinhVien = new SinhVien(maSV.toUpperCase(),hoTen,ngaySinh,gioiTinh,diaChi,heDaoTao,khoa);
                    dsSV.set(dongClick,sinhVien);
                    dsTK.get(dongClick+1).setTaiKhoan(maSV);
                    luuFileSV();
                    luuFileTK();
                    loadTable();
                }
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
       dongClick= jTableSinhVien.getSelectedRow();
        if(dongClick != -1){
          int check = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa không ?"
                  ,"Dialog Confirm",JOptionPane.YES_NO_OPTION);
          if(check==JOptionPane.YES_OPTION){
            dsSV.remove(dongClick);
            dsTK.remove(dongClick+1);
            luuFileSV();
            luuFileTK();
            loadTable();
          }
            
        }
    }//GEN-LAST:event_btnXoaActionPerformed
     
    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
       MenuQuanLyTT menuQuanLyTT = new MenuQuanLyTT();
       menuQuanLyTT.setVisible(true);
       dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
        Collections.sort(dsSV,new Comparator<SinhVien>(){
            @Override
            public int compare(SinhVien o1, SinhVien o2) {     
              return o1.getHoTen().compareToIgnoreCase(o2.getHoTen());   
            }
        });
       loadTable();
    }//GEN-LAST:event_btnSapXepActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
       txtMaSV.setText("");
       txtDiaChi.setText("");
       txtHeDaoTao.setText("");
       txtNgaySinh.setText("");
       txtHoTen.setText("");
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void jTableSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableSinhVienMouseClicked
        dongClick = jTableSinhVien.getSelectedRow();
        if(dongClick !=-1){
            sinhVien = dsSV.get(dongClick);
            txtMaSV.setText(sinhVien.getMaSinhVien());
            txtDiaChi.setText(sinhVien.getDiaChi());
            txtHeDaoTao.setText(sinhVien.getHeDaoTao());
            txtNgaySinh.setText(sinhVien.getNgaySinh());
            txtHoTen.setText(sinhVien.getHoTen());
            jComboBoxGioiTinh.setSelectedItem(sinhVien.getGioiTinh());
            jComboBoxKhoa.setSelectedItem(sinhVien.getKhoa());
        }
    }//GEN-LAST:event_jTableSinhVienMouseClicked

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
            java.util.logging.Logger.getLogger(QLSinhVienTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLSinhVienTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLSinhVienTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLSinhVienTT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLSinhVienTT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> jComboBoxGioiTinh;
    private javax.swing.JComboBox<String> jComboBoxKhoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSinhVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtHeDaoTao;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtNgaySinh;
    // End of variables declaration//GEN-END:variables

    private void loadFileSV() {
        try {
            dsSV = (ArrayList<SinhVien>) dBEngine.docFile(fileSV);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadFileTK() {
        try {
            dsTK = (ArrayList<TaiKhoan>) dBEngine.docFile(fileTK);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void luuFileSV(){
        try {
            dBEngine.LuuFile(fileSV,dsSV);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    private void luuFileTK(){
        try {
            dBEngine.LuuFile(fileTK,dsTK);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }
    }

    private void loadBoxGT() {
      jComboBoxGioiTinh.removeAllItems();
      jComboBoxGioiTinh.addItem("Nam");
      jComboBoxGioiTinh.addItem("Nữ");
    }

    private void loadBoxKhoa() {
      jComboBoxKhoa.removeAllItems();
      jComboBoxKhoa.addItem("K12");
      jComboBoxKhoa.addItem("K13");
      jComboBoxKhoa.addItem("K14");
    }

    private void loadTable() {
        jTableSinhVien.setModel(new SinhVienTTDAO(dsSV));
    }
    private boolean kiemTraSV(String txtKT){
        boolean kt = true;
        for (SinhVien sinhVien1 : dsSV) {
            if(sinhVien1.getMaSinhVien().trim().equals(txtKT.trim())){
                kt = false;
            }
        }
        return kt;
    }
}
