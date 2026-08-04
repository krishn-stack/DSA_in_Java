import java.util.*;
public class character_hashing{
    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().toLowerCase();

        int hash[] = new int[256];
        for(int i=0;i<str.length();i++){
            hash[str.charAt(i)]++;
        }

        // for(int i=0;i<26;i++){
        //     System.out.print(hash[i]+" ");
        // }
            
        System.out.println("Enter how many queries you want to check for: ");
        int num = sc.nextInt();sc.nextLine();
        for(int i=0;i<num;i++){
            System.out.print("Enter the query: ");
            char ch = sc.nextLine().charAt(0);
            System.out.println("The frequency of " + ch +" is: " + hash[ch]);
            System.out.println("The frequency of " + Character.toUpperCase(ch) +" is: " + hash[Character.toUpperCase(ch)]);
        }
    sc.close();
    }
}