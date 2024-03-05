package myproject;

import java.util.Scanner;

public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;
    Scanner sc = new Scanner(System.in);

    public TapChi() {
    }

    public TapChi(int soPhatHanh, int thangPhatHanh) {
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(int soPhatHanh, int thangPhatHanh, String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }
    
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhập số phát hành: ");
        soPhatHanh=Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tháng phát hành:  ");
        thangPhatHanh=Integer.parseInt(sc.nextLine());
    }
    
    public void Xuat() {
        super.Xuat();
        System.out.printf("|%-30s |%-10s |%-20s |%-20s |%-20s |%-20s |","","",soPhatHanh,thangPhatHanh,"","");
        
    }
}
