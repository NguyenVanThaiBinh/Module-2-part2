public class ArithmeticException extends Throwable {
    public static void main(String[] args) {
        try{
           int data = 5/0;
        }
        catch(java.lang.ArithmeticException e){
            System.out.println(e);

        }

        System.out.println("Compile still countries!");
        //giúp chương trình không báo lỗi và vẫn chạy tiếp bình thường
    }
}
