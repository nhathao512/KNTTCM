import java.util.*;
public class QuanLySV{
  private ArrayList<Student> Ds_sinhvien;
  
  public QuanLySV(){
    Ds_sinhvien = new ArrayList<>();
  }
    
  //Them SV
  public Boolean themSV(String MSSV, String Name, Double DiemTB, int NamSinh){
    for(Student sv : Ds_sinhvien){
      if(sv.getMSSV().equals(MSSV))
      {
        System.out.println("Student da ton tai");
        return false;
      }
    }
    Student newStudent = new Student(MSSV, Name, DiemTB, NamSinh);
    Ds_sinhvien.add(newStudent);
    System.out.println("Da them Student");
    return true;
  }
  
  
  //Danh sach sv
  public void showListSV(){
    if(Ds_sinhvien.isEmpty()){
      System.out.println("Danh sach trong");
      return;
    }
    
    for (int i = 0; i < Ds_sinhvien.size(); i++){
      System.out.println((i+1) + "." +  Ds_sinhvien.get(i));
    }
  }

  //Tim sv
  public Student timSV(String MSSV){
    for(Student sv : Ds_sinhvien){
      if(sv.getMSSV().equals(MSSV)){
        return sv;
      }
    }
    return null;
  }
  
}