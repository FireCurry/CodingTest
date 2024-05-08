class Solution {
    public int solution(String myString, String pat) {
        
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<myString.length(); i++){
            if(myString.charAt(i) == 'A'){
                str.append('B');
            } else {
                str.append('A');
            }
        }
        
        if(str.indexOf(pat) == -1){
            return 0;
        }
        
        return 1;
    }
}