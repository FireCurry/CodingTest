import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        if(numlist.length == 1) return numlist;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<numlist.length; i++){
            map.put(numlist[i], Math.abs(numlist[i] - n));
        }
        
        List<Integer> keySet = new ArrayList<>(map.keySet());
        
        keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(map.get(o1).equals(map.get(o2))) return o1>o2 ? -1 : 1;
                return map.get(o1).compareTo(map.get(o2));
            }
        });
        
        int[] answer = new int[numlist.length];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = keySet.get(i);
        }
        
        return answer;
    }
}