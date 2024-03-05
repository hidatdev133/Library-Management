package myproject;

import java.util.Scanner;

public class QuanLyThuVien {
     static Scanner sc = new Scanner(System.in);    
     public static void main(String[] args) {
       function();
    }
    static void Menu() {
	                System.out.println("=================================MENU QUẢN LÝ THƯ VIỆN=================================");
	                System.out.println("|\t1. Nhập thông tin cán bộ                                                      |");
                        System.out.println("|\t2. Thêm cán bộ                                                                |");
                        System.out.println("|\t3. Chỉnh sửa thông tin cán bộ                                                 |");
                        System.out.println("|\t4. Xóa cán bộ                                                                 |");
                        System.out.println("|\t5. Tìm kiếm thông tin cán bộ                                                  |");
                        System.out.println("|\t6. Hiển thị danh sách cán bộ                                                  |");
                        System.out.println("|\t7. Nhập tài liệu                                                              |");
                        System.out.println("|\t8. Thêm tài liệu                                                              |");
                        System.out.println("|\t9. Chỉnh sửa tài liệu                                                         |");
                        System.out.println("|\t10. Xóa tài liệu                                                              |");
                        System.out.println("|\t11. Tìm kiếm tài liệu                                                         |");
                        System.out.println("|\t12. Hiển thị danh sách tài liệu                                               |");
                        System.out.println("|\t13. Nhập thông tin đọc giả                                                    |");	               
	                System.out.println("|\t14. Xem hoá đơn                                                               |");
	                System.out.println("|\t15. Tìm kiếm đọc giả theo ID                                                  |");
	                System.out.println("|\t0. Thoát                                                                      |");
	                System.out.println("========================================================================================");
                        
      }
      
      static void function() {
          int choose,n;
          QuanLyCanBo qlcb = new  QuanLyCanBo();
          QuanLyTaiLieu qltl = new QuanLyTaiLieu();
          DocGia dg[] = new DocGia[100];
          do {
              Menu();
              System.out.print("Hãy chọn chức năng bạn muốn thực hiện: ");
              choose = Integer.parseInt(sc.nextLine());
              switch(choose) {
                case 1: 
                    qlcb.Nhap();
                    break;
                case 2:
                    qlcb.Them();
                    break;
                case 3:
                    qlcb.Sua();
                    break;
                case 4:
                    qlcb.Xoa();
                    break;
                case 5:
                    qlcb.timKiem();
                    break;
                case 6:
                    qlcb.Xuat();
                    break;
                case 7:
                    qltl.Nhap();
                    break;
                case 8:
                    qltl.Them();
                    break;
                case 9:
                    qltl.Sua();
                    break;
                case 10:
                    qltl.Xoa();
                    break;
                case 11:
                    qltl.timKiem();
                    break;
                case 12:
                    qltl.Xuat();
                    break;
                case 13:
                    System.out.print("Nhập số lượng đọc giả: ");
                    n =Integer.parseInt(sc.nextLine());
                    dg = new DocGia[n];
                    for (int i=0;i<n;i++) {
                        System.out.println("Nhập thông tin đọc giả thứ: "+(i+1));
                        dg[i] = new DocGia();
                        dg[i].Nhap();
                    }
                    break;
                case 14:
                    System.out.println("|========================================================= DANH SACH ĐỌC GIẢ ===============================================================|\");");
                    System.out.printf("|%-10s |%-40s |%-40s |%-40s |%-40s|","ID","HỌ TÊN","NGÀY SINH","ĐỊA CHỈ","HÓA  ĐƠN");
                    System.out.println("\n|-----------|-----------------------------------------|-----------------------------------------|-----------------------------------------|----------------------------------------|");
	            for (int i = 0; i < dg.length; i++) {
	                dg[i].DanhSachDocGia();
                        System.out.println("\n|-----------|-----------------------------------------|-----------------------------------------|-----------------------------------------|----------------------------------------|");
	               }
                    break;
                case 15:
                    System.out.print("Nhập ID: ");
                    int id=sc.nextInt();
                    for(int i=0;i<dg.length;i++) {
                        if(dg[i].ID == id) {
                            System.out.println("|======================================THÔNG TIN ĐỌC GIẢ CẦN TÌM====================================|");
                            System.out.printf("|%-5s |%-40s |%-30s |%-40s |%-80s |%-80s |%-20s |","ID","HỌ TÊN","NGÀY SINH","ĐỊA CHỈ","PHIẾU MƯỢN","PHIẾU TRẢ","HÓA  ĐƠN");
                            System.out.println("\n|------|-----------------------------------------|-------------------------------|-----------------------------------------|---------------------------------------------------------------------------------|---------------------------------------------------------------------------------|---------------------------------|");
                            dg[i].Xuat();
                            System.out.println("\n|------|-----------------------------------------|-------------------------------|-----------------------------------------|---------------------------------------------------------------------------------|---------------------------------------------------------------------------------|---------------------------------|");
                        }
                        else System.out.println("Không tìm thấy đọc giả có ID: "+id);
                    }
                        break;
                case 0: System.out.println("Thoát chương trình thành công");
                        break;
                default: System.out.println("Giá trị vừa nhập không có trong danh mục ");
                }
            } while(choose!=15);
    }
}
