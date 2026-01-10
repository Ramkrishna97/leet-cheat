/*
242.Valid Anagram

Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.
An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:
Input: s = "racecar", t = "carrace"
Output: true

Example 2:
Input: s = "jar", t = "jam"
Output: false

Constraints:
    s and t consist of lowercase English letters.

*/


public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(test());
    }
    public static boolean test(){
        String s = "anagram", t = "nagaram";
        //brute force way   
        //Time Complexity: O(N log N) - Due to sorting.
        // Space Complexity: O(N) or O(1) - Depends on the sort implementation (in-place or not, toCharArray creates new arrays).
 
       /*  int length=s.length();
        char[] arr1=s.toCharArray();
        Arrays.sort(arr1);
        char[] arr2=t.toCharArray();
        Arrays.sort(arr2);
        if(arr1.length!=arr2.length){
            return false;
        }
        for (int i = 0; i <length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
            return true;
            */

        //optimal way
        // Time Complexity: O(N) - We traverse both strings once.
        // Space Complexity: O(1) - The frequency array has a fixed size of 26.
        if(s.length()!=t.length()){
            return false;
        }
      int[] set=new int[26];    //created an array of size 26 for 26 unique empty letters
        for(char c:s.toCharArray()){
            set[c-'a']++;       //ASCII value of c is 99 , a-97 , so 2nd index is updated
        }                       // incremented the letter count in s
        for(char c:t.toCharArray()){
            set[c-'a']--;
            if(set[c-'a']<0){
                return false;
            }
        }
        return true;
        
    }
}
