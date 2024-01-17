class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        if(my_string.indexOf(is_suffix) != -1){
            if(my_string.lastIndexOf(is_suffix) + is_suffix.length() == my_string.length()){
                answer = 1;
            } else {
                answer = 0;
            }
        }
        return answer;
    }
}