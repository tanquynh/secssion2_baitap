package RA_secssion2_baitap5;

public class baitap5 {
    public static void main(String[] args) {
        int N =1;
        int count = 0;
        while(count <1) {
            if( N % 5 ==0 && N% 7 == 0 && N % 11 == 0) {
                System.out.print("Số nguyên dương nhỏ nhất chia hết cho 5, 7, 11 là : " + N);
                        count =1;
            } N++;
        }

    }
}
