import java.util.*;

class Solution {
    public int solution(int[] array) {
        if(array.length == 1) return array[0];
        int answer = -1;
        int temp = 0;
        int length = 1;
        int max = 1;   
        
        Arrays.sort(array);
        
        for(int i=1; i<array.length; i++){
            
            if(array[i] == array[i-1]){
                length++;
                if(length == max){
                    temp = max;
                }
                if(length > max){
                    max = length;
                    answer = array[i];
                }
            } else {
                length = 1;
            }
            
        }
        
        if(temp == max) return -1;
        
        return answer;
    }
}