

/*
14. Longest Common Prefix [EASY]

Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".

Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

Constraints:
    1 <= strs.length <= 200
    0 <= strs[i].length <= 200
    strs[i] consists of only lowercase English letters if it is non-empty.
    */
   
    public class LongestCommonPrefix {
   public static void main(String[] args) {
    String strs[] = {"flower","flow","flight"};
    String str[]={"apple","app","appricot","ap"};
    // {"dog","racecar","car"};
    longestCommonPrefix(strs);
    longestCommonPrefix(str);
   }
   
    public static String longestCommonPrefix(String[] strs) {
        //BruteForce : iterate over first word, and match its first element to other's first elements , then 2nd and so on.
        
        // String common="";
        // if(strs.length==0 || strs[0].length()==0) return common;
        // if(strs[0].toCharArray()[0]== strs[1].toCharArray()[0]){
        //     common+=(strs[0].toCharArray()[0]);
        // }
        // for(int i=1;i<strs.length;i++){
        //     if(strs[0].toCharArray()[i] ==strs[1].toCharArray()[i] && strs[0].toCharArray()[i]==strs[2].toCharArray()[i]){common+=(strs[0].toCharArray()[i]);}
        //     else break;
        // }System.out.println(common);
        // return common;


        //
        if (strs == null || strs.length == 0) {
	            return "";
	        }
	        
	        int minLength = Integer.MAX_VALUE;
	        for (String s : strs) {
	            if (s.length() < minLength) {
	                minLength = s.length();
	            }
	        }
	        
	        int i = 0;
	        while (i < minLength) {
	            for (String s : strs) {
	                if (s.charAt(i) != strs[0].charAt(i)) {
	                    return strs[0].substring(0, i);
	                }
	            }
	            i++;
	        }
	        
	        return strs[0].substring(0, i);
     }    
   }