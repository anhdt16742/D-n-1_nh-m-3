/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author DO VAN DAO
 */
public class SanPham {

    String maSP, maLoai, maChatlieu, XuatXu, maMauSac, tenSP, size;
    int soLuong, giaban;
    float trongLuong;

    public SanPham(String maSP, String maLoai, String maChatlieu, String XuatXu, String maMauSac, String tenSP, String size, int soLuong, int giaban, float trongLuong) {
        this.maSP = maSP;
        this.maLoai = maLoai;
        this.maChatlieu = maChatlieu;
        this.XuatXu = XuatXu;
        this.maMauSac = maMauSac;
        this.tenSP = tenSP;
        this.size = size;
        this.soLuong = soLuong;
        this.giaban = giaban;
        this.trongLuong = trongLuong;
    }

    public SanPham() {
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public String getMaChatlieu() {
        return maChatlieu;
    }

    public void setMaChatlieu(String maChatlieu) {
        this.maChatlieu = maChatlieu;
    }

    public String getXuatXu() {
        return XuatXu;
    }

    public void setMaXuatXu(String maXuatXu) {
        this.XuatXu = maXuatXu;
    }

    public String getMaMauSac() {
        return maMauSac;
    }

    public void setMaMauSac(String maMauSac) {
        this.maMauSac = maMauSac;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getGiaban() {
        return giaban;
    }

    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }

    public float getTrongLuong() {
        return trongLuong;
    }

    public void setTrongLuong(float trongLuong) {
        this.trongLuong = trongLuong;
    }

}
