import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++){
            if(s.indexOf(String.valueOf(s.charAt(i))) == s.lastIndexOf(String.valueOf(s.charAt(i)))){
                list.add(String.valueOf(s.charAt(i)));                
            }
        }
        
        Collections.sort(list);
        
        answer = String.join("", list);
        
        return answer;
    }
}