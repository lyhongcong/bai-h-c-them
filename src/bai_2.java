import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
//        int a = 6;
//        int b = 9;
//        int c = Math.min(6, 9);
//        System.out.println("Max = " + c);

        Scanner scanner = new Scanner(System.in);
        System.out.println("First number : " + Math.sqrt(49)); // pow(6, 2) -> 6 mũ 2 = 36 // sqrt(49) = 7
        int firstNumber = scanner.nextInt();
        System.out.println("Second number : ");
        int secondNumber = scanner.nextInt();
        System.out.println("Min = " + Math.min(firstNumber, secondNumber));
        scanner.close();
    }
}
