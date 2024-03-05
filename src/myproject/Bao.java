package myproject;

import java.util.Scanner;

public class Bao extends TaiLieu{
    private int ngayPhatHanh;
    Scanner sc = new Scanner(System.in);


    public Bao() {
    }

    public Bao(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao(int ngayPhatHanh, String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }
    
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhập ngày phát hành: ");
        ngayPhatHanh=Integer.parseInt(sc.nextLine());
    }
    
    public void Xuat() {
        super.Xuat();
        System.out.printf("|%-30s |%-10s |%-20s |%-20s |%-20s |%-20s |","","","","",ngayPhatHanh,"");
    }
}
