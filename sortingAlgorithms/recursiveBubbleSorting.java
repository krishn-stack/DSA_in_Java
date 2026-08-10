package Java.sortingAlgorithms;
import java.util.*;
public class recursiveBubbleSorting{
    
    static int[] recursiveBubble(int nums[], int n){
        boolean swapped = false;
        if(n == 1)
            return nums;
        
        for(int i=0;i<n-1;i++){
            if(nums[i] > nums[i+1]){
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
                swapped = true;
            }
        }
        if(!swapped)    //optimized for the best case(already sorted array)
            return nums;  //don't need to run the same entire loop again and again for the best case mentioned above.

        recursiveBubble(nums, n-1);
        return nums;
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.print("Enter the elements in the array: ");
        for(int i=0;i<size;i++)
            nums[i] = sc.nextInt();

        recursiveBubble(nums, size);
        System.out.println("----Sorted Array----");
        for(int i=0;i<size;i++)
            System.out.print(nums[i] + " ");
        System.out.println();
        sc.close();
    }
}
