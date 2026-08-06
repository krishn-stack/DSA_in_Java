package Java.hashMap_Algorithm;
import java.util.*;
public class highestFrequencyElement {

    static int highestElement(int nums[]){
       int maxValue = 0; int maxKey = 0;
       HashMap<Integer, Integer> hashMap = new HashMap<>();
       for(int i=0;i<nums.length;i++){
            if(hashMap.containsKey(nums[i]))
                hashMap.put(nums[i], hashMap.get(nums[i])+1);
            else
                hashMap.put(nums[i], 1);
        }

        for(Map.Entry<Integer, Integer> element : hashMap.entrySet()){
            if(element.getValue() > maxValue)
                maxKey = element.getKey();
                maxValue = element.getValue();
        }

        for(Map.Entry<Integer, Integer> element : hashMap.entrySet()){
            if(element.getValue() == hashMap.get(maxKey) && element.getKey() <= maxKey)
                maxKey = element.getKey();
                maxValue = element.getValue();
        }
       return maxKey;
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int nums[] = new int[size];
        System.out.println("Enter elements in the array: ");
        for(int i=0;i<size;i++)
            nums[i] = sc.nextInt();
        int highestFrequencyElement = highestElement(nums);
        System.out.println("The element with the highest frequency is : " + highestFrequencyElement);
        sc.close();
    }
}
