package Java.sortingAlgorithms;
import java.util.*;
public class quickSorting {
    
    static int partitionIndex(int nums[], int low, int high){
        int i = low;
        int j = high;
        int pivot = nums[low];
        while(i < j){
            while(nums[i] <= pivot && i <= high)
                i++;
            while(nums[j] > pivot && j >= low)
                j--;
            if(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[low];
        nums[low] = nums[j];
        nums[j] = temp;

        return j;
    }

    static void quickSort(int nums[], int low, int high){
        if(low < high){
            int pivotPartitionIndex = partitionIndex(nums, low, high);
            quickSort(nums, low, pivotPartitionIndex-1);
            quickSort(nums, pivotPartitionIndex+1, high);
        }
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements in the array: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        quickSort(arr, 0, n-1);

        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}
