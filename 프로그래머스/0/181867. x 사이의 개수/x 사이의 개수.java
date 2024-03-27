import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String myString) {
        
        List<Integer> list = new ArrayList<>();
        int num = 0;
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'x'){
                list.add(num);
                num = 0;
                if(i == myString.length()-1){
                    list.add(0);
                }
            } else {
                num++;
                if(i == myString.length()-1){
                    list.add(num);
                }
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }
}