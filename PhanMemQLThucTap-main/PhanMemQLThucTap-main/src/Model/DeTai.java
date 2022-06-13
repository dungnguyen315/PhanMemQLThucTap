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
public class DeTai implements Serializable{
    private String maDeTai;
    private String tenDeTai;
    private String maGiangVien;
    private String ngayBatDau;
    private String diaDiemTT;

    public DeTai() {
    }

    public DeTai(String maDeTai, String tenDeTai, String maGiangVien, String ngayBatDau, String diaDiemTT) {
        this.maDeTai = maDeTai;
        this.tenDeTai = tenDeTai;
        this.maGiangVien = maGiangVien;
        this.ngayBatDau = ngayBatDau;
        this.diaDiemTT = diaDiemTT;
    }

    public String getMaDeTai() {
        return maDeTai;
    }

    public void setMaDeTai(String maDeTai) {
        this.maDeTai = maDeTai;
    }

    public String getTenDeTai() {
        return tenDeTai;
    }

    public void setTenDeTai(String tenDeTai) {
        this.tenDeTai = tenDeTai;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public String getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(String ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public String getDiaDiemTT() {
        return diaDiemTT;
    }

    public void setDiaDiemTT(String diaDiemTT) {
        this.diaDiemTT = diaDiemTT;
    }
    
    
}
