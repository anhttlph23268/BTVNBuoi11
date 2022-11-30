/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.QuanLyKhachHang;

/**
 *
 * @author lananh
 */
public class QuanLyKhachhangRepository {
    public List<QuanLyKhachHang> getAll() throws SQLException{
        List<QuanLyKhachHang> listKH = new ArrayList<>();
        Connection con = DBConnection.getConnection();
        String sql = """
                     SELECT [id]
                           ,[ten_khach_hang]
                           ,[loai_khach_hang]
                           ,[nam_sinh]
                           ,[gioi_tinh]
                       FROM [dbo].[KhachHang]
                     """;
        PreparedStatement ps = con.prepareStatement(sql);
        ps.execute();
        ResultSet rs = ps.getResultSet();
        while (rs.next()) {// Long id, String ten, String loai, int namSinh, String gioiTinh)           
            String idStr = rs.getString("id");
            String tenStr = rs.getString("ten_khach_hang");
            String loaiStr = rs.getString("loai_khach_hang");
            int namSinh = rs.getInt("nam_sinh");
            int gioiTinh = rs.getInt("gioi_tinh");
            
            QuanLyKhachHang ql = new QuanLyKhachHang(Long.MIN_VALUE, tenStr, loaiStr, namSinh, gioiTinh);
            listKH.add(ql);
        }
               return listKH; 
    }
    public void add(QuanLyKhachHang kh) throws SQLException{
        Connection con = DBConnection.getConnection();
        String sql = """
                     INSERT INTO [dbo].[KhachHang]
                                ([id]
                                ,[ten_khach_hang]
                                ,[loai_khach_hang]
                                ,[nam_sinh]
                                ,[gioi_tinh])
                          VALUES
                                (<id, uniqueidentifier,>
                                ,<ten_khach_hang = ?,>
                                ,<loai_khach_hang = ?,>
                                ,<nam_sinh = ? >
                                ,<gioi_tinh = ?>)
                     """;
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kh.getTen());
        ps.setString(2, kh.getLoai());
        ps.setInt(3, kh.getNamSinh());
        ps.setInt(4, kh.getGioiTinh());
        ps.execute();
        System.out.println("add thanh cong");
    }
    
    public void delete(String id) throws SQLException{
        Connection con = DBConnection.getConnection();
        String sql = """
                     DELETE FROM [dbo].[KhachHang]
                           WHERE id = ?,>
                     """;
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, id);

        ps.execute();
        System.out.println("xoa thanh cong");
    }
}
