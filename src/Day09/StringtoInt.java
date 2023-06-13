package Day09;
import java.util.Scanner;
public class StringtoInt {

        public static int converttoint(String s1) throws NumberFormatException{
            try {
                int intvalue = Integer.parseInt(s1);
                return intvalue;
            } catch (NumberFormatException e) {
             throw new NumberFormatException("Cannot convert into Integer") ;
            }
        }
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String s1 = input.nextLine();
            try {
                converttoint(s1);
            } catch (NumberFormatException e) {
               System.out.println( "Exception:"+e.getMessage());
            }


        }

    }

