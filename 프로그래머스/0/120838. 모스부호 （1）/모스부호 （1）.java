import java.util.*;

class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String answer = "";
        String[] letters = letter.split(" ");
        for(int i=0; i<letters.length; i++){
            for(int u=0; u<morse.length; u++){
                if(letters[i].equals(morse[u])){
                    
                    answer += (char)(u+97);
                }
            }
        }
        return answer;
    }
}