package Java.arrayProblems.Easy;
import java.util.*;
public class secondLargest {
    
    static int findSecondLargest(int[] nums) {
        if(nums.length < 2)
            return -1;
        int firstMax = nums[0];
        int secondMax = 0;
        for(int i=1;i<nums.length;i++){
            if (firstMax < nums[i]){
                secondMax = firstMax;
                firstMax = nums[i];
            }
        }
        return secondMax;
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.print("Enter the elements in the array: ");
        for(int i=0;i<size;i++)
            nums[i] = sc.nextInt();

        System.out.println("Second Largest number in the array: " + findSecondLargest(nums));
        sc.close();
    }
}
