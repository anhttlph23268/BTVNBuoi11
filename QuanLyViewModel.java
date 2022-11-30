/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewmodel;

/**
 *
 * @author lananh
 */
public class QuanLyViewModel {
    private Long id;
    private String ten;
    private String loai;
    private int tuoi;
    private boolean gioiTinh;

    public QuanLyViewModel() {
    }

    public QuanLyViewModel(Long id, String ten, String loai, int tuoi, boolean gioiTinh) {
        this.id = id;
        this.ten = ten;
        this.loai = loai;
        this.tuoi = tuoi;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    @Override
    public String toString() {
        return "QuanLyViewModel{" + "id=" + id + ", ten=" + ten + ", loai=" + loai + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + '}';
    }
    
}
