class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder(my_string);
        
        StringBuilder str = new StringBuilder(answer.substring(s, e+1));
        
        str.reverse();
        
        answer = answer.replace(s, e+1, str.toString());
        
        return answer.toString();
    }
}