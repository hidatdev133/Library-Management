package myproject;

import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu;
    private String nhaXuatBan;
    private int soBanPhatHanh;
    Scanner sc = new Scanner(System.in);

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu() {
        return maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getSoBanPhatHanh() {
        return soBanPhatHanh;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh) {
        this.soBanPhatHanh = soBanPhatHanh;
    }
    
    public void Nhap() {
        System.out.print("Nhập ID tài liệu: ");
        maTaiLieu=sc.nextLine();
        System.out.print("Nhập nhà xuất bản: ");
        nhaXuatBan=sc.nextLine();
        System.out.print("Nhập số bản phát hành: ");
        soBanPhatHanh=Integer.parseInt(sc.nextLine());
    }

    
    
    public void Xuat() {
        System.out.printf("|%-10s |%-20s |%-20s ",maTaiLieu,nhaXuatBan,soBanPhatHanh );
    }
    
    
    
}
