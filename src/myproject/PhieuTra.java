package myproject;

import java.util.Scanner;

public class PhieuTra{
    int ngayTra;
    int soSachTra;
    private String trangThaiSachTra;
    Scanner sc = new Scanner(System.in);

    public PhieuTra() {
    }

    public PhieuTra(int ngayTra, int soSachTra, String trangThaiSachTra) {
        this.ngayTra = ngayTra;
        this.soSachTra = soSachTra;
        this.trangThaiSachTra = trangThaiSachTra;
    }

    public int getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(int ngayTra) {
        
        this.ngayTra = ngayTra;
    }

    public int getSoSachTra() {
        return soSachTra;
    }

    public void setSoSachTra(int soSachTra) {
        this.soSachTra = soSachTra;
    }

    public String getTrangThaiSachTra() {
        return trangThaiSachTra;
    }

    public void setTrangThaiSachTra(String trangThaiSachTra) {
        while (true) {
            System.out.print("Nhập tình trạng sách sau khi trả: ");
            trangThaiSachTra=sc.nextLine();
            if (trangThaiSachTra.equalsIgnoreCase("moi") || trangThaiSachTra.equalsIgnoreCase("rach nhe") || trangThaiSachTra.equalsIgnoreCase("rach nang"))
                break;
        }
        this.trangThaiSachTra = trangThaiSachTra;
    }

    
    public void Nhap() {
        System.out.print("Nhập ngày trả tài liệu: ");
        ngayTra = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số sách trả: ");
        soSachTra=Integer.parseInt(sc.nextLine());
        setTrangThaiSachTra("");
    }

    @Override
    public String toString() {
        return "Ngày trả: "+ngayTra+" ,số sách trả: "+soSachTra +" ,tình trạng sách sau khi trả: "+trangThaiSachTra;
    }
    
    
    public void Xuat() {
        System.out.println(toString());
    }
    
}
