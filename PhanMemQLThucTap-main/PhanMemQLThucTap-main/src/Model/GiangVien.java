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
public class GiangVien implements Serializable{
    private String maGiangVien;
    private String tenGiangVien;
    private String chuyenKhoa;

    public GiangVien() {
    }

    public GiangVien(String maGiangVien, String tenGiangVien, String chuyenKhoa) {
        this.maGiangVien = maGiangVien;
        this.tenGiangVien = tenGiangVien;
        this.chuyenKhoa = chuyenKhoa;
    }

    public String getMaGiangVien() {
        return maGiangVien;
    }

    public void setMaGiangVien(String maGiangVien) {
        this.maGiangVien = maGiangVien;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public String getChuyenKhoa() {
        return chuyenKhoa;
    }

    public void setChuyenKhoa(String chuyenKhoa) {
        this.chuyenKhoa = chuyenKhoa;
    }
    
    
}
