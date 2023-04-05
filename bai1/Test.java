/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication12;

/**
 *
 * @author TH
 */
class Test {
    public static void main(String[] args) {
        xeDap XD = new xeDap();
        MayBay MB = new MayBay();
        System.out.println(MB.loaiPhuongTien());
        MB.catCanh();
        MB.haCanh();
        System.out.println("Van Toc:"+MB.layVanToc());
        xeOto OT = new xeOto();
        System.out.println(OT.loaiPhuongTien());
        System.out.println("Van Toc:"+OT.layVanToc());  
        System.out.println(XD.loaiPhuongTien());
        System.out.println("Van Toc:"+XD.layVanToc()); 
    }
}
