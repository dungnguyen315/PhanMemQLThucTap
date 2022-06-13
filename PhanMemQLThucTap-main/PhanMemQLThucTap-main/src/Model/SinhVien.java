/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author ADMIN
 */
public class SinhVien implements Serializable{
    private String MaSinhVien;
    private String HoTen;
    private String NgaySinh;
    private String GioiTinh;
    private String DiaChi;
    private String HeDaoTao;
    private String Khoa;

    public SinhVien() {
    }

    public SinhVien(String MaSinhVien, String HoTen, String NgaySinh, String GioiTinh, String DiaChi, String HeDaoTao,String Khoa) {
        this.MaSinhVien = MaSinhVien;
        this.HoTen = HoTen;
        this.NgaySinh = NgaySinh;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.HeDaoTao = HeDaoTao;
        this.Khoa = Khoa;
    }

    public void setMaSinhVien(String MaSinhVien) {
        this.MaSinhVien = MaSinhVien;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setHeDaoTao(String HeDaoTao) {
        this.HeDaoTao = HeDaoTao;
    }
    
    public String getMaSinhVien() {
        return MaSinhVien;
    }

    public String getHoTen() {
        return HoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public String getHeDaoTao() {
        return HeDaoTao;
    }

    public String getKhoa() {
        return Khoa;
    }

    public void setKhoa(String Khoa) {
        this.Khoa = Khoa;
    }
}
