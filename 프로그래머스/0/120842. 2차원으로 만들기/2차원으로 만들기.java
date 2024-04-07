class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int index = 0;
        for(int i=0; i<num_list.length/n; i++){
            for(int u=0; u<n; u++){
                answer[i][u] = num_list[index];
                index++;
            }
        }
        return answer;
    }
}