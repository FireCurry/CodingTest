import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.toLowerCase();
        char[] arr = answer.toCharArray();
        Arrays.sort(arr);
        
        answer = new String(arr);
        
        return answer;
    }
}