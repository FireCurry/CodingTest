class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        boolean flag = true;
        for(int i=0; i<code.length(); i++){
            if(code.charAt(i) == '1'){
                flag = !flag;
                continue;
            }
            
            if(flag){
                if(i % 2 == 0){
                    answer.append(code.charAt(i));
                }
            } else {
                if(i % 2 != 0){
                    answer.append(code.charAt(i));
                }
            }
        }
        return answer.length() > 0 ? answer.toString() : "EMPTY";
    }
}