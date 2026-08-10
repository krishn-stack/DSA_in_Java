package Java.sortingAlgorithms;
import java.util.*;
public class insertionSorting {
    static void insertionSort(int a[], int n){
        int key = 0;
        for(int i=1;i<n;i++){
            key = a[i];
            int j = i-1;
            while(j>=0 && a[j] > key){
                a[j+1] = a[j];
                j-=1;
            }
            a[j+1] = key;

            for(int k=0;k<n;k++) //prints each pass
                System.out.print(a[k] + " ");
            System.out.println();
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

        insertionSort(a, n);

        System.out.println("----Sorted Array----");
        for(int i=0;i<n;i++)
            System.out.print(a[i] + " ");
        System.out.println();
        sc.close();
    }
}


