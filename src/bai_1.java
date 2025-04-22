import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        // %d: số nguyên
        // %f: số thực - mặc định là 6 số lẻ
        // %.3f định dạng 3 số lẻ
        // %s: chuỗi
//        scanner.nextLine() => nhận 1 dòng nhập từ bàn phím => trả ra dữ liệu string
//        scanner.nextInt() => nhận 1 số nguyên từ bàn phím => trả ra dữ liệu số nguyên

//        bài 1
//        int age = 20;
//        String name = "Lý Hồng Công";
//        System.out.println(" My age is: " + age + ", name is: " + name);

//        bài 2
//        Khai báo 2 biến name và age.
//        Nhập name và age từ bàn phím
//        Sử dụng 3 hàm trên để in ra màn hình:
//        My name is <name>, age = <age>
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name is: ");
        String name = scanner.nextLine();
        System.out.println("Your age is: ");
        int age = scanner.nextInt();
        System.out.println("My name is " + name + ", age = " + age);
        scanner.close();
    }
}
