/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.DiemTT;
import Model.SinhVien;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ADMIN
 */
public class DiemTTDAO extends AbstractTableModel{
    private String name[] ={"Mã sinh viên","Tên sinh viên","Điểm","Xếp loại"};
    private Class className[] ={String.class,String.class,String.class,String.class,String.class};
    private ArrayList<DiemTT> dsDiem = new ArrayList<>();
    private ArrayList<SinhVien> dsSV = new ArrayList<>();

    public DiemTTDAO(ArrayList<DiemTT> diem,ArrayList<SinhVien> sv) {
        this.dsDiem = diem;
        this.dsSV = sv;
    }
    
    
    @Override
    public int getRowCount() {
        return dsDiem.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }
private String tenSV(String ten){
        String nameSV = "";
        for(var list : dsSV){
            if(list.getMaSinhVien().equals(ten)){
                nameSV = list.getHoTen();
            }
        }
        return nameSV;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return dsDiem.get(rowIndex).getMaSV();
             case 1:
                return tenSV(dsDiem.get(rowIndex).getMaSV());
            case 2:
                return dsDiem.get(rowIndex).getDiem();
            case 3:
                return dsDiem.get(rowIndex).getXepLoai();
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
