import java.util.Arrays;

public class Permutation_in_String_567 {
    // BRUTE FOURCE APPROACH 

    // public static boolean helper(String s1,String s2){
    //     char[] a1 = s1.toCharArray();
    //     char[] a2 = s2.toCharArray();
    //     Arrays.sort(a1);
    //     Arrays.sort(a2);
    //     return Arrays.equals(a1, a2);
    // }
    // public boolean checkInclusion(String s1, String s2) {
    //     int w = s1.length();
    //     int l = s2.length();
    //     int n = l-w+1;
    //     for(int i=0;i<n;i++){
    //         if(helper(s1,s2.substring(i,w+i)))return true;
    //     }
    // return false;
    // }

    // OPTIMAL APPROACH USING SLIDING WINDOW AND HASHTABLE

    public boolean checkInclusion(String s1, String s2) {
        int n =  s1.length();
        int m = s2.length();
        if(n>m)return false;
        int window = n;
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        // frequency of s1 string;
        for(int i=0;i<n;i++){
            f1[s1.charAt(i)-'a']++;
        }
        // frequency of first window;
        for(int i=0;i<window;i++){
            f2[s2.charAt(i)-'a']++;
        } 
        if(Arrays.equals(f1,f2))return true;
        // check for others windows;
        for(int i=window;i<m;i++){
            f2[s2.charAt(i-window)-'a']--;
            f2[s2.charAt(i)-'a']++;
            if(Arrays.equals(f1,f2))return true;
        }
        return false;
    }
}
