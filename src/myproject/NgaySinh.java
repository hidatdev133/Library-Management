package myproject;


import java.util.Scanner;

public class NgaySinh {
	    private int ngay;
	    private int thang;
	    private int nam;
	    static Scanner sc = new Scanner(System.in);

	    public NgaySinh() {
	    }

	    public NgaySinh(int ngay, int thang, int nam) {
	        this.ngay = ngay;
	        this.thang = thang;
	        this.nam = nam;
	    }

	    public void setNgaySinh(int ngay, int thang, int nam) {
	        this.ngay = ngay;
	        this.thang = thang;
	        this.nam = nam;
	    }

	    public int getngay() {
	        return ngay;
	    }

	    public void setngay(int ngay) {
	        while (true) {
                    System.out.print("Nhập ngày sinh: ");
                    ngay=Integer.parseInt(sc.nextLine());
                    if (ngay >= 1 && ngay <= 31)
                        break;
                }
                
	        this.ngay=ngay;
	    }

	    public int getthang() {
	        return thang;
	    }

	    public void setthang(int thang) {
                while (true) {
                    System.out.print("Nhập tháng sinh: ");
	            thang = Integer.parseInt(sc.nextLine());
	            if (thang >= 1 && thang <= 12) 
	                break;
                    }
                    this.thang=thang;
                
            }

	    public int getnam() {
	        return nam;
	    }

	    public void setnam(int nam) {
	        
	        while (true) {
                    System.out.print("Nhập năm sinh: ");
                
	            nam = Integer.parseInt(sc.nextLine());
	            if (nam >= 1875 && nam <= 2021)
	                break;
                }
                   this.nam=nam;
	    }

	    public void NhapNgaySinh() {
	        setngay(ngay);
	        setthang(thang);
	        setnam(nam);
	    }

	    public String HienThi() {
	        String ngay = this.ngay + "";
	        String thang = this.thang + "";
	        String nam = this.nam + "";
	        return ngay + "/" + thang + "/" + nam;
	    }
}



