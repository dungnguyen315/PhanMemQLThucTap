/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.DeTai;
import Model.GiangVien;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ADMIN
 */
public class DangKyThucTapDAO extends AbstractTableModel{
    private String name[] = {"Mã đề tài","Tên đề tài","Giảng viên","Ngày bắt đầu","Địa điểm"};
    private Class className[] ={String.class,String.class,String.class,String.class,String.class};
    private ArrayList<DeTai> dsDT = new ArrayList<>();
    private ArrayList<GiangVien> dsGV = new ArrayList<>();

    public DangKyThucTapDAO(ArrayList<DeTai> dt,ArrayList<GiangVien> gv) {
        this.dsDT = dt;
        this.dsGV = gv;
    }
    
    
    @Override
    public int getRowCount() {
        return dsDT.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }
    private String tenGV(String gv){
        String nameGV = "";
        for(var list : dsGV){
            if(list.getMaGiangVien().equals(gv)){
                nameGV = list.getTenGiangVien();
            }
        }
        return nameGV;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return dsDT.get(rowIndex).getMaDeTai();
            case 1:
                return dsDT.get(rowIndex).getTenDeTai();
            case 2:
                return tenGV(dsDT.get(rowIndex).getMaGiangVien());
            case 3:
                return dsDT.get(rowIndex).getNgayBatDau();
            case 4:
                return dsDT.get(rowIndex).getDiaDiemTT();
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
