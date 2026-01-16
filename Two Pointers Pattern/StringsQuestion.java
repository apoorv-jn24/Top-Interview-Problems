import java.util.*;
public class StringsQuestion {
    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(reverseWords(str));
    }
    // reverse string- leetcode 344
    public static void reverseString(char[] s) {
        int left=0, right=s.length-1;
        while(left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }
    // reverse words in a string- leetcode 151
    public static String reverseWords(String s) {
        StringBuilder result=new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){    
                i--;
            }
            if(i<0) break;
            int j=i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
           result.append(s.substring(i+1, j+1));
           result.append(" ");
        }
        return result.toString().trim();
    }
    // reverse vowels of a string- leetcode 345
    // reverse string-II- leetcode 186
}
