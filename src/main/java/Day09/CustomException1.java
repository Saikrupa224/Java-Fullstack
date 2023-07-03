package Day09;

public class CustomException1 {
    public static void main(String[] args) {
        try {
            int res = 100 / 0;
        } catch (ArithmeticException e) {
            try {
                throwCustomException(e);
            } catch (CustomException ex) {
                System.out.println("Caugth customexception:" + ex.getMessage());
            }
        }
    }

    public static void throwCustomException(ArithmeticException e) throws CustomException {
        throw new CustomException("CustomException occurred:" + e.getMessage());
    }
}