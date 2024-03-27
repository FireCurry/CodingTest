class Solution {
    public int[] solution(int[] arr) {
        
        int sum = 0;
        for(int num : arr){
            sum += num;
        }
        int[] answer = new int[sum];
        
        int index = 0;
        
        for(int i=0; i<arr.length; i++){
            for(int u=0; u<arr[i]; u++){
                answer[index] = arr[i];
                index++;
            }
        }
        return answer;
    }
}