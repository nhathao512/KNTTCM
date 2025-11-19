// Đề A1: Quản lý sinh viên
// Mô tả nghiệp vụ:
// Xây dựng chương trình quản lý danh sách sinh viên với thông tin: MSSV, Họ tên, Điểm TB, Năm sinh.
// Chức năng yêu cầu:

// Thêm sinh viên mới (kiểm tra MSSV không trùng)
// Hiển thị danh sách sinh viên
// Tìm sinh viên theo MSSV
// Tìm sinh viên có điểm TB cao nhất
// Lọc sinh viên có điểm TB >= 8.0
// Sắp xếp danh sách theo điểm TB giảm dần
// Tính điểm TB của cả lớp
// Xóa sinh viên theo MSSV
// Cập nhật điểm TB của sinh viên
// Thống kê số sinh viên theo xếp loại (Xuất sắc >=9, Giỏi >=8, Khá >=7, TB >=5, Yếu <5)

// Input mẫu: Thêm ít nhất 8 sinh viên, thực hiện đầy đủ các chức năng

public class Student{
  private String MSSV;
  private String Name;
  private Double DiemTB;
  private int NamSinh;
  
  public Student(String MSSV, String Name, Double DiemTB, int NamSinh){
    this.MSSV = MSSV;
    this.Name = Name;
    this.DiemTB = DiemTB;
    this.NamSinh = NamSinh;
  }
  
  public Student(){
    this.MSSV = "";
    this.Name = "";
    this.DiemTB = 0.0;
    this.NamSinh = 2004;
  }
  
  public String getMSSV(){
    return MSSV;
  }
  
  public String getName(){
    return Name;
  }
  
  public Double getDiemTB() {
    return DiemTB;
  }
  
  public int getNamSinh() {
    return NamSinh;
  }
  
  public void setMSSV(String MSSV){
    this.MSSV = MSSV;
  }
  
  public void setName(String Name){
    this.Name = Name;
  }
  
  public void setDiemTB(Double DiemTB){
    this.DiemTB = DiemTB;
  }
  
  public void setNamSinh(int NamSinh){
    this.NamSinh = NamSinh;
  }
  
  public String xepLoai(){
    if (DiemTB >= 9){
      return "Xuat sac";
    }
    else if (DiemTB >= 8){
      return "Gioi";
    }
    else if (DiemTB >= 7){
      return "Kha";
    }
    
    else if (DiemTB >= 5){
      return "Trung Binh";
    }
    else
    {
      return "Yeu";
    }
  }
  
  public String toString(){
     return String.format("MSSV: %s, Họ tên: %s, Điểm TB: %.2f, Năm sinh: %d", MSSV, Name, DiemTB, NamSinh);
  }
}









