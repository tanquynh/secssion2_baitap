package RA_secssion2_baitap2;
import java.util.Scanner;
public class RA_secssion2_baitap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập cạnh dài");
         int Canhdai = sc.nextInt();
        System.out.print("Nhâ cạnh ngắn");
        int Canhngan = sc.nextInt();
        for(int i =1; i<= Canhngan; i++) {
            for(int j = 1; j <=Canhdai; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("Nhập cạnh góc vuông tam giác");
        int Canhdung = sc.nextInt();

        for(int k = 1; k <= Canhdung; k++) {
            for(int l = 1; l <= k ; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.print("Nhập cạnh góc vuông thứ hai tam giác");
        int Canhgocvuong = sc.nextInt();

        for(int k = 1; k <= Canhgocvuong; k++) {
            for(int l = k; l <= Canhgocvuong ; l++) {
                System.out.print("*");
            }
            System.out.println();
        }




    }
}
