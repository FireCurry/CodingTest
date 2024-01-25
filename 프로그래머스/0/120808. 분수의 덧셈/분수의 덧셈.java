class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int son = denom2*numer1 + denom1*numer2;
        int parent = denom2*denom1;
        int length = son<parent?son:parent;
        for(int i=length; i>1; i--){
            if(son%i == 0 && parent%i == 0){
                son = son/i;
                parent = parent/i;
            }
        }
        int[] answer = {son, parent};
        return answer;
    }
}