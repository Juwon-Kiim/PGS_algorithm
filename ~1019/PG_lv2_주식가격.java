package Algo_D0418;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i=0;i<prices.length-1;i++) { // for문 두개를 돌리면서
            for(int j=i+1;j<prices.length;j++){
                if(prices[i]>prices[j]) { // 두개씩 비교하여 앞에께 크면
                    answer[i]+=1;		  // 이때까지의 시간+1
                    break;				  // 하고 탈출
                }
                else answer[i]++;		  // 뒤에께 크면 시간+1
            }
        }
        return answer;
    }
}