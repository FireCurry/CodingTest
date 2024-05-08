import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        
        List<Integer> list = new ArrayList<>();
        List<Integer> delList = new ArrayList<>();
        
        for(int i : arr){
            list.add(i);
        }
        for(int i : delete_list){
            delList.add(i);
        }
                
        list.removeAll(delList);
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        
        
        return answer;
    }
}