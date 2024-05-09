import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        List<Integer> list = new ArrayList<>();
        
        for(int[] arr2 : intervals){
            for(int i= arr2[0]; i<=arr2[1]; i++){
                list.add(arr[i]);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}