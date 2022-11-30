/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author lananh
 */
public class QuanLyKhachHang {
    private Long id;
    private String ten;
    private String loai;
    private int namSinh;
    private int gioiTinh;

    public QuanLyKhachHang() {
    }

    public QuanLyKhachHang(Long id, String ten, String loai, int namSinh, int gioiTinh) {
        this.id = id;
        this.ten = ten;
        this.loai = loai;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
    }

   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

   

    
}
