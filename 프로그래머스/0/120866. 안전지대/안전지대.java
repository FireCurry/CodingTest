class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        boolean flag = false;
        // 전체 보드 순회
        for(int i=0; i<board.length; i++){
            for(int u=0; u<board.length; u++){
                if(board[i][u] == 1) continue;
                
                // 해당타일 주변 탐색
                for(int j=-1; j<2; j++){
                    for(int k=-1; k<2; k++){
                        if(i+j >=0 && u+k >=0 && i+j < board.length && u+k < board.length){
                            if(board[i+j][u+k] == 1){
                                flag = true;
                                break;
                            }
                        }
                    }
                    if(flag){
                        break;
                    }
                }
                
                if(flag){
                    flag = false;
                } else {
                    answer++;
                }
                
            }
        }
        
        
        
        return answer;
    }
}