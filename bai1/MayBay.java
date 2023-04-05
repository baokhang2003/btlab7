/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author TH
 */
class MayBay extends PhuongTienDiChuyen{
    @Override
    String loaiPhuongTien() {
        String loaiPhuongTien;
        loaiPhuongTien = "MAY BAY";
        return loaiPhuongTien;
    }
    private String loaiNguyenLieu;
    void catCanh(){
        System.out.println("Cat canh vao luc 2 gio 00 phut");
    }
    void haCanh(){
        System.out.println("Ha canh vao luc 3 gio 20 phut");
    }
    @Override
    Double layVanToc() {
        Double layVanToc;
        layVanToc = 100.00;
        return layVanToc;
    }
}
