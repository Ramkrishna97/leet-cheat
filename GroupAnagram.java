import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result=Solution.groupAnagrams(strs);
        System.out.println(result);
    }
    
}
class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        //brute force: try to add elements in  a set, if exists then return combined list.  xx-failes to group

        int length=strs.length;
        List<List<String>> result=null;
        Set<String> set=new HashSet<>();
        Map<String,List<String>> map=new HashMap<>();
        //Optimum approach: for each element, sort as a char array, make it as a key for INDEXing, 
        // if key exists then add value to  list, otherwise add key and make new value as a list.

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