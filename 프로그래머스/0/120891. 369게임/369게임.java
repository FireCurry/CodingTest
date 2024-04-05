class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = String.valueOf(order);
        str = str.replaceAll("[3,6,9]", "-");
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == '-'){
                answer++;
            }
        }
        
        return answer;
    }
}