class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            for(int u=0; u<n; u++){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}