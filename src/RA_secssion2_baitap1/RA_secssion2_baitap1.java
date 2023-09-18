package RA_secssion2_baitap1;
import java.util.Scanner;
public class RA_secssion2_baitap1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Nhập số đầu");
       int number1 = sc.nextInt();
        System.out.print("Nhập số cuối");
        int number2 = sc.nextInt();
        int sumTotal = 0;
        for( int i = number1; i <= number2; i++) {
            if(i % 2 == 0) {
                sumTotal += i;
            }
        }
        System.out.println("Tổng các số chẵn trong dãy là : " + sumTotal);
    }


}
