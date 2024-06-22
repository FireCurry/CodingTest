class Solution {
    public int[] solution(int[] arr) {
        
        int start = -1;
        int end = 0;
        boolean flag = true;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2){
                if(start == -1){
                    start = i;
                } else {
                    end = i;
                }
                flag = false;
            }
        }
        
        if(flag){
            int[] answer = {-1};
            return answer;
        }
        
        if(start != 0 && end == 0){
            end = start;
        }
        
        int[] answer = new int[end - start + 1];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = arr[start + i];
        }
        
        return answer;
    }
}