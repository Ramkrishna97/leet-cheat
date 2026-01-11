

/*
66. Plus One :
Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
You may assume the integer does not contain any leading zero, except the number 0 itself.
Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.

Example 2:
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.

Example 3:
Input: digits = [0]
Output: [1]
Explanation: The array represents the integer 0.
*/

public class PlusOne {
    public static void main(String[] args) {
        plusOne();
    }
     public static int[] plusOne() {
        int []digits={9};
        int len=digits.length-1;
        int[]res=digits;
        //Brute force: for every element, check if last element is 9 or not, all element is 9 or not.
        //need a loop, because at worst we need to check all elements if they are changing or not
        //only for last element incrementted once ; othes are checked if 9 or not; 
        // for first element to be 9, new array is assigned, where old array's first element is 0,
        //and new array's first is 1 , all other element is copied from old array to new array.

        for(int i=len;i>=0;i--){
            if(i==len){
                res[i]+=1;
            }
            if(i!=0 && res[i]>9){
                res[i]=0;
                res[i-1]+=1;
            }
            else if(i==0 && res[i]>9){
                int[]res1=new int[len+2];
                res1[0]=1;
                res[0]=0;
                System.arraycopy(digits, 0, res1, 1, digits.length);  
                return res1;
            }
    }
        return res;        
    
    }
}

