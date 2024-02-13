class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        for(int i=0; i<arr1.length; i++){
            for(int u=0; u<arr1[i].length; u++){
                answer[i][u] = arr1[i][u] + arr2[i][u];
            }
        }
        return answer;
    }
}