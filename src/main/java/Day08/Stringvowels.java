package Day08;

public class Stringvowels {
    public static void main(String[]args){
        String s="ICECREAM";
        s= s.toLowerCase();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' ||s.charAt(i)=='o'|| s.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("Number of vowels in the given string:" + count);
    }
}
