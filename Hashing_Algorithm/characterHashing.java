import java.util.*;
public class characterHashing{
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
            char q = sc.nextLine().charAt(0);
            System.out.println("The frequency of " + q +" is: " + hash[q]);
        }
    sc.close();
    }
}