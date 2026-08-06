import java.util.*;
public class hashMap{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter them elements in the array: ");
        for(int i=0;i<size;i++)
            arr[i] = sc.nextInt();

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for(int i=0;i<size;i++){
            if(hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i])+1);
            }
            else
                hashMap.put(arr[i], 1);
        }

        System.out.print("Enter number of queries you want to check for: ");
        int queries = sc.nextInt();
        for(int i=0;i<queries;i++){
            System.out.print("Enter a query: ");
            int query = sc.nextInt();
            if(hashMap.containsKey(query))
                System.out.println("Frequency of "+ query + ": " + hashMap.get(query));
            else
                System.out.println("Frequency of " + query + ": 0");
        }
    }

}




   



