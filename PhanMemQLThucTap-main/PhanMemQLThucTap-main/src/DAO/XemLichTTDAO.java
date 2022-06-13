/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.DangKyTT;
import Model.DeTai;
import Model.GiangVien;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ADMIN
 */
public class XemLichTTDAO extends AbstractTableModel{
    private String name[] = {"Mã đề tài","Tên đề tài","Giảng viên","Ngày bắt đầu","Địa điểm"};
    private Class className[] ={String.class,String.class,String.class,String.class,String.class};
    private ArrayList<DeTai> dsDT = new ArrayList<DeTai>();
    private ArrayList<DangKyTT> dsDK = new ArrayList<DangKyTT>();
    private ArrayList<GiangVien> dsGV = new ArrayList<GiangVien>();

    public XemLichTTDAO(ArrayList<DeTai> dt ,ArrayList<DangKyTT> dk ,ArrayList<GiangVien> gv) {
        this.dsDT = dt;
        this.dsDK = dk;
        this.dsGV = gv;
    }
    
    
    @Override
    public int getRowCount() {
        return dsDK.size();
    }

    @Override
    public int getColumnCount() {
        return name.length;
    }
    private String tenDT(String maDT){
        String anser = "";
        for (var list : dsDT) {
            if(list.getMaDeTai().equals(maDT)){
                anser = list.getTenDeTai();
            }
        }
        return anser;
    }
    private String tenGV(String maDT){
        String kq ="";
        for (DeTai dt : dsDT) {
            if(maDT.equals(dt.getMaDeTai())){
                kq = dt.getMaGiangVien();
            }
        }
        String anser = "";
        for (var list : dsGV) {
            if(list.getMaGiangVien().equals(kq)){
                anser = list.getTenGiangVien();
            }
        }
        return anser;
    }
    private String ngayBD(String maDT){
        String kq = "";
        for (DeTai dt : dsDT) {
            if(maDT.equals(dt.getMaDeTai())){
                kq = dt.getNgayBatDau();
            }
        }
        String anser = "";
        for (var list : dsDT) {
            if(list.getNgayBatDau().equals(kq)){
                anser = list.getNgayBatDau();
            }
        }
        return anser;
    }
    private String diaDiem(String maDT){
        String kq = "";
        for (DeTai dt : dsDT) {
            if(maDT.equals(dt.getMaDeTai())){
                kq = dt.getDiaDiemTT();
            }
        }
        String anser = "";
        for (var list : dsDT) {
            if(list.getDiaDiemTT().equals(kq)){
                anser = list.getDiaDiemTT();
            }
        }
        return anser;
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return dsDK.get(rowIndex).getMaDT();
            case 1:
                return tenDT(dsDK.get(rowIndex).getMaDT());
            case 2:
                return tenGV(dsDK.get(rowIndex).getMaDT());
            case 3:
                return ngayBD(dsDK.get(rowIndex).getMaDT());
            case 4:
                return diaDiem(dsDK.get(rowIndex).getMaDT());
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
