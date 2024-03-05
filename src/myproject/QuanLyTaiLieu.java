package myproject;

import java.util.Arrays;
import java.util.Scanner;

public class QuanLyTaiLieu {
    Scanner sc = new Scanner(System.in);
    TaiLieu dstl[];
    int n;
    
    public static void Menu() {
        System.out.println("\n---------------------MENU QUẢN LÍ TÀI LIỆU---------------------");
        System.out.println("1. Nhập tài liệu");
        System.out.println("2. Thêm tài liệu");
        System.out.println("3. Chỉnh sửa tài liệu");
        System.out.println("4. Xóa tài liệu");
        System.out.println("5. Tìm kiếm tài liệu");
        System.out.println("6. Hiển thị danh sách tài liệu");
        System.out.println("0. Thoát");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Chọn các chức năng: ");
    }
    
    public void Nhap() {
        System.out.println("========================================NHẬP THÔNG TIN TÀI LIỆU=======================================");
        System.out.print("Mời nhập số lượng tài liệu: ");
        n= Integer.parseInt(sc.nextLine());
        dstl = new TaiLieu[n];    
        int choose;
        for (int i=0;i<n;i++) {
            System.out.println("-------------------------------------------------");
            System.out.println("Mời nhập thông tin tài liệu thứ: "+(i+1));
            System.out.println("1. Sách");
            System.out.println("2. Tạp chí");
            System.out.println("3. Báo");
            System.out.println("4. Truyện");
            System.out.print("Chọn loại tài liệu muốn nhập: ");
            choose = Integer.parseInt(sc.nextLine());
        switch(choose){
                case 1: dstl[i]=new Sach();
                        dstl[i].Nhap();
                        break;
                case 2: dstl[i]=new TapChi();
                        dstl[i].Nhap();
                        break;
                 case 3: dstl[i]=new Bao();
                        dstl[i].Nhap();
                        break;
                 case 4: dstl[i] = new Truyen();
                        dstl[i].Nhap();
                        break;
                default: System.out.println("Giá trị vừa nhập không có trong danh mục");
            }
        }      
    }
    
    public void Xuat() {
        System.out.println("=============================================HIỂN THỊ DANH SÁCH TÀI LIỆU========================================================================");
        System.out.printf("|%-10s |%-20s |%-20s |%-30s |%-10s |%-20s |%-20s |%-20s |%-20s |","ID","NHÀ XUẤT BẢN","SỐ BẢN PHÁT HÀNH","TÊN TÁC GIẢ","SỐ TRANG","SỐ PHÁT HÀNH","THÁNG PHÁT HÀNH","NGÀY PHÁT HÀNH","SỐ CHƯƠNG");
        System.out.println("\n|-----------|---------------------|---------------------|-------------------------------|-----------|---------------------|---------------------|---------------------|---------------------|");
        for (int i=0;i<n;i++) {
            dstl[i].Xuat();
            System.out.println("\n|-----------|---------------------|---------------------|-------------------------------|-----------|---------------------|---------------------|---------------------|---------------------|");
        }     
    }
    
    public void Them() {
        System.out.println("========================================THÊM TÀI KIỆU =======================================");
        dstl = Arrays.copyOf(dstl, n+1);
        int   x ;
        do {
            System.out.println("1. Sách");
            System.out.println("2. Tạp chí");
            System.out.println("3. Báo");
            System.out.println("4. Truyện");
            System.out.print("Chọn tài liệu muốn thêm: ");
            x=Integer.parseInt(sc.nextLine());
            switch(x) {
                case 1:
                    dstl[n] = new Sach();
                    dstl[n].Nhap();
                    break;
                case 2: 
                    dstl[n] = new TapChi();
                    dstl[n].Nhap();
                    break;
                case 3:
                    dstl[n] = new Bao();
                    dstl[n].Nhap();
                    break;
                case 4: 
                    dstl[n] = new Truyen();
                    dstl[n].Nhap();
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
                    break;
            }
        } while (x<1 || x>4);
        n++;
    }
    
    public void Sua() {
        System.out.println("========================================SỬA THÔNG TIN CÁN BỘ=======================================");
        System.out.print("\n Nhập mã tài liệu cần sửa: ");
        String idtl = sc.nextLine();
        Sua(idtl);
    }
    
