public class Main {
    public static void main(String[] args) {
        QuanLySV ql = new QuanLySV();
        
        // Thêm 8 sinh viên mẫu
        System.out.println("=== THÊM SINH VIÊN ===");
        ql.themSV("SV001", "Nguyễn Văn A", 8.5, 2003);
        ql.themSV("SV002", "Trần Thị B", 9.2, 2003);
        ql.themSV("SV003", "Lê Văn C", 7.8, 2004);
        ql.themSV("SV004", "Phạm Thị D", 6.5, 2003);
        ql.themSV("SV005", "Hoàng Văn E", 9.5, 2004);
        ql.themSV("SV006", "Vũ Thị F", 8.2, 2003);
        ql.themSV("SV007", "Đỗ Văn G", 4.5, 2004);
        ql.themSV("SV008", "Bùi Thị H", 7.2, 2003);
        
        // Thử thêm trùng MSSV
        System.out.println("\n=== THỬ THÊM MSSV TRÙNG ===");
        ql.themSV("SV001", "Nguyễn Văn A2", 8.0, 2003);
        
        // Hiển thị danh sách
        ql.showListSV();

        // Tìm sinh viên theo MSSV
        System.out.println("=== TÌM SINH VIÊN THEO MSSV ===");
        Student sv = ql.timSV("SV003");
        if (sv != null) {
            System.out.println("Tìm thấy: " + sv);
        }
        
        // // Tìm sinh viên có điểm cao nhất
        // System.out.println("\n=== SINH VIÊN ĐIỂM CAO NHẤT ===");
        // Student svGioi = ql.timDiemCaoNhat();
        // if (svGioi != null) {
        //     System.out.println(svGioi);
        // }
        
        // // Lọc sinh viên điểm >= 8
        // System.out.println("\n=== SINH VIÊN CÓ ĐIỂM TB >= 8.0 ===");
        // ArrayList<SinhVien> dsGioi = ql.locDiemTren8();
        // for (SinhVien s : dsGioi) {
        //     System.out.println(s);
        // }
        
        // // Sắp xếp theo điểm
        // System.out.println("\n=== SẮP XẾP THEO ĐIỂM ===");
        // ql.sapXepTheoDiem();
        // ql.hienThiDanhSach();
        
        // // Tính điểm TB lớp
        // System.out.println("\n=== ĐIỂM TRUNG BÌNH CỦA LỚP ===");
        // double diemTBLop = ql.tinhDiemTBLop();
        // System.out.printf("Điểm TB lớp: %.2f\n", diemTBLop);
        
        // // Xóa sinh viên
        // System.out.println("\n=== XÓA SINH VIÊN ===");
        // ql.xoaSinhVien("SV007");
        // ql.hienThiDanhSach();
        
        // // Cập nhật điểm
        // System.out.println("\n=== CẬP NHẬT ĐIỂM ===");
        // ql.capNhatDiem("SV004", 7.5);
        // ql.hienThiDanhSach();
        
        // // Thống kê xếp loại
        // ql.thongKeXepLoai();
    }
}