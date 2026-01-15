// This file contains the code function of 
import java.util.*;
public class Sum {
    public static void main(String[] args) {
        int target = 9;
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    // Two Sum-II
    public static int[] twoSum(int[] numbers, int target) {
        // input array is sorted
        int n=numbers.length;
        int i=0, j=n-1;
        while(i<j){
            int sum= numbers[i] + numbers[j];
            if(sum==target){
                return new int[]{i+1, j+1};
            } else if(sum<target){
                i++;
            } else {
                j--;
            }
        }
        return new int[]{-1, -1};
    }

}
