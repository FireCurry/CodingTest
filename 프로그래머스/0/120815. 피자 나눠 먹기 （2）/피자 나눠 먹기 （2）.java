class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 0;
        while(true){
            i++;
            if((6*i) % n == 0){
                answer = i;
                break;
            }
        }
        return answer;
    }
}