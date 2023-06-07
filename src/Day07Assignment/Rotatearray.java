package Day07Assignment;

import java.util.Arrays;

public class Rotatearray {
    public static void main(String[]args){
        int[] array1 = {1,2,3,4,5,6};
        int x = 2;
        System.out.println("Original array:"+ Arrays.toString(array1));
        rotatearray(array1,x);
        System.out.println("Rotated array:"+Arrays.toString(array1));

    }
    public static void rotatearray(int[]array1 , int x){
        int n= array1.length;
        reversearray(array1,0,x-1);
        reversearray(array1,x,n-1);
        reversearray(array1,0,n-1);

    }
    public static void reversearray(int[]array1,int start, int end){
        while(start < end)
        {
            int temp =array1[start];
            array1[start]=array1[end];
            array1[end]=temp;
            start++;
            end--;
        }
    }
}
