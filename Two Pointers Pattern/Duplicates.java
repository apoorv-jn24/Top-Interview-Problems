public class Duplicates {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 4, 5, 1};
        System.out.println(removeDuplicates(nums));
    }
    // LeetCode Problem 26: Remove Duplicates from Sorted Array
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int left=0, right=1;
        while(right < nums.length){
            if(nums[left] != nums[right]){
                left++;
                nums[left] = nums[right];
            }
            right++;
        }
        return left + 1;
    }
    // find duplicate number 
    // public static int findDuplicate(int[] nums) {
        
    // }
}
