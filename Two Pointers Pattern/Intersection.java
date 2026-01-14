import java.util.*;
public class Intersection {
    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Approach 1: Using HashSet
        // Set<Integer> set1 = new HashSet<>();
        // for (int num : nums1) {
        //     set1.add(num);
        // }
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int num : nums2){
        //     if(set1.contains(num)){
        //         list.add(num);
        //         set1.remove(num); 
        //     }
        // }
        // int[] result = new int[list.size()];
        // for(int i = 0; i < list.size(); i++){
        //     result[i] = list.get(i);
        // }
        // return result;
        // Approach 2: Two Pointers
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int left=0, right=0;
        while(left<nums1.length && right<nums2.length){
            if(nums1[left]==nums2[right]){
                if(list.size()==0 || list.get(list.size()-1)!=nums1[left]){
                    list.add(nums1[left]);
                }
                left++;
                right++;
            }
            else if(nums1[left]<nums2[right]){
                left++;
            }
            else{
                right++;
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }
        return result;
    }
}
