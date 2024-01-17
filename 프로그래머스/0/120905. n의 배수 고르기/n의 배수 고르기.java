import java.util.*;

class Solution {
    public Integer[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]%n ==0){
                list.add(numlist[i]);
            }
        }
        Integer[] answer = list.toArray(new Integer[0]);
        return answer;
    }
}