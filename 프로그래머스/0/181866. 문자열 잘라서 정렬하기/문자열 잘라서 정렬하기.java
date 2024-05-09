import java.util.*;

class Solution {
    public String[] solution(String myString) {
        if(myString.charAt(0) == 'x'){
            myString = myString.replaceFirst("x+", "");
        }
        String[] answer = myString.split("x+");
        Arrays.sort(answer);
        return answer;
    }
}