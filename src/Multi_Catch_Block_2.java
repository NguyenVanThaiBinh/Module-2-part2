import java.lang.ArithmeticException;

public class Multi_Catch_Block_2 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
//        catch (java.lang.NullPointerException e){
//            System.out.println("AAAA");
//        }
        // thằng này phải nằm cuối cùng, dạng như default !
        catch (Exception e) {
            System.out.println("Chỉ cần có thằng này thì nó bắt lỗi hết!");
        }

        //câu lệnh vẫn tiếp tục thực hiện!
        System.out.println("rest of the code");
    }
}

