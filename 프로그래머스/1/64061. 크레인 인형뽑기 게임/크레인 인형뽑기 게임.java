import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        
        
        for(int i=0; i<moves.length; i++){
            
            for(int u=0; u<board.length; u++){
                if(board[u][moves[i]-1] != 0){
                    if(list.size() != 0 && list.get(list.size()-1) == board[u][moves[i]-1]){
                        list.remove(list.size()-1);
                        answer += 2;
                    } else {
                        list.add(board[u][moves[i]-1]);
                    }
                    
                    board[u][moves[i]-1] = 0;
                    
                    break;
                }
            }
                        
        }
       
        
        
        
        
        
        
        return answer;
    }
}