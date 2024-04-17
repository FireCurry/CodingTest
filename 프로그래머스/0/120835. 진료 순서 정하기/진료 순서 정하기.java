import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] arr = emergency.clone();
        Arrays.sort(arr);
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], arr.length - i);
        }
        
        for(int i=0; i<answer.length; i++){
            answer[i] = map.get(emergency[i]);
        }
        
        
        return answer;
    }
}