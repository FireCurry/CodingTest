import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> temp = new HashSet<>();
        
        for(int i=0; i<nums.length; i++){
            temp.add(nums[i]);
        }
        
        if(nums.length/2 <=  temp.size()){
            answer = nums.length/2;
        } else {
            answer = temp.size();
        }
        
        return answer;
    }
}