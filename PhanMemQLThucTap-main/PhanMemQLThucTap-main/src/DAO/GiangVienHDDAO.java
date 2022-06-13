/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.GiangVien;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ADMIN
 */
public class GiangVienHDDAO extends AbstractTableModel{
  private String name[] = {"Mã giảng viên","Tên giảng viên","Chuyên khoa"};
  private Class className[] = {String.class,String.class,String.class};
  private ArrayList<GiangVien> dsGV = new ArrayList<>();

    public GiangVienHDDAO(ArrayList<GiangVien> gv) {
        this.dsGV = gv;
    }
  
  
    @Override
    public int getRowCount() {
        return dsGV.size();
    }

    @Override
    public int getColumnCount() {
        return className.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return dsGV.get(rowIndex).getMaGiangVien();
            case 1:
                return dsGV.get(rowIndex).getTenGiangVien();
            case 2:
                return dsGV.get(rowIndex).getChuyenKhoa();
            default:
                return null;
        }
    }

    @Override
    public Class getColumnClass(int columnIndex) {
        return className[columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return name[column];
    }
    
    
}
