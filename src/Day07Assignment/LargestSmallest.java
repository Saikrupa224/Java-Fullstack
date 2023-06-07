package Day07Assignment;

public class LargestSmallest {
    public static void main(String[]args){
        int array[] = new int[]{1,2,3,4,5,6};
        int smallest=array[0];
        int largest=array[0];
        for(int i=1;i< array.length;i++){
            if(array[i]>largest)
            {
                largest = array[i];
            }
            else if(array[i]<smallest)
            {
                smallest = array[i];
            }

        }
        System.out.println("smallest number in array is"+smallest);
        System.out.println("largest number in array is"+largest);

    }
}
