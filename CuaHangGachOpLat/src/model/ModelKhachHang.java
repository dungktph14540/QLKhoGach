/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrator
 */
public class ModelKhachHang {
    private String makh, tenkh,diachi, sdt, email, thongtinkhac;
    private boolean trangthai;

    public ModelKhachHang(String makh, String tenkh, String diachi, String sdt, String email, String thongtinkhac, boolean trangthai) {
        this.makh = makh;
        this.tenkh = tenkh;
        this.diachi = diachi;
        this.sdt = sdt;
        this.email = email;
        this.thongtinkhac = thongtinkhac;
        this.trangthai = trangthai;
    }

    public String getMakh() {
        return makh;
    }

    public void setMakh(String makh) {
        this.makh = makh;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getThongtinkhac() {
        return thongtinkhac;
    }

    public void setThongtinkhac(String thongtinkhac) {
        this.thongtinkhac = thongtinkhac;
    }

    public boolean isTrangthai() {
        return trangthai;
    }

    public void setTrangthai(boolean trangthai) {
        this.trangthai = trangthai;
    }

    @Override
    public String toString() {
        return "ModelKhachHang{" + "makh=" + makh + ", tenkh=" + tenkh + ", diachi=" + diachi + ", sdt=" + sdt + ", email=" + email + ", thongtinkhac=" + thongtinkhac + ", trangthai=" + trangthai + '}';
    }
    
    
}
