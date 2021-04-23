import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static int[] createRandom() {
        Random rd = new Random();
        int[] arr = new int[100];
        System.out.println("Input arr");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = createRandom();

        for (int x : arr) {
            System.out.print(x + " ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("------------");
        System.out.println("Input key: ");
        int key = scanner.nextInt();

        try{

            System.out.println("Giá trị của phần tử có chỉ số "+key+" là: "+arr[key]);
        }
        catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Chỉ số vượt quá giới hạn của mảng!");
        }
    }
}
