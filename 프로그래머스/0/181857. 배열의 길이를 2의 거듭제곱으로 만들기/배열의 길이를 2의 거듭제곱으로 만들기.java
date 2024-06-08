class Solution {
    public int[] solution(int[] arr) {
        int two = 1;
        int length = arr.length;
        
        
        
        while(true){
            if(length == two){
                return arr;
            } else if(length > two){
                two = two*2;
            } else{
                break;
            }
        }
        
        int[] answer = new int[two];
        for(int i=0; i<two; i++){
            if(i>=arr.length){
                answer[i] = 0;
                continue;
            }
            answer[i] = arr[i];
        }
        
        return answer;
    }
}