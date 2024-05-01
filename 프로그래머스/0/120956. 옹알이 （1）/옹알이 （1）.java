class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i=0; i<babbling.length; i++){
            if(babbling[i].replaceAll("aya|ma|ye|woo", "").length() == 0) answer++; 
        }
        
        return answer;
    }
}