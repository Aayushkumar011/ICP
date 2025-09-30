import java.util.HashSet;

public class Longest_Substring_Without_Repeating_Characters_3 {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans=0;
        HashSet<Character> set = new HashSet<>();
        int j=0;
        for(int i=0;i<n;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
            set.add(s.charAt(i));
            ans= Math.max(ans,i-j+1);
        }
    return ans;
}
