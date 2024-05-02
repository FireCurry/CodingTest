class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        // 등차수열의 합
        
        int a = (2*total/num + 1 - num)/2;
        
        for(int i=0; i<num; i++){
            answer[i] = a + i;
        }
        
        return answer;
    }
}