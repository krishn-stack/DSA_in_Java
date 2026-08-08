package Java.Sorting_Algorithms;
import java.util.*;
public class bubbleSort{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<n;i++)
            a[i] = sc.nextInt();

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("----Sorted Array----");
        for(int i=0;i<n;i++)
            System.out.print(a[i] + " ");
        System.out.println();
        sc.close();
    }
}