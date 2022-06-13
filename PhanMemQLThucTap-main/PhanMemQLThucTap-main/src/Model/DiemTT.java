/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class DiemTT implements Serializable{
    private String maSV;
    private String diem;
    private String xepLoai;

    public DiemTT() {
    }

    
    public DiemTT(String maSV, String diem, String xepLoai) {
        this.maSV = maSV;
        this.diem = diem;
        this.xepLoai = xepLoai;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getDiem() {
        return diem;
    }

    public void setDiem(String diem) {
        this.diem = diem;
    }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }   
}
