package assignment2;

import java.util.Scanner;

public class Part1 {
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

        System.out.print("Nhap index: ");
        int index = sc.nextInt(); sc.nextLine();

        if (index < 0 || index >= n){
            System.out.println("Khong hop le");
            return;
        }

        System.out.print("Nhap X: ");
        int valueX = sc.nextInt(); sc.nextLine();

        if(index == n - 1){
            arr[n-1] = valueX;
        }

        for (int i = arr.length-1; i >= 0 ; i--) {
            arr[i] = arr[i-1];
            if(i-1 == index){
                break;
            }
        }
        arr[index] = valueX;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
