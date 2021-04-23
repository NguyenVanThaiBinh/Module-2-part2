public class ThrowException {
    public static class Fraction {
        private int numberator, denominator;

        public Fraction(int n, int d) throws Exception {
            if (d == 0) throw new Exception();
            numberator = n;
            denominator = d;
        }
    }

    public static void main(String[] args) {
        try{
            Fraction f = new Fraction(2,0);
        }
        catch (Exception e){

         e.getMessage();
        }
    }
}
