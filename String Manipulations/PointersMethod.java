import java.util.*;

public class PointersMethod {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindromeStr(str));
        int n = 121;
        System.out.println(isPalindrome(n));
    }
    // palindrome number leetcode 9
    public static boolean isPalindrome(int n) {
        if(n<0) return false;
        int reverseNumber=0;
        int originalNumber = n;
        while(n>0){
            int digit=n%10;
            reverseNumber = reverseNumber * 10 + digit;
            n=n/10;
        }
        if(reverseNumber==originalNumber){
            return true;
        }
        return false;
    }
    // palindrome string
    public static boolean isPalindromeStr(String str) {
        int left=0, right=str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
