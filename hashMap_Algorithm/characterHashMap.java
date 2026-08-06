package Java.hashMap_Algorithm;
import java.util.*;
public class characterHashMap {
    public static void main(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        //creating a hashmap for hashing characters of a string
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(hashMap.containsKey(ch))
                hashMap.put(ch, hashMap.get(ch)+1);
            else
                hashMap.put(ch, 1);
        }

        //printing the hashmap
        System.out.println("The frequency of the characters in the string are: ");
        for(Map.Entry<Character, Integer> element : hashMap.entrySet()){
            System.out.println(element.getKey() + " -> " + element.getValue());
        }

        //fetching the frequency of the characters using hashMap
        System.out.print("Enter the number of queries you want to check for: ");
        int queries = sc.nextInt();sc.nextLine();
        for(int i=0;i<queries;i++){
            System.out.print("Enter a query: ");
            char query = sc.nextLine().charAt(0);
            if(hashMap.containsKey(query))
                System.out.println("Frequency of " + query +": " + hashMap.get(query));
            else
                System.out.println("Frequency of " + query +": 0");
        }
    sc.close();
    }
}

