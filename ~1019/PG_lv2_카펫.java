package Algo_D0530;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for(int i=1;i<=yellow;i++){
            int j = yellow/i;
            if(yellow%i==0){
                if((i+j)*2+4==brown){
                    if(i>j){
                        answer[0]=i+2;
                        answer[1]=j+2;
                    }else {
                        answer[0]=j+2;
                        answer[1]=i+2;
                    }
                    break;
                }
            }
        }
        return answer;
    }
}