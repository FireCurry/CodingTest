import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int length = 0;
        int overlap = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<lines.length; i++){
            length += lines[i][1] - lines[i][0];
            for(int u=lines[i][0]; u<lines[i][1]; u++){
                if(list.contains(u)){
                    if(list.indexOf(u) != list.lastIndexOf(u)){
                        overlap++;
                    }
                    answer--;
                }
                list.add(u);
                answer++;
            }
        }
        
        answer = length - answer - overlap;
        
        
        return answer;
    }
}