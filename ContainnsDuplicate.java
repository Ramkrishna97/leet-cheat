/*
217. Contains Duplicate
Easy
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:
Input: nums = [1, 2, 3, 3]
Output: true


Example 2:
Input: nums = [1, 2, 3, 4]
Output: false
*/

public class ContainnsDuplicate {
    public static void main(String[] args) {        
        System.out.println("Class created successfully");
        Solution.test();
    }
}

class Solution{
    public static boolean test(){
        int[]nums={1,2,3,1};

        // for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        

        java.util.Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
            }
        }

        //best solution 
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
          for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false; // no duplicates
    }
}