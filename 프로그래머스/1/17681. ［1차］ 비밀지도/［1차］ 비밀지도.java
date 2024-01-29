class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i= 0; i<n; i++){
            String temp = "";
            int arrTemp1 = arr1[i];
            int arrTemp2 = arr2[i];
            
            for(int u=n-1; u>=0; u--){
                
                boolean check1 = true;
                boolean check2 = true;
                
                if(arrTemp1 >= Math.pow(2,u)){
                    arrTemp1 -= Math.pow(2,u);
                    
                } else {
                    check1 = false;
                }
                
                if(arrTemp2 >= Math.pow(2,u)){
                    arrTemp2 -= Math.pow(2,u);
                } else {
                    check2 = false;
                }
            
                if(check1 || check2){
                    temp += "#";
                } else {
                    temp += " ";
                }
            }
            answer[i] = temp;
        }
        
        return answer;
    }
}