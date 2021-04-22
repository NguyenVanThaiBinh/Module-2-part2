import java.util.Scanner;

public class TestException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a:");
        int a = scanner.nextInt();
        System.out.println("input b:");
        int b = scanner.nextInt();
        int result = a / b;
        System.out.printf("%d / %d = %d",a,b,result);
    }
}
