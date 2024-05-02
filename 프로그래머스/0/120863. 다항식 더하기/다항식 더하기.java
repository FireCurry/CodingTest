class Solution {
    public String solution(String polynomial) {
        String answer = "";
        int x = 0;
        int num = 0;
        
        String[] arr = polynomial.split(" \\+ ");
        if(arr.length == 1) return polynomial;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i].indexOf("x") == -1){
                num += Integer.parseInt(arr[i]);
            } else if(arr[i].equals("x")) {
                x++;
            } else {
                x += Integer.parseInt(arr[i].replace("x",""));
            }
        }
        if(num == 0){
            answer = x + "x";
        } else if(x == 0){
            answer = String.valueOf(num);
        } else if(x == 1){
    
            answer = "x + " + num;
        } else {
            answer = x + "x + " + num;
        }
        
        
        return answer;
    }
}