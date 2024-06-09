class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int index = myString.indexOf(pat);
        if(index == -1) return 0;
        StringBuilder str = new StringBuilder(myString);
        
        while(index >= 0){
            answer++;
            str = str.delete(0,index+1);
            index = str.indexOf(pat);
        }
        
        return answer;
    }
}