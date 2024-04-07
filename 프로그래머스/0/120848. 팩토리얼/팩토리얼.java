class Solution {
    public int solution(int n) {
        int answer = 1;
        int temp = 1;
        do{
            temp *= ++answer;
        }while(temp <= n);
        
        return answer-1;
    }
}