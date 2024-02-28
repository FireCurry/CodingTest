class Solution {
    public int solution(int[][] triangle) {
        
        for(int i=triangle.length-2; i>=0; i--){
            for(int u=0; u<triangle[i].length; u++){
                triangle[i][u] += Math.max(triangle[i+1][u], triangle[i+1][u+1]);
            }
        }
        
        return triangle[0][0];
    }
}