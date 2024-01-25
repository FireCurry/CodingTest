class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int u=i; u<=j; u++){
            String temp = u + "";
            for(int num=0; num<temp.length(); num++){
                if(Integer.parseInt(String.valueOf(temp.charAt(num))) == k){
                    answer++;
                }
            }
        }
        return answer;
    }
}