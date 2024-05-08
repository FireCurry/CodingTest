class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int a = 0;
        int b = 0;
        int maxA = n-1;
        int maxB = n-1;
        int minA = 0;
        int minB = 0;
        String direction = "right";
        
        for(int i=1; i<=n*n; i++){
            
            answer[a][b] = i;
            
            switch(direction){
                case "right" : b++; if(b==maxB){minA++; direction = "down";} break;
                case "down" : a++; if(a==maxA){maxB--; direction = "left";} break;
                case "left" : b--; if(b==minB){maxA--; direction = "up";} break;
                case "up" : a--; if(a==minA){minB++; direction = "right";} break;
            }
            
            
        }
        
        return answer;
    }
    

}