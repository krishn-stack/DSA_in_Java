package Java.sortingAlgorithms;
import java.util.*;
public class selectionSorting{
    static void selectionSort(int a[], int n){
        int small = 0; int minIndex = -1;
        for(int i=0;i<n-1;i++){
            small = a[i];
            minIndex = i;
            for(int j=i+1;j<n;j++){
                if(small > a[j]){
                    small = a[j];
                    minIndex = j;
                }
            }
            if(i != minIndex){
                a[minIndex] = a[i];
                a[i] = small;
            }
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

        selectionSort(a, n);

        System.out.println("----Sorted Array----");
        for(int i=0;i<n;i++)
            System.out.print(a[i] + " ");
        System.out.println();
        sc.close();
    }
}

