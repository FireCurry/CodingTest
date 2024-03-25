import java.util.List;
import java.util.ArrayList;

class Solution {
    public String[] solution(String my_string) {
        
        String str = "";
        List<String> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i) == ' '){
                end = i;
                list.add(my_string.substring(start, end));
                start = i+1;
            }
            
            if(i == my_string.length()-1){
                
                list.add(my_string.substring(start));
            }
        }
        
        String[] answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}