import java.util.*;

public class Cau1 {
    // Phương thức tính tổng bằng đệ quy
    public static int tinhTongDeQuy(int n) {
        if (n == 1) {
            return 1;
        }
        return n + tinhTongDeQuy(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        // a) Nhập và kiểm tra n
        do {
            System.out.print("Nhap so nguyen duong n: ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("n phai la so nguyen duong! Vui long nhap lai.");
            }
        } while (n <= 0);
        
        // b) Tạo tập S và kiểm tra
        Set<Integer> S = new HashSet<>();
        boolean hopLe = true;
        
        for (int i = 1; i <= n; i++) {
            if (i > 0) {
                S.add(i);
            } else {
                hopLe = false;
                System.out.println("Phat hien phan tu khong hop le: " + i);
                break;
            }
        }
        
        if (hopLe) {
            System.out.println("Tap S: " + S);
            
            // c) Tính tổng bằng vòng lặp
            int tongVongLap = 0;
            for (int num : S) {
                tongVongLap += num;
            }
            System.out.println("Tong cua tap S (vong lap): " + tongVongLap);
            
            // d) Tính tổng bằng đệ quy
            int tongDeQuy = tinhTongDeQuy(n);
            System.out.println("Tong cua tap S (de quy): " + tongDeQuy);
        }
        
        sc.close();
    }
}