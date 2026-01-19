import java.util.*;
public class StringsQuestion {
    public static void main(String[] args) {
        int k=2;
        String s="abcdefg";
        System.out.println(reverseStr(s, k));
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

    // reverse string-II- leetcode 541
    public static String reverseStr(String s, int k) {
        char[] arr=s.toCharArray();
        int n=arr.length;
        for(int i=0; i<n; i+=2*k){
            // i+*2k use kiya hai taki hum yaha par hi 2k tak ka kaam kar sake and aage same 
            // kaam repeat hi karna hai toh isilie pehle hi skipping karake unnecessary ka kaam bacha lo
            // Yaha par ab k tak ke numbers ko reverse karna hai toh i-k-1 tak ka loop laga denge
            int left=i, right=i+k-1;
            // agar right out of bound chala jaye toh usko last elememt par le jaao fix karne ke liye 
            if(right>=n) right=n-1; 
            while(left<right){
                char temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
}
