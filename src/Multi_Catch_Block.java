public class Multi_Catch_Block {
    public static void main(String[] args) {

        try {
            int a[] = new int[5];
           // Nếu có 2 ngoại lệ thì chỉ hiện thị ngoại lệ nào trước thôi
            System.out.println(a[10]);
            a[5] = 30 / 0;
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }

        catch (java.lang.ArithmeticException e) {
            System.out.println("Can't not divide by 0");
        }

        catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        // Câu lệnh cuối cùng vẫn được thực thi
        System.out.println("rest of the code");
    }
}
