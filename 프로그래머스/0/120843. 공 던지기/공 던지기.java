class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int size = numbers.length;
        int index = 2*k - 1;
        
        answer = index%size;
        if(answer == 0) return size;
        
        
        return answer;
    }
}