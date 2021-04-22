import java.io.IOException;

public class Throws_Key_Word {
    public static void main(String[] args) {
        try{
            M m = new M();
            m.method();
        }
        // ở bài này, ngoại lệ đã được bắt!
        catch (Exception e){
            System.out.println("exception handled!");
        }
        System.out.println("Normal flow!");
    }

    static class M{
        void method() throws IOException{
            // dòng lệnh throw xảy ra khi có ngoại lệ thôi!
            throw new IOException("device error!");
        }
    }
}
