public class bai2chap4 {
    package company;

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

        public boolean tangLuong(double soLuongTang) {
            if ((heSoLuong + soLuongTang) * luongCoBan <= LUONG_MAX) {
                heSoLuong += soLuongTang;
                return true;
            }
            return false;
        }

        public double tinhLuong() {
            return heSoLuong * luongCoBan;
        }

        public void inTTin() {
            System.out.println("Tên nhân viên: " + tenNhanVien);
            System.out.println("Lương cơ bản: " + luongCoBan);
            System.out.println("Hệ số lương: " + heSoLuong);
            System.out.println("Lương hiện tại: " + tinhLuong());
        }
    }

    public class TestNV {
        public static void main(String[] args) {
            NhanVien nv1 = new NhanVien("Nguyễn Văn A", 5000, 4.0);
            NhanVien nv2 = new NhanVien("Trần Thị B", 4500, 3.5);

            System.out.println("Thông tin nhân viên 1:");
            nv1.inTTin();
            System.out.println();

            System.out.println("Thông tin nhân viên 2:");
            nv2.inTTin();
            System.out.println();

            System.out.println("Tăng lương cho nhân viên 1: ");
            if (nv1.tangLuong(0.5)) {
                System.out.println("Tăng lương thành công.");
            } else {
                System.out.println("Không thể tăng lương do vượt mức.");
            }
            nv1.inTTin();

            System.out.println("\nTăng lương cho nhân viên 2: ");
            if (nv2.tangLuong(1.0)) {
                System.out.println("Tăng lương thành công.");
            } else {
                System.out.println("Không thể tăng lương do vượt mức.");
            }
            nv2.inTTin();
        }
    }
}
