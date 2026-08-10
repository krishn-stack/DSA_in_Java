package Java.arrayProblems.Easy;
import java.util.*;
public class largestNumber{
    
    static int findLargestNumber(int nums[]){
        int max = nums[0];
        for(int i=1;i<nums.length;i++){
            if(max < nums[i])
                max = nums[i];
        }
        return max;
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        for(int i=0;i<size;i++)
            nums[i] = sc.nextInt();

        System.out.println("Largest number in the array: " + findLargestNumber(nums));
        sc.close();
    }

}
