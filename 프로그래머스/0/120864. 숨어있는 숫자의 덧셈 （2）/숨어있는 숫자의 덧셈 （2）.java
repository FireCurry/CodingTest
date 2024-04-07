class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split("[^0-9]+");
        if(arr.length==0) return answer;
        if(arr[0].equals("")) arr[0] = "0";
        
        for(int i=0; i<arr.length; i++){
            answer += Integer.parseInt(arr[i]);
        }
        
        return answer;
    }
}