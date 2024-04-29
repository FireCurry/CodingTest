class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String str = "";       
        for(int i=0; i<numbers.length(); i++){
            
            switch(numbers.charAt(i)){
                case 'z' : if(i != 0) str += "0"; i+=3; break;
                case 'o' : str += "1"; i+=2; break;
                case 't' : if(numbers.charAt(i+1) == 'w'){
                    str += "2"; i+=2; break;
                } else {
                    str += "3"; i+=4; break;
                }
                case 'f' : if(numbers.charAt(i+1) == 'o'){
                    str += "4"; i+=3; break;
                } else {
                    str += "5"; i+=3; break;
                }
                case 's' : if(numbers.charAt(i+1) == 'i'){
                    str += "6"; i+=2; break;
                } else {
                    str += "7"; i+=4; break;
                }
                case 'e' : str += "8"; i+=4; break;
                case 'n' : str += "9"; i+=3; break;
            }
        }
        answer = Long.parseLong(str);
        return answer;
    }
}