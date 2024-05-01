import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        
        List<Double> list = new ArrayList<>();
        
        for(int i=0; i<score.length; i++){
            list.add((score[i][0]+score[i][1])/2.0);
        }
        
        List<Double> sortList = new ArrayList<>(list);
        Collections.sort(sortList);
        Collections.reverse(sortList);
        
        for(int i=0; i<answer.length; i++){
            answer[i] = 1 + sortList.indexOf(list.get(i));
        }
        
        return answer;
    }
}