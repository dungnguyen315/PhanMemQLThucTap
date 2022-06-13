/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.SinhVien;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ADMIN
 */
public class SinhVienTTDAO extends AbstractTableModel{
    private String name[] = {"Mã Sinh Viên","Họ Tên","Ngày Sinh","Giới Tính","Địa Chỉ","Hệ Đào Tạo","Khóa"};
    private Class className[] = {String.class,String.class,String.class,String.class,String.class,String.class,String.class};
    ArrayList<SinhVien> dsSV = new ArrayList<>();

    public SinhVienTTDAO(ArrayList<SinhVien> sv) {
        this.dsSV = sv;
    }
    

    @Override
    public int getRowCount() {
        return dsSV.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch(columnIndex){
           case 0:
               return dsSV.get(rowIndex).getMaSinhVien();
           case 1:
               return dsSV.get(rowIndex).getHoTen();
           case 2:
               return dsSV.get(rowIndex).getNgaySinh();
           case 3:
               return dsSV.get(rowIndex).getGioiTinh();
           case 4:
               return dsSV.get(rowIndex).getDiaChi();
           case 5:
               return dsSV.get(rowIndex).getHeDaoTao();
           case 6:
               return dsSV.get(rowIndex).getKhoa();
          default:
              return null;
       }
    }

    /**
     *
     * @param columnIndex
     * @return
     */
    @Override
    public Class getColumnClass(int columnIndex) {
        return className[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
       
}