    public void Sua(String idtl) {
        boolean fix = false;
        for (int i=0;i<n;i++) {
            if (dstl[i].getMaTaiLieu().equalsIgnoreCase(idtl)) {
                fix = true;
                System.out.println("\n Đang sửa thông tin tài liệu có ID:  "+idtl);
                System.out.print("Nhập tên nhà xuất bản:  ");
                String nhaxuatban = sc.nextLine();
                dstl[i].setNhaXuatBan(nhaxuatban);
                
                System.out.print("Nhập số bản phát hành: ");
                int sobanphathanh = Integer.parseInt(sc.nextLine());
                dstl[i].setSoBanPhatHanh(sobanphathanh);
                        
                
                if (dstl[i] instanceof Sach) {
                    System.out.print("Nhập tên tác giả: ");
                    String tentacgia = sc.nextLine();
                    Sach x = (Sach) dstl[i];
                    x.setTenTacGia(tentacgia);
                    
                    System.out.print("Nhập số trang: ");
                    int sotrang = Integer.parseInt(sc.nextLine());
                    Sach y = (Sach) dstl[i];
                    y.setSoTrang(sotrang);
                }
                
                if (dstl[i] instanceof TapChi) {
                    System.out.print("Nhập số phát hành: ");
                    int sophathanh = Integer.parseInt(sc.nextLine());
                    TapChi x = (TapChi) dstl[i];
                    x.setSoPhatHanh(sophathanh);
                    
                    System.out.print("Nhập tháng phát hành: ");
                    int thangphathanh = Integer.parseInt(sc.nextLine());
                    TapChi y = (TapChi) dstl[i];
                    y.setThangPhatHanh(thangphathanh);
                }
                
                if (dstl[i] instanceof Bao) {
                    System.out.print("Nhập ngày phát hành: ");
                    int ngayphathanh = Integer.parseInt(sc.nextLine());
                    Bao x = (Bao) dstl[i];
                    x.setNgayPhatHanh(ngayphathanh);
                }
                
                if (dstl[i] instanceof Truyen) {
                    System.out.print("Nhập số chương: ");
                    int sochuong = Integer.parseInt(sc.nextLine());
                    Truyen x = (Truyen) dstl[i];
                    x.setSoChuong(sochuong);
                }
                break;
            }
            
        }
        if (fix == false) {
            System.out.println("Không tìm thấy tài liệu có ID:  "+idtl);
        }
    } 
    public void Xoa() { 
        System.out.println("========================================XÓA TÀI LIỆU=======================================");
        System.out.print("\n Nhập mã tài liệu cần xóa: ");
        String idtl = sc.nextLine();
        Xoa(idtl);
    }
    
    public void Xoa(String idtl) {
        boolean delete = false;
        for (int i=0;i<n;i++) {
            if (dstl[i].getMaTaiLieu().equalsIgnoreCase(idtl)) {
                for (int j=i;j<n-1;j++)
                    dstl[j]=dstl[j+1];
                dstl = Arrays.copyOf(dstl, n-1);
                n--;
                delete = true;
                break;
            }
        }
        if (delete == false)
                System.out.println("Không tìm thấy tài liệu có ID: "+idtl);
    }
    
    public void timKiem() {
        System.out.println("========================================TÌM KIẾM TÀI LIỆU=======================================");
        System.out.print("Nhập ID tài liệu cần tìm: ");
        String idtl=sc.nextLine();
        timKiem(idtl);
    }
    
    public void timKiem(String idtl) {
        boolean find =false;
        System.out.printf("|%-10s |%-20s |%-20s |%-30s |%-10s |%-20s |%-20s |%-20s |%-20s |","ID","NHÀ XUẤT BẢN","SỐ BẢN PHÁT HÀNH","TÊN TÁC GIẢ","SỐ TRANG","SỐ PHÁT HÀNH","THÁNG PHÁT HÀNH","NGÀY PHÁT HÀNH","SỐ CHƯƠNG");
        System.out.println("\n|-----------|---------------------|---------------------|-------------------------------|-----------|---------------------|---------------------|---------------------|---------------------|");
        for (int i=0;i<n;i++) {
            if (dstl[i].getMaTaiLieu().equalsIgnoreCase(idtl)) {
                find = true;
                dstl[i].Xuat();
            }
        }
        System.out.println("\n|-----------|---------------------|---------------------|-------------------------------|-----------|---------------------|---------------------|---------------------|---------------------|");
        if (find == false) {
            System.out.println("Không tìm thấy tài liệu có ID: "+idtl);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyTaiLieu a = new QuanLyTaiLieu();
        int select;
        do {
            Menu();
            System.out.println("Mời nhập chức năng thực hiện: ");
            select = Integer.parseInt(sc.nextLine());
            switch(select) {
                case 1: 
                    a. Nhap();
                    break;
                case 2:
                    a.Them();
                    break;
                case 3:
                    a. Sua();
                    break;
                case 4:
                    a. Xoa();
                    break;
                case 5:
                    a.timKiem();
                    break;
                case 6: 
                    a.Xuat();
                    break;
                case 0:
                    System.out.println("Thoát chương trình thành công");
                default: System.out.println("Chức năng vừa nhập không có trong menu"); 
                    break;
            }
            
        } while (select!=6);
    }
}


