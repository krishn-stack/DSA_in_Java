package Java.Sorting_Algorithms;
import java.util.*;
public class recursiveInsertionSorting {
    
    static int[] recursiveInsertion(int nums[], int n){
        if(n == 1)
            return nums;
        int key = 0;
        for(int i=1;i<n;i++){
            key = nums[i];
            int j = i-1;
            while(j>=0 && nums[j]>key){
                nums[j+1] = nums[j];
                j-=1;
            }
            nums[j+1] = key;
        }
        recursiveInsertion(nums, n-1);
        return nums;
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.print("Enter elements in the array: ");
        for(int i=0;i<size;i++)
            nums[i] = sc.nextInt();

        recursiveInsertion(nums, size);

        System.out.println("----Sorted Array----");
        for(int i=0;i<size;i++)
            System.out.print(nums[i] + " ");
        System.out.println();
        sc.close();
    }
}
