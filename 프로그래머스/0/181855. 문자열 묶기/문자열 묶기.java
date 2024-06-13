import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<strArr.length; i++){
            
            int length = strArr[i].length();
            
            if(map.get(length) != null){
                map.put(length, map.get(length) + 1);
            } else {
                map.put(length, 1);
            }
            
        }
        
        for(int key : map.keySet()){
            if(map.get(key) > answer){
                answer = map.get(key);
            }
        }
       
        
        return answer;
    }
}