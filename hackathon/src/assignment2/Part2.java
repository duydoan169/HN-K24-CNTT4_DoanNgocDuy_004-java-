package assignment2;

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap kich thuoc mang: ");
        int n = sc.nextInt(); sc.nextLine();

        if (n <= 2){
            System.out.println("Khong hop le");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ": ");
            arr[i] = sc.nextInt(); sc.nextLine();
        }
        int max = arr[0];
        int max2nd = -99999;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max2nd = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > max2nd) {
                max2nd = arr[i];
            }
        }

        if (max != max2nd){
            System.out.printf("Max: %d, Second: %d", max, max2nd);
        }else {
            System.out.println("Không tồn tại số lớn thứ nhì");
        }
    }
}
