class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++){
            int count = 0;
            for(int u=1; u<=i; u++){
                if(i%u ==0){
                    count++;
                }
            }
            if(count >= 3){
                answer++;
            }
        }
        
        return answer;
    }
}