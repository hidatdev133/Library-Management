package myproject;

import java.util.Scanner;

public class Truyen extends TaiLieu{
    private int soChuong;
    Scanner sc = new Scanner(System.in);
    public Truyen() {
    }

    public Truyen(int soChuong) {
        this.soChuong = soChuong;
    }

    public Truyen(int soChuong, String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.soChuong = soChuong;
    }

    public int getSoChuong() {
        return soChuong;
    }

    public void setSoChuong(int soChuong) {
        this.soChuong = soChuong;
    }
    
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhập số chương: ");
        soChuong=Integer.parseInt(sc.nextLine());
    }
    
    public void Xuat() {
        super.Xuat();
        System.out.printf("|%-30s |%-10s |%-20s |%-20s |%-20s |%-10s           |","","","","","",soChuong);
    }
    
}
