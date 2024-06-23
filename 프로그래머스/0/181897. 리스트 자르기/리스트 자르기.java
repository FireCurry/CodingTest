import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        
        
        int start = 0;
        int end = num_list.length;
        int step = 1;
        
        switch(n){
            case 1 : end = slicer[1]+1; break;
            case 2 : start = slicer[0]; break;
            case 3 : start = slicer[0]; end = slicer[1]+1; break;
            case 4 : start = slicer[0]; end = slicer[1]+1; step = slicer[2]; break;
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=start; i<end; i=i+step){
            list.add(num_list[i]);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}