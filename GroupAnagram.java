import java.util.*;
/*
49. Group Anagrams(Medium)
Given an array of strings strs, group the
together. You can return the answer in any order.
Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Explanation:
    There is no string in strs that can be rearranged to form "bat".
    The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
    The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.

Example 2:
Input: strs = [""]
Output: [[""]]

Example 3:
Input: strs = ["a"]
Output: [["a"]]

Constraints:
    1 <= strs.length <= 104
    0 <= strs[i].length <= 100
    strs[i] consists of lowercase English letters.
*/
public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result=Solution.groupAnagrams(strs);
        System.out.println(result);
    }
    
}
class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        //brute force: try to add elements in  a set, if exists then return combined list.
        //   xx-failes to group 
        // time complexity : O(n^2)
        int length=strs.length;
        List<List<String>> result=null;
        Set<String> set=new HashSet<>();
        Map<String,List<String>> map=new HashMap<>();
        //Optimum approach: for each element, sort as a char array, make it as a key for INDEXing, 
        // if key exists then add value to  list, otherwise add key and make new value as a list.
        //time complexity : O(n*klogk) , n=number of strings, k= max length of a string.

        if(length==0){
            return new ArrayList<>();
        }

        for(int i=0;i<length;i++){ 
            char[]ch=strs[i].toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }
            else{
                List<String> list=new ArrayList<>();
                list.add(strs[i]);
                map.put(key,list);
            }
            }
            return result=new ArrayList<>(map.values());
        }
        
    }