class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        for(int i=0; i<answer.length; i++){
            for(int u=0; u<answer[i].length; u++){
                if(i == u){
                    answer[i][u] = 1;
                }
            }
        }
        
        return answer;
    }
}