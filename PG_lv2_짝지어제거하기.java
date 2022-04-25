package Algo_D0425;

import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char cur = s.charAt(i);
            if(stack.isEmpty()){
                stack.push(cur);
            } else{
                if(stack.peek()==cur){
                    stack.pop();
                }else{
                    stack.push(cur);
                }
            }
        }
        
        answer = stack.isEmpty()?1:0;

        return answer;
    }
}