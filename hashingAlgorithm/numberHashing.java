package Java.hashingAlgorithm;
import java.util.*;
public class numberHashing {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        //creating a hash array to store the frequency of numbers
        int hash[] = new int[100];
        for(int i=0;i<n;i++)
            hash[arr[i]]++;

        //accessing the frequency of numbers
        System.out.println("Enter how many number you want to check for: ");
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            System.out.print("Enter the numbers: ");
            int a = sc.nextInt();
            System.out.println("The frequency of " + a +" is: " + hash[a]);
        }
    sc.close();
    }
}