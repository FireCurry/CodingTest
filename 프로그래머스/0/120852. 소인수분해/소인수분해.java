import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        
        Set<Integer> set = new TreeSet<>();
        
       
        for(int i=2; i<=n; i++){
            if(n%i == 0){
                set.add(i);
                do{
                   n /= i; 
                } while(n%i==0);
            }
        }
        
        int[] answer = new int[set.size()];
        Iterator<Integer> iter = set.iterator();
        for(int i=0; i<set.size(); i++){
            answer[i] = iter.next();
        }
        
        
        return answer;
    }
}