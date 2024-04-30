class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        
        int maxX = (board[0] - 1)/2;
        int maxY = (board[1] - 1)/2;
        int x = 0;
        int y = 0;
        
        for(int i=0; i<keyinput.length; i++){
            switch(keyinput[i]){
                case "left" : if(x != -maxX) x -= 1; break;
                case "right" : if(x != maxX) x += 1; break;
                case "up" : if(y != maxY) y += 1; break;
                case "down" : if(y != -maxY) y-= 1; break;
            }
        }
        int[] answer = {x,y};
        return answer;
    }
}