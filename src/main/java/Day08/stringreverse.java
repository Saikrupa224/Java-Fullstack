package Day08;

import java.util.Scanner;

public class stringreverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first String: ");
        String s1 = input.nextLine();
        String[] words = s1.split(" ");
        String reversestring = "";
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String reverseword = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseword = reverseword + word.charAt(j);
            }
            reversestring = reversestring + reverseword +" ";
        }
        System.out.println("Reverse string is:" + reversestring);

        input.close();

    }
}

