class Solution {
    public String[] solution(String myStr) {
        
        char first = myStr.charAt(0);
        String str = null;
        if(first == 'a' || first == 'b' || first == 'c'){
            str = myStr.replaceFirst("[abc]*[abc]", "");
        } else {
            str = myStr;
        }
        
        String[] answer = str.split("[abc]*[abc]");
        
        if(answer[0].equals("")){
            answer[0] = "EMPTY";
        }
        
        return answer;
    }
}