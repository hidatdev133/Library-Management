package myproject;
import java.util.Scanner;

public class HoVaTen {
	    private String Ho, tenLot, Ten;
	    static Scanner sc = new Scanner(System.in);

	    HoVaTen() {
	    }

	    HoVaTen(String Ho, String Ten, String tenLot) {
	        this.Ho = Ho;
	        this.Ten = Ten;
                this.tenLot=tenLot;
	    }

	    public void setHo(String ho) {
	        this.Ho = ho;
	    }

	    public String getHo() {
	        return Ho;
	    }

	    public void setTen(String ten) {
	        this.Ten = ten;
	    }

	    public String getTen() {
	        return Ten;
	    }

	    void NhapHoTen() {
	        System.out.print("Nhập họ: ");
	        Ho = sc.nextLine();
	        System.out.print("Nhập tên lót: ");
                tenLot=sc.nextLine();
                System.out.print("Nhập tên: ");
	        Ten = sc.nextLine();
	    }

	    String HienThi_HoVaTen() {
	        return "Họ tên: "+Ho +" "+tenLot+" "+Ten;
	    }

}

