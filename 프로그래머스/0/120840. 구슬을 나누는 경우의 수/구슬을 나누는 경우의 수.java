import java.math.BigInteger;

class Solution {
    public int solution(int balls, int share) {
        int answer = 0;
        if(balls == share) return 1;
        BigInteger mom = new BigInteger("1");
        BigInteger son1 = new BigInteger("1");
        BigInteger son2= new BigInteger("1");
        
        for(int i=balls; i>0; i--){
            mom = mom.multiply(BigInteger.valueOf(i));
        }
        for(int i=balls-share; i>0; i--){
            son1 = son1.multiply(BigInteger.valueOf(i));
        }
        for(int i=share; i>0; i--){
            son2 = son2.multiply(BigInteger.valueOf(i));
        }
        BigInteger son = son1.multiply(son2);
        answer = mom.divide(son).intValue();
        return answer;
    }
}