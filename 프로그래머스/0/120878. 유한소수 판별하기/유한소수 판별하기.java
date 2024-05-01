import java.util.*;

class Solution {
    public int solution(int a, int b) {
        int min = Math.min(a, b);
        
        for(int i = 2; i<=min; i++){
            if(a%i == 0 && b%i == 0){
                a /= i;
                b /= i;
                i--;
            }
        }
        
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = Set.of(2,5);
        for(int i=2; i<=b; i++){
            if(b%i==0){
                set.add(i);
                b/=i;
                i--;
            }
        }
        if(set2.containsAll(set)) return 1;
        return 2;
    }
}