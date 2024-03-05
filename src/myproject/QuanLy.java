package myproject;
public class QuanLy extends CanBo implements ThuongThem{
    private String chucVu;

    public QuanLy() {
    }
    
    
    public QuanLy(String chucVu, String idCanBo, String hoTen, String namSinh, String gioiTinh, String diaChi, int soNgayLamViec) {
        super(idCanBo, hoTen, namSinh, gioiTinh, diaChi, soNgayLamViec);
        this.chucVu = chucVu;
    }

    public QuanLy(String chucVu) {
        this.chucVu = chucVu;
    }


    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
   
    
    public void Nhap() {
        super.Nhap();
        System.out.print("Nhập chức vụ quản lý: ");
        chucVu=sc.nextLine();
    }
    
    @Override
    public int tinhLuong() {
        return super.tinhLuong()+thuongChoQuanLy();
    }
    
    @Override
    public  int thuongChoQuanLy() {
        return 100000*this.getSoNgayLamViec();
    }
    
    public void Xuat() {
        super.Xuat();
        System.out.printf("|%-20s |%-20s |%-20s |",chucVu,"",tinhLuong());
    }

    

    
}
