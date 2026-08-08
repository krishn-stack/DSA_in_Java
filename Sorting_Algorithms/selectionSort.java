package Java.Sorting_Algorithms;
import java.util.*;
public class selectionSort {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter siz eof the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();

        int small = 0, minIndex = 0;
        for(int i=0;i<n-1;i++){
            small = a[i];
            minIndex = i;
            for(int j= i+1;j<n;j++){
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

        System.out.println("----Sorted Array----");
        for(int i=0;i<n;i++)
            System.out.print(a[i] + " ");
        sc.close();
    }
}

