package myproject;

import java.util.Scanner;

public class PhieuMuon {
    int ngayMuon;
    int soSachMuon;
    private String trangThaiSachMuon;
    Scanner sc = new Scanner(System.in);

    public PhieuMuon() {
        
    }

    public PhieuMuon(int ngayMuon, int soSachMuon, String trangThaiSachMuon) {
        this.ngayMuon = ngayMuon;
        this.soSachMuon = soSachMuon;
        this.trangThaiSachMuon = trangThaiSachMuon;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        
        this.ngayMuon = ngayMuon;
    }

    public int getSoSachMuon() {
        return soSachMuon;
    }

    public void setSoSachMuon(int soSachMuon) {
        this.soSachMuon = soSachMuon;
    }

    public String getTrangThaiSachMuon() {
        return trangThaiSachMuon;
    }

    public void setTrangThaiSachMuon(String trangThaiSachMuon) {
        while (true) {
            System.out.print("Nhập tình trạng sách trước khi mượn: ");
            trangThaiSachMuon=sc.nextLine();
            if (trangThaiSachMuon.equalsIgnoreCase("moi") || trangThaiSachMuon.equalsIgnoreCase("rach nhe") || trangThaiSachMuon.equalsIgnoreCase("rach nang"))
                break;
        }
        this.trangThaiSachMuon = trangThaiSachMuon;
    }
    
    
    
    public void Nhap() {
        System.out.print("Nhập ngày mượn tài liệu: ");
        ngayMuon=Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số sách mượn: ");
        soSachMuon=Integer.parseInt(sc.nextLine());
        setTrangThaiSachMuon("");
    }

    @Override
    public String toString() {
        return "Ngày mượn: "+ngayMuon+ " ,số sách mượn: "+soSachMuon+ " ,tình trạng sách trước khi mượn: "+trangThaiSachMuon;
    }
    
    public void Xuat() {
        System.out.println(toString());
    }
    
    
}
