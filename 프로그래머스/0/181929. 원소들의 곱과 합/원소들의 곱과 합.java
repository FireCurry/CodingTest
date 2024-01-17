class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multiple = 1;
        int plus = 0;
        for(int num : num_list){
            multiple *= num;
            plus += num;
        }
        if(multiple > plus*plus){
            answer = 0;
        } else {
            answer = 1;
        }
        return answer;
    }
}