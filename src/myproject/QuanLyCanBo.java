package myproject;

import java.util.Arrays;
import java.util.Scanner;

public class QuanLyCanBo {
    Scanner sc = new Scanner(System.in);
    CanBo dscb[];
    int n;
    
    public static void Menu() {
        System.out.println("\n---------------------MENU QUẢN LÍ CÁN BỘ---------------------");
        System.out.println("1. Nhập danh sách cán bộ");
        System.out.println("2. Thêm cán bộ");
        System.out.println("3. Chỉnh sửa thông tin cán bộ");
        System.out.println("4. Xóa cán bộ");
        System.out.println("5. Tìm kiếm thông tin cán bộ");
        System.out.println("6. Hiển thị danh sách cán bộ");
        System.out.println("0. Thoát");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Chọn các chức năng: ");
    }
    
    public void Nhap() {
        System.out.println("====================NHẬP THÔNG TIN CÁN BỘ===================");
        System.out.print("Mời nhập số lượng cán bộ: ");
        n= Integer.parseInt(sc.nextLine());
        dscb = new CanBo[n];    
        int choose;
        for (int i=0;i<n;i++) {
            System.out.println("-------------------------------------------------");
            System.out.println("Mời nhập thông tin cán bộ thứ: "+(i+1));
            System.out.println("1. Quản lý");
            System.out.println("2. Nhân viên");
            System.out.print("Chọn các bộ bạn muốn nhập: ");
            choose = Integer.parseInt(sc.nextLine());
        switch(choose){
                case 1: dscb[i]=new QuanLy();
                        dscb[i].Nhap();
                        break;
                case 2: dscb[i]=new NhanVien();
                        dscb[i].Nhap();
                        break;
                default: System.out.println("Giá trị vừa nhập không có trong danh mục");
            }
        }      
    }
    
    public void Xuat() {
        System.out.println("=============================================================================HIỂN THỊ DANH SÁCH CÁN BỘ===============================================");
        System.out.printf("|%-10s |%-30s |%-20s |%-10s |%-20s |%-20s |%-20s |%-20s |%-20s |","ID","HỌ TÊN"," NGÀY SINH","GIỚI  TÍNH","ĐỊA  CHỈ","SỐ NGÀY LÀM VIỆC","CHỨC VỤ","CÔNG VIỆC","LƯƠNG");
        System.out.println("\n|-----------|-------------------------------|---------------------|-----------|---------------------|---------------------|---------------------|---------------------|---------------------|");
        for (int i=0;i<n;i++) {
            dscb[i].Xuat();
                   System.out.println("\n|-----------|-------------------------------|---------------------|-----------|---------------------|---------------------|---------------------|---------------------|---------------------|");
        }
    }
    
    public void Them() {
        System.out.println("========================================THÊM THÔNG TIN CÁN BỘ=======================================");
        dscb = Arrays.copyOf(dscb, n+1);
        int   x ;
        do {
            System.out.println("1. Quản lý");
            System.out.println("2. Nhân viên");
            System.out.print("Chọn cán bộ muốn thêm: ");
            x=Integer.parseInt(sc.nextLine());
            switch(x) {
                case 1:
                    dscb[n] = new QuanLy();
                    dscb[n].Nhap();
                    break;
                case 2: 
                    dscb[n] = new NhanVien();
                    dscb[n].Nhap();
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
                    break;
            }
        } while (x<1 || x>2);
        n++;
    }
    
    public void Sua() {
        System.out.println("========================================SỬA THÔNG TIN CÁN BỘ=======================================");
        System.out.print("\n Nhập mã cán bộ cần sửa: ");
        String idcb = sc.nextLine();
        Sua(idcb);
    }
    
    public void Sua(String idcb) {
        boolean fix = false;
        for (int i=0;i<n;i++) {
            if (dscb[i].getIdCanBo().equalsIgnoreCase(idcb)) {
                fix = true;
                System.out.println("\nĐang sửa thông tin cán bộ có ID: "+idcb);
                
                System.out.print("Nhập họ tên cán bộ: ");
                String hoten = sc.nextLine();
                dscb[i].setHoTen(hoten);
                
                System.out.print("Nhập ngày sinh:  ");
                String namsinh = sc.nextLine();
                dscb[i].setNamSinh(namsinh);
                
                System.out.println("Giới tính là NAM hoặc NỮ");
                System.out.print("Nhập giới tính: ");
                String gioitinh = sc.nextLine();
                dscb[i].setGioiTinh(gioitinh);
                        
                System.out.print("Nhập địa chỉ: ");
                String diachi = sc.nextLine();
                dscb[i].setDiaChi(diachi);
                
                System.out.print("Nhập số ngày làm việc: ");
                int songaylamviec = Integer.parseInt(sc.nextLine());
                dscb[i].setSoNgayLamViec(songaylamviec);
                
                if (dscb[i] instanceof QuanLy) {
                    System.out.print("Nhập chức vụ quản lý: ");
                    String chucvu = sc.nextLine();
                    QuanLy x = (QuanLy) dscb[i];
                    x.setChucVu(chucvu);
                }
                
                if (dscb[i] instanceof NhanVien) {
                    System.out.print("Nhập công việc nhân viên:");
                    String congviec = sc.nextLine();
                    NhanVien x = (NhanVien) dscb[i];
                    x.setCongViec(congviec);
                }
                
                break;
            }
            
        }
        if (fix == false) 
            System.out.println("Không tìm thấy cán bộ có ID:  "+(idcb));
        
    } 
    public void Xoa() { 
        System.out.println("========================================XÓA THÔNG TIN CÁN BỘ=======================================");
        System.out.print("\n Nhập mã cán bộ cần xóa: ");
        String idcb = sc.nextLine();
        Xoa(idcb);
    }
    
    public void Xoa(String idcb) {
        boolean delete = false;
        for (int i=0;i<n;i++) {
            if (dscb[i].getIdCanBo().equalsIgnoreCase(idcb)) {
                for (int j=i;j<n-1;j++)
                    dscb[j]=dscb[j+1];
                dscb = Arrays.copyOf(dscb, n-1);
                n--;
                delete = true;
                break;
            }
        }
        if (delete == false)
                System.out.println("Không tìm thấy cán bộ có ID: "+idcb);
    }
    
    public void timKiem() {
        System.out.println("========================================TÌM KIẾM CÁN BỘ=======================================");
        System.out.print("Nhập mã cán bộ cần tìm: ");
        String idcb=sc.nextLine();
        timKiem(idcb);
    }
    
    public void timKiem(String idcb) {
        boolean find =false;
        System.out.printf("|%-10s |%-30s |%-20s |%-10s |%-20s |%-20s |%-20s |%-20s |%-20s |","ID","HỌ TÊN"," NGÀY SINH","GIỚI  TÍNH","ĐỊA  CHỈ","SỐ NGÀY LÀM VIỆC","CHỨC VỤ","CÔNG VIỆC","LƯƠNG");
        System.out.println("\n|-----------|-------------------------------|---------------------|-----------|---------------------|---------------------|---------------------|---------------------|---------------------|");
        for (int i=0;i<n;i++) {
            if (dscb[i].getIdCanBo().equalsIgnoreCase(idcb)) {
                find = true;
                dscb[i].Xuat();
            }
        }
        System.out.println("\n|-----------|-------------------------------|---------------------|-----------|---------------------|---------------------|---------------------|---------------------|---------------------|");
        if (find == false) {
            System.out.println("Không tìm thấy nhân viên có tên: "+idcb);
        }
    }
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyCanBo a = new QuanLyCanBo();
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

