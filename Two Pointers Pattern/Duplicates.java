public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {2,5,9,6,9,3,8,9,7,1};
        int[] nums = {1, 2, 3, 2, 4, 5, 1};
        // System.out.println(removeDuplicates(nums));
        System.out.println(findDuplicate(arr));
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
    // LeetCode Problem 80: Remove Duplicates from Sorted Array II
    public static int removeDuplicatesi(int[] nums) {
        /*
        Brute Force Approach
        int count = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]){
                count++;
                if(count <= 2){
                    nums[k] = nums[i];
                    k++;
                }
            } else {
                count = 1;
                nums[k] = nums[i];
                k++;
            }
        }
        */
        int k=2;
        // optional test case for some platforms
        if (nums.length <= 2) {
            return nums.length;
        }
        for(int i=2; i<nums.length; i++){
            if(nums[i] != nums[k-2]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    // find duplicate number 
    public static int findDuplicate(int[] nums) {
    /*  Normal or Brute Force Approach
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return nums[i];
                }
            }
        }
        return -1;
    }
        */
    /*
    Another approach using HashSet
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return num;
            }
            seen.add(num);
        }
        return -1;
     */
    /*
    One More Approach by frequency array
    int n = nums.length;
    int[] freq = new int[n];
    for (int num : nums) {
        freq[num]++;
        if (freq[num] > 1) {
            return num;
        }
    }
    */
//    Optimal Approach: Floyd's Tortoise and Hare (Cycle Detection)
        int slow=nums[0];
        int fast=nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while(slow != fast);
        slow=nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

}
