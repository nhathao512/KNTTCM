import java.util.*;

public class Cau3 {
    // Phương thức Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi arr[j] và arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    // Phương thức tính tổng mảng
    public static int tinhTong(int[] arr) {
        int tong = 0;
        for (int num : arr) {
            tong += num;
        }
        return tong;
    }
    
    // Phương thức in mảng
    public static void inMang(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        // a) Kiểm tra n là số nguyên dương
        do {
            System.out.print("Nhap so phan tu cua mang (n): ");
            n = sc.nextInt();
            if (n <= 0) {
                System.out.println("n phai la so nguyen duong! Vui long nhap lai.");
            }
        } while (n <= 0);
        
        // b) Nhập và kiểm tra các phần tử mảng
        int[] arr = new int[n];
        boolean hopLe = false;
        
        while (!hopLe) {
            hopLe = true;
            System.out.println("Nhap " + n + " phan tu cua mang:");
            
            for (int i = 0; i < n; i++) {
                System.out.print("Phan tu thu " + (i + 1) + ": ");
                arr[i] = sc.nextInt();
                
                if (arr[i] <= 0) {
                    System.out.println("Phat hien phan tu khong hop le: " + arr[i]);
                    System.out.println("Tat ca cac phan tu phai la so nguyen duong!");
                    hopLe = false;
                    break;
                }
            }
        }
        
        System.out.println("\nMang ban dau:");
        inMang(arr);
        
        // c) Sắp xếp mảng bằng Bubble Sort
        bubbleSort(arr);
        System.out.println("\nMang sau khi sap xep tang dan (Bubble Sort):");
        inMang(arr);
        
        // d) Tính tổng các phần tử
        int tong = tinhTong(arr);
        System.out.println("\nTong cac phan tu trong mang: " + tong);
        
        sc.close();
    }
}