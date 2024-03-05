package myproject;

import java.util.Scanner;

public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;
    Scanner sc = new Scanner(System.in);

    public Sach() {
    }

    public Sach(String tenTacGia, int soTrang) {
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach(String tenTacGia, int soTrang, String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhập tên tác giả: ");
        tenTacGia=sc.nextLine();
        System.out.print("Nhập số trang:  ");
        soTrang=Integer.parseInt(sc.nextLine());
    }
    
    public void Xuat() {
        super.Xuat();
        System.out.printf("|%-30s |%-10s |%-20s |%-20s |%-20s |%-20s |",tenTacGia,soTrang,"","","","");
    }
    
}
