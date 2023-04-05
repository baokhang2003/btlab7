/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author TH
 */
interface HangSanXuat{
    String TenHangSanXuat();
    String tenQuocGia();
}
abstract class PhuongTienDiChuyen implements HangSanXuat{
     String loaiPhuongTien(){
        return loaiPhuongTien();
     }
    void batDau(){
        System.out.println("Let's go");
    }
    void tangToc(){
        System.out.println("accelerate");
    }
    void dungLai(){
        System.out.println("Stop");
    }
    abstract Double layVanToc();

    @Override
    public String TenHangSanXuat() {
        String TenHangSanXuat;
        TenHangSanXuat = " ten hang san xuat";
        return TenHangSanXuat;
    }
    @Override
    public String tenQuocGia() {
        String tenQuocGia;
        tenQuocGia = " Ten Quoc Gia";
        return tenQuocGia;
    }
}
