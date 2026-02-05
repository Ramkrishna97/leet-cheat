
import java.util.HashMap;
import java.util.Stack;

/*
20. *Valid Parentheses [Easy] :
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.

An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.

Example 1:
Input: s = "()"
Output: true

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false

Example 4:
Input: s = "([])"
Output: true

Example 5:
Input: s = "([)]"
Output: false

Constraints:
    1 <= s.length <= 104
    s consists of parentheses only '()[]{}'.

*/


public class ValidParentheses  {
    public static void main(String[] args) {
        isValid("()[]({})");
    }
    public static boolean isValid(String s) {

        /*
        Bruteforce : keep a couple-set of opening:closing brackets ;
         now for chars in the given string check if it matches as opening or closing from bracket-set;
        peek the stack for - if it's opening , add, if it's closing then pop.
        **- check if length is odd, means can't be pair of open:close brackets.
        time complexity : O(n)  ;   space complexity : O(n) ;   givs 7ms in leetcode.
        */


        // if (s.length() % 2 != 0) {
        //     return false;
        // }
        // char[][]set=new char[][]{{'(',')'},{'[',']'},{'{','}'}};
        // Stack<Character> stack = new Stack<>();
        // for(char c: s.toCharArray()){
        //     if(stack.isEmpty()){
        //         stack.push(c);
        // }else if(stack.peek()=='(' && c==')' || stack.peek()=='[' && c==']' || stack.peek()=='{' && c=='}'){
        //         stack.pop();
        //     }else{
        //         stack.push(c);
        //     }
        // }
        // return stack.isEmpty();



         // Optimization: If the string length is odd, it cannot be valid.
        if (s.length() % 2 != 0) {
            return false;
        }

        // Use a HashMap to store the mappings of closing brackets to opening brackets.
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                char topElement = stack.isEmpty() ? '#' : stack.pop();
                if (topElement != map.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }    
}
