import java.util.Scanner;

public class bai4_bt3_4 {
    public static void main(String[] args) {

//        Bài 3: Viết chương trình nhập vào bàn phím cạnh của một khối lập phương.
//        Tính và xuất ra thể tích của hình lập phương.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh hình lập phương: ");
        int canh = scanner.nextInt();
        double theTich = Math.pow(canh, 3);
        System.out.println("Thể tích = " + theTich);
        scanner.close();
    }
}
