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
public class ModelGach {
    private String magach, tengach, madv, soluong, macl, matl,mancc, anh;
    private boolean trangthai;
    
    public ModelGach(String magach, String tengach, String madv, String soluong, String macl, String matl, String mancc, String anh) {
        this.magach = magach;
        this.tengach = tengach;
        this.madv = madv;
        this.soluong = soluong;
        this.macl = macl;
        this.matl = matl;
        this.mancc = mancc;
        this.anh = anh;
    }

    public String getMagach() {
        return magach;
    }

    public void setMagach(String magach) {
        this.magach = magach;
    }

    public String getTengach() {
        return tengach;
    }

    public void setTengach(String tengach) {
        this.tengach = tengach;
    }

    public String getMadv() {
        return madv;
    }

    public void setMadv(String madv) {
        this.madv = madv;
    }

    public String getSoluong() {
        return soluong;
    }

    public void setSoluong(String soluong) {
        this.soluong = soluong;
    }

    public String getMacl() {
        return macl;
    }

    public void setMacl(String macl) {
        this.macl = macl;
    }

    public String getMatl() {
        return matl;
    }

    public void setMatl(String matl) {
        this.matl = matl;
    }

    public String getMancc() {
        return mancc;
    }

    public void setMancc(String mancc) {
        this.mancc = mancc;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    @Override
    public String toString() {
        return "Gach{" + "magach=" + magach + ", tengach=" + tengach + ", madv=" + madv + ", soluong=" + soluong + ", macl=" + macl + ", matl=" + matl + ", mancc=" + mancc + ", anh=" + anh + '}';
    }
    
    
}
