package myproject;

import java.util.Scanner;

public class NhanVien extends CanBo{
    private String congViec;
    Scanner sc = new Scanner(System.in);

    public NhanVien() {
    }

    public NhanVien(String congViec, String idCanBo, String hoTen, String namSinh, String gioiTinh, String diaChi, int soNgayLamViec) {
        super(idCanBo, hoTen, namSinh, gioiTinh, diaChi, soNgayLamViec);
        this.congViec = congViec;
    }

    public NhanVien(String congViec) {
        this.congViec = congViec;
    }


    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }
    
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhập công việc nhân viên: ");
        congViec= sc.nextLine();
    }
    
    @Override
    public int tinhLuong() {
        return super.tinhLuong();
    }
    
    public void Xuat() {
        super.Xuat();
        System.out.printf("|%-20s |%-20s |%-20s |","",congViec,tinhLuong());
    }

    
}
