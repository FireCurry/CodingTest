import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        
        int number = Math.abs(array[0]-n);
        int answer = array[0];
        for(int i=1; i<array.length; i++){
            if(number > Math.abs(array[i]-n)){
                answer = array[i];
                number = Math.abs(array[i]-n);
            }
        }
        
        return answer;
    }
}