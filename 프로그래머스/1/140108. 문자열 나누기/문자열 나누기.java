class Solution {
    public int solution(String s) {
        if(s.length() == 1) return 1;
        int answer = 0;
        
        int firstNum = 1;
        int otherNum = 0;
        
        char first = s.charAt(0);
        
        for(int i=1; i<s.length(); i++){
            
            if(s.charAt(i) == first){
                firstNum++;
            } else {
                otherNum++;
            }
            
            if(firstNum == otherNum){
                answer++;
                
                firstNum = 0;
                otherNum = 0;
                
                if(i+1 < s.length()){
                    first = s.charAt(i+1);
                }
                
            } else {
                if(i+1 >= s.length()){
                    answer++;
                    break;
                }
            }
        }
        
        return answer;
    }
}