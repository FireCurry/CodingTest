class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        for(int i=0; i<num_list.length; i++){
            if(n+i > num_list.length-1) n = -i;
            answer[i] = num_list[n+i];
        }
        return answer;
    }
}