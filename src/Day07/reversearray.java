package Day07;
import java.util.Arrays;
public class reversearray {
    public static void main(String[]args){
        int[] array1 = {1,2,3,4,5,6};
        System.out.println("Original array:"+Arrays.toString(array1));
        reversearray(array1);
        System.out.println("Reversed array:"+Arrays.toString(array1));

    }

    public static void reversearray(int[]array){
        int start=0;
        int end=array.length-1;
        while(start < end)
        {
            int temp =array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }

}
