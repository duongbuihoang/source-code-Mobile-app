public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public static final double LUONG_MAX = 50000;

    public NhanVien(String tenNhanVien, double luongCoBan, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double tinhLuong() {
        return luongCoBan * heSoLuong;
    }

    public boolean tangLuong(double tang) {
        double heSoMoi = heSoLuong + tang;
        if (luongCoBan * heSoMoi > LUONG_MAX) {
            System.out.println("Không thể tăng lương. Mức lương vượt quá giới hạn!");
            return false;
        } else {
            heSoLuong = heSoMoi;
            return true;
        }
    }

    public void inTTin() {
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Lương hiện tại: " + tinhLuong());
    }

    public static void main(String[] args) {
        NhanVien nv = new NhanVien("Nguyễn Văn A", 5000, 3);
        nv.inTTin();
        System.out.println("\nTăng lương 1.5:");
        nv.tangLuong(1.5);
        nv.inTTin();
    }
}
