class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            
            String[] arr = quiz[i].split(" ");
            boolean tf = true;
            if(arr[1].equals("+")){
                tf = (Integer.parseInt(arr[0]) + Integer.parseInt(arr[2])) == Integer.parseInt(arr[4]);
            } else {
                tf = (Integer.parseInt(arr[0]) - Integer.parseInt(arr[2])) == Integer.parseInt(arr[4]);
            }
            
            if(tf){
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
            
        }
        
        
        return answer;
    }
}