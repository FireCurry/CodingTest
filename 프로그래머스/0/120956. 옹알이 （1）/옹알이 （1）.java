class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        for(int i=0; i<babbling.length; i++){
            if(babbling[i].indexOf("aya") != babbling[i].lastIndexOf("aya")) continue;
            if(babbling[i].indexOf("ma") != babbling[i].lastIndexOf("ma")) continue;
            if(babbling[i].indexOf("ye") != babbling[i].lastIndexOf("ye")) continue;
            if(babbling[i].indexOf("woo") != babbling[i].lastIndexOf("woo")) continue;
            if(babbling[i].replaceAll("aya|ma|ye|woo", "").length() == 0) answer++; 
        }
        
        return answer;
    }
}