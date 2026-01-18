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
        System.out.println(test());
    }
    
    public static boolean test(){
        int[]nums={1,2,3,1};
        
            // brute force approach : O(n^2) time complexity, easy to understand, for first loop it takes one input
            // with second loop it check all other element for the first element if it is duplicate or not. 
        // for(int i=0;i<nums.length;i++){
            // for(int j=i+1;j<nums.length;j++){
            //     if(nums[i]==nums[j]){
            //         return true;
            //     }
            // }
        
            //this method first sorts, so that duplicates elements are one after another
            //then it checks for duplicates, time complexity O(n log n) due to sorting
        // java.util.Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //     }
        // }

        //best solution : time complexity O(n), space complexity O(n)
        //it tries to add elements to a set, if already present it returns true.
        //(it passes because only one duplicate element is expected)
        java.util.HashSet<Integer> set = new java.util.HashSet<>();
          for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false; // no duplicates
    }
}