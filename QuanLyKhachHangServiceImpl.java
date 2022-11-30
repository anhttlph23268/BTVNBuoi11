/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.QuanLyKhachHang;
import repository.QuanLyKhachhangRepository;
import service.QuanLyKhachHangService;

/**
 *
 * @author lananh
 */
public class QuanLyKhachHangServiceImpl implements QuanLyKhachHangService{
   private QuanLyKhachhangRepository repo;

    public QuanLyKhachHangServiceImpl() {
        this.repo = new QuanLyKhachhangRepository();
    }

    @Override
    public List<QuanLyKhachHang> getList() {
       try {
           return this.repo.getAll() ;
       } catch (SQLException ex) {
          ex.printStackTrace();
       }
       return null;
    }

    @Override
    public void add(QuanLyKhachHang kh) {
        
    }

  
   
}
