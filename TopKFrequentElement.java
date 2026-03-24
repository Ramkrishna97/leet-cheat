/*
** 347. Top K Frequent Elements(Medium) :
Given an integer array nums and an integer k, return the k most frequent elements.
You may return the answer in any order.

Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]

Example 3:
Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2
Output: [1,2]

Constraints:
    1 <= nums.length <= 105
    -104 <= nums[i] <= 104
    k is in the range [1, the number of unique elements in the array].
    It is guaranteed that the answer is unique.

Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
*/

public class TopKFrequentElement {
    public static void main(String[] args) {
        System.out.println("First test case: {1,1,1,2,2,3}, k=2");
        topKFrequent(new int[]{1,1,1,2,2,3}, 2);

        System.out.println("Second test case: {1,2,1,2,1,2,3,1,3,2}, k=2");
        topKFrequent(new int[]{1,2,1,2,1,2,3,1,3,2}, 2);
    }
    
    
    public static int[] topKFrequent(int[] nums, int k) {
        //nums = [1,1,1,2,2,3], k = 2           Output: [1,2]
        //[1,2,1,2,1,2,3,1,3,2], k = 2           Output: [1,2]  

        //approach : need elements , and frequencies. so indexing is required. indexes of elements , 
        // values as counts. So, used hashmap , added key and values.
        //Now, need to return key as per top K values.
        // So, used stream, over key set , limited to k elements only, mapped to int , then to array.
        //but it;s time complexity is O(n log n) , due to sorting.
        
        /*Map<Integer, Integer> map = new HashMap<>();
        int[]res=new int[k];
        for(int i=0; i<nums.length; i++){    
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{                map.put(nums[i],1);            }       }
       res= map.entrySet()
        .stream()
        .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())) // Sort by value in descending order
        .limit(k) // Limit to top k entries
        .mapToInt(Map.Entry::getKey) // Extract keys
        .toArray(); // Convert to array
       return res;
       */
        
       
       /*Arrays.sort(nums);
        int len= nums.length;
        int maxCount=0;
        int res[]=new int[k];
        int resStart=0;
        for(int i=0;i<len;i++){
            if(nums[i]==nums[i+1]){
                maxCount++;
        }else{ if (resStart<k && res[resStart]!=0)
            res[i]=maxCount;
            maxCount=0;
            resStart++;
        }
    }*/
        return new int[]{};
       
    }
}