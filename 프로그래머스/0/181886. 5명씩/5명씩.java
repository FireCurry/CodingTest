import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        
        List<String> list = new ArrayList<>();
        for(int i=0; i<names.length; i=i+5){
            list.add(names[i]);
            
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}