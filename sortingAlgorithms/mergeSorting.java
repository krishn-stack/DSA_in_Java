package Java.sortingAlgorithms;
import java.util.*;
public class mergeSorting {
    
    static void mergeBackAlgo(int arr[], int low, int mid, int high){  // merges the hypothetically divided array back into a temp list.
        int leftPtr = low;
        int rightPtr = mid+1;
        List<Integer> temp = new ArrayList<>();  //create an arraylist to continuously merge the sorted array.
        while(leftPtr <= mid && rightPtr <= high){
            if(arr[leftPtr] < arr[rightPtr]){   //checking the smaller element in the two divided arrays which to enter first.
                temp.add(arr[leftPtr]);
                leftPtr++;
            }
            else{
                temp.add(arr[rightPtr]);
                rightPtr++;
            }
        }
        while(leftPtr <= mid){    //if right array exhausts left pointer merges the left over elements in the left array to the list.
            temp.add(arr[leftPtr]);
            leftPtr++;
        }
        while(rightPtr <= high){   //if the left array elements exhausts right pointer merges the left over elements in the right array to the list.
            temp.add(arr[rightPtr]);
            rightPtr++;
        }
        for(int i=low;i<=high;i++)
            arr[i] = temp.get(i-low);
    }

    static void mergeSort(int arr[], int low, int high){
        if(low >= high)
            return;
        int mid = low + ((high - low)/2);
        mergeSort(arr, low, mid);    //dividing the left array into two halves and making it ready for merging.
        mergeSort(arr, mid+1, high); //dividing the right array.
        mergeBackAlgo(arr, low, mid, high);  //merge back sorted arrays.
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter elements in the array: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        
        mergeSort(arr, 0, n-1);

        System.out.println("Sorted Array: ");
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}
