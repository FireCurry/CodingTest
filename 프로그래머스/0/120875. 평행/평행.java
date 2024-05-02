class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int k = 0;
        int j = 0;
        
        double[] slope = new double[3];
        double[] slope2 = new double[3];
        
        for(int i=0; i<3; i++){
            if(i == 1) j=1;
            if(i == 2) k=1;
            slope[i] = (double)(dots[i+1][1] - dots[0][1])/(dots[i+1][0] - dots[0][0]);
            slope2[i] = (double)(dots[3-k][1] - dots[2-j][1])/(dots[3-k][0] - dots[2-j][0]);
            
        }
        
        for(int i=0; i<slope.length; i++){
            if(slope[i]  == slope2[i]) return 1;
        }
        
        
        
        return answer;
    }
}