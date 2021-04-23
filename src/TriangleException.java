import java.util.Scanner;

public class TriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input triangle:");
        int a = 0, b = 0, c = 0;
        try {

            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
            if (a < 0 || b < 0 || c < 0) {
                throw new Exception();
            } else if (a + b < c || a + c < b || b + c < a) {
                throw new Exception();
            } else
                System.out.println("Everything is OK !");
        } catch (Exception e) {
            System.out.println("can't  input that!");
        } finally {
            System.out.println("----");
            System.out.println("Code is flowing!");
            System.out.print(a);
            System.out.print(" " + b);
            System.out.println(" " + c);
        }


    }
}
