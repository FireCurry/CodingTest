class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String temp = a + "" + b;
        if(Integer.parseInt(temp) >= 2*a*b){
            answer = Integer.parseInt(temp);
        } else {
            answer = 2*a*b;   
        }
        
        return answer;
    }
}