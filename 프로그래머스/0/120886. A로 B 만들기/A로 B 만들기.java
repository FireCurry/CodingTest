import java.util.Arrays;


class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] arrBefore = before.toCharArray();
        char[] arrAfter = after.toCharArray();
        Arrays.sort(arrBefore);
        Arrays.sort(arrAfter);
        before = Arrays.toString(arrBefore);
        after = Arrays.toString(arrAfter);
        
        
        if(before.equals(after)) answer = 1;
        
        
        return answer;
    }
}