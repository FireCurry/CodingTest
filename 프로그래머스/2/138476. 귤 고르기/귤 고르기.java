import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<tangerine.length; i++){
            if(map.get(tangerine[i]) == null){
                map.put(tangerine[i], 1);
            } else {
                map.put(tangerine[i], map.get(tangerine[i])+1);
            }
        }
        
        List<Integer> list = new ArrayList<>();
        
        for(int temp : map.values()){
            list.add(temp);
        }
        
        list.sort(Comparator.reverseOrder());
        int count = 0;
        for(int i=0; i<list.size(); i++){
            count += list.get(i);
            if(count >= k){
                answer = i+1;
                break;
            }
        }
        
        return answer;
    }
}