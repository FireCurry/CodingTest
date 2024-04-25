class Solution {
    public String[] solution(String my_str, int n) {
        int size = my_str.length()%n == 0 ? my_str.length()/n : my_str.length()/n+1;
        String[] answer = new String[size];
        
        for(int i=0; i<my_str.length(); i+=n){
            if(i+n > my_str.length()){
                answer[i/n] = my_str.substring(i);
                break;
            }
            answer[i/n] = my_str.substring(i, i+n);
        }
        
        
        return answer;
    }
}