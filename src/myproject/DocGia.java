package myproject;

import java.util.Scanner;

public class DocGia {
    int ID;
    HoVaTen hoten = new HoVaTen();
    DiaChi diachi = new DiaChi();
    NgaySinh ngaysinh = new NgaySinh();
    Sach sach = new Sach();
    Bao bao = new Bao();
    TapChi tapchi = new TapChi();
    Truyen truyen = new Truyen();
    PhieuMuon phieumuon = new PhieuMuon();
    PhieuTra phieutra = new PhieuTra();
    HoaDon hoadon = new HoaDon();
    Scanner sc = new Scanner(System.in);

    public DocGia() {
    }

    public DocGia(int ID, HoVaTen hoten, DiaChi diachi , NgaySinh ngaysinh, Sach sach, Bao bao, TapChi tapchi, Truyen truyen,
            PhieuMuon phieumuon, PhieuTra phieutra, HoaDon hoadon) {
        this.ID = ID;
        this.hoten = hoten;
        this.diachi=diachi;
        this.ngaysinh=ngaysinh;
        this.sach = sach;
        this.bao=bao;
        this.tapchi = tapchi;
        this.truyen = truyen;
        this.phieumuon = phieumuon;
        this.phieutra = phieutra;
        this.hoadon = hoadon;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public HoVaTen getHoten() {
        return hoten;
    }

    public void setHoten(HoVaTen hoten) {
        this.hoten = hoten;
    }

    public DiaChi getDiachi() {
        return diachi;
    }

    public void setDiachi(DiaChi diachi) {
        this.diachi = diachi;
    }

    public NgaySinh getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(NgaySinh ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public Sach getSach() {
        return sach;
    }

    public void setSach(Sach sach) {
        this.sach = sach;
    }

    public Bao getBao() {
        return bao;
    }

    public void setBao(Bao bao) {
        this.bao = bao;
    }

    public TapChi getTapchi() {
        return tapchi;
    }

    public void setTapchi(TapChi tapchi) {
        this.tapchi = tapchi;
    }

    public Truyen getTruyen() {
        return truyen;
    }

    public void setTruyen(Truyen truyen) {
        this.truyen = truyen;
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

    public HoaDon getHoadon() {
        return hoadon;
    }

    public void setHoadon(HoaDon hoadon) {
        this.hoadon = hoadon;
    }
    
    public void Nhap() {
        System.out.print("Nhập ID đọc giả: ");
        ID = Integer.parseInt(sc.nextLine());
        
        hoten.NhapHoTen();
        
        diachi.NhapDiaChi();
        
        ngaysinh.NhapNgaySinh();
        
        hoadon.Nhap();
        
        phieumuon.Nhap();
        
        phieutra.Nhap();
        
        
    }
    
    public void DanhSachDocGia() {
        System.out.printf("|%-10s |%-40s |%-40s |%-40s |%-40s|", ID, hoten.HienThi_HoVaTen(),
	ngaysinh.HienThi(),diachi.HienThiDiaChi(), kiemTraSoTienDaDong());
    }
    
    /*
    ID:
    họ  và tên:
    địa chỉ
    ngày sinh
    phiếu mượn
    phiếu  trả
    */
    
    public void xemPhieuMuon() {
        System.out.printf("|%-10s |%-20s |%-10s |%-10s |%-43s ",getID(), hoten.HienThi_HoVaTen(), 
                phieumuon.getNgayMuon(), phieumuon.getSoSachMuon(), phieumuon.getTrangThaiSachMuon());
    }
    
    public void xemPhieuTra() {
        System.out.printf("|%-10s |%-20s |%-10s |%-20s |%-43s ",getID(), hoten.HienThi_HoVaTen(), 
                phieutra.getNgayTra(), phieutra.getSoSachTra(), phieutra.getTrangThaiSachTra());
    }
    
    public void Xuat() {
        System.out.printf("|%-5s |%-40s |%-30s |%-40s |%-80s |%-80s |%-20s|",getID(), hoten.HienThi_HoVaTen(), ngaysinh.HienThi(), diachi.HienThiDiaChi(), phieumuon.toString(),phieutra.toString(),kiemTraSoTienDaDong());
    }
    
    String kiemTraSoTienDaDong() {
        int tongSoTien=0;
        int thoiGianMuon = phieutra.getNgayTra() - phieumuon.getNgayMuon();
        if (thoiGianMuon >= 0 && phieutra.getSoSachTra() - phieumuon.getSoSachMuon() >=0)
                System.out.println("|Đọc giả đã trả đúng thời hạn không cần trả thêm phí");
        else if (thoiGianMuon >= 0 && phieutra.getSoSachTra() - phieumuon.getSoSachMuon() <0)
                System.out.println("|Đọc giả đã trả không đủ số lượng tài liệu");
        else {
            System.out.println("|Đọc giả đã trả sai thời hạn "+Math.abs(thoiGianMuon)+" ngày. Đọc giả phải trả thêm "+ Math.abs(thoiGianMuon*hoadon.soTienMoiNgay)+" VND");
               tongSoTien+=thoiGianMuon*hoadon.soTienMoiNgay;
        }
        int phiBoithuong;
        
        if (phieumuon.getTrangThaiSachMuon().equalsIgnoreCase("moi") && phieutra.getTrangThaiSachTra().equalsIgnoreCase("moi")) {
            phiBoithuong=0;
            System.out.println("|Phí bồi thường tài liệu: "+phiBoithuong+ " VND");
            tongSoTien+=phiBoithuong;
        }
        
        else if (phieumuon.getTrangThaiSachMuon().equalsIgnoreCase("moi") && phieutra.getTrangThaiSachTra().equalsIgnoreCase("rach nhe")) {
            phiBoithuong=50000;
            System.out.println("|Phí bồi thường tài liệu: "+phiBoithuong+ " VND");
            tongSoTien+=phiBoithuong;
        }
        
        else if (phieumuon.getTrangThaiSachMuon().equalsIgnoreCase("moi") && phieutra.getTrangThaiSachTra().equalsIgnoreCase("rach nang")) {
            phiBoithuong=100000;
            System.out.println("|Phí bồi thường tài liệu: "+phiBoithuong+ " VND");
            tongSoTien+=phiBoithuong;
        }
            
        else if (phieumuon.getTrangThaiSachMuon().equalsIgnoreCase("rach nhe") && phieutra.getTrangThaiSachTra().equalsIgnoreCase("rach nhe")) {
            phiBoithuong=0;
            System.out.println("|Phí bồi thường tài liệu: "+phiBoithuong+ " VND");
            tongSoTien+=phiBoithuong;
        }
        
        else if (phieumuon.getTrangThaiSachMuon().equalsIgnoreCase("rach nhe") && phieutra.getTrangThaiSachTra().equalsIgnoreCase("rach nang")) {
            phiBoithuong=50000;
            System.out.println("|Phí bồi thường tài liệu: "+phiBoithuong+ " VND");
            tongSoTien+=phiBoithuong;
        }
        
        else if (phieumuon.getTrangThaiSachMuon().equalsIgnoreCase("rach nang") && phieutra.getTrangThaiSachTra().equalsIgnoreCase("rach nang")) {
            phiBoithuong=0;
            System.out.println("|Phí bồi thường tài liệu: "+phiBoithuong+ " VND");
            tongSoTien+=phiBoithuong;
        }
        if (tongSoTien - hoadon.getSoTienDaDong() > 0) 
            return "Số tiền còn thiếu:  "+Math.abs(tongSoTien - hoadon.getSoTienDaDong())+ " VND";
        else if (tongSoTien- hoadon.getSoTienDaDong()<0)
            return "Số tiền còn thừa: " +Math.abs(tongSoTien - hoadon.getSoTienDaDong()) + " VND";
        else 
            return "Đã đóng đầy đủ";
    }
}
