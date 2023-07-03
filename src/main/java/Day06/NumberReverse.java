package Day06;

public class NumberReverse {
    int reverse =0;
    public int NumberReverse(int number) {

        while (number != 0) {
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        NumberReverse nr= new NumberReverse();
        System.out.println("The reversed number is "+nr.NumberReverse(120469));
    }
}
