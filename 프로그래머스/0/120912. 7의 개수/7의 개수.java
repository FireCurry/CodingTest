class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        String[] arr = new String[array.length];
        
        for(int i=0; i<array.length; i++){
            arr[i] = String.valueOf(array[i]);
        }
        
        for(int i=0; i<arr.length; i++){
            for(int u=0; u<arr[i].length(); u++){
                if(arr[i].charAt(u) == 55){
                    answer++;
                }
            }
        }
        return answer;
    }
}