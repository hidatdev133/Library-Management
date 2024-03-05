package myproject;

import java.util.Scanner;

public class HoaDon {
    static int soTienMoiNgay = 10000;
    private int soTienDaDong;

    PhieuMuon phieumuon = new PhieuMuon();
    PhieuTra phieutra = new PhieuTra();
    Scanner sc = new Scanner(System.in);
    

    public HoaDon() {
    }

    public HoaDon(int soTienDaDong) {
        this.soTienDaDong = soTienDaDong;
    }

    public static int getSoTienMoiNgay() {
        return soTienMoiNgay;
    }

    public static void setSoTienMoiNgay(int soTienMoiNgay) {
        HoaDon.soTienMoiNgay = soTienMoiNgay;
    }

    public int getSoTienDaDong() {
        return soTienDaDong;
    }

    public void setSoTienDaDong(int soTienDaDong) {
        this.soTienDaDong = soTienDaDong;
    }

    public PhieuMuon getPhieumuon() {
        return phieumuon;
    }

    public void setPhieumuon(PhieuMuon phieumuon) {
        this.phieumuon = phieumuon;
    }

    public PhieuTra getPhieutra() {
        return phieutra;
    }

    public void setPhieutra(PhieuTra phieutra) {
        this.phieutra = phieutra;
    }
    
    public void Nhap() {
        System.out.print("Nhập số tiền đã đóng: ");
        soTienDaDong=Integer.parseInt(sc.nextLine());
    }
    
    
    
    
    
    
}
