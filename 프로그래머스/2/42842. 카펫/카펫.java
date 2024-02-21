class Solution {
    public int[] solution(int brown, int yellow) {
        
        
        int b = brown/2 +2;
        int c = brown + yellow;
        
        int[] answer = {(int)(b+Math.sqrt(b*b-4*c))/2, (int)(b-Math.sqrt(b*b-4*c))/2};
        
        return answer;
    }
}