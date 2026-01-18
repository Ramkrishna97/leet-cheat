/*
125. Valid Palindrome :

Given a string s, return true if it is a palindrome, otherwise return false.
A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).

Example 1:
Input: s = "Was it a car or a cat I saw?"
Output: true
Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.

Example 2:
Input: s = "tab a cat"
Output: false
Explanation: "tabacat" is not a palindrome.

Constraints:
    1 <= s.length <= 1000
    s is made up of only printable ASCII characters.
*/

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome());
    }
    public static boolean isPalindrome() {
        String s="Was it a car or a cat I saw?";

        //first try brute force: convert to lower case, remove all non-alphanumeric characters, then check elements - either from middle to end / from ends to middle
        // Time complexity : (\(O(n+n+n+n/2)\)) -> O(n) 
        /*
        char[] ch=s.toLowerCase().replaceAll("[^a-z0-9]", "").toCharArray();
        int len=ch.length;      // which is 19 here
        if (len <= 1) {
        return true; 
    }
        for(int i=0;i<len/2;i++){
            if(ch[i]!=ch[len-i-1]){
                return false;
            }
        }
        return true;        
        */

        
       // Optimized approach: using two pointers
       // Time complexity : O(n)

       int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Move the left pointer forward if the character is not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move the right pointer backward if the character is not alphanumeric
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Compare the characters (case-insensitively)
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; // Not a palindrome
            }

            // Move both pointers inward for the next comparison
            left++;
            right--;
        }
        return true; // All valid characters matched
    }
    
}
