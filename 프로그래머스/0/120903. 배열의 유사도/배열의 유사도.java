class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for(int i=0; i<s1.length; i++){
            for(int u=0; u<s2.length; u++){
                if(s1[i].equals(s2[u])){
                    answer += 1;
                }
            }
        }
        return answer;
    }
}