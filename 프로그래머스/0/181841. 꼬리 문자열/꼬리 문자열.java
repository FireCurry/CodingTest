class Solution {
    public String solution(String[] str_list, String ex) {
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].indexOf(ex) == -1){
                answer.append(str_list[i]);
            }
        }
        return answer.toString();
    }
}