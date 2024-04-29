class Solution {
    public int solution(String my_string) {
        
        String[] arr = my_string.split(" ");
        int answer = Integer.parseInt(arr[0]);
        int temp = 0;
        for(int i=2; i<arr.length; i+=2){
            temp = Integer.parseInt(arr[i]);
            
            if(arr[i-1].equals("+")){
                answer += temp;
            } else {
                answer -= temp;
            }
        }
        return answer;
    }
}