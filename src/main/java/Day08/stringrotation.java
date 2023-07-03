package Day08;

import java.util.Scanner;

public class stringrotation {

    public int checkrotation(String s1, String s2) {
        String s3 = s1 + s2;
        if (s3.contains(s2)) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String s1 = input.nextLine();
        System.out.print("Enter second String: ");
        String s2 = input.nextLine();
        stringrotation Stringrotation = new stringrotation();
        int output = Stringrotation.checkrotation(s1, s2);
        if (output == 1) {
            System.out.println("True");
        } else {
            System.out.println("False");

        }
    }
}
