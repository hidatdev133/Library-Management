package myproject;

import java.util.Scanner;

public class DiaChi {
	    private String soNha,xa, huyen, tinh;
	    static Scanner sc = new Scanner(System.in);

	    DiaChi() {
	    }

	    DiaChi(String soNha, String xa, String huyen, String tinh) {
	        this.soNha = soNha; 
	        this.xa = xa;
	        this.huyen = huyen;
	        this.tinh = tinh;
	    }

	    public void setHuyen(String huyen) {
	        this.huyen = huyen;
	    }

	    public String getHuyen() {
	        return huyen;
	    }

	    public void setSoNha(String soNha) {
	        this.soNha = soNha;
	    }

	    public String getSoNha() {
	        return soNha;
	    }


	    public void setTinh(String tinh) {
	        this.tinh = tinh;
	    }

	    public String getTinh() {
	        return tinh;
	    }

	    public void setXa(String xa) {
	        this.xa = xa;
	    }

	    public String getXa() {
	        return xa;
	    }

	    public void NhapDiaChi() {
	        System.out.print("Nhập số nhà: ");
	        soNha = sc.nextLine();
	        System.out.print("Nhập xã: ");
	        xa = sc.nextLine();
	        System.out.print("Nhập huyện: ");
	        huyen = sc.nextLine();
	        System.out.print("Nhập tỉnh: ");
	        tinh = sc.nextLine();
	    }

	    public String HienThiDiaChi() {
	        return "Số nhà: "+soNha+" ,xã: "+xa+" ,huyện: "+huyen+" ,tỉnh:"+tinh;
	    }
}


