/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DAO.DangKyThucTapDAO;
import DBEnginee.DBEngine;
import Model.DangKyTT;
import Model.DeTai;
import Model.GiangVien;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import DBEnginee.DBEngine;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.JOptionPane;
/**
 *
 * @author ADMIN
 */
public class DangKyThucTap extends javax.swing.JFrame {
    private ArrayList<DeTai> dsDT = new ArrayList<>();
    private ArrayList<GiangVien> dsGV = new ArrayList<>();
    private ArrayList<DangKyTT> dsDK = new ArrayList<>();
    private String fileDT = "detai.txt";
    private String fileGV = "giangvien.txt";
    private String fileDK = "dangkytt.txt";
    private int dongClick = -1;
    private String maSV;
    private DangKyTT dangKyTT = new DangKyTT();
    private DBEngine dBEngine = new DBEngine();

    public void setMaSV(String MaSV){
        this.maSV = MaSV;
    }

    public DangKyThucTap(JButton btnDangKy, JButton btnQuayLai, JButton btnSapXep, JButton btnTimKiem, JLabel jLabel1, JLabel jLabel2, JScrollPane jScrollPane1, JTable jTableDangKyTT, JTextField txtSearch) throws HeadlessException {
        this.btnDangKy = btnDangKy;
        this.btnQuayLai = btnQuayLai;
        this.btnSapXep = btnSapXep;
        this.btnTimKiem = btnTimKiem;
        this.jLabel1 = jLabel1;
        this.jLabel2 = jLabel2;
        this.jScrollPane1 = jScrollPane1;
        this.jTableDangKyTT = jTableDangKyTT;
        this.txtSearch = txtSearch;
    }
    
    public DangKyThucTap() {
        initComponents();
        loadFileDT();
        loadFileGV();
        loadFileDKy();
        loadTable();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDangKyTT = new javax.swing.JTable();
        btnDangKy = new javax.swing.JButton();
        btnSapXep = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        btnQuayLai = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setText("Đăng Ký Thực Tập");

        jTableDangKyTT.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableDangKyTT);

        btnDangKy.setText("Đăng ký thực tập");
        btnDangKy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangKyActionPerformed(evt);
            }
        });

        btnSapXep.setText("Sắp xếp");
        btnSapXep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSapXepActionPerformed(evt);
            }
        });

        jLabel2.setText("Tìm kiếm theo tên đề tài thực tập");

        btnTimKiem.setText("Tìm kiếm");
        btnTimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimKiemActionPerformed(evt);
            }
        });

        btnQuayLai.setText("Quay lại");
        btnQuayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuayLaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(btnSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(165, 165, 165)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(101, 101, 101))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(btnQuayLai, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDangKy, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem))
                .addGap(48, 48, 48)
                .addComponent(btnQuayLai)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangKyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangKyActionPerformed
        dongClick = jTableDangKyTT.getSelectedRow();
        if(dongClick != -1){
            String maDT = (jTableDangKyTT.getModel().getValueAt(dongClick,0).toString());
            String ma = "";
            for(var item : dsDT){
                if(item.getMaDeTai().equals(maDT)){
                    ma = item.getMaDeTai();
                }
            }
            if(kiemtraDK(ma)){
                try {
                    dangKyTT = new DangKyTT(maSV,ma);
                    dsDK.add(dangKyTT);
                    nhapFile();
                    JOptionPane.showMessageDialog(this,"Đăng ký thành công !");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                JOptionPane.showMessageDialog(this,"Đề tài đã được đăng ký rồi");
            }
        }
    }//GEN-LAST:event_btnDangKyActionPerformed

    private void btnSapXepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSapXepActionPerformed
       Collections.sort(dsDT,new Comparator<DeTai>(){
            @Override
            public int compare(DeTai o1, DeTai o2) {     
              return (o1.getTenDeTai().compareToIgnoreCase(o2.getTenDeTai()));   
            }
        });
        loadTable();
    }//GEN-LAST:event_btnSapXepActionPerformed

    private void btnTimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimKiemActionPerformed
        String tenDT = txtSearch.getText().toString().trim().toUpperCase();
        ArrayList<DeTai> dsSearch = new ArrayList<>();
        for(var tk : dsDT){
            if(tk.getTenDeTai().trim().toUpperCase().contains(tenDT)){
               dsSearch.add(tk);
            }
        }
        jTableDangKyTT.setModel(new DangKyThucTapDAO(dsSearch,dsGV));
    }//GEN-LAST:event_btnTimKiemActionPerformed
 
    private void btnQuayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuayLaiActionPerformed
        MenuSinhVienTT meNuSinhVien = new MenuSinhVienTT();
        meNuSinhVien.setMaSV(maSV);
        meNuSinhVien.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnQuayLaiActionPerformed

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
            java.util.logging.Logger.getLogger(DangKyThucTap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangKyThucTap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangKyThucTap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangKyThucTap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangKyThucTap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangKy;
    private javax.swing.JButton btnQuayLai;
    private javax.swing.JButton btnSapXep;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDangKyTT;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void loadFileDT() {
        try {
           dsDT=(ArrayList<DeTai>) dBEngine.docFile(fileDT);
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this,e);
        }
    }

    private void loadFileGV() {
        try {
           dsGV =(ArrayList<GiangVien>) dBEngine.docFile(fileGV);
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this,e);
        }
    }
    
   
    private void loadFileDKy() {
        try {
           dsDK =(ArrayList<DangKyTT>) dBEngine.docFile(fileDK);
        } catch (Exception e) {
           JOptionPane.showMessageDialog(this,e);
        }
    }
    private void nhapFile(){
        try {
            dBEngine.LuuFile(fileDK,dsDK);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }
    }
    private void loadTable() {
        jTableDangKyTT.setModel(new DangKyThucTapDAO(dsDT,dsGV));
    }
    private boolean kiemtraDK(String maDT){
        boolean check = true;
        for(var dk : dsDK){
           
            if(dk.getMaSV()!=null && maDT.equals(dk.getMaDT())&&(dk.getMaSV().equals(maSV))){
                check = false;
            }
        }
        return check;
    }
}
