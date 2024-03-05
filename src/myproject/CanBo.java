package myproject;

import java.util.Scanner;

public abstract class CanBo {
    private String idCanBo;
    private  String hoTen;
    private  String namSinh;
    private  String gioiTinh;
    private String diaChi;
    private int soNgayLamViec;
    static int Luong= 400000;
    Scanner sc = new Scanner(System.in);

    public CanBo(String idCanBo, String hoTen, String namSinh, String gioiTinh, String diaChi, int soNgayLamViec) {
        this.idCanBo = idCanBo;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.soNgayLamViec = soNgayLamViec;
    }

    public CanBo() {
    }

    public String getIdCanBo() {
        return idCanBo;
    }

    public void setIdCanBo(String idCanBo) {
        this.idCanBo = idCanBo;
    }

    
    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    public void Nhap() {
        System.out.print("Nhập mã cán bộ: ");
        idCanBo=sc.nextLine();
        System.out.print("Nhập họ và tên cán bộ: ");
        hoTen=sc.nextLine();
        System.out.print("Nhập ngày sinh cán bộ: ");
        namSinh=sc.nextLine();
        System.out.println("Giới tính là NAM hoặc NỮ");
        while(true) {
            System.out.print("Nhập giới tính: ");
            gioiTinh=sc.nextLine();
            if (gioiTinh.equalsIgnoreCase("nam") || gioiTinh.equalsIgnoreCase("nu"))
                break;
        }
        System.out.print("Nhập địa chỉ cán bộ: ");
        diaChi=sc.nextLine();
        System.out.print("Nhập số ngày làm việc: ");
        soNgayLamViec=Integer.parseInt(sc.nextLine());         
    }
    
    public  int tinhLuong() {
        return this.getSoNgayLamViec()*Luong;
    }
    
    
    public void Xuat() {
         System.out.printf("|%-10s |%-30s |%-20s |%-10s |%-20s |%-20s ",idCanBo,hoTen,namSinh,gioiTinh,diaChi,soNgayLamViec);
    }
    
}
