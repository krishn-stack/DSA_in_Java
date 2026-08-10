package Java.sortingAlgorithms;
import java.util.*;
public class bubbleSorting{
    static void bubbleSort(int a[], int n){

        int didSwap = 0;  //optimization, T.C -> O(n^2) -> O(n)

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    didSwap = 1;    // if there is a swap, didSwap will be 1, else it will be 0
                }
            }
            if(didSwap == 0)    // if there is no swap, it means the array is already sorted, so we can break the loop
                break;          // Time Complexity changes from O(n^2) to O(n) in best case when the array is already sorted,    
                               // if we optimize the code by adding a didSwap flag to check if there is a swap or not.
        }
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();

        bubbleSort(a, n);

        System.out.println("----Sorted Array----");
        for(int i=0;i<n;i++)
            System.out.print(a[i] + " ");
        System.out.println();
        sc.close();
    }
}