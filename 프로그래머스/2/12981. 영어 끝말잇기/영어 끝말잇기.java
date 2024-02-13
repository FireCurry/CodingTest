import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0,0};

        List<String> list = new ArrayList<>();
        list.add(words[0]);
        for(int i=1; i<words.length; i++){
            
            char first = words[i].charAt(0);
            char last = words[i-1].charAt(words[i-1].length()-1);
            if(first != last || list.contains(words[i])){
                answer[0] = (i+1)%n == 0 ? n : (i+1)%n;
                answer[1] = i/n +1;
                break;
            }
                        
            list.add(words[i]);
        }
        
        return answer;
    }
}