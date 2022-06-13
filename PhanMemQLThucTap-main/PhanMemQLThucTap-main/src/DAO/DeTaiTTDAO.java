/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.DeTai;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ADMIN
 */
public class DeTaiTTDAO extends AbstractTableModel{
    private String name[] = {"Mã đề tài","Tên đề tài","Mã giảng viên","Ngày bắt đầu","Địa điểm thực tập"};
    private Class className[] = {String.class,String.class,String.class,String.class,String.class};
    private ArrayList<DeTai> dsDeTai = new ArrayList<>();

    public DeTaiTTDAO(ArrayList<DeTai> ds) {
        this.dsDeTai = ds;
    }
    
    
    @Override
    public int getRowCount() {
        return dsDeTai.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return dsDeTai.get(rowIndex).getMaDeTai();
            case 1:
                return dsDeTai.get(rowIndex).getTenDeTai();
            case 2:
                return dsDeTai.get(rowIndex).getMaGiangVien();
            case 3:
                return dsDeTai.get(rowIndex).getNgayBatDau();
            case 4:
                return dsDeTai.get(rowIndex).getDiaDiemTT();
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
