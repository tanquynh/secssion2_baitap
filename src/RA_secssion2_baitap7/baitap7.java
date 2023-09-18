package RA_secssion2_baitap7;

public class baitap7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Chọn loại hình:");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Hình tam giác");
            System.out.println("3. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập chiều dài: ");
                    double chieuDai = scanner.nextDouble();
                    System.out.print("Nhập chiều rộng: ");
                    double chieuRong = scanner.nextDouble();

                    double chuViHCN = 2 * (chieuDai + chieuRong);
                    double dienTichHCN = chieuDai * chieuRong;

                    System.out.println("Chu vi của hình chữ nhật là: " + chuViHCN);
                    System.out.println("Diện tích của hình chữ nhật là: " + dienTichHCN);
                    break;

                case 2:
                    System.out.print("Nhập độ dài cạnh a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Nhập độ dài cạnh b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Nhập độ dài cạnh c: ");
                    double c = scanner.nextDouble();

                    double chuViTamGiac = a + b + c;
                    double p = chuViTamGiac / 2;
                    double dienTichTamGiac = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                    System.out.println("Chu vi của hình tam giác là: " + chuViTamGiac);
                    System.out.println("Diện tích của hình tam giác là: " + dienTichTamGiac);
                    break;

                case 3:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }
}
