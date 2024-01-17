class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = n + "";
        for(int i=0; i<temp.length(); i++){
            answer += Integer.parseInt(String.valueOf(temp.charAt(i)));
        }
        return answer;
    }
}