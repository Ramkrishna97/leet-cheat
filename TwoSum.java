
import java.util.Map;

/*
1.Two Sum :
Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.
You may assume that every input has exactly one pair of indices i and j that satisfy the condition.
Return the answer with the smaller index first.

Example 1:
Input: nums = [3,4,5,6], target = 7
Output: [0,1]
Explanation: nums[0] + nums[1] == 7, so we return [0, 1].

Example 2:
Input: nums = [4,5,6], target = 10
Output: [0,2]

Example 3:
Input: nums = [5,5], target = 10
Output: [0,1]

Constraints:
    2 <= nums.length <= 1000
    -10,000,000 <= nums[i] <= 10,000,000
    -10,000,000 <= target <= 10,000,000
    Only one valid answer exists.
*/

public class TwoSum {
    public static void main(String[] args) {
        System.out.println(test());
    }
    static int[] test(){
        int[] nums = {3,4,5,6};
        int target = 7;

        //bruteforce approach : use two loops to compare and add the elements and check
        //time complexity O(n^2)
        /*
        int[] result={0,0};
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        */

        //optimal approach : use hashmap to store the elements and their indices,
        //one loop to iterate the elements , then checks if target - current element exists in the map,
        //if exists, then return the indice , otherwise add the current element to the map
        //time complexity O(n) : because only one loop is used.
        /*  key   value(index)
         *   2  ->  0
         *   7  ->  1 
        */
       
        int[] result={0,0};
        Map<Integer, Integer> map = new java.util.HashMap<>();
       for(int i=0;i<nums.length;i++){
        if(map.containsKey(target-nums[i])){
            result[0]=map.get(target-nums[i]);
            result[1]=i;
            return result;
        }map.put(nums[i], i);
           }
           
        return result;
    }
    
}
