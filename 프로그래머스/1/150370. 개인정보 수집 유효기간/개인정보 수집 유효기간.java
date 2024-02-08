import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<terms.length; i++){
            String[] temp = terms[i].split(" ");
            map.put(temp[0], Integer.parseInt(temp[1]));
        }
        
        List<Integer> list = new ArrayList<>();
        
        String[] todayArr = today.split("\\.");
    
            
        for(int i=0; i<privacies.length; i++){
            String[] temp = privacies[i].split(" ");
            String[] temp2 = temp[0].split("\\.");
            
            if(Integer.parseInt(todayArr[0]) == Integer.parseInt(temp2[0]) ){
                  
                if((Integer.parseInt(todayArr[1])*28 + Integer.parseInt(todayArr[2]) - 
                    Integer.parseInt(temp2[1])*28 - Integer.parseInt(temp2[2]) - 28*map.get(temp[1])) >= 0  ){
                    list.add(i);
                }
                                
            } else {
                
                if(((Integer.parseInt(todayArr[0]) - Integer.parseInt(temp2[0]))*12*28
                    + Integer.parseInt(todayArr[1])*28 + Integer.parseInt(todayArr[2]) - 
                    Integer.parseInt(temp2[1])*28 - Integer.parseInt(temp2[2]) - 28*map.get(temp[1])) >= 0  ){
                    list.add(i);
                }          
            }            
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i)+1;
        }
        
        return answer;
    }
}