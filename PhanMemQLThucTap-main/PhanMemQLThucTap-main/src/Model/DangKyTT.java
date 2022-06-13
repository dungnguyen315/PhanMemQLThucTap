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
public class DangKyTT implements Serializable{
    private String maSV;
    private String maDT;

    public DangKyTT(String maSV, String maDT) {
        this.maSV = maSV;
        this.maDT = maDT;
    }

    public DangKyTT() {
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaDT() {
        return maDT;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }
    
    
}
