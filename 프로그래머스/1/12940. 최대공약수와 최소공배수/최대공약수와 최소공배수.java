class Solution {
    public int[] solution(int n, int m) {
                
        int temp1 = 0;
        int temp2 = 0;
        int num = m;
        if(m<n){
            m = n;
            n = num;
        }
        for(int i=n; i>0 ; i--){
            if(m%i == 0 && n%i == 0){
                temp1 = i;
                break;
            }
        }
        
        for(int i=1; i<=n; i++){
            for(int u=1; u<=m; u++){
                if(m*i == n*u){
                    temp2 = n*u;
                    break;
                }
            }
            if(temp2 != 0){
                break;
            }
        }
        
        int[] answer = {temp1, temp2};
        
        return answer;
    }
}